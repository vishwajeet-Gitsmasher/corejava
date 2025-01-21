package Day_50;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount(101,20000);
		BankAccount b2 = new BankAccount(102,5000);
		Customer c1 = new Customer("Rahul",b1);
		Customer c2 = new Customer("Aryan",b2);
		double amount;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Select an option :");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Transfer");
			System.out.println("4. Loan Application");
			System.out.println("5. Check Balance");
			System.out.println("6. Exit");
			System.out.print("Enter your option : ");
	        int choice = sc.nextInt();
	        try{
				
				switch(choice) {
					case 1 :
						System.out.print("Enter Amount for Deposit : ");
						amount = sc.nextDouble();
						b1.deposit(amount);
						break;
					case 2 :
						System.out.print("Enter Amount for Withdraw : ");
						amount = sc.nextDouble();
						b1.withdraw(amount);
						break;
					case 3 :
						System.out.print("Enter Amount for Transfer : ");
						amount = sc.nextDouble();
						b1.transfer(b2, amount);
						System.out.println("Sender Balance : "+b1.getBalance());
						System.out.println("Receiver Balance : "+b2.getBalance());
						break;
					case 4 :
						System.out.print("Enter Amount for Loan : ");
						amount = sc.nextDouble();
						b1.applyForLoan(amount);
						break;
					case 5:
						System.out.println("Your Balance : "+b1.getBalance());
						break;
					case 6:
						System.out.println("Thank you for using this application, Have a good day!!");
						sc.close();
						return;
				}
			} catch(InsufficientFundsException e) {
				System.err.println(e.getMessage());
			} catch(InvalidAmountException e) {
				System.err.println(e.getMessage());
			} catch(AccountNotFoundException e) {
				System.err.println(e.getMessage());
			} catch(LoanNotAllowedException e) {
				System.err.println(e.getMessage());
			} catch(Exception e) {
				e.printStackTrace();
			} 
		}
	}

}


/*
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