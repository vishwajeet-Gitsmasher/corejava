package Day_39;

public class MyCalculator implements AdvancedArithmetic {

	@Override
	public int divisorSum(int num) {
		if(num<1) {
			System.err.println("Error: Input must be a positive integer.");
			System.exit(0);
		}
		int sum = 0;
		for(int i = 1;i<=num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		return sum;
	}

}

/*
Then write a class called MyCalculator which implements the interface AdvancedArithmetic. 

divisorSum function just takes an integer as input and return the sum of all its divisors.

*/