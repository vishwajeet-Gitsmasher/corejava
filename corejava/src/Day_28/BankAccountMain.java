package Day_28;

public class BankAccountMain {
	public static void main(String[] args) {
		SavingAccount savingAccount = new SavingAccount(101,10000,5);
		savingAccount.deposit(5000);
		savingAccount.withdraw(2000);
		savingAccount.addInterest();
		
		System.out.println("======================================================");
		
		CheckingAccount checkingAccount = new CheckingAccount(102,20000);
		checkingAccount.deposit(8000);
		checkingAccount.withdraw(3000);
	}

}

/*
Money Deposited, Now balance : 15000.0
Withdrawl Successful
Money Withdrawl, Now balance : 13000.0
Interest Added
Now balance : 13650.0
======================================================
Money Deposited, Now balance : 28000.0
Withdrawl Successful because within overdraft limit
Money Withdrawl, Now balance : 25000.0

*/
