package Day_63;

import java.util.ArrayList;

public class AirlineBookingService {
	ArrayList<AirlineCustomer> airlineCustomers = new ArrayList<AirlineCustomer>();
	
	public void bookFlight(AirlineCustomer a) {
		airlineCustomers.add(a);
	}
	
	public boolean isFirstTimeCustomer(AirlineCustomer a){
		for(AirlineCustomer ob: airlineCustomers) {
			if(a.getPhoneNumber().equals(ob.getPhoneNumber())) {
				return false;
			}
		}
		return true;
	}
	
	public int calculateBookingCost(AirlineCustomer a, int baseCost) {
		if(isFirstTimeCustomer(a)) {
			return 0;
		} else {
			return baseCost;
		}
	}
	
	public String printBookingDetails(AirlineCustomer a, int bookingCost) {
		return "BILL FOR : Customer Name : "+a.getFullName()+" Bill Amount : "+bookingCost+"";
	}
}

/*
AirlineBookingService Class:


Create a class named AirlineBookingService to handle flight bookings.

Maintain an ArrayList of AirlineCustomer objects to store booking details.

Implement a method bookFlight that takes an AirlineCustomer object and adds it to the list of customers.

Implement a method isFirstTimeCustomer that takes an AirlineCustomer object and returns true if the customer is booking for the first time based on their phone number, false otherwise.

Implement a method calculateBookingCost that takes an AirlineCustomer object and a base cost per ticket as parameters. If the customer is booking for the first time, return a booking cost of 0; otherwise, return the base cost per ticket.

Implement a method printBookingDetails that takes an AirlineCustomer object and a booking cost as parameters and returns a message confirming the booking with the customer's full name and the booking cost.

*/