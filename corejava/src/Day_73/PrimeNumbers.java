package Day_73;

import java.util.Arrays;

public class PrimeNumbers {
	public static void main(String[] args) {
		Integer[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		Object[] nums = Arrays.stream(numbers).filter(n -> findPrime(n)).toArray();
		System.out.println("Prime Numbers:"+Arrays.toString(nums));
	}
	
	public static boolean findPrime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}

// Prime Numbers:[2, 3, 5, 7, 11]

/*
Q3) WAP to print all the Prime Numbers from an Integer Array.

Integer[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

Output : Prime Numbers: [2, 3, 5, 7, 11]
*/