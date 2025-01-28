package pojos;

public class ProductType{
	private String updatedBy;
	private boolean markForDelete;
	private String updatedDate;
	private String storeId;
	private int version;
	private String deletedBy;
	private boolean isNeedMsisdn;
	private String createdDate;
	private String createdBy;
	private String deletedDate;
	private String productTypeDescription;
	private boolean isNeedEnquiry;
	private String id;
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

	public void setIsNeedMsisdn(boolean isNeedMsisdn){
		this.isNeedMsisdn = isNeedMsisdn;
	}

	public boolean isIsNeedMsisdn(){
		return isNeedMsisdn;
	}

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public String getCreatedDate(){
		return createdDate;
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

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
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
