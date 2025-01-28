package stepdefinitions;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojos.ApiResponse;
import pojos.ContentItem;
import pojos.ItemMappingResponse;
import pojos2.TEST.ResponseTest;
import pojos2.Value;
import pojos2.Responses;
import pojos3.SaveItemMappingResponse;
import pojos4.Response4;
import pojos5.CheckoutResponse;
import pojos6.SetPulsaCartRequest;
import pojos6.SetPulsaCartResponse;
import pojos7.AddToCartRequest;
import pojos7.AddToCartResponse;
import pojos8.ChangePaymentRequest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

public class MyStepdefs {

    private static String brandId;
    private static String productType;
    private static String defaultProviderId;
    private static String defaultProviderName;
    private SaveItemMappingResponse response;
    private Response responses;

    private final ObjectMapper objectMapper = new ObjectMapper();
    private static final Properties properties = loadProperties();

    static final String BASE_URI = properties.getProperty("baseUri");
    static final String BASE_URI2 = properties.getProperty("baseUri2"); // Base URI
    static final String BASE_URI3 = properties.getProperty("baseUri3");
    private static Properties loadProperties() {
        Properties props = new Properties();
        try (FileInputStream fis = new FileInputStream("src/test/resources/config.properties")) {
            props.load(fis);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load properties file: " + e.getMessage());
        }
        return props;
    }
    private static final Map<String, Object> scenarioData = new HashMap<>();
    public static void put(String key, Object value) {
        scenarioData.put(key, value);
    }

    public static Object get(String key) {
        return scenarioData.get(key);
    }

    // API 1
    @Given("the Get all item mappings API is called with productTypeCode {string} and brandName {string}")
    public void theGetAllItemMappingsAPIIsCalledWithProductTypeCodeAndBrandName(String productTypeCode, String brandName) {
        RequestSpecification rs = given()
                .baseUri(BASE_URI)
                .contentType("application/json")
                .queryParam("storeId", properties.getProperty("storeId"))
                .queryParam("requestId", properties.getProperty("requestId"))
                .queryParam("channelId", properties.getProperty("channelId"))
                .queryParam("clientId", properties.getProperty("clientId"))
                .queryParam("username", properties.getProperty("username"));

        try {
            Response response = rs.when()
                    .get("/findAll")
                    .then()
                    .statusCode(200)
                    .extract()
                    .response();

            ApiResponse apiResp = objectMapper.readValue(response.getBody().asString(), ApiResponse.class);
            List<ContentItem> contentItems = apiResp.getContent();

            ContentItem matchedItem = contentItems.stream()
                    .filter(contentItem ->
                            contentItem.getProductType().getProductTypeCode().equalsIgnoreCase(productTypeCode) &&
                                    contentItem.getBrand().getBrandName().equalsIgnoreCase(brandName)
                    )
                    .findFirst()
                    .orElse(null);

            if (matchedItem != null) {
                String brandId = String.valueOf(matchedItem.getBrand().getBrandId());
                String productType = matchedItem.getProductType().getProductTypeCode();

                System.out.println("Brand ID found: " + brandId);
                System.out.println("Product Type found: " + productType);

                put("brandId", brandId);
                put("productType", productType);
                put("brandName", brandName);
            } else {
                System.out.println("No matching product found for brandName: " + brandName + " and productTypeCode: " + productTypeCode);
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error while calling the API or processing the response: " + e.getMessage());
        }
    }

    @Then("the response should contain a brandId for {string}")
    public void theResponseShouldContainABrandIdFor(String brandName) {
        String brandId = (String) get("brandId");
        assertNotNull("brandId should not be null", brandId);
        System.out.println("Brand ID for " + brandName + ": " + brandId);
        assertTrue("brandId should be present for " + brandName, brandId.length() > 0);
    }
    // API 2
    @When("the API is called with the brandId and productType")
    public void theAPIIsCalledWithTheBrandIdAndProductType() {
        String brandId = (String) get("brandId");
        String productType = (String) get("productType");

        if (brandId == null || productType == null) {
            throw new IllegalStateException("brandId or productType is missing in ScenarioContext. Make sure the previous step executed successfully.");
        }

        RequestSpecification rs = given()
                .baseUri(BASE_URI)
                .contentType("application/json")
                .queryParam("storeId", properties.getProperty("storeId"))
                .queryParam("requestId", properties.getProperty("requestId"))
                .queryParam("channelId", properties.getProperty("channelId"))
                .queryParam("clientId", properties.getProperty("clientId"))
                .queryParam("username", properties.getProperty("username"))
                .queryParam("brandId", brandId)
                .queryParam("productTypeCode", productType);

        try {
            Response response = rs.when()
                    .get("/findOne")
                    .then()
                    .statusCode(200)
                    .extract()
                    .response();

            System.out.println(response.getBody().asString());
            ResponseTest rt = objectMapper.readValue(response.getBody().asString(), ResponseTest.class);

            String defaultProviderId = rt.value.getDefaultProviderId();
            String defaultProviderName = rt.value.getDefaultProviderName();

            System.out.println("Default Provider ID: " + defaultProviderId);
            System.out.println("Default Provider Name: " + defaultProviderName);

            put("defaultProviderId", defaultProviderId);
            put("defaultProviderName", defaultProviderName);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error while calling the API or processing the response: " + e.getMessage());
        }
    }
    @Then("the response should contain defaultProviderId and defaultProviderName")
    public void theResponseShouldContainDefaultProviderIdAndDefaultProviderName() {
        String defaultProviderId = (String) get("defaultProviderId");
        String defaultProviderName = (String) get("defaultProviderName");

        assertTrue("defaultProviderId should not be empty", !defaultProviderId.isEmpty());
        assertTrue("defaultProviderName should not be empty", !defaultProviderName.isEmpty());

        System.out.println("Validated Default Provider ID: " + defaultProviderId);
        System.out.println("Validated Default Provider Name: " + defaultProviderName);
    }
    // API 3
    @When("the Save item mapping API is called with the following data:")
    public void theSaveItemMappingAPIIsCalledWithTheFollowingData(DataTable dataTable) throws Exception {
        String brandId = (String) get("brandId");
        String productType = (String) get("productType");

        if (brandId == null || productType == null) {
            throw new IllegalStateException("brandId or productType is missing in ScenarioContext. Ensure the previous steps were executed successfully.");
        }

        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        Map<String, String> data = rows.get(0);
        Map<String, Object> payload = new HashMap<>();
        payload.put("active", Boolean.parseBoolean(data.get("active")));
        payload.put("autoSwitch", Boolean.parseBoolean(data.get("autoSwitch")));
        payload.put("brandId", Integer.parseInt(brandId));
        payload.put("defaultProviderId", get("defaultProviderId"));
        payload.put("defaultProviderName", get("defaultProviderName"));
        payload.put("msisdn", data.get("msisdn"));
        payload.put("productTypeCode", productType);

        Response apiResponse = given()
                .baseUri(properties.getProperty("baseUri"))
                .contentType("application/json")
                .queryParam("storeId", properties.getProperty("storeId"))
                .queryParam("requestId", properties.getProperty("requestId"))
                .queryParam("channelId", properties.getProperty("channelId"))
                .queryParam("clientId", properties.getProperty("clientId"))
                .queryParam("username", properties.getProperty("username"))
                .body(payload)
                .when()
                .post("/save")
                .then()
                .log().all()
                .extract()
                .response();

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        SaveItemMappingResponse response = mapper.readValue(apiResponse.asString(), SaveItemMappingResponse.class);
        System.out.println("API Response: " + response);
        this.response = response;
    }
    @Then("the Save item mapping API response should be stored and validated")
    public void theSaveItemMappingAPIResponseShouldBeStoredAndValidated() {
        assertNotNull("Response should not be null", response);
        assertNotNull("Response value should not be null", response.getValue());
        assertNotNull("Default Provider ID should not be null", response.getValue().getDefaultProviderId());
        assertNotNull("Default Provider Name should not be null", response.getValue().getDefaultProviderName());

        System.out.println("Validated Default Provider ID: " + response.getValue().getDefaultProviderId());
        System.out.println("Validated Default Provider Name: " + response.getValue().getDefaultProviderName());
    }
    // API 4
    @When("the Delete existing cart API is called with cartId")
    public void theDeleteExistingCartAPIIsCalledWithCartId( ) {
        Response response = given()
                .baseUri(BASE_URI2)
                .contentType("application/json")
                .queryParam("storeId", properties.getProperty("storeId"))
                .queryParam("requestId", properties.getProperty("requestId"))
                .queryParam("channelId", properties.getProperty("channelId"))
                .queryParam("clientId", properties.getProperty("clientId"))
                .queryParam("username", properties.getProperty("username"))
                .queryParam("cartId", "be2ed610-044c-4aa9-9e86-de66a43ca1bb@blibli")
                .queryParam("additionalProp1", "string")
                .queryParam("additionalProp2", "string")
                .queryParam("additionalProp3", "string")
                .when()
                .delete("/api/pulsaCart/deletePulsaCart");

        response.prettyPrint();
        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.asPrettyString());
    }

//    @Then("the response should indicate the cart is deleted")
//    public void theResponseShouldIndicateTheCartIsDeleted() {
//        assertEquals("Success code should be 200", 200, response.getStatusCode());
//        String successMessage = response.jsonPath().getString("message");
//        assertEquals("Success message should indicate cart is deleted", "Cart deleted successfully", successMessage);
//    }


// API 5
@When("the Fetch Catalog SKU Data API is called with the internalName {string} and return the SKU code of the item")
public void theFetchCatalogSKUDataAPIIsCalledWithTheInternalNameAndReturnTheSKUCodeOfTheItem(String internalName) {

    RequestSpecification rs = given()
            .baseUri(BASE_URI3)
            .contentType("application/json")
            .queryParam("storeId", properties.getProperty("storeId"))
            .queryParam("requestId", properties.getProperty("requestId"))
            .queryParam("channelId", properties.getProperty("channelId"))
            .queryParam("clientId", properties.getProperty("clientId"))
            .queryParam("username", properties.getProperty("username"))
            .queryParam("productTypeCode",productType )
            .queryParam("brandName", properties.getProperty("brandName"))
            .queryParam("page", 0)
            .queryParam("size", 10)
            .header("accept", "application/json");
    Response response = rs.when()
            .get("/digital-catalog/api/merchantDigitalSku/getProductListByFilter");

    Assert.assertEquals("Expected status code 200", 200, response.getStatusCode());
    Response4 responseBody = response.as(Response4.class);
    String skuCode = null;

    for (var contentItem : responseBody.getContent()) {
        if (contentItem.getDigitalProduct() != null &&
                internalName.equals(contentItem.getDigitalProduct().getInternalName())) {
            skuCode = contentItem.getMerchantDigitalSkuList().get(0).getSkuCode();
            System.out.println("SKU Code for " + internalName + ": " + skuCode);
            break;
        }
    }

    put("skuCode", skuCode);
    Assert.assertNotNull("SKU Code should not be null", skuCode);
    Assert.assertFalse("SKU Code should not be empty", skuCode.isEmpty());
    Properties properties = new Properties();
    try (FileOutputStream output = new FileOutputStream("config.properties", true)) {
        properties.load(new FileInputStream("config.properties"));
        properties.setProperty("skuCode", skuCode);
        properties.store(output, null);
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    @Then("validate the response and the fetched SKU Code")
    public void validateTheResponseAndTheFetchedSKUCode() {
        String skuCode = (String) get("skuCode");

        Assert.assertNotNull("SKU Code should not be null", skuCode);
        Assert.assertFalse("SKU Code should not be empty", skuCode.isEmpty());
    }


//API 6
@When("PULSECART API service is hit and DOCHCEKOUT is done")
public void pulsecartAPIServiceIsHitAndDOCHCEKOUTIsDone() {
    Response response = given()
            .baseUri(BASE_URI2)
            .contentType("application/json")
            .queryParam("storeId", properties.getProperty("storeId"))
            .queryParam("requestId", properties.getProperty("requestId"))
            .queryParam("channelId", properties.getProperty("channelId"))
            .queryParam("clientId", properties.getProperty("clientId"))
            .queryParam("username", properties.getProperty("username"))
            .queryParam("cartId", properties.getProperty("cartId"))
            .queryParam("customerLogonId", properties.getProperty("customerLogonId"))
            .queryParam("cartOwnershipType", properties.getProperty("cartOwnershipType"))
            .queryParam("additionalProp1", properties.getProperty("additionalProp1"))
            .queryParam("additionalProp2", properties.getProperty("additionalProp2"))
            .queryParam("additionalProp3", properties.getProperty("additionalProp3"))
            .when()
            .post("/api/pulsaCart/doCheckout");

    Assert.assertEquals("Expected status code 200", 200, response.getStatusCode());
    CheckoutResponse checkoutResponse = response.as(CheckoutResponse.class);

 put("checkoutResponse", checkoutResponse);

    System.out.println("Response: " + checkoutResponse.getRequestId() + ", Success: " + checkoutResponse.isSuccess());
}
    @Then("validate the response")
    public void validateTheResponse() {
        CheckoutResponse checkoutResponse = (CheckoutResponse) get("checkoutResponse");
        Assert.assertNotNull("Response should not be null", checkoutResponse);
        Assert.assertTrue("The success flag should be true", checkoutResponse.isSuccess());
        Assert.assertEquals("Expected requestId", properties.getProperty("requestId"), checkoutResponse.getRequestId());

    }
//api7
@When("the Setpulsecart api service is hit with the values")
public void theSetpulsecartApiServiceIsHitWithTheValues() {
    String productType = (String)get("productType");
    String skuCode = (String) get("skuCode");

    SetPulsaCartRequest request = new SetPulsaCartRequest();
    request.setCustomerNumber(properties.getProperty("msisdn"));
    request.setItemSku(skuCode);
    request.setNominal(Integer.parseInt(properties.getProperty("nominal")));
    request.setOperatorCode(properties.getProperty("brandName"));
    request.setOperatorName(properties.getProperty("brandName"));
    request.setCustomerName(properties.getProperty("customerName"));
    request.setCustomerEmail(properties.getProperty("customerEmail"));
    request.setProductType(productType);
    request.setSourceSdc(true);

    Response response = given()
            .baseUri(properties.getProperty("baseUri2"))
            .contentType("application/json")
            .accept("application/json")
            .queryParam("storeId", properties.getProperty("storeId"))
            .queryParam("requestId", properties.getProperty("requestId"))
            .queryParam("channelId", properties.getProperty("channelId"))
            .queryParam("clientId", properties.getProperty("clientId"))
            .queryParam("username", properties.getProperty("username"))
            .queryParam("cartId", properties.getProperty("cartId"))
            .queryParam("msisdn", properties.getProperty("msisdn"))
            .queryParam("language", properties.getProperty("language"))
            .queryParam("additionalProp1", properties.getProperty("additionalProp1"))
            .queryParam("additionalProp2", properties.getProperty("additionalProp2"))
            .queryParam("additionalProp3", properties.getProperty("additionalProp3"))
            .body(request)
            .when()
            .post("/api/pulsaCart/setPulsaCartMsisdn");

    Assert.assertEquals(200, response.getStatusCode());

    SetPulsaCartResponse setPulsaCartResponse = response.as(SetPulsaCartResponse.class);

    put("setPulsaCartResponse", setPulsaCartResponse);

    System.out.println("Response: " + setPulsaCartResponse.getRequestId() + ", Success: " + setPulsaCartResponse.isSuccess());
}

    @Then("validate the response fetched")
    public void validateTheResponseFetched() {
        SetPulsaCartResponse response = (SetPulsaCartResponse) get("setPulsaCartResponse");

        Assert.assertNotNull(response.getRequestId());
        Assert.assertTrue(response.isSuccess());

        System.out.println("Validated Response: " + response.getRequestId() + ", Success: " + response.isSuccess());
    }

//    //api8
//    @When("AddToCart api is hit with the request body")
//    public void addtocartApiIsHitWithTheRequestBody() {
//        // Create an instance of AddToCartRequest and set the required values
//        AddToCartRequest addToCartRequest = new AddToCartRequest();
//        addToCartRequest.setProductType("PHONE_CREDIT");
//        addToCartRequest.setItemSku("BLP-25978-XDP-0000316");  // Use SKU Code from ScenarioContext
//        addToCartRequest.setCartId("be2ed610-044c-4aa9-9e86-de66a43ca1bb@blibli");  // Use Cart ID from ScenarioContext
//        addToCartRequest.setOperatorName("Indosat");  // Use Operator Name from ScenarioContext
//        addToCartRequest.setDeviceId("00d57723-464d-455b-ab81-1cd22f4dda31");
//
//        // Create the additionalProp object
//        Map<String, String> additionalProp = new HashMap<>();
//        additionalProp.put("additionalProp1", "string");
//        additionalProp.put("additionalProp2", "string");
//        additionalProp.put("additionalProp3", "string");
//
//        // Serialize the additionalProp object to JSON string
//        ObjectMapper objectMapper = new ObjectMapper();
//        String additionalPropJson = null;
//        try {
//            additionalPropJson = objectMapper.writeValueAsString(additionalProp);  // Convert to JSON string
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        // Ensure the "additionalProp" values are passed correctly as a stringified JSON in the query params
//        Response response = given()
//                .baseUri(BASE_URI2)
//                .accept("application/json")
//                .contentType("application/json")
//                .queryParam("storeId", "10001")
//                .queryParam("requestId", "RANDOM")
//                .queryParam("channelId", "pulsa-web")
//                .queryParam("clientId", "pulsa")
//                .queryParam("username", "username")
//                .queryParam("additionalProp", additionalPropJson)  // Pass the serialized JSON object as a string
//                .body(addToCartRequest)  // Send the request body
//                .when()
//                .post("/api/pulsaCart/addToCart");
//
//        // Print the response for debugging
//        System.out.println("Response: " + response.asString());
//        AddToCartResponse addToCartResponse = response.as(AddToCartResponse.class);
//
//        // Store the response for use in the @Then step
//       put("AddToCartResponse", addToCartResponse);
//
//    }
//
//
//    @Then("validate the response fetched from the post")
//    public void validateTheResponseFetchedFromThePost() {
//        // Retrieve the response from the ScenarioContext
//        AddToCartResponse addToCartResponse = (AddToCartResponse) get("AddToCartResponse");
//
//        // Check if the response object is not null
//        Assert.assertNotNull("Response should not be null", addToCartResponse);
//
//
//
//        // Validate if 'success' field is true
//        Assert.assertTrue("Success should be true", addToCartResponse.isSuccess());
//
//        // Optionally validate the 'requestId'
//        String requestId = addToCartResponse.getRequestId();
//        Assert.assertNotNull("RequestId should not be null", requestId);
//
//        // If the response contains an error message, assert that the success flag is false
//        if (!addToCartResponse.isSuccess()) {
//            // Since we don't have an error message in your response POJO, we cannot check that directly
//            // If your response POJO contains an error message, you could add the validation here
//            System.out.println("Error occurred while adding to the cart. Check the error details in the response.");
//        } else {
//            System.out.println("Request was successful. Request ID: " + requestId);
//        }
//    }
////
    @When("the payment method is changed to {string}")
    public void thePaymentMethodIsChangedTo(String paymentMethod) {
        // Create an instance of ChangePaymentRequest and set the required values
        ChangePaymentRequest changePaymentRequest = new ChangePaymentRequest();
        changePaymentRequest.setStoreId("10001");
        changePaymentRequest.setRequestId("RANDOM");
        changePaymentRequest.setChannelId("pulsa-web");
        changePaymentRequest.setClientId("pulsa");
        changePaymentRequest.setUsername("username");
        changePaymentRequest.setCartId("be2ed610-044c-4aa9-9e86-de66a43ca1bb@blibli");
        changePaymentRequest.setPaymentMethod(paymentMethod);

        // Create the additionalProp object as a JSON map
        Map<String, String> additionalProp = new HashMap<>();
        additionalProp.put("additionalProp1", "string");
        additionalProp.put("additionalProp2", "string");
        additionalProp.put("additionalProp3", "string");

        // Serialize the additionalProp object to JSON string
        ObjectMapper objectMapper = new ObjectMapper();
        String additionalPropJson = null;
        try {
            additionalPropJson = objectMapper.writeValueAsString(additionalProp);  // Convert to JSON string
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Send the POST request with the request body using the ChangePaymentRequest POJO
        Response response = given()
                .baseUri(BASE_URI2)  // Using the correct base URI here
                .accept("application/json")
                .contentType("application/json")
                .queryParam("storeId", changePaymentRequest.getStoreId())
                .queryParam("requestId", changePaymentRequest.getRequestId())
                .queryParam("channelId", changePaymentRequest.getChannelId())
                .queryParam("clientId", changePaymentRequest.getClientId())
                .queryParam("username", changePaymentRequest.getUsername())
                .queryParam("cartId", changePaymentRequest.getCartId())
                .queryParam("paymentMethod", changePaymentRequest.getPaymentMethod())
                .queryParam("additionalProp", additionalPropJson)  // Pass the serialized JSON object as a string
                .when()
                .post("/api/pulsaCart/changePayment");  // Just use the endpoint relative to the base URI

        // Store the response for later use in the scenario context
        put("response", response);

        // Print the response for debugging
        System.out.println("Response: " + response.asString());
    }



    @Then("validate the repsonse for paymentapi")
    public void validateTheRepsonse() {
        // Retrieve the stored response from ScenarioContext
        Response response = (Response) get("response");

        // Validate the response status code is 200
        assert response.getStatusCode() == 200 : "Expected status code 200, but got " + response.getStatusCode();

        // Validate the success message in the response
        String successMessage = response.jsonPath().getString("success");
        assert successMessage != null && successMessage.equals("true") : "Expected success to be true, but got: " + successMessage;

        // Validate the error message is null or empty if success is true
        if (successMessage.equals("false")) {
            String errorMessage = response.jsonPath().getString("errorMessage");
            assert errorMessage != null && !errorMessage.isEmpty() : "Expected error message, but got none";
            System.out.println("Error Message: " + errorMessage);  // Optionally print the error message
        }

        System.out.println("Status Code:" + response.getStatusCode());
    }

    @When("the Pay Order API is called with pulsaCartId")
    public void theAPIIsCalledWithPulsaCartId() {
        // Set the base URI for the API
        Response response = given()
                .baseUri("http://x-pulsa.qa2-sg.cld/x-pulsa/api/pulsaCart")  // Base URI for the Pay Order API
                .accept("application/json")  // Accept header
                .contentType("application/json")  // Content-Type header
                .queryParam("storeId", "10001")
                .queryParam("requestId", "RANDOM")
                .queryParam("channelId", "pulsa-web")
                .queryParam("clientId", "pulsa")
                .queryParam("username", "username")
                .body("{\n" +
                        "    \"pulsaCartId\": \"49e404b2-286b-4e24-87a3-2a10d006592e@blibli\",\n" +
                        "    \"extendedData\": {}\n" +
                        "}")  // Body of the request, using pulsaCartId
                .when()
                .post("/payOrder");  // Call the API to pay for the order

        // Store the response in ScenarioContext for use in the @Then step
    put("payOrderResponse", response);

        // Optionally, print the response for debugging
        System.out.println("Response: " + response.getBody().asString());
    }

    @Then("the response code should be valid and the payment should be processed")
    public void theResponseCodeShouldBeValidAndThePaymentShouldBeProcessed() {
        // Retrieve the response from ScenarioContext
        Response response = (Response) get("payOrderResponse");

        // Validate that the response status code is 200 OK (or another valid status code)
        Assert.assertEquals("Expected status code 200", 200, response.getStatusCode());

        // Extract the 'success' field from the response body


        // Optionally, print the full response for debugging
        System.out.println("Response: " + response.getBody().asString());
    }




//


}
