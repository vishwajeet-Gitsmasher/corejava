package Day_25;

public class Electronics extends Product{
	private String brand;

	public Electronics(String name, double price, String brand) {
		super(name, price);
		this.brand = brand;
	}
	
	public void displayInfo() {
		System.out.println("Electronics Details:");
		System.out.println("Product name : "+super.name);
		System.out.println("Product price : $ "+super.price);
		System.out.println("Electronics brand : "+this.brand);
	}

	@Override
	public String toString() {
		return "Electronics [name=" + name + ", price=" + price + ", brand=" + brand + "]";
	}
	
	
}

/*
Create a subclass named Electronics:
------------------------------------
Extend the Product class.
Add a private instance variable brand (String).
Implement a constructor that takes name, price, and brand as parameters and initializes the superclass constructor.
Define a method displayInfo() method to additionally print the product's brand.

*/