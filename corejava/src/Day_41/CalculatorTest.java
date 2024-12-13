package Day_41;

public class CalculatorTest {

	public static void main(String[] args) {
		SimpleCalculator s = new SimpleCalculator();
		s.calculateSum(1,2,3);
		
		s.calculateSum(10,20,30,40);

	}

}

/*
Sum of the numbers: 6
Sum of the numbers: 100


 */

/*
Create a Main class named as CalculatorTest nad instantiate the object and call the method for execution.


Test Case-1:

Sum of 1, 2, 3:
Sample Input :1,2,3

Expected Output: "Sum of the numbers: 6"

Test Case-2:
Sum of 10, 20, 30, 40:
Sample Input :(10, 20, 30, 40)
Expected Output: "Sum of the numbers: 100"

Test Case-3:
Sum of 5:
Sample Input :5
Expected Output: "Sum of the numbers: 5"

Test Case-4:

Sample Input :
Expected Output: "Sum of the numbers: 0"
*/