package Day_11;

public class Truck {
	// properties
		int truckId;
		String truckName;
		double truckPrice;
		
		//Behavior
		public void settruckData(int id, String name, double price) {
			truckId = id;
			truckName = name;
			truckPrice = price;
		}

		
		public void gettruckInfo() {
			System.out.println("Truck ID : "+truckId);
			System.out.println("Truck Name : "+truckName);
			System.out.println("Truck Price : "+truckPrice);
		}
}
