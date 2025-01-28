package pojos3;

import java.util.Map;
import java.util.ResourceBundle;

public class SaveItemMappingResponse {
    private String requestId;
    private Boolean success;
    private Value value;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "SaveItemMappingResponse{" +
                "requestId='" + requestId + '\'' +
                ", success=" + success +
                ", value=" + value +
                '}';
    }


}

