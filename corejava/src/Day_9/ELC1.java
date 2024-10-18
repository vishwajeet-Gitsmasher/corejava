package Day_9;
import java.util.Scanner;


public class ELC1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number = ");
		int num = sc.nextInt();
		if(num>99 || num<10) {
			System.out.println("Please enter only 2 digit number");
		} else {
			System.out.println("Digit Sum of "+num+" is "+TwoDigitsSum.getSumOfDigits(num));
		}
	}

}

/*
	Enter your number = 56
	Digit Sum of 56 is 11
	
	Enter your number = 135
	Please enter only 2 digit number
*/

/*
	Program-1
	Define a method which returns the sum of digits of the given two digit number.
	Write the method with the following specifications: 
	Name of the BLC class:TwoDigitsSum
	Name of method: getSumOfDigits()
	Access Modifier : public, static
	Arguments: one argument of type integer
	Return type: an integer value
	For example,
	If the given value is 34, return 7
	
	Create an ELC class Main to test the application
*/
