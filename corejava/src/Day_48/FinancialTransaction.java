package Day_48;

public class FinancialTransaction {
	
	public void processTransaction(double amount, long accountNumber) {
		try {
			if(amount <=0) {
				throw new IllegalArgumentException();
			}
			System.out.println("Transaction successful: Amount Rs."+amount+" transferred to account "+accountNumber);
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid input: Please enter a valid number for transaction amount. It cannot be negative or zero");
		} catch (RuntimeException e) {
			System.out.println("Runtime Exception");
		}
	}

}

/*
Ques - 4
-------------
Financial Transaction Validation
Objective:
Write a Java program that validates and processes financial transaction data entered by a user. Use a multi-catch block to handle exceptions related to input validation and processing.

Instructions:
Create a BLC class named FinancialTransaction.

Implement a processTransaction method that:
method name : processTransaction
Access Modifiers : public
return type : void
parameters : double, long
Accepts user input for transaction details such as transaction amount and account number.

Uses a multi-catch block to handle exceptions:
NumberFormatException for invalid numeric inputs.
IllegalArgumentException for invalid transaction amount (negative or zero).
RuntimeException for other unexpected errors during processing.
Validates the transaction amount and account number.
Prints appropriate messages for successful transaction or specific error conditions.

Implement the main method in an ELC class.

Create an instance of FinancialTransaction.
Prompt the user to input transaction details.
Call the processTransaction method with user inputs to test different scenarios:
Valid transaction amount and account number.
Invalid transaction amount (negative or zero).
Invalid input types (non-numeric values).

Test Case 1 : Valid Transaction:
Transaction amount: 500
Account number: 1234567890
Expected Output:
Processing transaction...
Transaction successful: Amount Rs.500.0 transferred to account 1234567890

Test Case 2 :Invalid Transaction Amount (Negative):
Transaction amount: -100
Account number: 9876543210
Expected Output:
Error processing transaction: Transaction amount must be positive.

Test Case 3 :Invalid Input (Non-numeric Transaction Amount):

Transaction amount: abc
Account number: 4567890123
Expected Output:
Invalid input: Please enter a valid number for transaction amount.


*/