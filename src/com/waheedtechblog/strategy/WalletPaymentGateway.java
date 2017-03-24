/**
 * 
 */
package com.waheedtechblog.strategy;

/**
 * Wallet payment gateway
 * 
 * @author abdulwaheed18@gmail.com
 *
 */
public class WalletPaymentGateway implements PaymentGateway {

	private String mobileNumber;

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public WalletPaymentGateway(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public void pay(int amount) {
		System.out.println("Payment via Wallet: " + amount);

	}

}
