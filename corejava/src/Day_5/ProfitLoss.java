package Day_5;

public class ProfitLoss {

	public static void main(String[] args) {
		int cp = Integer.parseInt(args[0]);
		int sp = Integer.parseInt(args[1]);
		int profit = sp - cp;
		int loss = cp - sp;
		int profitPercentage = (profit *cp) / 100;
		int lossPercentage = (loss *cp) / 100;
		if(sp>cp) {
			System.out.println("Profit = "+profit);
			System.out.println("Profit Percentage = "+profitPercentage+"%");
		} else {
			System.out.println("Loss = "+loss);
			System.out.println("Loss Percentage = "+lossPercentage+"%");
		}
	}

}

/*
	100 80
	Loss = 20
	Loss Percentage = 20%
	
	100 130
	Profit = 30
	Profit Percentage = 30%
 */


/*
Write a java program to find the profit and loss by following the formula
Profit and loss Formulas – 
Profit = SP – CP
Loss = CP – SP
Profit percentage = (Profit /Cost Price) x 100
Loss percentage = (Loss / Cost price) x 100
*/