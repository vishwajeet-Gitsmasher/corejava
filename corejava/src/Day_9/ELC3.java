package Day_9;

import java.util.Scanner;

public class ELC3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number = ");
		int num = sc.nextInt();
		System.out.println("Next multiple of 100 of "+num+" is "+NextMultipleOfHundred.getNextMultipleOfHundred(num));

	}

}

/*
	Enter your number = 123
	Next multiple of 100 of 123 is 200
	
	Enter your number = 589
	Next multiple of 100 of 589 is 600
	
	Enter your number = 1380
	Next multiple of 100 of 1380 is 1400
	
	Enter your number = 100
	Next multiple of 100 of 100 is 200

*/

/*
	Program-3
	Define a method which returns the next multiple of 100 for the given number.
	Write the method with the following specifications: 
	Name of the BLC class:NextMultipleOfHundred
	Name of method: getNextMultipleOfHundred()
	Access Modifier : public, static
	Arguments: one argument of type integer
	Return type: an integer value
	For example,
	If the given value is 123, return 200.
	
	Create an ELC class Main to test the application
*/