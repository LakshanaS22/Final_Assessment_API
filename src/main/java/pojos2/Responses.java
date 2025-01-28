package pojos2;

public class Responses {
	private Object headers;
	private String requestId;
	private boolean success;
	private Object errorMessage;
	private Object errorCode;
	public Value value;

	public void setHeaders(Object headers){
		this.headers = headers;
	}

	public Object getHeaders(){
		return headers;
	}

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

	public void setErrorMessage(Object errorMessage){
		this.errorMessage = errorMessage;
	}

	public Object getErrorMessage(){
		return errorMessage;
	}

	public void setErrorCode(Object errorCode){
		this.errorCode = errorCode;
	}

	public Object getErrorCode(){
		return errorCode;
	}

	public void setValue(Value value){
		this.value = value;
	}

	public Value getValue(){
		return value;
	}
}
