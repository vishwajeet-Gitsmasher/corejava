package Day_40;

public class HDFC implements Bank {
	double accountBalance;
	@Override
	public void deposit(double amount) {
		if(amount>0) {
			this.accountBalance += amount;
			System.out.println("Dposit Successful");
			System.out.println("Current balance in HDFC Bank is : "+this.accountBalance);
		} else {
			System.out.println("Invalid Amount");
		}
	}

	@Override
	public void withdraw(double amount) {
		if(amount>0 && amount<=this.accountBalance) {
			this.accountBalance -= amount;
			System.out.println("Withdraw Successful");
			System.out.println("Current balance in HDFC Bank is : "+this.accountBalance);
		} else {
			System.out.println("Invalid Amount OR Insuufiecnt Funds");
		}

	}

	@Override
	public double checkBalance() {
		
		return this.accountBalance;
	}

}
