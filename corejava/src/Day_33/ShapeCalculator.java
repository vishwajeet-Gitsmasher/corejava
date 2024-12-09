package Day_33;

public class ShapeCalculator {
	public int calculateArea(int sideLength) {
		if(sideLength<0) {
			System.err.println("Error: Side length must be non-negative.");
			System.exit(0);
		}
		return (sideLength * sideLength);
	}
	
	public int calculateArea(int length, int width) {
		if(length<0 || width<0) {
			System.err.println("Error: Length or width must be non-negative.");
			System.exit(0);
		}
		return (length * width);
	}
	
	public double calculateArea(double radius) {
		if(radius<0) {
			System.err.println("Error: Radius must be non-negative.");
			System.exit(0);
		}
		return (3.14 * radius * radius);
	}
}

/*
Question - 2: 
---------------

Write a Java program that defines a ShapeCalculator class with method overloading to calculate the area of geometric shapes. Implement the following methods:


ShapeCalculator - Method overloading


take 4 public Method :

calculateArea(int sideLength): Returns the area of a square (side * side).

calculateArea(int length, int width): Returns the area of a rectangle (length * width).

calculateArea(double radius): Returns the area of a circle (p * radius^2).


*/