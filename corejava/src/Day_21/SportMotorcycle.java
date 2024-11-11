package Day_21;

public class SportMotorcycle extends Motorcycle{
	boolean raceMode;

	public SportMotorcycle(String brand, int year, int engineCapacity, boolean raceMode) {
		super(brand, year, engineCapacity);
		this.raceMode = raceMode;
	}
	
	public void activateRaceMode() {
		this.raceMode = true;
		System.out.println("race mode is now on.");
	}
	
	public void displaySportMotorcycleDetails() {
		super.displayVehicleDetails();
		System.out.println("Vehicle engine capacity : "+super.engineCapacity);
		System.out.println("Vehicle racemode is activated ? : "+this.raceMode);
	}
}

/*
SportMotorcycle Class (Child Class)
Create a class named SportMotorcycle that inherits from Motorcycle.
Additional attribute:
raceMode (boolean): Indicates if race mode is activated for the sport motorcycle.
Constructor:
SportMotorcycle(String brand, int year, int engineCapacity, boolean raceMode): Initializes the brand, year, engine capacity, 
and race mode status of the sport motorcycle.
Methods:
void activateRaceMode(): Activates race mode and displays a message confirming that race mode is now on.
void displaySportMotorcycleDetails(): Displays the full details of the sport motorcycle, including brand, year, engine capacity, 
and the status of race mode.
*/