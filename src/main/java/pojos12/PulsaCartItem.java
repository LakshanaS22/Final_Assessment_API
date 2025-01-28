package pojos12;

import java.util.List;

public class PulsaCartItem{
	private String operatorDescription;
	private int quantity;
	private int adminCharge;
	private List<Object> adjustments;
	private String networkOperator;
	private String orderItemId;
	private String itemSku;
	private String description;
	private ItemDetail itemDetail;
	private int platformFee;
	private BrandProductCustomAttribute brandProductCustomAttribute;
	private int discountPercentage;
	private int total;
	private int adminChargeDiscount;
	private int nominal;
	private int price;
	private int originalPlatformFee;
	private String productType;
	private String providerName;
	private int orderItemAdjustment;

	public void setOperatorDescription(String operatorDescription){
		this.operatorDescription = operatorDescription;
	}

	public String getOperatorDescription(){
		return operatorDescription;
	}

	public void setQuantity(int quantity){
		this.quantity = quantity;
	}

	public int getQuantity(){
		return quantity;
	}

	public void setAdminCharge(int adminCharge){
		this.adminCharge = adminCharge;
	}

	public int getAdminCharge(){
		return adminCharge;
	}

	public void setAdjustments(List<Object> adjustments){
		this.adjustments = adjustments;
	}

	public List<Object> getAdjustments(){
		return adjustments;
	}

	public void setNetworkOperator(String networkOperator){
		this.networkOperator = networkOperator;
	}

	public String getNetworkOperator(){
		return networkOperator;
	}

	public void setOrderItemId(String orderItemId){
		this.orderItemId = orderItemId;
	}

	public String getOrderItemId(){
		return orderItemId;
	}

	public void setItemSku(String itemSku){
		this.itemSku = itemSku;
	}

	public String getItemSku(){
		return itemSku;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setItemDetail(ItemDetail itemDetail){
		this.itemDetail = itemDetail;
	}

	public ItemDetail getItemDetail(){
		return itemDetail;
	}

	public void setPlatformFee(int platformFee){
		this.platformFee = platformFee;
	}

	public int getPlatformFee(){
		return platformFee;
	}

	public void setBrandProductCustomAttribute(BrandProductCustomAttribute brandProductCustomAttribute){
		this.brandProductCustomAttribute = brandProductCustomAttribute;
	}

	public BrandProductCustomAttribute getBrandProductCustomAttribute(){
		return brandProductCustomAttribute;
	}

	public void setDiscountPercentage(int discountPercentage){
		this.discountPercentage = discountPercentage;
	}

	public int getDiscountPercentage(){
		return discountPercentage;
	}

	public void setTotal(int total){
		this.total = total;
	}

	public int getTotal(){
		return total;
	}

	public void setAdminChargeDiscount(int adminChargeDiscount){
		this.adminChargeDiscount = adminChargeDiscount;
	}

	public int getAdminChargeDiscount(){
		return adminChargeDiscount;
	}

	public void setNominal(int nominal){
		this.nominal = nominal;
	}

	public int getNominal(){
		return nominal;
	}

	public void setPrice(int price){
		this.price = price;
	}

	public int getPrice(){
		return price;
	}

	public void setOriginalPlatformFee(int originalPlatformFee){
		this.originalPlatformFee = originalPlatformFee;
	}

	public int getOriginalPlatformFee(){
		return originalPlatformFee;
	}

	public void setProductType(String productType){
		this.productType = productType;
	}

	public String getProductType(){
		return productType;
	}

	public void setProviderName(String providerName){
		this.providerName = providerName;
	}

	public String getProviderName(){
		return providerName;
	}

	public void setOrderItemAdjustment(int orderItemAdjustment){
		this.orderItemAdjustment = orderItemAdjustment;
	}

	public int getOrderItemAdjustment(){
		return orderItemAdjustment;
	}
}