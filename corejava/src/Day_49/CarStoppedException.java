package Day_49;

public class CarStoppedException extends Exception{

	public CarStoppedException(String errorMessage) {
		super(errorMessage);
	}
	
}

/*
Ques - 1
----------------
Implement a Java program that simulates various car-related exceptions using custom exception classes (CarStopped, CarPuncture, 
CarHeat). The program should handle different scenarios and test cases using the CarTest class and demonstrate exception handling 
through static methods.

For CarStoppedException: extends Exception
Purpose: Represents an exception when the car stops for reasons other than puncture or overheating.

Instance Methods:
No Instance methods

Methods:
Parameterized Constructor with String as parameter

*/