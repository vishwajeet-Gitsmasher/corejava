package Day_56;

public class ATMMachine {

	public static void main(String[] args) {
		Account a = new Account();
		
		Drawer d = new Drawer(a);
		Depositor dp = new Depositor(a);
		
		d.start();
		dp.start();
		
//		Thread t1 = new Thread(d);
//		Thread t2 = new Thread(dp);
//		t1.start();
//		t2.start();
	}

}

/*'
Deposit Successful of Rs.2000
Account Balance : 2000
Withdrawl Successful of Rs.1000
Remaining Balance : 1000
Deposit Successful of Rs.1000
Account Balance : 2000
Withdrawl Successful of Rs.2000
Remaining Balance : 0
Deposit Successful of Rs.4000
Account Balance : 4000
Withdrawl Successful of Rs.3000
Remaining Balance : 1000
 */

/*
Create an ELC class ATMMachine, inside main method create object as per 
requirement, start both the threads to see inter thread communication result
*/