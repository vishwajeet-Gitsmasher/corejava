package Day_31;

public class Car {
	 private String brand;
	 private String model;
	 private int year;
	 private Driver driver;
	 
	public Car(String brand, String model, int year, Driver driver) {
		super();
		if(year<=0) {
			System.err.println("ERROR : Invalid year");
			System.exit(0);
		}
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.driver = driver;
	}
	 
	 public Car(Car c) {
		super();
		this.brand = c.getBrand();
		this.model = c.getModel();
		this.year = c.getYear();
		this.driver = c.getDriver();
	 }

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	 
	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public void changeDriver(Driver newDriver) {
		this.driver = newDriver;
	}
	
}

/*
Que 4 : Change The Driver
==========================

Scenario Description :
John is a car enthusiast who loves collecting detailed information about different cars and their drivers. 
He has recently acquired information about a Hyundai Creta, and he has also collected details about the car's driver, John. 
John wants to store this information in his database and ensure that any changes to the original car details do not affect his backup copy. 
He also plans to change the driver of the car at a later time.

John has a Java program with two main classes: Car and Driver. He wants to ensure that:

He can create a Car object with specific attributes and set its driver's details.
He can create a copy of this Car object, ensuring the copy remains unchanged even if the original is modified.
He can change the driver of the original Car object.
He can print the details of both the original and the copied Car objects to confirm the deep copy functionality.
Help John by creating a Java program to accomplish these tasks.

Create a Java BLC class named Car with following attributes:
 private String brand
 private String model
 private int year and
 private Driver driver

Implement a parameterised constructor to initialise all the instance variable of Car.
Implement one copy constructor for the Car class that takes a Car object and  initialize the new Car object with the same attributes.
Take a pair of setter and getter method for all the instance variables.
In the Car class, create a method named changeDriver(Driver newDriver) that changes the driver of the car to the specified driver.

*/