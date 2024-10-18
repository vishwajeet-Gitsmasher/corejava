package Day_9;

import java.util.Scanner;

public class ELC2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number = ");
		int num = sc.nextInt();
		if(num>99 || num<10) {
			System.out.println("Please enter only 2 digit number");
		} else {
			System.out.println("Difference of digits of "+num+" is "+ TwoDigitsDifference.getDiffOfDigits(num));
		}
	}


}


/*
	Enter your number = 83
	Difference of digits of 83 is 5
	
	Enter your number = 39
	Difference of digits of 39 is -6
	
	Enter your number = 123
	Please enter only 2 digit number
*/


/*
	Program-2 
	Define a method which returns the difference of digits of the given two digit number.
	Write the method with the following specifications: 
	Name of the BLC class:TwoDigitsDifference
	Name of method: getDiffOfDigits()
	Access Modifier : public, static
	Arguments: one argument of type integer
	Return type: an integer value
	For example,
	If the given value is 83, 8 - 3 return 5.  If x = 38, 3 - 8 return -5.
	
	Create an ELC class Main to test the application
*/