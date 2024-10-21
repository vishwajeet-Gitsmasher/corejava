package Day_10;

public class Car {
	// Properties
	String carName;
	String carType;
	int price;
	
	// Behavior
	
	public void getCarInformation() {
		System.out.println("Car name : "+carName);
		System.out.println("Type of car : "+carType);
		System.out.println("Price of car : "+price);
	}
	
	public void running() {
		System.out.println(carName+" is running");
	}
	
	public void carMusicSystemOn() {
		System.out.println("Music System is ON");
	}
	
}
