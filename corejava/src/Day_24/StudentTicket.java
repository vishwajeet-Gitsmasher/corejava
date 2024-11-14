package Day_24;

public class StudentTicket extends Ticket{
	private boolean studentDiscount;

	public StudentTicket(String eventName, int seatNumber, double price, boolean studentDiscount) {
		super(eventName, seatNumber, price);
		this.studentDiscount = studentDiscount;
	}

	public boolean isStudentDiscount() {
		return studentDiscount;
	}

	public void setStudentDiscount(boolean studentDiscount) {
		this.studentDiscount = studentDiscount;
	}
	
	public void displayDetails() {
		System.out.println("Student Ticket:");
		System.out.println("Event:"+super.getEventName());
		System.out.println("Seat Number:"+super.getSeatNumber());
		System.out.println("Price:"+super.getPrice());
		System.out.println("Student Discount:"+this.studentDiscount);
	}
}

/*
3.Create another class StudentTicket and inherit Ticket class here.
-------------------------------------------------------------------

Instance variable:-

boolean studentDiscount,private

Create a parameterized constructor for Instance variable to initialize the variable.

//Use super keyword to initialize Ticket class constructor attributes.

Generate Getters and setters for Instance variable to get values and set values.
*/