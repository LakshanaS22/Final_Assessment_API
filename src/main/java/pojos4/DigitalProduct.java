package pojos4;

public class DigitalProduct{
	private boolean buyable;
	private String updatedBy;
	private boolean visible;
	private int productId;
	private String description;
	private boolean markForDelete;
	private long updatedDate;
	private String label;
	private String storeId;
	private Object version;
	private Object deletedBy;
	private String internalName;
	private long createdDate;
	private String createdBy;
	private Object deletedDate;
	private Object id;
	private String externalProductId;
	private Brand brand;
	private ProductType productType;

	public void setBuyable(boolean buyable){
		this.buyable = buyable;
	}

	public boolean isBuyable(){
		return buyable;
	}

	public void setUpdatedBy(String updatedBy){
		this.updatedBy = updatedBy;
	}

	public String getUpdatedBy(){
		return updatedBy;
	}

	public void setVisible(boolean visible){
		this.visible = visible;
	}

	public boolean isVisible(){
		return visible;
	}

	public void setProductId(int productId){
		this.productId = productId;
	}

	public int getProductId(){
		return productId;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
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

	public void setLabel(String label){
		this.label = label;
	}

	public String getLabel(){
		return label;
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

	public void setInternalName(String internalName){
		this.internalName = internalName;
	}

	public String getInternalName(){
		return internalName;
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

	public void setId(Object id){
		this.id = id;
	}

	public Object getId(){
		return id;
	}

	public void setExternalProductId(String externalProductId){
		this.externalProductId = externalProductId;
	}

	public String getExternalProductId(){
		return externalProductId;
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
