package pojos4;

import java.util.List;

public class ContentItem{
	private Object updatedBy;
	private List<MerchantDigitalSkuListItem> merchantDigitalSkuList;
	private String defaultProviderName;
	private boolean markForDelete;
	private Object updatedDate;
	private Object storeId;
	private Object version;
	private Object deletedBy;
	private Object createdDate;
	private Object createdBy;
	private Object deletedDate;
	private DigitalProduct digitalProduct;
	private Object id;

	public void setUpdatedBy(Object updatedBy){
		this.updatedBy = updatedBy;
	}

	public Object getUpdatedBy(){
		return updatedBy;
	}

	public void setMerchantDigitalSkuList(List<MerchantDigitalSkuListItem> merchantDigitalSkuList){
		this.merchantDigitalSkuList = merchantDigitalSkuList;
	}

	public List<MerchantDigitalSkuListItem> getMerchantDigitalSkuList(){
		return merchantDigitalSkuList;
	}

	public void setDefaultProviderName(String defaultProviderName){
		this.defaultProviderName = defaultProviderName;
	}

	public String getDefaultProviderName(){
		return defaultProviderName;
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

	public void setCreatedDate(Object createdDate){
		this.createdDate = createdDate;
	}

	public Object getCreatedDate(){
		return createdDate;
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

	public void setDigitalProduct(DigitalProduct digitalProduct){
		this.digitalProduct = digitalProduct;
	}

	public DigitalProduct getDigitalProduct(){
		return digitalProduct;
	}

	public void setId(Object id){
		this.id = id;
	}

	public Object getId(){
		return id;
	}
}