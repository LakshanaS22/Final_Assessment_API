package pojos4;

public class PageMetaData{
	private int totalRecords;
	private int pageNumber;
	private int pageSize;

	public void setTotalRecords(int totalRecords){
		this.totalRecords = totalRecords;
	}

	public int getTotalRecords(){
		return totalRecords;
	}

	public void setPageNumber(int pageNumber){
		this.pageNumber = pageNumber;
	}

	public int getPageNumber(){
		return pageNumber;
	}

	public void setPageSize(int pageSize){
		this.pageSize = pageSize;
	}

	public int getPageSize(){
		return pageSize;
	}
}
