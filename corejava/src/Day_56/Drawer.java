package Day_56;

public class Drawer extends Thread{
	private Account account;

	public Drawer(Account account) {
		super();
		this.account = account;
	} 
	
	@Override
	public void run() {
		int[] withdrawals = {1000,2000,3000};
		for(int withdrawl:withdrawals) {
			account.withdraw(withdrawl);
		}
	}
}

/*
Create another BLC class Drawer which extends from Thread class
Instance Variable :
private Account account;  //HAS-A Relation

Initialize the Object properties by using parameterized constructor.

Override run() method :
inside run method create an array variable of type int withdrawals which 
will accept multiple amount in int value.

create a for each loop to accept these integer value one by one and pass these 
value to withdraw the amount. In each withdraw process you should have 1 sec
waiting period.
*/