package Day_26;

public class ICICI extends Bank {
    private double loanLimit;

    public ICICI(String bankName, String branchName, double loanLimit) {
        super(bankName, branchName);
        this.loanLimit = loanLimit;
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
        if (fromAccount.getBalance() >= amount) {
            toAccount.setBalance(toAccount.getBalance() + amount);
            fromAccount.setBalance(fromAccount.getBalance() - amount);
            return true;
        }
        System.err.println("Insufficient balance");
        return false;
    }

    public void loan(double amount, int years) {
        if (amount <= 0) {
            System.err.println("Invalid Amount");
            return;
        }
        if (amount <= loanLimit) {
            System.out.println("Loan Approved");
        } else {
            System.out.println("Loan amount exceeds limit");
        }
    }
}

/*
ICICI (Subclass of Bank)
==========================

Fields:
loanLimit: double: private

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
Logic: Validate the transfer amount and ensure the fromAccount has sufficient balance. Perform the transfer if valid.
Validation: Check if the amount is greater than zero and if fromAccount has sufficient balance.

@Override: loan(double amount):
Logic: Validate the loan amount. If the amount is within the loan limit, approve the loan.
Validation: Check if the loan amount is greater than zero and within the loan limit.
*/