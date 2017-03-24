/**
 * 
 */
package com.waheedtechblog.strategy;

/**
 * In strategy Pattern, the behaviors get decided at runtime.
 * 
 * The real example can be Amazon payment gateway where decision of payment
 * gateway decided at runtime by the customer.
 * 
 * In JDK,
 * 
 * Collections.sort(list, comparator)
 * 
 * @author abdulwaheed18@gmail.com
 *
 */
public class StrategyTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// CreditCardPaymentGateway, NetbankingPaymentGateway and
		// WalletPaymentGateway are the different types of payment gateway

		// Payment -> Class which decides the payment gateway at runtime

		Payment payment = new Payment(5000);

		// if payment via card
		PaymentGateway creditCard = new CreditCardPaymentGateway("Abdul", "1234567890123412", "11/18", "123");
		payment.pay(creditCard);

		// if payment via Netbanking
		PaymentGateway netBanking = new NetBankingPaymentGateway("1234567", "********");
		payment.pay(netBanking);

		// if payment via Wallet
		PaymentGateway wallet = new WalletPaymentGateway("123456789");
		payment.pay(wallet);

	}

}
