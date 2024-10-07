package Day_5;

public class NetBill {

	public static void main(String[] args) {
		double bill = Double.parseDouble(args[0]);
		double amount=0;
		double discount=0;
		if(bill<5000) {
			discount = 5;
			amount = bill - (bill*discount/100);
		} else if(bill>=5000 && bill<10000) {
			discount = 10;
			amount = bill - (bill*discount/100);
		} else if(bill>=10000) {
			discount = 15;
			amount = bill - (bill*discount/100);
		}
		System.out.println("Discount % = "+discount);
		System.out.println("Discount Amount = "+(bill-amount));
		System.out.println("Amount Payable = "+amount);
	}

}

/*
	1000
	Discount % = 5.0
	Discount Amount = 50.0
	Amount Payable = 950.0
	
	6000
	Discount % = 10.0
	Discount Amount = 600.0
	Amount Payable = 5400.0
	
	15000
	Discount % = 15.0
	Discount Amount = 2250.0
	Amount Payable = 12750.0
 */


/*
Program-5
-----------
A whole-seller gives incentives in the form of discounts on the net bill. Write a program to input the net bill and calculate the discount as follows:

     Net Bill in Rupees			    Discount %
	<5000						5
	>=5000 and <10000			10
	>=10000						15

Display Discount %, Discount Amount and Amount Payable
*/