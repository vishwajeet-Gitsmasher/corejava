package Day_29;

public class Car {
	private String make;
	private String model;
	private Engine engine;
	
	public Car(String make, String model, Engine engine) {
		super();
		this.make = make;
		this.model = model;
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", engine=" + engine + "]";
	}
	
}

/*
Create the Car Class
--------------------
A class to represent a car with make, model, and an engine.
Variable Declarations:

private String make; — This variable stores the make of the car.
private String model; — This variable stores the model of the car.
private Engine engine; — This variable stores the engine object of the car.

Constructor Declaration:
public Car(String make, String model, Engine engine) — A constructor that initializes the car's make, model, and engine.

toString Method Declaration:
@Override public String toString() — A method to return a string representation of the car.
*/