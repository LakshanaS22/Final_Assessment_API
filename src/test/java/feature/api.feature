Feature: Digital Catalog API and X-Pulsa Integration

  @Test
  Scenario:To Automate Digital Catalog and Pulsa Parent Service API
     #API 1
    Given the Get all item mappings API is called with productTypeCode "PHONE_CREDIT" and brandName "Indosat"
    Then the response should contain a brandId for "Indosat"

     #API 2
    When the API is called with the brandId and productType
    Then the response should contain defaultProviderId and defaultProviderName

    #API 3
    When the Save item mapping API is called with the following data:
      | active | autoSwitch | msisdn                             |
      | true   | false      | 0814,0815,0816,0855,0856,0857,0858 |
    Then the Save item mapping API response should be stored and validated

     #API 4
    When the Delete existing cart API is called with cartId
    #Then the response should indicate the cart is deleted

     #API 5
    When the Fetch Catalog SKU Data API is called with the internalName "For promotionRecommendation2" and return the SKU code of the item
    Then validate the response and the fetched SKU Code

    #API 6
    When PULSECART API service is hit and DOCHCEKOUT is done
    Then validate the response

   #API 7
    When the Setpulsecart api service is hit with the values
    Then validate the response fetched

##  # API 8
##    When AddToCart api is hit with the request body
#    Then validate the response fetched from the post

    #API 9
#    When the payment method is changed to "Indomaret"
#    Then validate the repsonse for paymentapi
##
#    When the Pay Order API is called with pulsaCartId
#    Then the response code should be valid and the payment should be processed
##
##  Scenario: Approve and Verify Order Payment
##    Given an orderId "27006458233" is provided
##    When the "Approve Order" API is called with the orderId
##    Then the response status should be "success" and the order should be approved
##
##    When the "Get Pulsa Order by OrderId" API is called with the orderId
##    Then the response should validate the order transaction successfully
