package Day_21;

import java.util.Scanner;

public class MotorcycleInheritanceExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Vehicle brand = ");
		String brand = sc.next();
		System.out.print("Enter Vehicle manufacturing year = ");
		int year = sc.nextInt();
		System.out.print("Enter Vehicle engine capacity = ");
		int engineCapacity = sc.nextInt();
		System.out.print("Enter Vehicle raceMode = ");
		boolean raceMode = sc.nextBoolean();
		SportMotorcycle SM = new SportMotorcycle(brand, year, engineCapacity, raceMode);
		SM.startEngine();
		SM.activateRaceMode();
		SM.displaySportMotorcycleDetails();
	}

}

/*
Enter Vehicle brand = Yamaha
Enter Vehicle manufacturing year = 2018
Enter Vehicle engine capacity = 1200
Enter Vehicle raceMode = false
engine is starting, with 1200 cc engine capacity
race mode is now on.
Vehicle brand : Yamaha
Vehicle manufacturing year : 2018
Vehicle engine capacity : 1200
Vehicle racemode is activated ? : true

=================================================

Enter Vehicle brand = Ducati
Enter Vehicle manufacturing year = 2023
Enter Vehicle engine capacity = 1200
Enter Vehicle raceMode = false
engine is starting, with 1200 cc engine capacity
race mode is now on.
Vehicle brand : Ducati
Vehicle manufacturing year : 2023
Vehicle engine capacity : 1200
Vehicle racemode is activated ? : true

*/


/*
Main Class (MotorcycleInheritanceExample)

In the main class, create an instance of SportMotorcycle with the following details:
Brand: "Ducati"
Year: 2023
Engine Capacity: 1200 cc
Race Mode: Initially set to false.
Perform the following actions in the main method:
Start the engine.
Activate the race mode.
Display all details of the sport motorcycle.
*/