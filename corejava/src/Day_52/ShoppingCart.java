package Day_52;

public class ShoppingCart {
	Product[] cartItems;
	int index = 0;
	int itemCount = 0;
	public ShoppingCart(int capacity) {
		super();
		this.cartItems = new Product[capacity];
	}
	
	public void addToCart(Product p,int items) throws InvalidProductException, InsufficientQuantityException{
		if(index==cartItems.length || p==null) {
			throw new InvalidProductException("Product is not found");
		} else if(p.quantity<=0) {
			throw new InsufficientQuantityException("Insufficient Quantity : Product quantity is Insuffcient.");
		} else {
			Product pr = new Product(p);
			pr.quantity = items;
			cartItems[index] = pr;
			itemCount += items;
			index++;
			p.decreaseQuantity(items);
		}
	}
	
	public double calculateTotal() {
		double total = 0;
		for(Product p:cartItems) {
			total += (p.price * p.quantity);
		}
		return total;
	}
}

/*
BLC  ShoppingCart Class:
Attributes:
cartItems: Product[] : to store items in the cart.
itemCount: int : An integer representing the number of items in the cart.

Constructor:
parameter : capacity : int 
Initialize the cartItems with a Product[] based on the given 
capacity.

Mehtods:

Method name: addToCart 
Access Modifier : public
return type : void
parameters : Product,int
Adds the product to the cart or updates its quantity.Throws InsufficientQuantityException if the requested quantity is not available, or InvalidProductException if the product is not found.


Method name: calculateTotal 
Access Modifier : public
return type : double
parameters : no param
Method: Calculates and returns the total price of all items in the cart.

*/