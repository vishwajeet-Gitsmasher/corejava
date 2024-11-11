package Day_21;

public class Vehicle {
	String brand;
	int year;
	public Vehicle(String brand, int year) {
		super();
		this.brand = brand;
		this.year = year;
	}
	
	public void displayVehicleDetails() {
		System.out.println("Vehicle brand : "+this.brand);
		System.out.println("Vehicle manufacturing year : "+this.year);
	}
}

/*
Problem Statement: Sport Motorcycle Inheritance System
You are asked to implement a multilevel inheritance system for a hierarchy of vehicles, specifically focusing on motorcycles. 
This system will include basic vehicle information, general motorcycle features, and specific properties for sport motorcycles. 
Follow the requirements below to design and implement this system.

Requirements
Vehicle Class (Grandparent Class)
Create a class named Vehicle with the following attributes:
brand (String): The brand of the vehicle.
year (int): The year the vehicle was manufactured.
Constructor:
Vehicle(String brand, int year): Initializes the brand and year of the vehicle.
Method:
void displayVehicleDetails(): Displays the vehicle’s brand and year.


*/