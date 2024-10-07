package Day_4;

public class Profit_Atfer_Selling {

	public static void main(String[] args) {
		double cost = 32500.0;
		double profitPerc = 27.0;
		double vat = 12.7;
		double service_Charge = 3.87;
		double selling_Price = cost + (cost*profitPerc/100);
		double final_Price = selling_Price + (selling_Price*vat/100) + (selling_Price*service_Charge/100);
		System.out.println("Selling Price of TV without adding vat and service charge : "+ selling_Price);
		System.out.println("Selling Price of TV after adding vat and service charge : "+ final_Price);
		System.out.println("Profit after selling TV is : "+ (final_Price-cost));
	}

}

/*
	Selling Price of TV without adding vat and service charge : 41275.0
	Selling Price of TV after adding vat and service charge : 48114.2675
	Profit after selling TV is : 15614.267500000002
*/

/*
Program-1
-----------
A shopkeeper buys a TV set for Rs. 32,500 and sells it at a profit of 27%. 
Apart from this a VAT of 12.7% and Service Charge is 3.87% is charged. 
Display total selling price, profit along with vat and service charge.
*/