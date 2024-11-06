package Day_18;

class Vehicle{
	String vehicleType;
	String vehicleCompany;
	String vehicleName;
	
	Vehicle (String vehicleType, String vehicleCompany, String vehicleName){
		this.vehicleType = vehicleType;
		this.vehicleCompany = vehicleCompany;
		this.vehicleName = vehicleName;
	}
	
	public void purchased() {
		System.out.println("Vehicle purchased");
	}
	
	public void selled() {
		System.out.println("Vehicle Sellled");
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleType=" + vehicleType + ", vehicleCompany=" + vehicleCompany + ", vehicleName="
				+ vehicleName + "]";
	}
	
}

class Car extends Vehicle{ // IS-A
	String carName;
	String carBrand;
	int tyres;
	int gears;
	Owner owner; // HAS - A
	
	Car(String vehicleType, String vehicleCompany, String vehicleName, String carName, String carBrand, int tyres, int gears, Owner owner){
		super(vehicleType, vehicleCompany, vehicleName);
		this.carName = carName;
		this.carBrand = carBrand;
		this.tyres = tyres;
		this.gears =  gears;
		this.owner = owner;
	}
	
	public void runs() {
		System.out.println("Car Runs at very high speed");
	}
	
	public void parked() {
		System.out.println("Car is parked");
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carBrand=" + carBrand + ", tyres=" + tyres + ", gears=" + gears
				+ ", owner=" + owner + "]";
	}
	
}

class Motorcycle extends Vehicle{ //IS-A
	String motorcycleName;
	String motorcycleBrand;
	int tyres;
	int gears;
	Owner owner; // HAS - A
	
	

	Motorcycle(String vehicleType, String vehicleCompany, String vehicleName, String motorcycleName, String motorcycleBrand, int tyres, int gears, Owner owner){
		super(vehicleType, vehicleCompany, vehicleName);
		this.motorcycleName = motorcycleName;
		this.motorcycleBrand = motorcycleBrand;
		this.tyres = tyres;
		this.gears =  gears;
		this.owner = owner;
	}
	
	public void runAtHighSpeed() {
		System.out.println("Motocycle is running at very high speed");
	}
	
	public void Started() {
		System.out.println("Motorcycle is Started");
	}

	@Override
	public String toString() {
		return "Motorcycle [motorcycleName=" + motorcycleName + ", motorcycleBrand=" + motorcycleBrand + ", tyres="
				+ tyres + ", gears=" + gears + ", owner=" + owner + "]";
	}
	
}

class Owner{
	String ownerName;
	int mobile;
	String Location;
	
	Owner(String ownerName, int mobile, String Location){
		this.ownerName = ownerName;
		this.mobile = mobile;
		this.Location = Location;
	}

	@Override
	public String toString() {
		return "Owner [ownerName=" + ownerName + ", mobile=" + mobile + ", Location=" + Location + "]";
	}
	
}




public class Test1 {

	public static void main(String[] args) {
		Owner owner = new Owner("Vishwajeet", 1167583729, "Hyderabad");
		Car c = new Car("Four Wheller", "Mahindra", "Sedan", "Verna", "S-X", 4, 5, owner);
		System.out.println(c);
		c.purchased();
		c.runs();
		c.parked();
		c.selled();
		
		System.out.println("===================================================================================================");
		
		Motorcycle m = new Motorcycle("Two Wheller", "Yamaha", "Racer","Rx", "X-100", 2, 5, owner);
		System.out.println(m);
		m.purchased();
		m.Started();
		m.runAtHighSpeed();
		m.selled();
	}

}

/*
Car [carName=Verna, carBrand=S-X, tyres=4, gears=5, owner=Owner [ownerName=Vishwajeet, mobile=1167583729, Location=Hyderabad]]
Vehicle purchased
Car Runs at very high speed
Car is parked
Vehicle Sellled
===================================================================================================
Motorcycle [motorcycleName=Rx, motorcycleBrand=X-100, tyres=2, gears=5, owner=Owner [ownerName=Vishwajeet, mobile=1167583729, Location=Hyderabad]]
Vehicle purchased
Motorcycle is Started
Motocycle is running at very high speed
Vehicle Sellled
*/
