package Day_33;

public class ShapeCalculatorMain {

	public static void main(String[] args) {
		ShapeCalculator s = new ShapeCalculator();
		System.out.println("Area of a square = "+s.calculateArea(7));
		
		//System.out.println("Area of a square = "+s.calculateArea(-5));
		
		System.out.println("Area of a rectangle = "+s.calculateArea(10,20));
		
		System.out.println("Area of a circle = "+s.calculateArea(5.5));

	}

}

/*
Area of a square = 49
Area of a rectangle = 200
Area of a circle = 94.985
*/

/*
Take an Elc class Main  it having main method and execute the methods.

Test Cases -1 :
-------------------
Valid Case: Calculate area of a circle

Sample Input: radius = 7.0

Expected Output:

Area of circle with radius 7.0: 153.93804


Test Cases -2 :
-------------------

Invalid Case: Negative side length for square

Sample Input: sideLength = -5
Expected Output:

Error: Side length must be non-negative.


Test Cases -3 :
-------------------
Invalid Case: Negative length or width for rectangle

Sample Input: length = -5, width = 10

Expected Output:

Error: Length and width must be non-negative.
*/
