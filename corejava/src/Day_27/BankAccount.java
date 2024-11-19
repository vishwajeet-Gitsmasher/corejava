package Day_27;

public class BankAccount {
	int accountNumber;
	double balance;
	
	public BankAccount(int accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
		System.out.println("Money Deposited, Now balance : "+this.balance);
	}
	
	public void withdraw(double amount) {
		if(amount <= this.balance) {
			this.balance -= amount;
			System.out.println("Withdrawl Successful");
			System.out.println("Money Withdrawl, Now balance : "+this.balance);
		} else {
			System.out.println("Insuffcient funds");
		}
	}
}


/*
-------
1)
You are tasked with modeling a simple banking system using Java classes. Implement three classes: BankAccount, SavingsAccount, and CheckingAccount.

BankAccount Class:

Attributes:

int accountNumber: Represents the account number.
double balance: Represents the current balance in the account.

create Parametrized constructor to initialize Instance Variables

Methods:-

1)method name:- deposit
Return Type:- void
parameter: double amount
this method Adds the specified amount to the balance.

2)method name:- withdraw
Return Type:- void
parameter: double amount

Subtracts the specified amount from the balance if sufficient funds are available; otherwise, prints "Insufficient funds."

*/