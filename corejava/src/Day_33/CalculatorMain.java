package Day_33;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println("Addition of two doubles = "+c.add(10.5, 20.3));
		System.out.println("Addition of two Integers = "+c.add(10, 20));
		System.out.println("Addition of two Integers = "+c.add(-10, 20));
		System.out.println("Multiplication of two Integers = "+c.multiply(10, 20));
		System.out.println("Multiplication of two doubles = "+c.multiply(2.3, 4.2));
	}

}


/*
Addition of two doubles = 30.8
Addition of two Integers = 30
Addition of two Integers = 10
Multiplication of two Integers = 200
Multiplication of two doubles = 9.66
 */
/*
Take an (ELC Class)In the main method, create an instance of MathOperations and demonstrate the use of each method by performing calculations with different types of arguments (integers and doubles).

Test Cases-1 :    Add two doubles
------------------
Sample Input: 10.5, 20.3

Expected Output:

Sum of 10.5 and 20.3 (double): 30.8


Test Cases -2 :
------------------
Multiply two integers

Sample Input: 10, 20

Expected Output:
Product of 10 and 20 (int): 200

Test Case-3 :
----------------
Add with negative integers

Sample Input: -10, 20

Expected Output:

Sum of -10 and 20 (int): 10
*/