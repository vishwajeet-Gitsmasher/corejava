package Day_50;

public interface Bank {
	void deposit(double amount) throws InvalidAmountException;
	void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException;
	void transfer(BankAccount toAccount, double amount)throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException; 
	void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException;
	double getBalance();
}

/*
Bank Interface:
-------------------
Methods:

Method name: deposit 
return type : void
parameters : double amount
throws InvalidAmountException
Deposits the specified amount into the account. Throws InvalidAmountException if the amount is less than or equal to zero.


Method name: withdraw 
return type : void
parameters : double amount
throws InsufficientFundsException, InvalidAmountException:
Withdraws the specified amount from the account. Throws InsufficientFundsException if the amount is greater than the account balance. Throws InvalidAmountException if the amount is less than or equal to zero.


Method name: transfer 
return type : void
parameters : (BankAccount toAccount, double amount) 
throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException: 
Transfers the specified amount to another account. Throws InsufficientFundsException if the amount is greater than the account balance. Throws AccountNotFoundException if the target account is not found. Throws InvalidAmountException if the amount is less than or equal to zero.


Method name: applyForLoan 
return type : void
parameters : (double amount) 
throws LoanNotAllowedException, InvalidAmountException:
Applies for a loan of the specified amount(50000). Throws LoanNotAllowedException if the loan amount exceeds the allowed limit(50000) or if the balance is less than specified amount(50000). Throws InvalidAmountException if the amount is less than or equal to zero.

Method name: getBalance 
return type : double
Returns the current balance of the account.
*/