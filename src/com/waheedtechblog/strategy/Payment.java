/**
 * 
 */
package com.waheedtechblog.strategy;

/**
 * This class decides total amount to be paid and using which payment gateway.
 * 
 * @author abdulwaheed18@gmail.com
 *
 */
public class Payment {

	private int amount;

	public Payment(int amount) {
		this.amount = amount;
	}

	public void pay(PaymentGateway gateway) {
		gateway.pay(amount);
	}

}
