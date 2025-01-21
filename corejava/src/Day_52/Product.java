package Day_52;

public class Product {
	int id;
	String name;
	double price;
	int quantity;
	
	public Product(int id, String name, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(Product p) {
		super();
		this.id = p.id;
		this.name = p.name;
		this.price = p.price;
		this.quantity = p.quantity;
	}
	
	public void decreaseQuantity(int amount) throws InsufficientQuantityException {
		if(amount>quantity || amount<=0) {
			throw new InsufficientQuantityException("Quantity is Insufficient OR Invalid Qauntity request.");
		} else {
			this.quantity -= amount;
			//System.out.println("Quantity Decreased");
		}
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
}

/*
BLC Product Class:

Attributes:
id: int: representing the product's unique identifier.
name: String: representing the product's name.
price: double: representing the product's price.
quantity: int: representing the available quantity of the product.


Constructor: 
Parameterized Constructor to initialize all the atributes.

methods : 
Method name: decreaseQuantity 
Access Modifier : public
return type : void
parameters : amount: int
Takes an integer amount as a parameter and decreases the product's quantity. Throws InsufficientQuantityException if the requested quantity is not available.

*/