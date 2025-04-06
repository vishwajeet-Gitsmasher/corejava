package Day_74;

import java.util.Arrays;

public class CalculatesTheSum {

	public static void main(String[] args) {
		int[] arr = {-3, 2, -5, 6, -1, 4};
		int sum = Arrays.stream(arr).filter(n -> n>0).reduce(0,(a,b) -> a + b*b);
		
		int sum2 = Arrays.stream(arr).filter(n -> n>0).map(n -> n*n).sum();
		
		System.out.println("Sum of squares of positive numbers:"+sum);
		System.out.println("Sum of squares of positive numbers:"+sum2);

	}

}

/*
 * Sum of squares of positive numbers:56
Sum of squares of positive numbers:56
 */

/*
Ques - 4
------------
Write a Java program that reads an array of integers, filters out the negative numbers, 
and then calculates the sum of the squares of the remaining positive numbers using streams 
and the reduce method.

Input:
Input array: [-3, 2, -5, 6, -1, 4]
Output:
Sum of squares of positive numbers: 52
*/