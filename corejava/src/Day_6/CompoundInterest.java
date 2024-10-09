package Day_6;

public class CompoundInterest {

	public static void main(String[] args) {
		double principle = Double.parseDouble(args[0]);
		double rate = Double.parseDouble(args[1]);
		double amount = principle*((1+rate/100)*(1+rate/100)*(1+rate/100));
		System.out.println("Amount = "+amount);
	}

}

/*
	100 10
	Amount = 133.10000000000005
*/


/*
write a Java program to calculate compound interest for 3 years? 
Formula- amount=principle*((1+rate/100)*(1+rate/100)*(1+rate/100));
*/