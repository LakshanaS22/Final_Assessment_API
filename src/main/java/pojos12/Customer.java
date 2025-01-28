package pojos12;

public class Customer{
	private CustomerAddress customerAddress;
	private String loginEmail;
	private String mobilePhoneNumber;
	private String gender;
	private Level level;
	private String customerId;
	private String userType;
	private String userName;

	public void setCustomerAddress(CustomerAddress customerAddress){
		this.customerAddress = customerAddress;
	}

	public CustomerAddress getCustomerAddress(){
		return customerAddress;
	}

	public void setLoginEmail(String loginEmail){
		this.loginEmail = loginEmail;
	}

	public String getLoginEmail(){
		return loginEmail;
	}

	public void setMobilePhoneNumber(String mobilePhoneNumber){
		this.mobilePhoneNumber = mobilePhoneNumber;
	}

	public String getMobilePhoneNumber(){
		return mobilePhoneNumber;
	}

	public void setGender(String gender){
		this.gender = gender;
	}

	public String getGender(){
		return gender;
	}

	public void setLevel(Level level){
		this.level = level;
	}

	public Level getLevel(){
		return level;
	}

	public void setCustomerId(String customerId){
		this.customerId = customerId;
	}

	public String getCustomerId(){
		return customerId;
	}

	public void setUserType(String userType){
		this.userType = userType;
	}

	public String getUserType(){
		return userType;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public String getUserName(){
		return userName;
	}
}
