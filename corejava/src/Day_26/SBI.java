package Day_26;

public class SBI extends Bank {
    private double minimumBalance;

    public SBI(String bankName, String branchName, double minimumBalance) {
        super(bankName, branchName);
        this.minimumBalance = minimumBalance;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.err.println("Invalid Amount");
            return;
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.err.println("Invalid Amount");
            return;
        }
    }

    public boolean transfer(double amount, BankAccount fromAccount, BankAccount toAccount) {
        if (fromAccount.getBalance() >= amount && (fromAccount.getBalance() - amount >= minimumBalance)) {
            toAccount.setBalance(toAccount.getBalance() + amount);
            fromAccount.setBalance(fromAccount.getBalance() - amount);
            return true;
        }
        System.err.println("Insufficient balance or minimum balance not maintained");
        return false;
    }

    public void loan(double amount, int years) {
        if (amount <= 0) {
            System.err.println("Invalid Amount");
            return;
        }
        System.out.println("Loan Approved");
    }
}

/*
SBI (Subclass of Bank)
===========================

Fields:
minimumBalance: double: private

Constructor:
Develop a parameterized constructor to initialized all variable including inherited variable.

Methods:
@Override: withdraw(double amount):
Logic: Validate the withdrawal amount. If the amount is greater than zero, proceed with the withdrawal.
Validation: Check if the amount is greater than zero.

@Override: deposit(double amount):
Logic: Validate the deposit amount. If the amount is greater than zero, proceed with the deposit.
Validation: Check if the amount is greater than zero.

@Override: transfer(double amount, BankAccount fromAccount, BankAccount toAccount):
Logic: Validate the transfer amount and ensure the fromAccount has sufficient balance after maintaining the minimum balance. Perform the transfer if valid.
Validation: Check if the amount is greater than zero and if fromAccount has sufficient balance after maintaining the minimum balance.

@Override: loan(double amount):
Logic: Approve the loan if the amount is greater than zero.
Validation: Check if the loan amount is greater than zero.
*/