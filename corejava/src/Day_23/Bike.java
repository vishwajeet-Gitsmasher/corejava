package Day_23;

public class Bike extends Vehicle{
	String type;

	public Bike(String make, String model, int year, String type) {
		super(make, model, year);
		this.type = type;
	}
	
	public void displayDetails() {
		System.out.println("Bike make : "+super.make);
		System.out.println("Bike model : "+super.model);
		System.out.println("Bike year : "+super.year);
		System.out.println("Bike type : "+this.type);
	}
	
	
}

/*
Define the subclass Bike Inherits from Vehicle
----------------------------------------------

Attribute:
type: String

Constructor:
Bike(String make, String model, int year, String type): Constructor to initialize the attributes.

Methods:
void displayDetails(): Method to display the details of the bike, overriding the method from Vehicle.
*/