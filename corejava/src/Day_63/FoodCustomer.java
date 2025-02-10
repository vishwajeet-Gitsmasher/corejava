package Day_63;

public class FoodCustomer {
	private int customerId;
	private String customerName;
	private String address;
	private String phoneNumber;
	
	
	public FoodCustomer() {
		super();
	}

	public FoodCustomer(int customerId, String customerName, String address, String phoneNumber) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	
	
}

/*
Q1)

FoodOrderService

FoodCustomer Class:

Create a class named FoodCustomer with the following private attributes:

customerId (int)

customerName (String)

address (String)

phoneNumber (String)

Implement a default constructor and a parameterized constructor that initializes all attributes.

Implement getter and setter methods for all attributes.

FoodOrderService Class:


Create a class named FoodOrderService to handle food orders.

Maintain an ArrayList of FoodCustomer objects to store order details.

Implement a method placeOrder that takes a FoodCustomer object and adds it to the list of customers.

Implement a method isFirstTimeCustomer that takes a FoodCustomer object and returns true if the customer is ordering for the first time based on their phone number, false otherwise.

Implement a method calculateBill that takes a FoodCustomer object and a base delivery charge as parameters. If the customer is ordering for the first time, return a bill of 0; otherwise, return the base delivery charge.

Implement a method printBill that takes a FoodCustomer object and a bill amount as parameters and returns a message confirming the order with the customer's name and the bill amount.

FoodOrderServiceTester Class:

Create a class named FoodOrderServiceTester with a main method.

Inside the main method:

Create an instance of FoodOrderService.

Create two instances of FoodCustomer.

Place orders for both customers using the placeOrder method.

Test the isFirstTimeCustomer method for both customers and print the results.

Test the calculateBill method for both customers with a base delivery charge of 50.0 and print the bills.

Test the printBill method for both customers and print the bills.

Your implementation should demonstrate the functionality of the food ordering system. Make sure to include appropriate messages and output formats for better clarity.

Ouput :-

Yes , Yes , Yes , No , Yes 


*/