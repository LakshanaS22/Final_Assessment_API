package pojos12;

public class DigitalBill{
	private boolean reminderFlag;
	private boolean autoPayFlag;
	private int autoPayDay;
	private int reminderDay;
	private boolean existingBill;
	private String operatorName;
	private String productName;

	public void setReminderFlag(boolean reminderFlag){
		this.reminderFlag = reminderFlag;
	}

	public boolean isReminderFlag(){
		return reminderFlag;
	}

	public void setAutoPayFlag(boolean autoPayFlag){
		this.autoPayFlag = autoPayFlag;
	}

	public boolean isAutoPayFlag(){
		return autoPayFlag;
	}

	public void setAutoPayDay(int autoPayDay){
		this.autoPayDay = autoPayDay;
	}

	public int getAutoPayDay(){
		return autoPayDay;
	}

	public void setReminderDay(int reminderDay){
		this.reminderDay = reminderDay;
	}

	public int getReminderDay(){
		return reminderDay;
	}

	public void setExistingBill(boolean existingBill){
		this.existingBill = existingBill;
	}

	public boolean isExistingBill(){
		return existingBill;
	}

	public void setOperatorName(String operatorName){
		this.operatorName = operatorName;
	}

	public String getOperatorName(){
		return operatorName;
	}

	public void setProductName(String productName){
		this.productName = productName;
	}

	public String getProductName(){
		return productName;
	}
}
