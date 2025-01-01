package Day_49;

public class CarTest {
	public static void main(String[] args) {
		try {
			CarTest.stop("go");
			CarTest.stop("stop");
		} catch (CarStoppedException e) {
			System.out.println(e);
		}
		
		System.out.println("========================================================");
		
		try {
			CarTest.puncture("move");				
			CarTest.puncture("puncture");
		} catch (CarPunctureException e) {
			System.out.println(e);
		}
		
		System.out.println("========================================================");
		
		try {
			CarTest.carHeat(40);
			CarTest.carHeat(60);
		} catch (CarHeatException e) {
			System.out.println(e);
		} 
	}
	public static void stop(String str) throws CarStoppedException{
		if(str.equalsIgnoreCase("stop")) {
			throw new CarStoppedException("Car stopped for some reason.");
		} else if(str.equalsIgnoreCase("go")) {
			System.out.println("Car not stalled.");
		}
	}
	
	public static void puncture(String str) throws CarPunctureException {
		if(str.equalsIgnoreCase("puncture")) {
			throw new CarPunctureException("Car is punctured.");
		} else if(str.equalsIgnoreCase("move")) {
			System.out.println("Car not punctured.");
		}
	}
	
	public static void carHeat(int heat) throws CarHeatException {
		if(heat > 50) {
			throw new CarHeatException("Car is heated more than 50 degrees Celsius.");
		} else {
			System.out.println("Car temperature normal.");
		}
	}
}

/*
Car not stalled.
Day_49.CarStoppedException: Car stopped for some reason.
========================================================
Car not punctured.
Day_49.CarPunctureException: Car is punctured.
========================================================
Car temperature normal.
Day_49.CarHeatException: Car is heated more than 50 degrees Celsius.

*/

/*
For CarTest class:
Contains static methods to simulate car operations and throw exceptions based on certain conditions.

Instance Variables:
No Instance Variables

Methods:
Stop(String): void: static

This class throws CarStoppedException. If the string is  stop  throw new exception and get the message or else message is Car not stall


Methods:
puncture(String): void: static: public

This class throws CarPunctureException. If the string is  puncture  throw new exception and get the message line  Car is punctured  
or else message is Car not stall.

Methods:
carHeat(int): void: static : public

This class throws CarHeatException. If the car heat is more than 50 degrees calicoes it throw new exception and get the message line  
Car is heated more the 50 degrees  or else message is Car not stall.

ELC class CarUser :-
Invoke stop, puncture, and carHeat methods with appropriate messages or temperatures to test different scenarios.
Ensure that exceptions are properly thrown and caught where applicable.

Test Cases for Car Exceptions
----------------------------------
Car Stopped Exception Test:
Action: Invoke CarTest.stop("stop").
Expected Output: Should throw CarStoppedException with message "Car stopped for some reason."

Car Not Started Test:
Action: Invoke CarTest.stop("go").
Expected Output: Should print "Car not stalled."

Car Puncture Exception Test:
Action: Invoke CarTest.puncture("puncture").
Expected Output: Should throw CarPunctureException with message "Car is punctured."

Car Not Punctured Test:
Action: Invoke CarTest.puncture("move").
Expected Output: Should print "Car not punctured."

Car Overheating Exception Test:
Action: Invoke CarTest.carHeat(60).
Expected Output: Should throw CarHeatException with message "Car is heated more than 50 degrees Celsius."

Car Temperature Normal Test:
Action: Invoke CarTest.carHeat(40).
Expected Output: Should print "Car temperature normal."

*/