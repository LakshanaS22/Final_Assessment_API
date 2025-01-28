package pojos12;

public class TransactionNotes{
	private String readableStatus;
	private String sn;
	private String message;
	private int status;
	private String timestamp;

	public void setReadableStatus(String readableStatus){
		this.readableStatus = readableStatus;
	}

	public String getReadableStatus(){
		return readableStatus;
	}

	public void setSn(String sn){
		this.sn = sn;
	}

	public String getSn(){
		return sn;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setStatus(int status){
		this.status = status;
	}

	public int getStatus(){
		return status;
	}

	public void setTimestamp(String timestamp){
		this.timestamp = timestamp;
	}

	public String getTimestamp(){
		return timestamp;
	}
}
