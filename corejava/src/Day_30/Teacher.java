package Day_30;

public class Teacher {
	private String name;
	private int id;
	private String specialization;
	
	public Teacher() {
		super();
		this.name = "Unknown";
		this.id = 0;
		this.specialization = "General";
	}
	
	public Teacher(String name, int id, String specialization) {
		super();
		this.name = name;
		this.id = id;
		this.specialization = specialization;
	}
	
	public void displayDetails() {
		System.out.println("Teacher name : "+this.name);
		System.out.println("Teacher id : "+this.id);
		System.out.println("Teacher specialization : "+this.specialization);
	}
	
	
}

/*
Program 3 :  (Points 10)Sigle level Inheritance
------------------------------------------------------------------------------------------------------------

You are required to develop a system to manage details about teachers and the classes they handle. The system must include the following functionality:

Base Class: Teacher

 private fields:

name (String): Name of the teacher.
id (int): Unique identifier for the teacher.
specialization (String): The area of expertise of the teacher.

Includes:

A default constructor to initialize the fields with default values:
name = "Unknown", id = 0, specialization = "General".

A parameterized constructor to initialize these fields with specific values.

A method displayDetails() to print the teacher's details.

*/