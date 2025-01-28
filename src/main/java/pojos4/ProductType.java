package pojos4;

public class ProductType{
	private String updatedBy;
	private boolean markForDelete;
	private long updatedDate;
	private String storeId;
	private Object version;
	private Object deletedBy;
	private boolean isNeedMsisdn;
	private long createdDate;
	private String createdBy;
	private Object deletedDate;
	private String productTypeDescription;
	private boolean isNeedEnquiry;
	private Object id;
	private String productTypeCode;
	private String pricingType;

	public void setUpdatedBy(String updatedBy){
		this.updatedBy = updatedBy;
	}

	public String getUpdatedBy(){
		return updatedBy;
	}

	public void setMarkForDelete(boolean markForDelete){
		this.markForDelete = markForDelete;
	}

	public boolean isMarkForDelete(){
		return markForDelete;
	}

	public void setUpdatedDate(long updatedDate){
		this.updatedDate = updatedDate;
	}

	public long getUpdatedDate(){
		return updatedDate;
	}

	public void setStoreId(String storeId){
		this.storeId = storeId;
	}

	public String getStoreId(){
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

	public void setIsNeedMsisdn(boolean isNeedMsisdn){
		this.isNeedMsisdn = isNeedMsisdn;
	}

	public boolean isIsNeedMsisdn(){
		return isNeedMsisdn;
	}

	public void setCreatedDate(long createdDate){
		this.createdDate = createdDate;
	}

	public long getCreatedDate(){
		return createdDate;
	}

	public void setCreatedBy(String createdBy){
		this.createdBy = createdBy;
	}

	public String getCreatedBy(){
		return createdBy;
	}

	public void setDeletedDate(Object deletedDate){
		this.deletedDate = deletedDate;
	}

	public Object getDeletedDate(){
		return deletedDate;
	}

	public void setProductTypeDescription(String productTypeDescription){
		this.productTypeDescription = productTypeDescription;
	}

	public String getProductTypeDescription(){
		return productTypeDescription;
	}

	public void setIsNeedEnquiry(boolean isNeedEnquiry){
		this.isNeedEnquiry = isNeedEnquiry;
	}

	public boolean isIsNeedEnquiry(){
		return isNeedEnquiry;
	}

	public void setId(Object id){
		this.id = id;
	}

	public Object getId(){
		return id;
	}

	public void setProductTypeCode(String productTypeCode){
		this.productTypeCode = productTypeCode;
	}

	public String getProductTypeCode(){
		return productTypeCode;
	}

	public void setPricingType(String pricingType){
		this.pricingType = pricingType;
	}

	public String getPricingType(){
		return pricingType;
	}
}
