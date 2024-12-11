package Day_39;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = 0;
		try {
			num = sc.nextInt();
		} catch(InputMismatchException i){
			System.err.println("Error: Invalid input. Please enter a valid positive integer.");
			System.exit(0);
		}
		MyCalculator m = new MyCalculator();
		System.out.println("Sum of divisors of "+num+" is : "+m.divisorSum(num));

	}
}

/*
Enter Number : 6
Sum of divisors of 6 is : 12

Enter Number : abc
Error: Invalid input. Please enter a valid positive integer.
*/

/*
For example divisors of 6 are 1,2,3 and 6, so divisorSum should return 12. 

Sample Input 
6 
Sample Output 
12 
Explanation 
Divisors of 6 are 1,2,3 and 6. 1+2+3+6=12. 
A class Testing is given to you with a main method. Use this class to test your solution's classes and meth
ods.


Example :
-----------
Test Case 1 : 
--------------
Sample Input: 6

Expected Output:

Sum of divisors: 12
Explanation: Divisors of 6 are 1, 2, 3, and 6. 1 + 2 + 3 + 6 = 12.

Test Case 2 : 
--------------
Sample Input: -6

Expected Output:
Error: Input must be a positive integer.


Test Case 3:
--------------
Sample Input: 0

Expected Output:
Error: Input must be a positive integer.

Test Case 4:
--------------
Input: abc

Expected Output:

Error: Invalid input. Please enter a valid positive integer.

Test Case 5: 
--------------
Input: 28

Expected Output:
Sum of divisors: 56
Explanation: Divisors of 28 are 1, 2, 4, 7, 14, and 28. 1 + 2 + 4 + 7 + 14 + 28 = 56.
*/