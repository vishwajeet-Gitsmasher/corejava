package Day_25;

public class Animal {
	String name;
	int age;
	
	public Animal(String name, int age) {
		super();
		if(age <=0) {
			System.err.println("Error Invalid Input");
			System.exit(0);
		}
		this.name = name;
		this.age = age;
	}

	public void makeSound() {
		System.out.println("The animal makes a generic sound.");
	}
	
	public void displayInfo() {
		System.out.println("Animal name : "+this.name);
		System.out.println("Animal age : "+this.age);
	}
}

/*
Que 1 : Zoo Management System
=============================

You are tasked with creating a Zoo Management System that can handle different types of animals. 
You need to implement classes that represent animals and their specific characteristics.
In this system, you'll implement the concept of inheritance and method overriding to showcase the behavior of animals.

Follow the provided code as a base, and create the necessary classes to satisfy the requirements below:

Create a class named Animal:
-----------------------------
It should have private instance variables name (String) and age (int).
Implement a constructor that initializes the name and age.
Define a method makeSound() that prints "The animal makes a generic sound."
Define a method displayInfo() that prints the name and age.

*/