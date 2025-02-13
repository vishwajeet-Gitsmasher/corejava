package Day_28;

public class CheckingAccount extends BankAccount{
	double overdraftLimit = 3000;

	public CheckingAccount(int accountNumber, double balance) {
		super(accountNumber, balance);;
	}
	
	public void withdraw(double amount) {
		if(amount > this.overdraftLimit) {
			System.out.println("Exceeds overdraft limit.");
		} else {
			super.balance -= amount;
			System.out.println("Withdrawl Successful of rs : "+amount);
			System.out.println("Balance : "+super.balance);
		}
	}
}

/*
CheckingAccount Class:

extends from BankAccount.

Additional Attributes:

double overdraftLimit: Represents the overdraft limit for the checking account.//3000

create Parametrized constructor to initialize Instance Variables

Methods:-

void withdraw(double amount): Subtracts the specified amount from the balance if it does 
not exceed the overdraft limit(3000); otherwise, prints "Exceeds overdraft limit."
*/