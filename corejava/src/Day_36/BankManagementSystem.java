package Day_36;

public class BankManagementSystem {
	public static void main(String[] args){
		SavingsAccount s = new SavingsAccount("102",30000,10);
		s.generateStatement();
		
		System.out.println("===========================");
		
		CheckingAccount c = new CheckingAccount("103",20000,1000);
		c.generateStatement();
	}
}

/*
ELC - BankManagementSystem:

Create an ELC named BankManagementSystem that:
Instantiates a SavingsAccount object with sample data.
Invokes methods on the SavingsAccount object to demonstrate the generation of a savings account statement.
Instantiates a CheckingAccount object with sample data.
Invokes methods on the CheckingAccount object to demonstrate the generation of a checking account statement.
*/