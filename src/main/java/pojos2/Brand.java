package pojos2;

public class Brand {
	private String id;
	private String storeId;
	private String createdDate;
	private String createdBy;
	private String updatedDate;
	private String updatedBy;
	private String version;

	public String getDeletedDate() {
		return deletedDate;
	}

	public void setDeletedDate(String deletedDate) {
		this.deletedDate = deletedDate;
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

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getExternalBrandId() {
		return externalBrandId;
	}

	public void setExternalBrandId(String externalBrandId) {
		this.externalBrandId = externalBrandId;
	}

	public String getBrandCode() {
		return brandCode;
	}

	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandDetail() {
		return brandDetail;
	}

	public void setBrandDetail(String brandDetail) {
		this.brandDetail = brandDetail;
	}

	public String getBrandDescription() {
		return brandDescription;
	}

	public void setBrandDescription(String brandDescription) {
		this.brandDescription = brandDescription;
	}

	public String getBrandLogoUrl() {
		return brandLogoUrl;
	}

	public void setBrandLogoUrl(String brandLogoUrl) {
		this.brandLogoUrl = brandLogoUrl;
	}

	private String deletedDate;
	private String deletedBy;
	private boolean markForDelete;
	private int brandId;
	private String externalBrandId;
	private String brandCode;
	private String brandName;
	private String brandDetail;
	private String brandDescription;
	private String brandLogoUrl;

	// Getters and Setters
	// (Add getters and setters for all fields here)
}
