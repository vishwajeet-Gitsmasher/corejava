package Day_40;

public class TesterBank {

	public static void main(String[] args) {
		SBI s = new SBI();
		ICICI i = new ICICI();
		HDFC h = new HDFC();
		
		
		Customer c = new Customer("Rahul");
		System.out.println("SBI Bank Account");
		c.deposit(s, 5000);
		c.withdraw(s, 3000);
		c.checkBalance(s);

		System.out.println("\n========================================\n");
		
		System.out.println("HDFC Bank Account");
		c.deposit(h, 15000);
		c.withdraw(h, 8000);
		c.checkBalance(h);
		
		System.out.println("\n========================================\n");
		
		System.out.println("ICICI Bank Account");
		c.deposit(i, 35000);
		c.withdraw(i, 23000);
		c.checkBalance(i);
	}

}

/*
SBI Bank Account
Dposit Successful
Current balance in SBI Bank is : 5000.0
Withdraw Successful
Current balance in SBI Bank is : 2000.0

========================================

HDFC Bank Account
Dposit Successful
Current balance in HDFC Bank is : 15000.0
Withdraw Successful
Current balance in HDFC Bank is : 7000.0

========================================

ICICI Bank Account
Dposit Successful
Current balance in ICICI Bank is : 35000.0
Withdraw Successful
Current balance in ICICI Bank is : 12000.0

 */
/*
Create instances of SBI, HDFC, and ICICI bank classes.
Create a Customer instance.
Allow the customer to interact with each bank:


Note: Feel free to provide constructors and any additional methods required for the classes. You can adapt the question based on your preferences and the level of understanding you want to assess.
*/
