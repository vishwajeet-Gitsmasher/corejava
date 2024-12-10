package Day_38;

public class Test extends Car{

	public Test(String brand, String model, int mileage, int top_speed, int yearOfManufacturing) {
		super(brand, model, mileage, top_speed, yearOfManufacturing);
	}

	public static void main(String[] args) {
		Test t = new Test("TATA","Harrier",25,200,2019);
		t.display();

	}
	
	public void display() {
		System.out.println("Car Brand : "+super.brand);
		System.out.println("Car Model : "+super.model);
		System.out.println("Car mileage : "+super.mileage);
		System.out.println("Car top_speed : "+super.top_speed);
		System.out.println("Car yearOfManufacturing : "+super.yearOfManufacturing);
		
	}

}

/*
Car Brand : TATA
Car Model : Harrier
Car mileage : 25
Car top_speed : 200
Car yearOfManufacturing : 2019
*/

/*
sub class
Create a sub class of Car called as Test
Methods:
@Override
display(): void : It print all the details of parent class
This class having main method to test the solutions of parent class
*/