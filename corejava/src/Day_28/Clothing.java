package Day_28;

public class Clothing extends Product {
	private String size;

	public Clothing(String name, double price, String size) {
		super(name, price);
		this.size = size;
	}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Clothing Size : "+this.size);
	}
	
}

/*
Create another subclass named Clothing:
Extend the Product class.

Add a private instance variable size (String).
Implement a constructor that takes name, price, and size as parameters and initializes the superclass constructor.
Define a method displayInfo() method to additionally print the product's size.
*/