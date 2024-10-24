package Day_13;

import java.util.Scanner;

public class BankCustomer {

	public static void main(String[] args) {
		Bank b = new Bank();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Bank Name : ");
		String bankName = sc.nextLine();
		System.out.print("Enter Bank Customer Name : ");
		String bankCustomerName = sc.nextLine();
		System.out.print("Enter Bank Address : ");
		String bankAddress = sc.nextLine();
		System.out.print("Enter Bank IFSC Code : ");
		String bankIFSCCode = sc.next();
		System.out.print("Enter Bank Account Number : ");
		int customerAccountNumber = sc.nextInt();
		System.out.print("Enter Current Balance : ");
		double currentBalance = sc.nextDouble();
		
		b.setDeatils(bankName, bankCustomerName, bankAddress, bankIFSCCode, customerAccountNumber, currentBalance);

		while(true) {
			System.out.println("1. Deposit ");
			System.out.println("2. Withdraw ");
			System.out.println("3. Check Current Balance ");
			System.out.println("4. Display Details ");
			System.out.println("5. Exit ");
			System.out.print("Enter Your Choice : ");
			int choice = sc.nextInt();
			switch(choice) {
				case 1:
					System.out.print("Enter Amount to Deposit : ");
					double depositAmount = sc.nextDouble();
					b.deposit(depositAmount);
					break;
				case 2:
					System.out.print("Enter Amount to Withdraw : ");
					double withdrawAmount = sc.nextDouble();
					b.withdraw(withdrawAmount);
					break;
				case 3:
					b.currentBalance();
					break;
				case 4:
					System.out.println(b.displayDetails());
					break;
				case 5:
					System.out.println("Thank You for Using");
					return;
			}
		}
		
	}
}

/*
Enter Bank Name : State Bank Of India
Enter Bank Customer Name : Rahul Pandey
Enter Bank Address : Pune, Maharashtra
Enter Bank IFSC Code : SBIN0001945
Enter Bank Account Number : 123456
Enter Current Balance : 1000

1. Deposit 
2. Withdraw 
3. Check Current Balance 
4. Display Details 
5. Exit 
Enter Your Choice : 2
Enter Amount to Withdraw : 500
Maintain Minimum Balance of 1000.Rs.
Available Balance : 1000.0

1. Deposit 
2. Withdraw 
3. Check Current Balance 
4. Display Details 
5. Exit 
Enter Your Choice : 1
Enter Amount to Deposit : 3000
Deposited Successfully.
Available Balance : 4000.0

1. Deposit 
2. Withdraw 
3. Check Current Balance 
4. Display Details 
5. Exit 
Enter Your Choice : 3
Available Balance : 4000.0

1. Deposit 
2. Withdraw 
3. Check Current Balance 
4. Display Details 
5. Exit 
Enter Your Choice : 4
Bank [bankName=State Bank Of India, bankCustomerName=Rahul Pandey, bankAddress=Pune, Maharashtra, bankIFSCCode=SBIN0001945, customerAccountNumber=123456, currentBalance=4000.0]

1. Deposit 
2. Withdraw 
3. Check Current Balance 
4. Display Details 
5. Exit 
Enter Your Choice : 5
Thank You for Using

*/
