package Day_26;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private Bank bank;

    public BankAccount(Bank bank, double initialDeposit) {
        this.bank = bank;
        this.balance = initialDeposit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawal of "+ amount +" from Axis bank successful.");
        } else {
            System.err.println("Insufficient balance");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit successful");
        } else {
            System.err.println("Invalid amount");
        }
    }

    public boolean transfer(double amount, BankAccount toAccount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            toAccount.setBalance(toAccount.getBalance() + amount);
            System.out.println("Transfer successful");
            return true;
        }
        System.err.println("Insufficient balance");
        return false;
    }
}

/*
BankAccount(BLC)
=================
Fields:
accountNumber: int: private
balance: double: private
bank: Bank: private

Constructor:
BankAccount(Bank bank, double initialDeposit)

Methods:
getAccountNumber():public: int 
Logic: Get the account number.
Validation: None.

getBalance():public: double 
Logic: Get the current balance.
Validation: None.

setBalance(double amount):public: void 
Logic: Set the balance to the given amount.
Validation: None.

withdraw(double amount):public: void 
Logic: Perform withdrawal using the bank's logic.
Validation: None.

withdraw(double amount, ATM atm):public: void 
Logic: Perform withdrawal using the ATM's logic.
Validation: None.

deposit(double amount):public: void 
Logic: Perform deposit using the bank's logic.
Validation: None.

deposit(double amount, ATM atm):public: void 
Logic: Perform deposit using the ATM's logic.
Validation: None.

transfer(double amount, BankAccount toAccount):public: boolean 
Logic: Perform transfer using the bank's logic.
Validation: None.

transfer(double amount, BankAccount toAccount, ATM atm):public: boolean 
Logic: Perform transfer using the ATM's logic.
Validation: None.

checkBalance():public: double 
Logic: Check the current balance.
Validation: None.
*/