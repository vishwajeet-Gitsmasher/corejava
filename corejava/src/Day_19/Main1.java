package Day_19;

class Vehicle{
	String brand;
	int year;
	
	void start() {
		System.out.println("The vehicle is starting.");
	}
}


class Car extends Vehicle{
	String model;

	void displayCarDetails() {
		System.out.println(this.model);
		System.out.println(super.brand);
		System.out.println(super.year);
	}
	
}

public class Main1 {

	public static void main(String[] args) {
		Car c = new Car();
		c.model = "TATA";
		c.year = 1897;
		c.brand = "Harrier";
		c.start();
		c.displayCarDetails();
	}

}

/*
The vehicle is starting.
TATA
Harrier
1897
 */

/*
2)
create base class Vehicle 
with its attributes
String brand
int year

methods:-

return type :- void
method Name :- start
behavior of start method:- this method will print the message that " The vehicle is starting."
------
create derived class name as car inherit from vehicle

Attribute:-

String model


methods:-

return type :- void
method Name :- displayCarDetails
behavior of displayCarDetails method:- this method will print the brand, year,model

------
create main class to test your logic 
create object initialize the values and call the methods
*/