package Day_26;

public class Bank {
    protected String bankName;
    protected String branchName;
    public static String ifscCode;

    public Bank(String bankName, String branchName) {
        super();
        this.bankName = bankName;
        this.branchName = branchName;
    }

    public void withdraw(double amount) {
        
    }

    public void deposit(double amount) {
        
    }

    public boolean transfer(double amount, BankAccount fromAccount, BankAccount toAccount) {
        
        return false;
    }

    public void loan(double amount, int years) {
        
    }
}

/*
Banking System with Advanced Operations:
==============================================
You are required to design and implement a banking system that supports multiple types of banks and a range of banking operations, including withdrawals, deposits, transfers, and loans. Each bank has its specific business logic for these operations.

Classes and Methods:

Bank (Super Class)
=======================

Fields:
bankName: String: protected 
branchName: String: protected
ifscCode: String: public static
Constructor:
Develop a parameterized constructor to initialized all variable except ifscCode.

Methods:
withdraw(double amount):public: void:  method to be Overridden by subclasses for withdrawal logic.
deposit(double amount):public: void:   method to be Overridden by subclasses for deposit logic.
transfer(double amount, BankAccount fromAccount, BankAccount toAccount):public: boolean: method to be Overridden by subclasses for transfer logic.
loan(double amount, int years):public: void: method to be Overridden by subclasses for loan logic.
*/