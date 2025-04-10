package Day_25;

public class Product {
	protected String name;
	protected double price;
	
	public Product(String name, double price) {
		super();
		if(price <=0) {
			System.out.println("Error Invalid Input");
			System.exit(0);
		}
		this.name = name;
		this.price = price;
	}
	
	public void displayInfo() {
		System.out.println("Product name : "+this.name);
		System.out.println("Product price : $ "+this.price);
	}
	
	public double calculateTotalCost(int quantity) {
		double totalCost = this.price * quantity;
		return totalCost;
	}
}

/*
Que 2 : Online Shopping System
==============================

You are building an Online Shopping System, and you need to create a class hierarchy to represent different types of products that customers can purchase. You will be implementing a set of classes that model the products and their attributes. The focus of this problem is to demonstrate the use of inheritance and method overriding in Java.

Follow the provided code as a base, and create the necessary classes to satisfy the requirements below:

Create a class named Product:
-----------------------------
It should have protected instance variables name (String) and price (double).
Implement a constructor that initializes the name and price.
Define a method displayInfo() that prints the product's name and price.
Define a method calculateTotalCost(int quantity) that calculates and returns the total cost of purchasing a given quantity of the product.

*/