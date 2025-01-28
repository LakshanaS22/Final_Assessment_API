package pojos12;

public class PaymentInfo{
	private int minAmount;
	private String description;
	private boolean active;
	private boolean repayable;
	private boolean holidayAffected;
	private int expiredTimeInSecond;
	private int expiredTimeDisplayCustomerInSecond;
	private int sequence;
	private int remainingAmount;
	private String bankShortName;
	private String paymentGroup;
	private boolean installment;
	private String imageUrl;
	private String paymentEngine;
	private String paymentMethod;
	private String swiftBankCode;
	private String listChannelId;
	private boolean refundable;
	private String paymentBackend;
	private int maxAmount;
	private int approvedProcessingDelayInMilisecond;

	public void setMinAmount(int minAmount){
		this.minAmount = minAmount;
	}

	public int getMinAmount(){
		return minAmount;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setActive(boolean active){
		this.active = active;
	}

	public boolean isActive(){
		return active;
	}

	public void setRepayable(boolean repayable){
		this.repayable = repayable;
	}

	public boolean isRepayable(){
		return repayable;
	}

	public void setHolidayAffected(boolean holidayAffected){
		this.holidayAffected = holidayAffected;
	}

	public boolean isHolidayAffected(){
		return holidayAffected;
	}

	public void setExpiredTimeInSecond(int expiredTimeInSecond){
		this.expiredTimeInSecond = expiredTimeInSecond;
	}

	public int getExpiredTimeInSecond(){
		return expiredTimeInSecond;
	}

	public void setExpiredTimeDisplayCustomerInSecond(int expiredTimeDisplayCustomerInSecond){
		this.expiredTimeDisplayCustomerInSecond = expiredTimeDisplayCustomerInSecond;
	}

	public int getExpiredTimeDisplayCustomerInSecond(){
		return expiredTimeDisplayCustomerInSecond;
	}

	public void setSequence(int sequence){
		this.sequence = sequence;
	}

	public int getSequence(){
		return sequence;
	}

	public void setRemainingAmount(int remainingAmount){
		this.remainingAmount = remainingAmount;
	}

	public int getRemainingAmount(){
		return remainingAmount;
	}

	public void setBankShortName(String bankShortName){
		this.bankShortName = bankShortName;
	}

	public String getBankShortName(){
		return bankShortName;
	}

	public void setPaymentGroup(String paymentGroup){
		this.paymentGroup = paymentGroup;
	}

	public String getPaymentGroup(){
		return paymentGroup;
	}

	public void setInstallment(boolean installment){
		this.installment = installment;
	}

	public boolean isInstallment(){
		return installment;
	}

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public void setPaymentEngine(String paymentEngine){
		this.paymentEngine = paymentEngine;
	}

	public String getPaymentEngine(){
		return paymentEngine;
	}

	public void setPaymentMethod(String paymentMethod){
		this.paymentMethod = paymentMethod;
	}

	public String getPaymentMethod(){
		return paymentMethod;
	}

	public void setSwiftBankCode(String swiftBankCode){
		this.swiftBankCode = swiftBankCode;
	}

	public String getSwiftBankCode(){
		return swiftBankCode;
	}

	public void setListChannelId(String listChannelId){
		this.listChannelId = listChannelId;
	}

	public String getListChannelId(){
		return listChannelId;
	}

	public void setRefundable(boolean refundable){
		this.refundable = refundable;
	}

	public boolean isRefundable(){
		return refundable;
	}

	public void setPaymentBackend(String paymentBackend){
		this.paymentBackend = paymentBackend;
	}

	public String getPaymentBackend(){
		return paymentBackend;
	}

	public void setMaxAmount(int maxAmount){
		this.maxAmount = maxAmount;
	}

	public int getMaxAmount(){
		return maxAmount;
	}

	public void setApprovedProcessingDelayInMilisecond(int approvedProcessingDelayInMilisecond){
		this.approvedProcessingDelayInMilisecond = approvedProcessingDelayInMilisecond;
	}

	public int getApprovedProcessingDelayInMilisecond(){
		return approvedProcessingDelayInMilisecond;
	}
}
