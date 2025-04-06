package Day_73;

import java.util.Arrays;

public class RemoveNegativeNumbers {
	public static void main(String[] args) {
		Integer[] numbers = {-10, -5, 0, 5, 10, 15, -20};
		Object[] nums = Arrays.stream(numbers).filter(n -> n>0).toArray();
		System.out.println("Positive Numbers:"+Arrays.toString(nums));
	}
}

// Positive Numbers:[5, 10, 15]

/*
Q1) WAP to remove Negative Numbers from an Integer Array.

Integer[] numbers = {-10, -5, 0, 5, 10, 15, -20};

Output : Positive Numbers: [5, 10, 15]
*/