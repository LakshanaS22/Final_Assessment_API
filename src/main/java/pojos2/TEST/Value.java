package pojos2.TEST;

import java.util.List;

public class Value {
	private List<EligibleProvidersItem> eligibleProviders;
	private Object updatedBy;
	private String defaultProviderName;
	private boolean active;
	private boolean markForDelete;
	private Object updatedDate;
	private Object storeId;
	private Object version;
	private Object deletedBy;
	private String defaultProviderId;
	private Object createdDate;
	private boolean autoSwitch;
	private Object createdBy;
	private Object deletedDate;
	private Object id;
	private boolean temporaryShutdown;
	private String msisdn;
	private Brand brand;
	private ProductType productType;
	private List<AutoSwitchProvidersItem> autoSwitchProviders;

	public void setEligibleProviders(List<EligibleProvidersItem> eligibleProviders){
		this.eligibleProviders = eligibleProviders;
	}

	public List<EligibleProvidersItem> getEligibleProviders(){
		return eligibleProviders;
	}

	public void setUpdatedBy(Object updatedBy){
		this.updatedBy = updatedBy;
	}

	public Object getUpdatedBy(){
		return updatedBy;
	}

	public void setDefaultProviderName(String defaultProviderName){
		this.defaultProviderName = defaultProviderName;
	}

	public String getDefaultProviderName(){
		return defaultProviderName;
	}

	public void setActive(boolean active){
		this.active = active;
	}

	public boolean isActive(){
		return active;
	}

	public void setMarkForDelete(boolean markForDelete){
		this.markForDelete = markForDelete;
	}

	public boolean isMarkForDelete(){
		return markForDelete;
	}

	public void setUpdatedDate(Object updatedDate){
		this.updatedDate = updatedDate;
	}

	public Object getUpdatedDate(){
		return updatedDate;
	}

	public void setStoreId(Object storeId){
		this.storeId = storeId;
	}

	public Object getStoreId(){
		return storeId;
	}

	public void setVersion(Object version){
		this.version = version;
	}

	public Object getVersion(){
		return version;
	}

	public void setDeletedBy(Object deletedBy){
		this.deletedBy = deletedBy;
	}

	public Object getDeletedBy(){
		return deletedBy;
	}

	public void setDefaultProviderId(String defaultProviderId){
		this.defaultProviderId = defaultProviderId;
	}

	public String getDefaultProviderId(){
		return defaultProviderId;
	}

	public void setCreatedDate(Object createdDate){
		this.createdDate = createdDate;
	}

	public Object getCreatedDate(){
		return createdDate;
	}

	public void setAutoSwitch(boolean autoSwitch){
		this.autoSwitch = autoSwitch;
	}

	public boolean isAutoSwitch(){
		return autoSwitch;
	}

	public void setCreatedBy(Object createdBy){
		this.createdBy = createdBy;
	}

	public Object getCreatedBy(){
		return createdBy;
	}

	public void setDeletedDate(Object deletedDate){
		this.deletedDate = deletedDate;
	}

	public Object getDeletedDate(){
		return deletedDate;
	}

	public void setId(Object id){
		this.id = id;
	}

	public Object getId(){
		return id;
	}

	public void setTemporaryShutdown(boolean temporaryShutdown){
		this.temporaryShutdown = temporaryShutdown;
	}

	public boolean isTemporaryShutdown(){
		return temporaryShutdown;
	}

	public void setMsisdn(String msisdn){
		this.msisdn = msisdn;
	}

	public String getMsisdn(){
		return msisdn;
	}

	public void setBrand(Brand brand){
		this.brand = brand;
	}

	public Brand getBrand(){
		return brand;
	}

	public void setProductType(ProductType productType){
		this.productType = productType;
	}

	public ProductType getProductType(){
		return productType;
	}

	public void setAutoSwitchProviders(List<AutoSwitchProvidersItem> autoSwitchProviders){
		this.autoSwitchProviders = autoSwitchProviders;
	}

	public List<AutoSwitchProvidersItem> getAutoSwitchProviders(){
		return autoSwitchProviders;
	}
}