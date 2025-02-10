package Day_63;

public class AirlineBookingServiceTester {

	public static void main(String[] args) {
		AirlineBookingService fs = new AirlineBookingService();
		
		AirlineCustomer f1 = new AirlineCustomer(1,"Rahul","rahul@gmail.com","36373");
		AirlineCustomer f2 = new AirlineCustomer(2,"Virat","virat@gmail.com","73837");
		
		fs.bookFlight(f1);
		fs.bookFlight(f2);
		
		System.out.println("Is f1 first Customer : "+fs.isFirstTimeCustomer(f1));
		System.out.println("Is f2 first Customer : "+fs.isFirstTimeCustomer(f2));
		
		System.out.println("Bill Calculated for f1 : "+fs.calculateBookingCost(f1, 1500));
		System.out.println("Bill Calculated for f2 : "+fs.calculateBookingCost(f2, 1500));
		
		System.out.println("Printing Bill for f1: "+fs.printBookingDetails(f1, 1500));
		System.out.println("Printing Bill for f2: "+fs.printBookingDetails(f2, 1500));

	}

}

/*
AirlineBookingServiceTester Class:

Create a class named AirlineBookingServiceTester with a main method.

Inside the main method:

Create an instance of AirlineBookingService.

Create two instances of AirlineCustomer.

Book flights for both customers using the bookFlight method.

Test the isFirstTimeCustomer method for both customers and print the results.

Test the calculateBookingCost method for both customers with a base cost per ticket of 1500.0 and print the booking costs.

Test the printBookingDetails method for both customers and print the booking details.

Your implementation should demonstrate the functionality of the airline booking system. Make sure to include appropriate messages and output formats for better clarity.



*/