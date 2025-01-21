package Day_51;

public class ShoppingCart {
	private int availableItems;

	public ShoppingCart(int availableItems) {
		super();
		this.availableItems = availableItems;
	}
	
	int addItem(int quantity) throws InvalidItemException{
		int cart = 0;
		if(quantity <= 0) {
			throw new InvalidItemException("Invalid Item Quantity : Quantity cannot negative or zero.");
		} else if (quantity > availableItems) {
			throw new InvalidItemException("Invalid Item Quantity : Insufficient stock.");
		} else {
			cart += quantity;
		}
		return cart;
	}
	
	int addItemUnchecked(int quantity) throws OutOfStockException, IllegalArgumentException{
		int cart = 0;
		if(availableItems==0 || quantity > availableItems) {
			throw new OutOfStockException("Out of Stock");
		} else if(quantity <= 0) {
			throw new IllegalArgumentException("Invalid Item Quantity : Quantity cannot negative or zero.");
		} else {
			cart += quantity;
		}
		return cart;
	}
}

/*
* ShoppingCart Class:
-> The class should have a private instance variable availableItems representing the number of items in stock.
-> Implement a constructor to initialize the initial number of available items.
-> Implement a method addItem(int quantity) that adds items to the cart, throwing InvalidItemException for invalid quantities or 
insufficient stock.
-> Implement a method addItemUnchecked(int quantity) that simulates adding items, throwing OutOfStockException for 
quantities exceeding the available stock and handling IllegalArgumentException for invalid quantities.

*/