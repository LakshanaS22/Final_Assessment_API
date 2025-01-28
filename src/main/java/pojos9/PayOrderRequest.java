package pojos9;

import java.util.Map;

public class PayOrderRequest {
    private String pulsaCartId;
    private Map<String, Object> extendedData;

    // Getters and Setters
    public String getPulsaCartId() {
        return pulsaCartId;
    }

    public void setPulsaCartId(String pulsaCartId) {
        this.pulsaCartId = pulsaCartId;
    }

    public Map<String, Object> getExtendedData() {
        return extendedData;
    }

    public void setExtendedData(Map<String, Object> extendedData) {
        this.extendedData = extendedData;
    }
}
