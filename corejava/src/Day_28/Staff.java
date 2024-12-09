package Day_28;

public class Staff {
	String name;
	int id;
	
	public Staff(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public void displayInfo() {
		System.out.println("Staff name : "+this.name);
		System.out.println("Staff id : "+this.id);
	}
	
	
}

/*
SET A
-----------------------------------------------------------------------------------------------------------------------
Program 1 : ( 10 points )Multilevel Inheritance
-----------------------------------------------------------------------------------------------------------------------
University Staff Management System
You are tasked with creating a system that models university staff members, with multiple levels of staff positions. The system will represent different staff roles and their specific responsibilities.

Class Hierarchy:

Staff Class (Base Class) 

Attributes:

String name: Represents the name of the staff member.
int id: Represents the unique ID of the staff member.

Methods:

Constructor to initialize the name and id attributes.

void displayInfo(): Prints the staff member's name and ID.
*/