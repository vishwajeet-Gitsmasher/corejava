package Day_50;

public class BankAccount implements Bank{
	private long accountNumber;
	private double balance;
	
	public BankAccount(long accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	@Override
	public void deposit(double amount) throws InvalidAmountException{
		if(amount <= 0) {
			throw new InvalidAmountException("Invalid Amount: Amount must be greater than 0.");
		} else {
			this.balance += amount;
			System.out.println("Deposit Successful of Rs."+amount+".");
		}
	}
	
	@Override
	public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException{
		if(amount <= 0) {
			throw new InvalidAmountException("Invalid Amount: Amount must be greater than 0.");
		} else if (amount > this.balance) {
			throw new InsufficientFundsException("Insufficient Funds: Funds are not sufficient for withdrawl.");
		} else {
			this.balance -= amount;
			System.out.println("Withdrawl Successful of Rs."+amount+".");
		}
	}

	@Override
	public void transfer(BankAccount toAccount, double amount) throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException {
		if(this.accountNumber == toAccount.accountNumber){
			throw new AccountNotFoundException("Account Not Found");
		} else if(amount <= 0) {
			throw new InvalidAmountException("Invalid Amount: Amount must be greater than 0.");
		}  else if (amount > this.balance) {
			throw new InsufficientFundsException("Insufficient Funds: Funds are not sufficient for Transfer.");
		} else {
			this.balance -= amount;
			toAccount.balance += amount;
			System.out.println("Transfer Successful of Rs."+amount+" to "+toAccount.accountNumber+".");
		}
	}

	@Override
	public void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException {
		if(amount <= 0) {
			throw new InvalidAmountException("Invalid Amount: Amount must be greater than 0.");
		}  else if (amount > 50000 || this.balance < 50000) {
			throw new LoanNotAllowedException("Loan Amount Exceded : This much of Loan cannot be provided. You are not eligible for Loan");
		} else {
			System.out.println("Loan Approved of Rs."+amount+".");
		}
		
	}

	@Override
	public double getBalance() {
		return this.balance;
	}
}

/*
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
*/