package Day_28;

public class BankAccount {
	int accountNumber;
	double balance;
	
	public BankAccount(int accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		if(amount >0) {
			this.balance += amount;
			System.out.println("Deposit Successful of rs : "+amount);
			System.out.println("Balance : "+this.balance);
		} else {
			System.out.println("Invalid Amount");
		}
	}
	
	public void withdraw (double amount) {
		if(amount >0 && amount <= this.balance) {
			this.balance -= amount;
			System.out.println("Withdrawl Successful of rs : "+amount);
			System.out.println("Balance : "+this.balance);
		} else if (amount > this.balance) {
			System.out.println("Insufficient funds.");
		} else {
			System.out.println("Invalid Amount");
		}
	}
}

/*
Program 4 : (points 10) )Hierarchical Inheritance
-----------------------------------------------------------------------------------------------------
You are tasked with modeling a simple banking system using Java classes. Implement three classes: BankAccount, SavingsAccount, and CheckingAccount.

BankAccount Class:

Attributes:

int accountNumber: Represents the account number.
double balance: Represents the current balance in the account.

create Parametrized constructor to initialize Instance Variables

Methods:-

1)method name:- deposite
Return Type:- void
parameter: double amount
this method Adds the specified amount to the balance.

2)method name:- withdraw
Return Type:- void
parameter: double amount

Subtracts the specified amount from the balance if sufficient funds are available; otherwise, prints "Insufficient funds."

*/