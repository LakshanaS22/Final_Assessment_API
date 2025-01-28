package pojos8;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

public class ChangePaymentRequest {

    private String storeId;
    private String requestId;
    private String channelId;
    private String clientId;
    private String username;
    private String cartId;
    private String paymentMethod;

    @JsonProperty("additionalProp")
    private Map<String, String> additionalProp;  // This will hold the additionalProp as a JSON object

    // Getters and Setters
    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Map<String, String> getAdditionalProp() {
        return additionalProp;
    }

    public void setAdditionalProp(Map<String, String> additionalProp) {
        this.additionalProp = additionalProp;
    }
}
