package Day_25;

public class Clothing extends Product{
	private String size;

	public Clothing(String name, double price, String size) {
		super(name, price);
		this.size = size;
	}
	
	public void displayInfo() {
		System.out.println("Clothing Details:");
		System.out.println("Product name : "+super.name);
		System.out.println("Product price : $ "+super.price);
		System.out.println("Clothing size : "+this.size);
	}

	@Override
	public String toString() {
		return "Clothing [name=" + name + ", price=" + price + ", size=" + size + "]";
	}
	
	
}

/*
Create another subclass named Clothing:
---------------------------------------
Extend the Product class.
Add a private instance variable size (String).
Implement a constructor that takes name, price, and size as parameters and initializes the superclass constructor.
Define a method  displayInfo() method to additionally print the product's size.
*/