package pojos12;

public class VerifyOrder{
	private String requestId;
	private boolean success;
	private Values value;

	public void setRequestId(String requestId){
		this.requestId = requestId;
	}

	public String getRequestId(){
		return requestId;
	}

	public void setSuccess(boolean success){
		this.success = success;
	}

	public boolean isSuccess(){
		return success;
	}

	public void setValue(Values value){
		this.value = value;
	}

	public Values getValue(){
		return value;
	}
}
