package stepdefinitions;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Verify;
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
import pojos10.ApproveOrderRequest;
import pojos10.ApproveOrderResponse;
import pojos11.Approve;
import pojos12.*;
import pojos13.Response2;
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
import pojos9.PayOrderRequest;

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
    private static String orderId;
    private SaveItemMappingResponse response;
    private Response responses;

    private final ObjectMapper objectMapper = new ObjectMapper();
    private static final Properties properties = loadProperties();

    static final String BASE_URI = properties.getProperty("baseUri");
    static final String BASE_URI2 = properties.getProperty("baseUri2");
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
    public void theDeleteExistingCartAPIIsCalledWithCartId() {
        Response response = given()
                .baseUri(BASE_URI2)
                .contentType("application/json")
                .queryParam("storeId", properties.getProperty("storeId"))
                .queryParam("requestId", properties.getProperty("requestId"))
                .queryParam("channelId", properties.getProperty("channelId"))
                .queryParam("clientId", properties.getProperty("clientId"))
                .queryParam("username", properties.getProperty("username"))
                .queryParam("cartId", properties.getProperty("cartId"))
                .queryParam("additionalProp1", "string")
                .queryParam("additionalProp2", "string")
                .queryParam("additionalProp3", "string")
                .when()
                .delete("/api/pulsaCart/deletePulsaCart");

        Assert.assertEquals("Expected status code 200", 200, response.getStatusCode());
        response.prettyPrint();
        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.asPrettyString());
        put("response", response);

    }

    @Then("the response should indicate the cart is deleted")
    public void theResponseShouldIndicateTheCartIsDeleted() {
        Response response = (Response) get("response");
        assertNotNull("Response should not be null", response);
        assert response.getStatusCode() == 200 : "Expected status code 200, but got " + response.getStatusCode();

    }

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
                .queryParam("productTypeCode", productType)
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

    //Api7
    @When("the Setpulsecart api service is hit with the values")
    public void theSetpulsecartApiServiceIsHitWithTheValues() {
        String productType = (String) get("productType");
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

    //API 9
    @When("the payment method is changed to {string}")
    public void thePaymentMethodIsChangedTo(String paymentMethod) {
        ChangePaymentRequest changePaymentRequest = new ChangePaymentRequest();
        changePaymentRequest.setStoreId(properties.getProperty("storeId"));
        changePaymentRequest.setRequestId(properties.getProperty("requestId"));
        changePaymentRequest.setChannelId(properties.getProperty("channelId"));
        changePaymentRequest.setClientId(properties.getProperty("clientId"));
        changePaymentRequest.setUsername(properties.getProperty("username"));
        changePaymentRequest.setCartId(properties.getProperty("cartId"));
        changePaymentRequest.setPaymentMethod(paymentMethod);
        Map<String, String> additionalProp = Map.of(
                "additionalProp1", properties.getProperty("additionalProp1"),
                "additionalProp2", properties.getProperty("additionalProp2"),
                "additionalProp3", properties.getProperty("additionalProp3")
        );

        String additionalPropJson;
        try {
            additionalPropJson = new ObjectMapper().writeValueAsString(additionalProp);
        } catch (Exception e) {
            throw new RuntimeException("Failed to serialize additional properties", e);
        }

        Response response = given()
                .baseUri(properties.getProperty("baseUri2"))
                .accept("application/json")
                .contentType("application/json")
                .queryParam("storeId", changePaymentRequest.getStoreId())
                .queryParam("requestId", changePaymentRequest.getRequestId())
                .queryParam("channelId", changePaymentRequest.getChannelId())
                .queryParam("clientId", changePaymentRequest.getClientId())
                .queryParam("username", changePaymentRequest.getUsername())
                .queryParam("cartId", changePaymentRequest.getCartId())
                .queryParam("paymentMethod", changePaymentRequest.getPaymentMethod())
                .queryParam("additionalProp", additionalPropJson)
                .when()
                .post("/api/pulsaCart/changePayment");

        put("response", response);
        System.out.println("Response: " + response.asString());
    }


    @Then("validate the repsonse for paymentapi")
    public void validateTheRepsonse() {
        Response response = (Response) get("response");
        assert response.getStatusCode() == 200 : "Expected status code 200, but got " + response.getStatusCode();
        System.out.println("Status Code:" + response.getStatusCode());
    }

    //API 10
    @When("the Pay Order API is called with pulsaCartId")
    public void theAPIIsCalledWithPulsaCartId() {
        PayOrderRequest requestBody = new PayOrderRequest();
        requestBody.setPulsaCartId(properties.getProperty("cartId"));
        requestBody.setExtendedData(new HashMap<>());

        Response response = given()
                .baseUri(properties.getProperty("baseUri2"))
                .accept("application/json")
                .contentType("application/json")
                .queryParam("storeId", properties.getProperty("storeId"))
                .queryParam("requestId", properties.getProperty("requestId"))
                .queryParam("channelId", properties.getProperty("channelId"))
                .queryParam("clientId", properties.getProperty("clientId"))
                .queryParam("username", properties.getProperty("username"))
                .body(requestBody)
                .when()
                .post("/api/pulsaCart/payOrder");

        Approve approve = response.as(Approve.class);
        put("payOrderResponse", response);
        orderId = approve.getValue().getOrderId();
        put("orderId", orderId);
        System.out.println(orderId);
        System.out.println("Response: " + response.getBody().asString());
    }

    @Then("the responsens code should be valid and the payment should be processed")
    public void theResponseCodeShouldBeValidAndThePaymentShouldBeProcessed() {
        Response response = (Response) get("payOrderResponse");
        Assert.assertEquals("Expected status code 200", 200, response.getStatusCode());
        System.out.println("Response Status Code:" + response.getStatusCode());
    }

    //API 11
    @When("the Approve Order API is called with the orderId")
    public void theApproveOrderAPIIsCalledWithTheOrderId() {
        ApproveOrderRequest requestBody = new ApproveOrderRequest();
        String orderId = (String) get("orderId");
        requestBody.setOrderId(orderId);
        requestBody.setExtData(new HashMap<>());
        requestBody.setSubscriptionToken("string");
        requestBody.setSubscriptionTokenExpiryDate("2025-01-29T12:42:00.264Z");
        Response response = given()
                .baseUri("http://x-pulsa.qa2-sg.cld/x-pulsa")
                .accept("application/json")
                .contentType("application/json")
                .queryParam("storeId", properties.getProperty("storeId"))
                .queryParam("requestId", properties.getProperty("requestId"))
                .queryParam("channelId", properties.getProperty("channelId"))
                .queryParam("clientId", properties.getProperty("clientId"))
                .queryParam("username", properties.getProperty("username"))
                .body(requestBody)
                .when()
                .post("/api/approveOrder/approveOrderPayment");

        Response2 response2 = response.as(Response2.class);
        put("response2", response2);
        System.out.println("Response: " + response.getBody().asString());

    }

    @Then("the response status should be {string} and the order should be approved")
    public void theResponseStatusShouldBeAndTheOrderShouldBeApproved(String expectedStatus) {
        Response2 response2 = (Response2) get("response2");
//        int actualStatusCode = response2.getStatusCode();
//        Assert.assertEquals("Expected status code to be 200", 200, actualStatusCode);
//        System.out.println("Response Status Code: " + actualStatusCode);
//
//        String actualStatus = response.jsonPath().getString("true");
//        Assert.assertEquals("Expected success status", expectedStatus, actualStatus);
//
//        String errorMessage = response.jsonPath().getString("errorMessage");
//        String errorCode = response.jsonPath().getString("errorCode");

//        System.out.println("Error Message: " + errorMessage);
//        System.out.println("Error Code: " + errorCode);
        Assert.assertTrue("Response was not successful", response2.isSuccess());

    }

    //API 12
    @When("the Get Pulsa Order by OrderId API is called with the orderId")
    public void theGetPulsaOrderByOrderIdAPIIsCalledWithTheOrderId() {
        String orderId = (String) get("orderId");

        Response response = given()
                .baseUri("http://x-pulsa.qa2-sg.cld/x-pulsa")
                .accept("application/json")
                .contentType("application/json")
                .queryParam("storeId", properties.getProperty("storeId"))
                .queryParam("requestId", properties.getProperty("requestId"))
                .queryParam("channelId", properties.getProperty("channelId"))
                .queryParam("clientId", properties.getProperty("clientId"))
                .queryParam("username", properties.getProperty("username"))
                .queryParam("orderId", orderId) // Pass the orderId to the query param
                .queryParam("inquirePayment", "false")
                .queryParam("additionalProp1", "string")
                .queryParam("additionalProp2", "string")
                .queryParam("additionalProp3", "string")
                .when()
                .get("/api/pulsaOrder/getPulsaOrderByOrderId");
        VerifyOrder verifyOrderResponse = response.as(VerifyOrder.class);
        put("verifyOrderResponse", verifyOrderResponse);

        System.out.println("Response: " + response.getBody().asString());
    }

    @Then("the response should validate the order transaction successfully")
    public void theResponseShouldValidateTheOrderTransactionStatus() {
        VerifyOrder verifyOrderResponse = (VerifyOrder) get("verifyOrderResponse");
        Assert.assertTrue("Response was not successful", verifyOrderResponse.isSuccess());

        Values values = verifyOrderResponse.getValue();
        if (values != null && values.getPulsaOrder() != null) {
            PulsaOrder pulsaOrder = values.getPulsaOrder();

            String transactionStatus = pulsaOrder.getTransactionStatus();
            Assert.assertEquals("Transaction status should be 'SUCCESS'", "TRANSACTION_SUCCESS", transactionStatus);
            System.out.println("Transaction Status: " + transactionStatus);
        } else {
            Assert.fail("PulsaOrder data is missing in the response");
        }

        System.out.println("Order transaction status validated successfully.");
    }


}
