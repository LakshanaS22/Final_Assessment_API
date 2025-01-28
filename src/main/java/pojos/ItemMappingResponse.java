package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class ItemMappingResponse {
    private String defaultProviderId;
    private String defaultProviderName;

    // Getters and Setters
    public String getDefaultProviderId() {
        return defaultProviderId;
    }

    public void setDefaultProviderId(String defaultProviderId) {
        this.defaultProviderId = defaultProviderId;
    }

    public String getDefaultProviderName() {
        return defaultProviderName;
    }

    public void setDefaultProviderName(String defaultProviderName) {
        this.defaultProviderName = defaultProviderName;
    }
}
