package pojos12;

public class Payment{
	private int amount;
	private int handlingFee;
	private String paymentId;
	private boolean paylaterEnabled;
	private BillingAddress billingAddress;
	private String billingName;
	private String paymentStatus;
	private PaymentInfo paymentInfo;
	private String transactionId;
	private ExtendedData extendedData;

	public void setAmount(int amount){
		this.amount = amount;
	}

	public int getAmount(){
		return amount;
	}

	public void setHandlingFee(int handlingFee){
		this.handlingFee = handlingFee;
	}

	public int getHandlingFee(){
		return handlingFee;
	}

	public void setPaymentId(String paymentId){
		this.paymentId = paymentId;
	}

	public String getPaymentId(){
		return paymentId;
	}

	public void setPaylaterEnabled(boolean paylaterEnabled){
		this.paylaterEnabled = paylaterEnabled;
	}

	public boolean isPaylaterEnabled(){
		return paylaterEnabled;
	}

	public void setBillingAddress(BillingAddress billingAddress){
		this.billingAddress = billingAddress;
	}

	public BillingAddress getBillingAddress(){
		return billingAddress;
	}

	public void setBillingName(String billingName){
		this.billingName = billingName;
	}

	public String getBillingName(){
		return billingName;
	}

	public void setPaymentStatus(String paymentStatus){
		this.paymentStatus = paymentStatus;
	}

	public String getPaymentStatus(){
		return paymentStatus;
	}

	public void setPaymentInfo(PaymentInfo paymentInfo){
		this.paymentInfo = paymentInfo;
	}

	public PaymentInfo getPaymentInfo(){
		return paymentInfo;
	}

	public void setTransactionId(String transactionId){
		this.transactionId = transactionId;
	}

	public String getTransactionId(){
		return transactionId;
	}

	public void setExtendedData(ExtendedData extendedData){
		this.extendedData = extendedData;
	}

	public ExtendedData getExtendedData(){
		return extendedData;
	}
}
