package Day_5;

public class SimpleInterest {

	public static void main(String[] args) {
		double principal = Double.parseDouble(args[0]);
		double rate = Double.parseDouble(args[1]);
		double time = Double.parseDouble(args[2]);
		double simpleInterest = (principal * rate * time)/100;
		double amount = principal + simpleInterest;
		System.out.println("Principal = "+ principal);
		System.out.println("Simple Interest = "+ simpleInterest);
		System.out.println("Amount = "+ amount);
	}

}

/*
	100 25 5
	Principal = 100.0
	Simple Interest = 125.0
	Amount = 225.0
	
	10000 5 2
	Principal = 10000.0
	Simple Interest = 1000.0
	Amount = 11000.0
*/

/*
Program-3
----------
Write a program to enter Principal, Rate and Time. Calculate and display Simple
 Interest and Amount.
*/