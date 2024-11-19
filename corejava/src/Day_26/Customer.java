package Day_26;

public class Customer {
    private int customerId;
    private String name;
    private String address;
    private String phoneNumber;
    private BankAccount bankAccount;

    public Customer(int customerId, String name, String address, String phoneNumber, BankAccount bankAccount) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.bankAccount = bankAccount;
    }

    public void openAccount(Bank bank, double initialDeposit) {
        this.bankAccount = new BankAccount(bank, initialDeposit);
    }

    public void closeAccount() {
        this.bankAccount = null;
        System.out.println("Account closed successfully");
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public double checkBalance() {
        return bankAccount.getBalance();
    }
}


/*
Customer(BLC)
=================
Fields:
customerId: int: private  
name: String: private  
address: String : private 
phoneNumber: String: private  
bankAccount: BankAccount: private 

Constructor:
Develop a parameterized constructor to initialized all variable including inherited variable.

Methods:
openAccount(Bank bank, double initialDeposit):public: void 
Logic: Open a new bank account with the given bank and initial deposit.
Validation: None.

closeAccount():public: void 
Logic: Close the existing bank account.
Validation: None.

getBankAccount():public: BankAccount 
Logic: Retrieve the associated bank account.
Validation: None.

checkBalance():public: double 
Logic: Check the balance of the associated bank account.
*/