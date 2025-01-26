package Day_57;

public class Car implements Runnable{
	String name;
	PetrolPump petrolPump;
	
	public Car(String name, PetrolPump petrolPump) {
		super();
		this.name = name;
		this.petrolPump = petrolPump;
	}

	@Override
	public void run() {
		petrolPump.refillCar(name);		
	}

}

/*
Car Class:

Create a Car class that implements the Runnable interface. Include the following members:
name (String): The name of the car.
petrolPump (PetrolPump): A reference to the petrol pump.
run(): Implement the run method from the Runnable interface. Inside this method, call the refillCar method of the petrol pump to simulate the refilling process.

*/