package Day_27;

public class Product {
	protected String name;
	protected double price;
	
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void displayInfo() {
		System.out.println("Product name :"+this.name);
		System.out.println("Product price :"+this.price);
		
	}
	
	public double calculateTotalCost(int quantity) {
		  double totalCost = quantity * this.price;
		  return totalCost;
	}
	
	
}

/*
2)Problem: Online Shopping System

You are building an Online Shopping System, and you need to create a class hierarchy to represent different types of products that customers can purchase. You will be implementing a set of classes that model the products and their attributes. The focus of this problem is to demonstrate the use of inheritance and method overriding in Java.

Follow the provided code as a base, and create the necessary classes to satisfy the requirements below:

  Create a class named Product:

    It should have protected instance variables name (String) and price (double).
    Implement a constructor that initializes the name and price.
    Define a method displayInfo() that prints the product's name and price.
    Define a method calculateTotalCost(int quantity) that calculates and returns the total cost of purchasing a given quantity of the product.

  Create a subclass named Electronics:
    Extend the Product class.

    Add a private instance variable brand (String).
    Implement a constructor that takes name, price, and brand as parameters and initializes the superclass constructor.
    Define a method displayInfo() method to additionally print the product's brand.

  Create another subclass named Clothing:
    Extend the Product class.

    Add a private instance variable size (String).
    Implement a constructor that takes name, price, and size as parameters and initializes the superclass constructor.
    Define a method displayInfo() method to additionally print the product's size.

  Create a class named OnlineShopping (as provided in the code):

    In the main method, create instances of both Electronics and Clothing with appropriate values.
    Print information about each product, including their specific attributes.
    Calculate and print the total cost for a given quantity of each product.

Your task is to implement the required classes based on the provided problem description. This will help you practice inheritance concepts.


=============================================
*/