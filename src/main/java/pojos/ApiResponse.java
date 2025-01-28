package pojos;

import java.util.List;

public class ApiResponse {
	private List<HeadersItem> headers;
	private String requestId;
	private boolean success;
	private String errorMessage;
	private String errorCode;
	private PageMetaData pageMetaData;
	private List<ContentItem> content;

	public void setHeaders(List<HeadersItem> headers){
		this.headers = headers;
	}

	public List<HeadersItem> getHeaders(){
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

	public void setErrorMessage(String errorMessage){
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage(){
		return errorMessage;
	}

	public void setErrorCode(String errorCode){
		this.errorCode = errorCode;
	}

	public String getErrorCode(){
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