package Day_15;

import java.util.Scanner;

public class CalculateDifferenceDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num = sc.nextInt();
		int difference = CalculateDifference.calculateDifference(num);
		System.out.println("The Difference is = "+difference);

	}

}

/*
Enter the number = 10
The Difference is = -2640
*/