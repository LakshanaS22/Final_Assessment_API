package pojos4;

public class MerchantDigitalSkuListItem{
	private boolean buyable;
	private boolean visible;
	private int offerPrice;
	private int commissionFee;
	private int handlingFee;
	private String marginScheme;
	private int markupFee;
	private boolean splitHandlingFeeFlag;
	private int totalMargin;
	private String merchantName;
	private Object marginMinimal;
	private String externalReference;
	private Object aggregatorHandlingFee;
	private Object marginPercentage;
	private String merchantId;
	private String marginType;
	private boolean hideAdminFeeFlag;
	private int purchaseLimit;
	private String skuCode;
	private int listPrice;

	public void setBuyable(boolean buyable){
		this.buyable = buyable;
	}

	public boolean isBuyable(){
		return buyable;
	}

	public void setVisible(boolean visible){
		this.visible = visible;
	}

	public boolean isVisible(){
		return visible;
	}

	public void setOfferPrice(int offerPrice){
		this.offerPrice = offerPrice;
	}

	public int getOfferPrice(){
		return offerPrice;
	}

	public void setCommissionFee(int commissionFee){
		this.commissionFee = commissionFee;
	}

	public int getCommissionFee(){
		return commissionFee;
	}

	public void setHandlingFee(int handlingFee){
		this.handlingFee = handlingFee;
	}

	public int getHandlingFee(){
		return handlingFee;
	}

	public void setMarginScheme(String marginScheme){
		this.marginScheme = marginScheme;
	}

	public String getMarginScheme(){
		return marginScheme;
	}

	public void setMarkupFee(int markupFee){
		this.markupFee = markupFee;
	}

	public int getMarkupFee(){
		return markupFee;
	}

	public void setSplitHandlingFeeFlag(boolean splitHandlingFeeFlag){
		this.splitHandlingFeeFlag = splitHandlingFeeFlag;
	}

	public boolean isSplitHandlingFeeFlag(){
		return splitHandlingFeeFlag;
	}

	public void setTotalMargin(int totalMargin){
		this.totalMargin = totalMargin;
	}

	public int getTotalMargin(){
		return totalMargin;
	}

	public void setMerchantName(String merchantName){
		this.merchantName = merchantName;
	}

	public String getMerchantName(){
		return merchantName;
	}

	public void setMarginMinimal(Object marginMinimal){
		this.marginMinimal = marginMinimal;
	}

	public Object getMarginMinimal(){
		return marginMinimal;
	}

	public void setExternalReference(String externalReference){
		this.externalReference = externalReference;
	}

	public String getExternalReference(){
		return externalReference;
	}

	public void setAggregatorHandlingFee(Object aggregatorHandlingFee){
		this.aggregatorHandlingFee = aggregatorHandlingFee;
	}

	public Object getAggregatorHandlingFee(){
		return aggregatorHandlingFee;
	}

	public void setMarginPercentage(Object marginPercentage){
		this.marginPercentage = marginPercentage;
	}

	public Object getMarginPercentage(){
		return marginPercentage;
	}

	public void setMerchantId(String merchantId){
		this.merchantId = merchantId;
	}

	public String getMerchantId(){
		return merchantId;
	}

	public void setMarginType(String marginType){
		this.marginType = marginType;
	}

	public String getMarginType(){
		return marginType;
	}

	public void setHideAdminFeeFlag(boolean hideAdminFeeFlag){
		this.hideAdminFeeFlag = hideAdminFeeFlag;
	}

	public boolean isHideAdminFeeFlag(){
		return hideAdminFeeFlag;
	}

	public void setPurchaseLimit(int purchaseLimit){
		this.purchaseLimit = purchaseLimit;
	}

	public int getPurchaseLimit(){
		return purchaseLimit;
	}

	public void setSkuCode(String skuCode){
		this.skuCode = skuCode;
	}

	public String getSkuCode(){
		return skuCode;
	}

	public void setListPrice(int listPrice){
		this.listPrice = listPrice;
	}

	public int getListPrice(){
		return listPrice;
	}
}
