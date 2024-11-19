package Day_26;

public class Axis extends Bank {
    private double interestRate;

    public Axis(String bankName, String branchName, double interestRate) {
        super(bankName, branchName);
        this.interestRate = interestRate;
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
        double totalPayable = amount + (amount * interestRate * years / 100);
        System.out.println("Total Payable Amount : " + totalPayable);
    }
}


/*
Axis (Subclass of Bank)
==========================

Fields:
private: interestRate: double
Constructor:
Develop a parameterized constructor to initialized all variable including inherited variable.

Methods:
@Override : withdraw(double amount):
Logic: Validate the withdrawal amount. If the amount is greater than zero, proceed with the withdrawal.
Validation: Check if the amount is greater than zero.

@Override: deposit(double amount):
Logic: Validate the deposit amount. If the amount is greater than zero, proceed with the deposit.
Validation: Check if the amount is greater than zero.

@Override: transfer(double amount, BankAccount fromAccount, BankAccount toAccount):
Logic: Validate the transfer amount and ensure the fromAccount has sufficient balance. Perform the transfer if valid.
[totalPayable = amount + (amount * interestRate * years / 100);]
Validation: Check if the amount is greater than zero and if fromAccount has sufficient balance.

@Override: loan(double amount, int years):
Logic: Calculate the total payable amount using the interest rate and loan duration.
[totalPayable = amount + (amount * interestRate * years / 100);]
Validation: Check if the loan amount is greater than zero.

*/