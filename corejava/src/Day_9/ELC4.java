package Day_9;

import java.util.Scanner;

public class ELC4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First number = ");
		int a = sc.nextInt();
		System.out.print("Enter Second number = ");
		int b = sc.nextInt();
		System.out.print("Enter Third number = ");
		int c = sc.nextInt();
		System.out.println("Sum of rounded numbers is "+ RoundedSum.sumOfRoundedValues(a, b, c));

	}

}

/*
	Enter First number = 13
	Enter Second number = 23
	Enter Third number = 26
	Sum of rounded numbers is 60
	
	Enter First number = 12
	Enter Second number = 13
	Enter Third number = 18
	Sum of rounded numbers is 40
*/


/*
	Program-4
	Define a method which returns the sum of three rounded numbers. If the right most digit of the number is less than 5, then round off its value to the previous multiple of 10 otherwise if the right most digit of the number is greater or equal to 5, and then round off to the next multiple of 10. 
	Write the method with the following specifications: 
	Name of the BLC class:RoundedSum
	Name of method: sumOfRoundedValues() 
	Access Modifier : public, static
	Arguments: three argument of type integer
	Return type: an integer value 
	For example
	If a = 23, b = 34, c = 66
	   20 + 30 + 70 = 120
	Note:Don't use any control statements and looping statements
	
	Create an ELC class Main to test the application
*/