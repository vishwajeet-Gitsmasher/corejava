package Day_26;

public class ATM {
    public static void withdraw(BankAccount account, double amount) {
        account.withdraw(amount);
    }

    public static void deposit(BankAccount account, double amount) {
        account.deposit(amount);
    }

    public static boolean transfer(BankAccount fromAccount, BankAccount toAccount, double amount) {
        return fromAccount.transfer(amount, toAccount);
    }
}



/*
class ATM(BLC)
================
Methods:
withdraw(BankAccount account, double amount):public: static: void 
Logic: Perform withdrawal from the account.
Validation: None.

deposit(BankAccount account, double amount):public: static: void 
Logic: Perform deposit to the account.
Validation: None.

transfer(BankAccount fromAccount, BankAccount toAccount, double amount):public: static: boolean 
Logic: Perform transfer between accounts.
Validation: None.

*/