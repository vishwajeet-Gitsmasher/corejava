package Day_29;

public class Order {
	private String orderId;
	private String productName;
	
	public Order(String orderId, String productName) {
		super();
		if(orderId.charAt(0)=='-' || orderId.charAt(0)=='0') {
			System.err.println("ERROR : Invalid order id");
			System.exit(0);
		}
		int[] arr = {0,1,2,3,4,5,6,7,8,9};
		for(int i=0;i<orderId.length();i++) {
			int count = 0;
			int num = orderId.charAt(i)-'0';
			for(int j=0;j<arr.length;j++) {
				if(num == arr[j]) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.err.println("ERROR : Invalid order id");
				System.exit(0);
			}
		}
		this.orderId = orderId;
		this.productName = productName;
	}
	
	public String getOrderId() {
		return this.orderId;
	}
	
	public String getProductName() {
		return this.productName;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", productName=" + productName + "]";
	}
	
}

/*
Que 2 : Customer and Orders Management 
======================================

Create the Order Class 
----------------------
A class to represent an order with details like order ID and product name.

Variable Declarations:
private String orderId; — This variable stores the order ID.
private String productName; — This variable stores the name of the product ordered.

Constructor Declaration:
public Order(String orderId, String productName) — A constructor to initialize the order ID and product name.

Getter Methods Declaration:
public String getOrderId() — A method to get the order ID.
public String getProductName() — A method to get the product name.

toString Method Declaration:
@Override public String toString() — A method to return a string representation of the order.



Create the Customer Class
-------------------------
A class to represent a customer with details like name, email, and an order.

Variable Declarations:
private String name; — This variable stores the customer's name.
private String email; — This variable stores the customer's email.
private Order order; — This variable stores the order object.

Constructor Declaration:
public Customer(String name, String email, Order order) — A constructor to initialize the customer's name, email, and order.

toString Method Declaration:
@Override public String toString() — A method to return a string representation of the customer, including order details.


Create Shoping class
---------------------
-> Create main method 
-> Create an Order object.
-> Create a Customer object that includes the Order.
-> Display the Customer information.

Condition :
-----------
if any numeric value is zero or negative then print "Error Invalid Input".


TEST CASE 1 :
-------------
sample input  : When your reading numeric values for any above Classe then make sure if any numeric value is <=0 then print "Error Invalid Input".
                
sample output : Error Invalid Input


TEST CASE 2:
------------
sample input  :
                Order order = new Order("123456", "Laptop");
                Customer customer = new Customer("James", "James@example.com", order);
                System.out.println(customer);

sample output : Customer Name: James, Email: James@example.com, Order ID: 123456, Product Name: Laptop

*/