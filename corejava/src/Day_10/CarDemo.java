package Day_10;

public class CarDemo {

	public static void main(String[] args) {
		// Object 1
		Car scorpio = new Car();
		scorpio.carName = "Scorpio N";
		scorpio.carType = "SUV";
		scorpio.price = 2000000;
		
		scorpio.getCarInformation();
		scorpio.running();
		scorpio.carMusicSystemOn();
		
		System.out.println("----------------------------------");
		
		// Object 2
		Car verna = new Car();
		verna.carName = "Verna SX";
		verna.carType = "Sedan";
		verna.price = 1600000;
		
		verna.getCarInformation();
		verna.running();
		verna.carMusicSystemOn();


	}

}

/*
Car name : Scorpio N
Type of car : SUV
Price of car : 2000000
Scorpio N is running
Music System is ON
----------------------------------
Car name : Verna SX
Type of car : Sedan
Price of car : 1600000
Verna SX is running
Music System is ON

*/
