package pojos12;

import java.util.List;

public class PulsaOrder{
	private int totalOrderAdjustment;
	private String orderId;
	private boolean flashSalePPASku;
	private boolean orderCancelledByAging;
	private int acquiredPointLoyalty;
	private int productAdjustmentValue;
	private boolean subscription;
	private boolean processCCForReorder;
	private List<Object> appliedPromoCodeAndValue;
	private boolean appliedTiketPoints;
	private String responseCode;
	private String pulsaCartId;
	private int totalOrderWithAdmin;
	private String paymentStepUrl;
	private boolean reviewed;
	private Payment payment;
	private boolean overLimitFailure;
	private AdditionalData additionalData;
	private String msisdn;
	private String businessChannel;
	private String pendingCartId;
	private boolean paymentPublished;
	private String transactionStatus;
	private TransactionNotes transactionNotes;
	private boolean orderReceivedEmailSent;
	private boolean includePlatformFeeInAdminCharge;
	private PulsaCartItem pulsaCartItem;
	private String externalOrderId;
	private int orderAdjustmentWithoutTiketPoints;
	private boolean resendOrderApproved;
	private int redeemableTiketPoint;
	private boolean resendOrderRejected;
	private boolean combinePayment;
	private boolean fraudOrder;
	private boolean orderPaidEmailSent;
	private int walletCashbackAmount;
	private boolean enableSubscription;
	private List<Object> appliedCouponAndValue;
	private int totalOrder;
	private int totalAdjustmentPoints;
	private CommonInquiryInfo commonInquiryInfo;
	private String orderDate;
	private boolean resendOrderRequested;
	private Customer customer;
	private String status;

	public void setTotalOrderAdjustment(int totalOrderAdjustment){
		this.totalOrderAdjustment = totalOrderAdjustment;
	}

	public int getTotalOrderAdjustment(){
		return totalOrderAdjustment;
	}

	public void setOrderId(String orderId){
		this.orderId = orderId;
	}

	public String getOrderId(){
		return orderId;
	}

	public void setFlashSalePPASku(boolean flashSalePPASku){
		this.flashSalePPASku = flashSalePPASku;
	}

	public boolean isFlashSalePPASku(){
		return flashSalePPASku;
	}

	public void setOrderCancelledByAging(boolean orderCancelledByAging){
		this.orderCancelledByAging = orderCancelledByAging;
	}

	public boolean isOrderCancelledByAging(){
		return orderCancelledByAging;
	}

	public void setAcquiredPointLoyalty(int acquiredPointLoyalty){
		this.acquiredPointLoyalty = acquiredPointLoyalty;
	}

	public int getAcquiredPointLoyalty(){
		return acquiredPointLoyalty;
	}

	public void setProductAdjustmentValue(int productAdjustmentValue){
		this.productAdjustmentValue = productAdjustmentValue;
	}

	public int getProductAdjustmentValue(){
		return productAdjustmentValue;
	}

	public void setSubscription(boolean subscription){
		this.subscription = subscription;
	}

	public boolean isSubscription(){
		return subscription;
	}

	public void setProcessCCForReorder(boolean processCCForReorder){
		this.processCCForReorder = processCCForReorder;
	}

	public boolean isProcessCCForReorder(){
		return processCCForReorder;
	}

	public void setAppliedPromoCodeAndValue(List<Object> appliedPromoCodeAndValue){
		this.appliedPromoCodeAndValue = appliedPromoCodeAndValue;
	}

	public List<Object> getAppliedPromoCodeAndValue(){
		return appliedPromoCodeAndValue;
	}

	public void setAppliedTiketPoints(boolean appliedTiketPoints){
		this.appliedTiketPoints = appliedTiketPoints;
	}

	public boolean isAppliedTiketPoints(){
		return appliedTiketPoints;
	}

	public void setResponseCode(String responseCode){
		this.responseCode = responseCode;
	}

	public String getResponseCode(){
		return responseCode;
	}

	public void setPulsaCartId(String pulsaCartId){
		this.pulsaCartId = pulsaCartId;
	}

	public String getPulsaCartId(){
		return pulsaCartId;
	}

	public void setTotalOrderWithAdmin(int totalOrderWithAdmin){
		this.totalOrderWithAdmin = totalOrderWithAdmin;
	}

	public int getTotalOrderWithAdmin(){
		return totalOrderWithAdmin;
	}

	public void setPaymentStepUrl(String paymentStepUrl){
		this.paymentStepUrl = paymentStepUrl;
	}

	public String getPaymentStepUrl(){
		return paymentStepUrl;
	}

	public void setReviewed(boolean reviewed){
		this.reviewed = reviewed;
	}

	public boolean isReviewed(){
		return reviewed;
	}

	public void setPayment(Payment payment){
		this.payment = payment;
	}

	public Payment getPayment(){
		return payment;
	}

	public void setOverLimitFailure(boolean overLimitFailure){
		this.overLimitFailure = overLimitFailure;
	}

	public boolean isOverLimitFailure(){
		return overLimitFailure;
	}

	public void setAdditionalData(AdditionalData additionalData){
		this.additionalData = additionalData;
	}

	public AdditionalData getAdditionalData(){
		return additionalData;
	}

	public void setMsisdn(String msisdn){
		this.msisdn = msisdn;
	}

	public String getMsisdn(){
		return msisdn;
	}

	public void setBusinessChannel(String businessChannel){
		this.businessChannel = businessChannel;
	}

	public String getBusinessChannel(){
		return businessChannel;
	}

	public void setPendingCartId(String pendingCartId){
		this.pendingCartId = pendingCartId;
	}

	public String getPendingCartId(){
		return pendingCartId;
	}

	public void setPaymentPublished(boolean paymentPublished){
		this.paymentPublished = paymentPublished;
	}

	public boolean isPaymentPublished(){
		return paymentPublished;
	}

	public void setTransactionStatus(String transactionStatus){
		this.transactionStatus = transactionStatus;
	}

	public String getTransactionStatus(){
		return transactionStatus;
	}

	public void setTransactionNotes(TransactionNotes transactionNotes){
		this.transactionNotes = transactionNotes;
	}

	public TransactionNotes getTransactionNotes(){
		return transactionNotes;
	}

	public void setOrderReceivedEmailSent(boolean orderReceivedEmailSent){
		this.orderReceivedEmailSent = orderReceivedEmailSent;
	}

	public boolean isOrderReceivedEmailSent(){
		return orderReceivedEmailSent;
	}

	public void setIncludePlatformFeeInAdminCharge(boolean includePlatformFeeInAdminCharge){
		this.includePlatformFeeInAdminCharge = includePlatformFeeInAdminCharge;
	}

	public boolean isIncludePlatformFeeInAdminCharge(){
		return includePlatformFeeInAdminCharge;
	}

	public void setPulsaCartItem(PulsaCartItem pulsaCartItem){
		this.pulsaCartItem = pulsaCartItem;
	}

	public PulsaCartItem getPulsaCartItem(){
		return pulsaCartItem;
	}

	public void setExternalOrderId(String externalOrderId){
		this.externalOrderId = externalOrderId;
	}

	public String getExternalOrderId(){
		return externalOrderId;
	}

	public void setOrderAdjustmentWithoutTiketPoints(int orderAdjustmentWithoutTiketPoints){
		this.orderAdjustmentWithoutTiketPoints = orderAdjustmentWithoutTiketPoints;
	}

	public int getOrderAdjustmentWithoutTiketPoints(){
		return orderAdjustmentWithoutTiketPoints;
	}

	public void setResendOrderApproved(boolean resendOrderApproved){
		this.resendOrderApproved = resendOrderApproved;
	}

	public boolean isResendOrderApproved(){
		return resendOrderApproved;
	}

	public void setRedeemableTiketPoint(int redeemableTiketPoint){
		this.redeemableTiketPoint = redeemableTiketPoint;
	}

	public int getRedeemableTiketPoint(){
		return redeemableTiketPoint;
	}

	public void setResendOrderRejected(boolean resendOrderRejected){
		this.resendOrderRejected = resendOrderRejected;
	}

	public boolean isResendOrderRejected(){
		return resendOrderRejected;
	}

	public void setCombinePayment(boolean combinePayment){
		this.combinePayment = combinePayment;
	}

	public boolean isCombinePayment(){
		return combinePayment;
	}

	public void setFraudOrder(boolean fraudOrder){
		this.fraudOrder = fraudOrder;
	}

	public boolean isFraudOrder(){
		return fraudOrder;
	}

	public void setOrderPaidEmailSent(boolean orderPaidEmailSent){
		this.orderPaidEmailSent = orderPaidEmailSent;
	}

	public boolean isOrderPaidEmailSent(){
		return orderPaidEmailSent;
	}

	public void setWalletCashbackAmount(int walletCashbackAmount){
		this.walletCashbackAmount = walletCashbackAmount;
	}

	public int getWalletCashbackAmount(){
		return walletCashbackAmount;
	}

	public void setEnableSubscription(boolean enableSubscription){
		this.enableSubscription = enableSubscription;
	}

	public boolean isEnableSubscription(){
		return enableSubscription;
	}

	public void setAppliedCouponAndValue(List<Object> appliedCouponAndValue){
		this.appliedCouponAndValue = appliedCouponAndValue;
	}

	public List<Object> getAppliedCouponAndValue(){
		return appliedCouponAndValue;
	}

	public void setTotalOrder(int totalOrder){
		this.totalOrder = totalOrder;
	}

	public int getTotalOrder(){
		return totalOrder;
	}

	public void setTotalAdjustmentPoints(int totalAdjustmentPoints){
		this.totalAdjustmentPoints = totalAdjustmentPoints;
	}

	public int getTotalAdjustmentPoints(){
		return totalAdjustmentPoints;
	}

	public void setCommonInquiryInfo(CommonInquiryInfo commonInquiryInfo){
		this.commonInquiryInfo = commonInquiryInfo;
	}

	public CommonInquiryInfo getCommonInquiryInfo(){
		return commonInquiryInfo;
	}

	public void setOrderDate(String orderDate){
		this.orderDate = orderDate;
	}

	public String getOrderDate(){
		return orderDate;
	}

	public void setResendOrderRequested(boolean resendOrderRequested){
		this.resendOrderRequested = resendOrderRequested;
	}

	public boolean isResendOrderRequested(){
		return resendOrderRequested;
	}

	public void setCustomer(Customer customer){
		this.customer = customer;
	}

	public Customer getCustomer(){
		return customer;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}
}