package Day_30;

public class Employee {
	String name;
	int id;
	
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public void displayInfo() {
		System.out.println("Employee name : "+this.name);
		System.out.println("Employee id : "+this.id);
	}
	
}

/*
Program 2 : (10 points) Multilevel Inheritances 
---------------------------------------------------------------------------------------------

Company Management System
You are tasked with creating a Company Management System that models employees within a company. The system should represent employees at different levels, where each level has specific responsibilities and properties. Use multi-level inheritance to model the relationships between the classes.

Class Hierarchy:
Employee Class (Base Class):

Attributes:
String name: Represents the name of the employee.
int id: Represents the unique ID of the employee.
Methods:
A constructor to initialize the name and id attributes.
void displayInfo(): Prints the employee's name and ID.


*/