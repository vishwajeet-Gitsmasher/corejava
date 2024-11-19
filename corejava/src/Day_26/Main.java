package Day_26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Axis axis = new Axis("Axis Bank", "Delhi", 5);
        ICICI icici = new ICICI("ICICI Bank", "Pune", 500000);
        SBI sbi = new SBI("SBI Bank", "Hyderabad", 1000);

        Bank b = null;
        BankAccount ba = null;
        Customer c = null;

        while (true) {
            System.out.println("--- Main Menu ---");
            System.out.println("1. Open Account");
            System.out.println("2. Bank Operations");
            System.out.println("3. ATM Operations");
            System.out.println("4. Close Account");
            System.out.println("5. Exit");
            System.out.print("Select an option:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("--- Select Bank ---");
                    System.out.println("1. Axis Bank");
                    System.out.println("2. ICICI Bank");
                    System.out.println("3. SBI Bank");
                    System.out.print("Select a bank:");
                    int bankNo = sc.nextInt();
                    System.out.print("Enter initial deposit:");
                    double initialDeposit = sc.nextDouble();

                    if (bankNo == 1) {
                        b = new Axis("Axis Bank", "Delhi", 5);
                    } else if (bankNo == 2) {
                        b = new ICICI("ICICI Bank", "Pune", 500000);
                    } else if (bankNo == 3) {
                        b = new SBI("SBI Bank", "Hyderabad", 1000);
                    } else {
                        System.out.println("Invalid Bank");
                        continue;
                    }

                    ba = new BankAccount(b, initialDeposit);
                    c = new Customer(101, "Customer", "Address", "Phone", ba);
                    System.out.println("Account opened successfully with initial deposit of " + initialDeposit);
                    break;

                case 2:
                    System.out.println("--- Bank Operations ---");
                    System.out.println("1. Check Balance");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Deposit");
                    System.out.println("4. Transfer");
                    System.out.println("5. Loan");
                    System.out.println("6. Back to Main Menu");
                    System.out.print("Select an option:");
                            int bankOpChoice = sc.nextInt();
                            switch (bankOpChoice) {
                                case 1:
                                    if (c != null) {
                                        System.out.println("Your balance is: " + c.checkBalance());
                                    } else {
                                        System.out.println("No account exists. Please open an account first.");
                                    }
                                    break;

                                case 2:
                                    if (c != null) {
                                        System.out.print("Enter amount to withdraw: ");
                                        double withdrawAmount = sc.nextDouble();
                                        c.getBankAccount().withdraw(withdrawAmount);
                                    } else {
                                        System.out.println("No account exists. Please open an account first.");
                                    }
                                    break;

                                case 3:
                                    if (c != null) {
                                        System.out.print("Enter amount to deposit: ");
                                        double depositAmount = sc.nextDouble();
                                        c.getBankAccount().deposit(depositAmount);
                                    } else {
                                        System.out.println("No account exists. Please open an account first.");
                                    }
                                    break;

                                case 4:
                                    if (c != null) {
                                        System.out.print("Enter amount to transfer: ");
                                        double transferAmount = sc.nextDouble();
                                        System.out.print("Enter recipient's account number: ");
                                        int recipientAccountNumber = sc.nextInt();
                                       
                                        BankAccount recipientAccount = new BankAccount(b, 0);
                                        if (c.getBankAccount().transfer(transferAmount, recipientAccount)) {
                                            System.out.println("Transfer successful.");
                                        } else {
                                            System.out.println("Transfer failed.");
                                        }
                                    } else {
                                        System.out.println("No account exists. Please open an account first.");
                                    }
                                    break;

                                case 5:
                                    if (b != null) {
                                        System.out.print("Enter loan amount: ");
                                        double loanAmount = sc.nextDouble();
                                        System.out.print("Enter loan duration in years: ");
                                        int years = sc.nextInt();
                                        b.loan(loanAmount, years);
                                    } else {
                                        System.out.println("No bank selected. Please open an account first.");
                                    }
                                    break;

                                case 6:
                                    System.out.println("Returning to Main Menu...");
                                    break;

                                default:
                                    System.out.println("Invalid option. Please try again.");
                                    break;
                            }
                            break;

                        case 3:
                            System.out.println("--- ATM Operations ---");
                            System.out.println("1. Withdraw");
                            System.out.println("2. Deposit");
                            System.out.println("3. Transfer");
                            System.out.println("4. Back to Main Menu");
                            System.out.print("Select an option: ");
                            int atmOpChoice = sc.nextInt();
                            switch (atmOpChoice) {
                                case 1:
                                    if (c != null) {
                                        System.out.print("Enter amount to withdraw: ");
                                        double atmWithdraw = sc.nextDouble();
                                        ATM.withdraw(c.getBankAccount(), atmWithdraw);
                                    } else {
                                        System.out.println("No account exists. Please open an account first.");
                                    }
                                    break;

                                case 2:
                                    if (c != null) {
                                        System.out.print("Enter amount to deposit: ");
                                        double atmDeposit = sc.nextDouble();
                                        ATM.deposit(c.getBankAccount(), atmDeposit);
                                    } else {
                                        System.out.println("No account exists. Please open an account first.");
                                    }
                                    break;

                                case 3:
                                    if (c != null) {
                                        System.out.print("Enter amount to transfer: ");
                                        double atmTransfer = sc.nextDouble();
                                        System.out.print("Enter recipient's account number: ");
                                        int recipientAccountNumber = sc.nextInt();
                                      
                                        BankAccount atmRecipientAccount = new BankAccount(b, 0);
                                        if (ATM.transfer(c.getBankAccount(), atmRecipientAccount, atmTransfer)) {
                                            System.out.println("Transfer successful.");
                                        } else {
                                            System.out.println("Transfer failed.");
                                        }
                                    } else {
                                        System.out.println("No account exists. Please open an account first.");
                                    }
                                    break;

                                case 4:
                                    System.out.println("Returning to Main Menu...");
                                    break;

                                default:
                                    System.out.println("Invalid option. Please try again.");
                                    break;
                            }
                            break;

                        case 4:
                            if (c != null) {
                                c.closeAccount();
                                c = null;
                            } else {
                                System.out.println("No account exists to close.");
                            }
                            break;

                        case 5:
                            System.out.println("Exiting the application. Thank you for using the banking system!");
                            sc.close();
                            return;

                        default:
                            System.out.println("Invalid option. Please try again.");
                            break;
                    }
                }
            }
        }


/*
class Main(ELC)
====================
Contains the main method to demonstrate the functionality with a user menu.
Instructions:
Initialize Banks:

Create instances of Axis, ICICI, and SBI banks with appropriate attributes.
Create Customer and Account:

Create a customer and open an account with an initial deposit in one of the banks.
Perform Operations:

Implement a user menu to perform the following operations:
// Main Menu
1. Open Account
2. Bank Operations
3. ATM Operations
4. Close Account
5. Exit

Example of Menu Navigation in Console:
--- Main Menu ---
1. Open Account
2. Bank Operations
3. ATM Operations
4. Close Account
5. Exit
Select an option: 

// If 1 is selected:
--- Select Bank ---
1. Axis Bank
2. ICICI Bank
3. SBI Bank
Select a bank: 
Enter initial deposit: 

// If 2 is selected:
--- Bank Operations ---
1. Check Balance
2. Withdraw
3. Deposit
4. Transfer
5. Loan
6. Back to Main Menu
Select an option: 

// If 3 is selected:
--- ATM Operations ---
1. Check Balance
2. Withdraw
3. Deposit
4. Transfer
5. Back to Main Menu
Select an option: 

// If 4 is selected:
Confirm action to close the account.


SAMPLE INPUT OUTPUT
====================

--- Main Menu ---
1. Open Account
2. Bank Operations
3. ATM Operations
4. Close Account
5. Exit
Select an option: 1

--- Select Bank ---
1. Axis Bank
2. ICICI Bank
3. SBI Bank
Select a bank: 1
Enter initial deposit: 1000
Account opened successfully with initial deposit of 1000

--- Main Menu ---
1. Open Account
2. Bank Operations
3. ATM Operations
4. Close Account
5. Exit
Select an option: 2

--- Bank Operations ---
1. Check Balance
2. Withdraw
3. Deposit
4. Transfer
5. Loan
6. Back to Main Menu
Select an option: 1
Your balance is: 1000.0

--- Bank Operations ---
1. Check Balance
2. Withdraw
3. Deposit
4. Transfer
5. Loan
6. Back to Main Menu
Select an option: 2
Enter amount to withdraw: 200
Withdrawal of 200 from Axis bank successful.

--- Bank Operations ---
1. Check Balance
2. Withdraw
3. Deposit
4. Transfer
5. Loan
6. Back to Main Menu
Select an option: 1
Your balance is: 800.0

--- Main Menu ---
1. Open Account
2. Bank Operations
3. ATM Operations
4. Close Account
5. Exit
Select an option: 3

--- ATM Operations ---
1. Check Balance
2. Withdraw
3. Deposit
4. Transfer
5. Back to Main Menu
Select an option: 2
Enter amount to withdraw: 300
ATM withdrawal of 300 successful.

--- ATM Operations ---
1. Check Balance
2. Withdraw
3. Deposit
4. Transfer
5. Back to Main Menu
Select an option: 1
Your balance is: 500.0

--- Main Menu ---
1. Open Account
2. Bank Operations
3. ATM Operations
4. Close Account
5. Exit
Select an option: 4
Account closed successfully.

--- Main Menu ---
1. Open Account
2. Bank Operations
3. ATM Operations
4. Close Account
5. Exit
Select an option: 5

*/