package Day_23;

public class Car extends Vehicle{
	int numberOfDoors;

	public Car(String make, String model, int year, int numberOfDoors) {
		super(make, model, year);
		if(numberOfDoors <=0) {
			System.out.println("Error Invalid Input");
			System.exit(0);
		}
		this.numberOfDoors = numberOfDoors;
	}
	
	public void displayDetails() {
		System.out.println("Car make : "+super.make);
		System.out.println("Car model : "+super.model);
		System.out.println("Car year : "+super.year);
		System.out.println("Car number of doors : "+this.numberOfDoors);
	}
}

/*
Define the subclass Car Inherits from Vehicle
---------------------------------------------

Attributes:
numberOfDoors: int

Constructor:
Car(String make, String model, int year, int numberOfDoors): Constructor to initialize the attributes.

Methods:
void displayDetails(): Method to display the details of the car, overriding the method from Vehicle.
*/
