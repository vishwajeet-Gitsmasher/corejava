package Day_36;

public class SavingsAccount extends Account{
	double interestRate;

	public SavingsAccount(String accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}
	
	public SavingsAccount() {
		super();
	}
	
	
	public SavingsAccount generateStatement() {
		System.out.println("Account Number : "+super.getAccountNumber()+"\nBalance : "+super.getBalance()+"\nInterest Rate : "+this.interestRate);
		return new SavingsAccount();
	}
}

/*
Subclass - SavingsAccount:

Create a subclass named SavingsAccount that extends the Account class.
Add an additional attribute:
interestRate (double): Represents the interest rate for the savings account.
Implement a parameterized constructor to initialize the attributes of both the Account class and the SavingsAccount class.

Override the generateStatement(): In the SavingsAccount subclass, the generateStatement() method is overridden to  prints the account number, current balance, and the interest rate for the savings account. It utilizes the covariant return type to return a SavingsAccount object.

*/