package Day_50;

public class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String errorMessage) {
		super(errorMessage);
	}
}

/*
Bank Application
Objective:
Develop a Java program for a bank application that performs deposit, withdrawal, transfer, loan application, and balance check operations 
with proper input validation and error handling. The program should utilize a Bank interface, BankAccount and Customer classes, and an 
ATM class to demonstrate the application's functionality. Use custom exceptions, switch-case statements, try-with-resources, and 
multi-catch blocks for error handling.

Requirements:
Custom Exceptions:

class InsufficientFundsException(Checked):
Methods:
Parameterized Constructor with String as parameter
Purpose: Thrown when there are not enough funds for a withdrawal or transfer.

class InvalidAmountException(Unchecked):
Methods:
Parameterized Constructor with String as parameter
Purpose: Thrown when an invalid amount is entered for any transaction.

class AccountNotFoundException(Checked):
Methods:
Parameterized Constructor with String as parameter
Purpose: Thrown when an account is not found during a transfer.

class LoanNotAllowedException(Unchecked):
Methods:
Parameterized Constructor with String as parameter
Purpose:
Thrown when the loan amount exceeds the allowed limit.

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

BankAccount Class(BLC):
Attributes:
accountNumber: long: private
balance:double: private

Implements Bank interface.
Methods:
Implement all methods from the Bank interface.
deposit(double amount): Increases the account balance by the specified amount. Throws InvalidAmountException if the amount is less than or equal to zero.

withdraw(double amount): Decreases the account balance by the specified amount. Throws InsufficientFundsException if the amount is greater than the account balance. Throws InvalidAmountException if the amount is less than or equal to zero.

transfer(BankAccount toAccount, double amount): Transfers the specified amount to another account. Throws InsufficientFundsException if the amount is greater than the account balance. Throws AccountNotFoundException if the target account is not found(i,e if toAccount is null). Throws InvalidAmountException if the amount is less than or equal to zero.

applyForLoan(double amount): Allows the user to apply for a loan. Throws LoanNotAllowedException if the loan amount exceeds the allowed limit. Throws InvalidAmountException if the amount is less than or equal to zero.

getBalance(): Returns the current balance of the account.
Constructor to initialize account number and initial balance.


Customer Class(BLC):
Attributes:
name: String: private
account: BankAccount: private //HAS-A

Methods:
Constructor to initialize the customer's name and account.

getAccount(): Returns the customer's bank account.

ATM Class(ELC):
Contains the main method to demonstrate the application.
Uses switch-case for different operations (deposit, withdraw, transfer, loan application, check balance).
Uses try-with-resources and multi-catch blocks for error handling , use switch case to  display the oprations as menu
like : 
      Select an option :
           1. Deposit
           2. Withdraw
           3. Transfer
           4. Loan Application
           5. Check Balance
           6. Exit
      Enter your option : 1

Validates all inputs.

Test Cases for Bank Application
---------------------------------
Deposit Test Cases - 1:
Valid Deposit:
Action: Deposit 1000 into account.
Expected Output: Balance should increase by 1000.
Invalid Deposit Amount:
Action: Attempt to deposit -500.
Expected Output: Should throw InvalidAmountException with appropriate message.

Withdrawal Test Cases - 2:
Valid Withdrawal:
Action: Withdraw 500 from account balance of 1000.
Expected Output: Balance should decrease by 500.
Insufficient Funds:
Action: Attempt to withdraw 1500 from account balance of 1000.
Expected Output: Should throw InsufficientFundsException with appropriate message.
Invalid Withdrawal Amount:
Action: Attempt to withdraw -200.
Expected Output: Should throw InvalidAmountException with appropriate message.

Transfer Test Cases - 3:
Valid Transfer:
Action: Transfer 300 from one account to another with sufficient balance.
Expected Output: Sender's balance should decrease by 300, receiver's balance should increase by 300.
Insufficient Funds for Transfer:
Action: Attempt to transfer 1000 from account with balance 500.
Expected Output: Should throw InsufficientFundsException with appropriate message.
Account Not Found:
Action: Attempt to transfer to a null account.
Expected Output: Should throw AccountNotFoundException with appropriate message.
Invalid Transfer Amount:
Action: Attempt to transfer -200.
Expected Output: Should throw InvalidAmountException with appropriate message.


Loan Application Test Cases - 4:
Valid Loan Application:
Action: Apply for a loan of 30000 with account balance greater than 50000.
Expected Output: Loan should be approved, balance should increase by 30000.
Loan Amount Exceeds Limit:
Action: Apply for a loan of 60000 with account balance greater than 50000.
Expected Output: Should throw LoanNotAllowedException with appropriate message.
Invalid Loan Amount:
Action: Apply for a loan of -200.
Expected Output: Should throw InvalidAmountException with appropriate message.
Check Balance Test Cases:

Valid Check Balance - 5:
Action: Retrieve balance after performing transactions.
Expected Output: Balance should reflect all deposits, withdrawals, transfers, and loans correctly.

*/