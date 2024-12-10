package Day_38;

abstract public class Car {
	String brand;
	String model;
	int mileage;
	int top_speed;
	int yearOfManufacturing;
		
	public Car(String brand, String model, int mileage, int top_speed, int yearOfManufacturing) {
		super();
		this.brand = brand;
		this.model = model;
		this.mileage = mileage;
		this.top_speed = top_speed;
		this.yearOfManufacturing = yearOfManufacturing;
	}

	public Car() {
		super();
	}
	
	public String carBrand() {
		return this.brand;
	}
	
	public int carMileage() {
		return mileage;
	}

	public String carModel() {
		return this.model;
	}

	public int carTopSpeed() {
		return top_speed;
	}

	public int carYear() {
		return yearOfManufacturing;
	}
	
	public abstract void display();
}

/*
Program 1:
----------
We have a class named as Car and it is abstract class we need to implement abstract method in 
sub class named as Test
For abstract class Car 
Instance Variables:
brand : String default
model : String default
mileage : int default
top_speed : int default
yearOfManufacturing : int default
Methods:
No Argument Constructor
carBrand() : String : It return brand of the car by using brand variable so initialize brand variable and return it.

carModel() : String : It return model of the car by using model variable so initialize model variable and return it.

carMileage() : int : It return mileage of the car by using mileage variable so initialize mileage variable and return it 

carTopSpeed() : int : It return topspeed of the car by using top_speed variable so initialize top-speed variable and return it 

carYear() : int : It return year of manufacturing of the car by using yearOfManufacturing 

variable so initialize yearOfManufacturing variable and return it
display() : void : abstract : This is abstract method to implement in 


*/