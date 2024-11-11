package Day_21;

public class Motorcycle extends Vehicle{
	int engineCapacity;

	public Motorcycle(String brand, int year, int engineCapacity) {
		super(brand, year);
		this.engineCapacity = engineCapacity;
	}
	
	public void startEngine() {
		System.out.println("engine is starting, with "+this.engineCapacity+" cc engine capacity");
	}
}

/*
Motorcycle Class (Parent Class)
Create a class named Motorcycle that inherits from Vehicle.
Additional attribute:
engineCapacity (int): Engine capacity of the motorcycle in cubic centimeters (cc).
Constructor:
Motorcycle(String brand, int year, int engineCapacity): Initializes the brand, year, and engine capacity of the motorcycle.
Method:
void startEngine(): Displays a message indicating the engine is starting, showing the engine capacity.
*/