package Day_32;

public class Zomato {

	public static void main(String[] args) {
		Order ord = new Order(12,"TV",45000);
		Customer c = new Customer(101,"Ram","Pune",ord);
		System.out.println(c);

	}

}

/*
 * Customer [customerId=101, customerName=Ram, customerAddress=Pune, order=Order 
 * [orderId=12, itemName=TV, itemPrice=45000.0]]
 */


/*
Create a class Zomato (Executable Logic Class) which contains main method to print Customer 
class properties using toString() method.

*/