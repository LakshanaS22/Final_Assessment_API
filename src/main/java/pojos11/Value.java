package pojos11;

public class Value{
	private String pulsaCartId;
	private boolean reachRequestLimit;
	private String orderId;
	private int expiryInSeconds;
	private String paymentEngine;
	private RequestParam requestParam;
	private boolean autoApprove;
	private boolean status;
	private int retryIntervalInSeconds;

	public void setPulsaCartId(String pulsaCartId){
		this.pulsaCartId = pulsaCartId;
	}

	public String getPulsaCartId(){
		return pulsaCartId;
	}

	public void setReachRequestLimit(boolean reachRequestLimit){
		this.reachRequestLimit = reachRequestLimit;
	}

	public boolean isReachRequestLimit(){
		return reachRequestLimit;
	}

	public void setOrderId(String orderId){
		this.orderId = orderId;
	}

	public String getOrderId(){
		return orderId;
	}

	public void setExpiryInSeconds(int expiryInSeconds){
		this.expiryInSeconds = expiryInSeconds;
	}

	public int getExpiryInSeconds(){
		return expiryInSeconds;
	}

	public void setPaymentEngine(String paymentEngine){
		this.paymentEngine = paymentEngine;
	}

	public String getPaymentEngine(){
		return paymentEngine;
	}

	public void setRequestParam(RequestParam requestParam){
		this.requestParam = requestParam;
	}

	public RequestParam getRequestParam(){
		return requestParam;
	}

	public void setAutoApprove(boolean autoApprove){
		this.autoApprove = autoApprove;
	}

	public boolean isAutoApprove(){
		return autoApprove;
	}

	public void setStatus(boolean status){
		this.status = status;
	}

	public boolean isStatus(){
		return status;
	}

	public void setRetryIntervalInSeconds(int retryIntervalInSeconds){
		this.retryIntervalInSeconds = retryIntervalInSeconds;
	}

	public int getRetryIntervalInSeconds(){
		return retryIntervalInSeconds;
	}
}
