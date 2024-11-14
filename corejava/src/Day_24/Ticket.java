package Day_24;

public class Ticket {
	private String eventName;
	private int seatNumber;
	private double price;
	
	public Ticket(String eventName, int seatNumber, double price) {
		super();
		if(seatNumber <=0) {
			System.err.println("Error Invalid Seat Number");
			System.exit(0);
		}else if (price <=0) {
			System.err.println("Error Invalid Price");
			System.exit(0);
		}
		this.eventName = eventName;
		this.seatNumber = seatNumber;
		this.price = price;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	    
    public void displayDetails() {
		System.out.println("Regular Ticket:");
		System.out.println("Event:"+this.eventName);
		System.out.println("Seat Number:"+this.seatNumber);
		System.out.println("Price:"+this.price);
	}
	
	
}

/*
Que 5 : Ticket Management System with VIP and Student Tickets
============================================================= 

You have been hired by an event management company to develop a ticketing system that can manage different types of tickets for various events. 
The system needs to handle regular tickets, VIP tickets with special access privileges, and student tickets that may have a discount. 
Your task is to create a Java program with the following requirements: 

Design a Ticket class with attributes like event name, seat number, and price.

1.Create a class Ticket
------------------------

Instance variable:-

String eventName,private

int seatNumber,private

double price,private

Create a parameterized constructor for all Instance variable to initialize the variable.

Generate Getters and setters for all Instance variable to get values and set values.

*/