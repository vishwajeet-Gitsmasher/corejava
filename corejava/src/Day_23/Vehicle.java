package Day_23;

public class Vehicle {
	String make;
	String model;
	int year;
	
	public Vehicle(String make, String model, int year) {
		super();
		if(year <=0) {
			System.out.println("Error Invalid Input");
			System.exit(0);
		}
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public void displayDetails() {
		System.out.println("Vehicle make : "+this.make);
		System.out.println("Vehicle model : "+this.model);
		System.out.println("Vehicle year : "+this.year);
	}
	
}

/*
Que 1 : Simple Vehicle Inheritance in Java
===========================================

Demonstrating Inheritance to Simplify and Extend Class Functionality and 
This motto emphasizes the key educational goal of the program: to show how inheritance can be used to simplify code by 
reusing existing class functionality and extending it with new features specific to derived classes.


Define the base class Vehicle
-------------------------------

Attributes:
make: String
model: String
year: int

Constructor:
Vehicle(String make, String model, int year): Constructor to initialize the attributes.

Methods:
void displayDetails(): Method to display the details of the vehicle.

*/