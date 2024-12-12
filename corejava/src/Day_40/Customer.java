package Day_40;

public class Customer {
	String name;
	
	public Customer(String name){
		super();
		this.name = name;
	}

	void deposit(Bank bank, double amount) {
		bank.deposit(amount);
	}
	
	void withdraw(Bank bank, double amount) {
		bank.withdraw(amount);
	}
	
	void checkBalance(Bank bank) {
		bank.checkBalance();
	}
}

/*
Create the Customer class:
------------------------------

Attributes: name (String), accountBalance (double)
Methods: deposit(Bank bank, double amount), withdraw(Bank bank, double amount), checkBalance(Bank bank)
Demonstrate the loosely coupled architecture:

Create instances of SBI, HDFC, and ICICI bank classes.
Create a Customer instance.
Allow the customer to interact with each bank:


Note: Feel free to provide constructors and any additional methods required for the classes. You can adapt the question based on your preferences and the level of understanding you want to assess.

*/