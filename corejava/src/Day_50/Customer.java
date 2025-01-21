package Day_50;

public class Customer {
	private String name;
	private BankAccount account;
	
	public Customer(String name, BankAccount account) {
		super();
		this.name = name;
		this.account = account;
	}
	
	BankAccount getAccount() {
		return account;
	}
}

/*
Customer Class(BLC):
Attributes:
name: String: private
account: BankAccount: private //HAS-A

Methods:
Constructor to initialize the customer's name and account.

getAccount(): Returns the customer's bank account.
*/