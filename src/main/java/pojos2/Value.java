package pojos2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)

public class Value {

	private String id;
	private String storeId;
	private String createdDate;
	private String createdBy;
	private String updatedDate;
	private String updatedBy;
	private String version;
	private String deletedDate;
	private String deletedBy;
	private boolean markForDelete;
	private Brand brand;
	private ProductType productType;
	private String defaultProviderId;
	private String defaultProviderName;
	private List<EligibleProvidersItem> eligibleProviders;
	private boolean active;
	private boolean autoSwitch;
	private String msisdn;
	private List<AutoSwitchProvidersItem> autoSwitchProviders;
	private boolean temporaryShutdown;

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDeletedDate() {
		return deletedDate;
	}

	public void setDeletedDate(String deletedDate) {
		this.deletedDate = deletedDate;
	}

	public String getDeletedBy() {
		return deletedBy;
	}

	public void setDeletedBy(String deletedBy) {
		this.deletedBy = deletedBy;
	}

	public boolean isMarkForDelete() {
		return markForDelete;
	}

	public void setMarkForDelete(boolean markForDelete) {
		this.markForDelete = markForDelete;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

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

	public List<EligibleProvidersItem> getEligibleProviders() {
		return eligibleProviders;
	}

	public void setEligibleProviders(List<EligibleProvidersItem> eligibleProviders) {
		this.eligibleProviders = eligibleProviders;
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

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public List<AutoSwitchProvidersItem> getAutoSwitchProviders() {
		return autoSwitchProviders;
	}

	public void setAutoSwitchProviders(List<AutoSwitchProvidersItem> autoSwitchProviders) {
		this.autoSwitchProviders = autoSwitchProviders;
	}

	public boolean isTemporaryShutdown() {
		return temporaryShutdown;
	}

	public void setTemporaryShutdown(boolean temporaryShutdown) {
		this.temporaryShutdown = temporaryShutdown;
	}



}
