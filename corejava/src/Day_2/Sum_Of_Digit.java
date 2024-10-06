package Day_2;

public class Sum_Of_Digit {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int sum = 0;
		while(n>0) {
			sum += n%10;
			n/=10;
		}
		System.out.println("Sum of Digits = "+sum);
	}

}

/*
	Sum of Digits = 6
*/