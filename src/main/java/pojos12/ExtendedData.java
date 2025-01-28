package pojos12;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)  // Ignore any unknown properties in the JSON response
public class ExtendedData {

	@JsonProperty("x-payment-transaction-id")  // Maps the JSON field 'x-payment-transaction-id' to the Java field 'xPaymentTransactionId'
	private String xPaymentTransactionId;

	@JsonProperty("payment-category")  // Maps 'payment-category' to 'paymentCategory'
	private String paymentCategory;

	private String channelId;

	@JsonProperty("fdscheckoutstatus")  // Maps 'fdscheckoutstatus' to 'fDSCHECKOUTSTATUS'
	private String fDSCHECKOUTSTATUS;

	// Getters and setters
	public String getXPaymentTransactionId() {
		return xPaymentTransactionId;
	}

	public void setXPaymentTransactionId(String xPaymentTransactionId) {
		this.xPaymentTransactionId = xPaymentTransactionId;
	}

	public String getPaymentCategory() {
		return paymentCategory;
	}

	public void setPaymentCategory(String paymentCategory) {
		this.paymentCategory = paymentCategory;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getFDSCHECKOUTSTATUS() {
		return fDSCHECKOUTSTATUS;
	}

	public void setFDSCHECKOUTSTATUS(String fDSCHECKOUTSTATUS) {
		this.fDSCHECKOUTSTATUS = fDSCHECKOUTSTATUS;
	}
}
