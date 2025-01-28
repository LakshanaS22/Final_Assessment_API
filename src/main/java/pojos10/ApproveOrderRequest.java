package pojos10;

import java.util.Map;

public class ApproveOrderRequest {
    private String orderId;
    private Map<String, String> extData;
    private String subscriptionToken;
    private String subscriptionTokenExpiryDate;

    // Getters and Setters
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Map<String, String> getExtData() {
        return extData;
    }

    public void setExtData(Map<String, String> extData) {
        this.extData = extData;
    }

    public String getSubscriptionToken() {
        return subscriptionToken;
    }

    public void setSubscriptionToken(String subscriptionToken) {
        this.subscriptionToken = subscriptionToken;
    }

    public String getSubscriptionTokenExpiryDate() {
        return subscriptionTokenExpiryDate;
    }

    public void setSubscriptionTokenExpiryDate(String subscriptionTokenExpiryDate) {
        this.subscriptionTokenExpiryDate = subscriptionTokenExpiryDate;
    }
}
