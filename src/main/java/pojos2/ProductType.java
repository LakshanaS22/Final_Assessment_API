package pojos2;

public class ProductType {
	private String id;
	private String storeId;
	private String createdDate;
	private String createdBy;
	private String updatedDate;

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
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

	public String getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
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

	public String getProductTypeCode() {
		return productTypeCode;
	}

	public void setProductTypeCode(String productTypeCode) {
		this.productTypeCode = productTypeCode;
	}

	public String getProductTypeDescription() {
		return productTypeDescription;
	}

	public void setProductTypeDescription(String productTypeDescription) {
		this.productTypeDescription = productTypeDescription;
	}

	public String getPricingType() {
		return pricingType;
	}

	public void setPricingType(String pricingType) {
		this.pricingType = pricingType;
	}

	public boolean isNeedMsisdn() {
		return isNeedMsisdn;
	}

	public void setNeedMsisdn(boolean needMsisdn) {
		isNeedMsisdn = needMsisdn;
	}

	public boolean isNeedEnquiry() {
		return isNeedEnquiry;
	}

	public void setNeedEnquiry(boolean needEnquiry) {
		isNeedEnquiry = needEnquiry;
	}

	private String updatedBy;
	private String version;
	private String deletedDate;
	private String deletedBy;
	private boolean markForDelete;
	private String productTypeCode;
	private String productTypeDescription;
	private String pricingType;
	private boolean isNeedMsisdn;
	private boolean isNeedEnquiry;

	// Getters and Setters
	// (Add getters and setters for all fields here)
}
