package Day_2;

public class Calculate_Tax {

	public static void main(String[] args) {
		int income = Integer.parseInt(args[0]);
		float tax = 4.9f;
		float f = income*tax/100;
		System.out.println("Tax = "+ (int)f);
		System.out.println("Tax = "+ f);
		System.out.format("%.2f",f);
		System.out.println();
		System.out.printf("%.3f",f);
	}

}

/*
	Tax = 48510
	Tax = 48510.0
	48510.00
	48510.000
*/

