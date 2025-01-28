package pojos12;

public class CommonInquiryInfo{
	private int adminListCharge;
	private DigitalBill digitalBill;
	private int adminOfferCharge;

	public void setAdminListCharge(int adminListCharge){
		this.adminListCharge = adminListCharge;
	}

	public int getAdminListCharge(){
		return adminListCharge;
	}

	public void setDigitalBill(DigitalBill digitalBill){
		this.digitalBill = digitalBill;
	}

	public DigitalBill getDigitalBill(){
		return digitalBill;
	}

	public void setAdminOfferCharge(int adminOfferCharge){
		this.adminOfferCharge = adminOfferCharge;
	}

	public int getAdminOfferCharge(){
		return adminOfferCharge;
	}
}
