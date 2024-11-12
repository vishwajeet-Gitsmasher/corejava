package Day_22;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void displayInfo() {
		System.out.println("Person name : "+ this.name);
		System.out.println("Person age : "+ this.age);
	}
}

/*
1)Multilevel Inheritance for Employee Management
Problem Statement:
You are tasked with building a simple Employee Management System for a company. The system should track basic details for Person, Employee, and Manager roles. Each role will inherit attributes and behaviors from its parent role in a multilevel inheritance structure.

Person (Base Class):

Attributes:
name (String): Name of the person.
age (int): Age of the person.
Methods:
displayInfo(): This method should print the name and age of the person.
*/