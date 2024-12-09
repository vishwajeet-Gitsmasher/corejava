package Day_28;

public class SavingAccount extends BankAccount{
	double interestRate;

	public SavingAccount(int accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}
	
	public void addInterest() {
		this.balance += (super.balance*this.interestRate)/100;
		System.out.println("Interest added ");
		System.out.println("Balance : "+super.balance);
	}
}

/*
SavingAccount class:-

extends from BankAccount.

Additional Attributes:
double interestRate: Represents the interest rate for the savings account.

create Parametrized constructor to initialize Instance Variables


Methods:-

1)method name:- addInterest
Return Type:- void
parameter: NO
this method Adds interest to the balance based on the interest rate.
*/