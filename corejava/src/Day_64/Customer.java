package Day_64;

public class Customer {
	private Integer customerNumber;
	private String customerName;
	private Double customerBill;
	
	public Customer(Integer customerNumber, String customerName, Double customerBill) {
		super();
		this.customerNumber = customerNumber;
		this.customerName = customerName;
		this.customerBill = customerBill;
	}

	public Integer getCustomerNumber() {
		return customerNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public Double getCustomerBill() {
		return customerBill;
	}

	@Override
	public String toString() {
		return "Customer [customerNumber=" + customerNumber + ", customerName=" + customerName + ", customerBill="
				+ customerBill + "]";
	}	
}

/*
Program 2:
------------
Write a Program to perform sorting operation on Customer class using 
ArrayList by implementing Comparator interface 

Create a BLC class Customer
Instance variables:
customerNumber-private-Integer
customerName-private-String
customerBill-private-Double

Create a parameterized constructor to initialize the instance variable of Customer class.

Implement Comparator interface to write the logic to sort the Customer class based on the following 
a) Based on customer number
b) Based on customer name
c) Based on customer bill
Create an ELC class which contains main method, create ArrayList object to hold Customer data as 
well as sort the Customer data object based on the above criteria
*/