package Day_23;

public class Student {
	protected String name;
	protected int rollNumber;
	
	public Student(String name, int rollNumber) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
	}
	
	public void displayDetails() {
		System.out.println("Student name : "+this.name);
		System.out.println("Student roll number : "+this.rollNumber);
		
	}
	
	public double calculatePercentage() {
		return 0;
	}
	
	
}

/*
Que 2 : Calculate Student Percentage
====================================

Create a simple Java program using inheritance to manage student data. 
We have a base class Student, and two subclasses: ScienceStudent and ArtsStudent. 
Each subclass should calculate the percentage of marks based on its own set of subjects. 
The percentage calculation will be done using an overridden method.

Define the base class Student
------------------------------
Attributes: protected Sreing name and protected int rollNumber.

Costructor:  A constructor to initialize these attributes

Methods: 1) public void displayDetails() a method to display student details.
         2) public double calculatePercentage() a method wich will calculate and return percentage.

*/