package pojos;

public class ContentItem{
	private String updatedBy;
	private String disabledDate;
	private String defaultProviderName;
	private boolean active;
	private boolean markForDelete;
	private String updatedDate;
	private String storeId;
	private int version;
	private String deletedBy;
	private String defaultProviderId;
	private String createdDate;
	private boolean autoSwitch;
	private String createdBy;
	private String deletedDate;
	private String id;
	private boolean temporaryShutdown;
	private String msisdn;
	private Brand brand;
	private ProductType productType;

	public void setUpdatedBy(String updatedBy){
		this.updatedBy = updatedBy;
	}

	public String getUpdatedBy(){
		return updatedBy;
	}

	public void setDisabledDate(String disabledDate){
		this.disabledDate = disabledDate;
	}

	public String getDisabledDate(){
		return disabledDate;
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

	public void setUpdatedDate(String updatedDate){
		this.updatedDate = updatedDate;
	}

	public String getUpdatedDate(){
		return updatedDate;
	}

	public void setStoreId(String storeId){
		this.storeId = storeId;
	}

	public String getStoreId(){
		return storeId;
	}

	public void setVersion(int version){
		this.version = version;
	}

	public int getVersion(){
		return version;
	}

	public void setDeletedBy(String deletedBy){
		this.deletedBy = deletedBy;
	}

	public String getDeletedBy(){
		return deletedBy;
	}

	public void setDefaultProviderId(String defaultProviderId){
		this.defaultProviderId = defaultProviderId;
	}

	public String getDefaultProviderId(){
		return defaultProviderId;
	}

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public void setAutoSwitch(boolean autoSwitch){
		this.autoSwitch = autoSwitch;
	}

	public boolean isAutoSwitch(){
		return autoSwitch;
	}

	public void setCreatedBy(String createdBy){
		this.createdBy = createdBy;
	}

	public String getCreatedBy(){
		return createdBy;
	}

	public void setDeletedDate(String deletedDate){
		this.deletedDate = deletedDate;
	}

	public String getDeletedDate(){
		return deletedDate;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
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
}
