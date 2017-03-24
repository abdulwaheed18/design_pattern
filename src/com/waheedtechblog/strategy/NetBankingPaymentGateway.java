/**
 * 
 */
package com.waheedtechblog.strategy;

/**
 * 
 * Netbanking Payment Gateway
 *
 * @author abdulwaheed18@gmail.com
 *
 */
public class NetBankingPaymentGateway implements PaymentGateway {

	private String accountId;
	private String password;

	public NetBankingPaymentGateway(String accountId, String password) {
		this.accountId = accountId;
		this.password = password;
	}

	@Override
	public void pay(int amount) {
		System.out.println("Payment via NetBanking: " + amount);
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
