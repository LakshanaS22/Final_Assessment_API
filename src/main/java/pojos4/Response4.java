package pojos4;

import java.util.List;

public class Response4 {
	private Object headers;
	private String requestId;
	private boolean success;
	private Object errorMessage;
	private Object errorCode;
	private PageMetaData pageMetaData;
	private List<ContentItem> content;

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

	public void setPageMetaData(PageMetaData pageMetaData){
		this.pageMetaData = pageMetaData;
	}

	public PageMetaData getPageMetaData(){
		return pageMetaData;
	}

	public void setContent(List<ContentItem> content){
		this.content = content;
	}

	public List<ContentItem> getContent(){
		return content;
	}
}