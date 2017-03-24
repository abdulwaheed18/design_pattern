/**
 * 
 */
package com.waheedtechblog.strategy;

/**
 * CreditCard payment gatway
 * 
 * @author abdulwaheed18@gmail.com
 *
 */
public class CreditCardPaymentGateway implements PaymentGateway {

	private String ownerName;
	private String cardNumber;
	private String expiryDate;
	private String cvv;

	public CreditCardPaymentGateway(String ownerName, String cardNumber, String expiryDate, String cvv) {
		this.ownerName = ownerName;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.expiryDate = expiryDate;
	}

	@Override
	public void pay(int amount) {
		System.out.println("Payment via CreditCard: " + amount);
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
}
