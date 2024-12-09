package Day_35;

public class PaymentMain {
	public static void main(String[] args) {
		Payment p = new Payment();
		p.processPayment();

		CreditCardPayment c = new CreditCardPayment();
		c.processPayment();
		
		PayPalPayment pp = new PayPalPayment();
		pp.processPayment();
		
		BankTransferPayment b = new BankTransferPayment();
		b.processPayment();
		
		System.out.println("\n=====By using Var Args=====\n");
		PaymentMain.processMultiplePayments(p,c,pp,b);
	}
	
	public static void processMultiplePayments(Payment... payments) {
		for(Payment p:payments) {
			p.processPayment();
		}
	}
}

/*
Processing payment
Processing credit card payment
Processing PayPal payment
Processing bank transfer payment

=====By using Var Args=====

Processing payment
Processing credit card payment
Processing PayPal payment
Processing bank transfer payment
 */

/*
Create a Main Class in which take main method and take one static method

Method :

Method to process multiple payments in a single transaction:

Method Name: processMultiplePayments
Access Modifier: public
Return Type: void
Arguments: Payment... payments

Task: Loop through each payment and call the processPayment method.

Create instances of Payment, CreditCardPayment, PayPalPayment, and BankTransferPayment.
Use polymorphism to call the processPayment method on each instance.



Test Case 1: 
--------------
Generic Payment
Sample Input:
if you are calling processPayment() of generic Payment

Expected Output :
Processing payment


Test Case 2: Credit Card Payment
---------------
Sample Input:
if you are calling processPayment() of Credit Card Payment

Expected Output :
Credit Card  payment done.
*/