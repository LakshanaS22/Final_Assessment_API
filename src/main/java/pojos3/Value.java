package pojos3;

public class Value {
    private String defaultProviderId;
    private String defaultProviderName;
    private boolean active;
    private boolean autoSwitch;

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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isAutoSwitch() {
        return autoSwitch;
    }

    public void setAutoSwitch(boolean autoSwitch) {
        this.autoSwitch = autoSwitch;
    }
    @Override
    public String toString() {
        return "Value{" +
                "defaultProviderId='" + defaultProviderId + '\'' +
                ", defaultProviderName='" + defaultProviderName + '\'' +
                ", active=" + active +
                ", autoSwitch=" + autoSwitch +
                '}';
    }
}
