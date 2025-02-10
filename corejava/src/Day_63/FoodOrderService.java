package Day_63;

import java.util.ArrayList;

public class FoodOrderService {
	ArrayList<FoodCustomer> foodCustomers = new ArrayList<>();
	
	public void placeOrder(FoodCustomer f) {
		foodCustomers.add(f);
	}
	
	public boolean isFirstTimeCustomer(FoodCustomer f){
		for(FoodCustomer ob: foodCustomers) {
			if(f.getPhoneNumber().equals(ob.getPhoneNumber())) {
				return false;
			}
		}
		return true;
	}
	
	public int calculateBill(FoodCustomer f, int baseDeliveryCharge) {
		if(isFirstTimeCustomer(f)) {
			return 0;
		} else {
			return baseDeliveryCharge;
		}
	}
	
	public String printBill(FoodCustomer f, int billAmount) {
		return "BILL FOR : Customer Name : "+f.getCustomerName()+" Bill Amount : "+billAmount+"";
	}
}

/*
FoodOrderService Class:


Create a class named FoodOrderService to handle food orders.

Maintain an ArrayList of FoodCustomer objects to store order details.

Implement a method placeOrder that takes a FoodCustomer object and adds it to the list of customers.

Implement a method isFirstTimeCustomer that takes a FoodCustomer object and returns true if the customer is ordering for the first time based on their phone number, false otherwise.

Implement a method calculateBill that takes a FoodCustomer object and a base delivery charge as parameters. If the customer is ordering for the first time, return a bill of 0; otherwise, return the base delivery charge.

Implement a method printBill that takes a FoodCustomer object and a bill amount as parameters and returns a message confirming the order with the customer's name and the bill amount.

*/