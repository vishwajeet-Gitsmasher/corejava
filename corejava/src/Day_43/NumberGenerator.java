package Day_43;

import java.util.Scanner;
import java.util.Random;

public class NumberGenerator {
	
	public static int generateRandomNumber(int min, int max) {
		Random r = new Random();
		return r.nextInt(min, max);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the minimum value: ");
		int min = sc.nextInt();
		System.out.print("Enter the maximum value: ");
		int max = sc.nextInt();
		System.out.println("Random number generated: "+generateRandomNumber(min,max));

	}

}

/*
Ques - 4
---------------
Question:

Create a Java program that demonstrates the usage of the Supplier interface to generate random numbers within a specified range. Your task is to implement a method generateRandomNumber in the NumberGenerator class that generates a random integer between a given minimum and maximum value (inclusive).

NumberGenerator class(ELC) :

Method name : generateRandomNumber
Access Modifier : public
Non-Access Modifier : static
return type : int
parameters : int min, int max
Implement the generateRandomNumber method such that it generates and returns a random integer between the specified min and max values (inclusive) by using Supplier<Integer>.

In the main method:

Prompt the user to enter the minimum and maximum values for the range.
Use the generateRandomNumber method to generate a random number within the specified range.
Print the generated random number.

Example Output:
Enter the minimum value: 5
Enter the maximum value: 10
Random number generated: 7

Test Case 1
Input:
Enter the minimum value: 5
Enter the maximum value: 10
Output:
Random number generated: 7

Test Case 2
Input:
Enter the minimum value: 1
Enter the maximum value: 100

Output:
Random number generated: 42
Test Case 3

Input:
Enter the minimum value: 10
Enter the maximum value: 20

Output:
Random number generated: 15
*/