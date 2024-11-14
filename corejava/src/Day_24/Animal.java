package Day_24;

public class Animal {
	private String name;

	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void displayDetails() {
		System.out.println("Animal name : "+this.name);
	}
}

/*
Que 4 : A Hierarchical Model of Animals
========================================

Scenario Description:

In a virtual zoo management system, you need to organize and categorize various types of animals to efficiently manage their characteristics and behaviors. 
To achieve this, you decide to implement a class hierarchy using multilevel inheritance.

1. Create the Animal Class
Requirements:
Define a private String attribute named name.
Implement a parameterized constructor to initialize name.
Implement getter and setter methods for name.
Create a method to display the animal's details.

*/