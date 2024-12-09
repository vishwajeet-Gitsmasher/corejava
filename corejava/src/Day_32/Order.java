package Day_32;

public class Order {
	private int orderId;
	private String itemName;
    private double itemPrice;
    
	public Order(int orderId, String itemName, double itemPrice) {
		super();
		if(orderId<=0) {
			System.err.println("Error: Invalid Employee ID");
			System.exit(0);
		}
		this.orderId = orderId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
	
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", itemName=" + itemName + ", itemPrice=" + itemPrice + "]";
	}
    
    
}

/*
Program: 2
-----------
Create a class Order (Business Logic Class)
Instance Variables: 
   private int orderId;
   private String itemName;
   private double itemPrice;
Create a parameterized constructor initialize the instance variable of the class.
Override toString() from Object class to print Order class properties.

*/