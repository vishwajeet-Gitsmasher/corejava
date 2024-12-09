package Day_29;

public class Shopping {

	public static void main(String[] args) {
		Order order = new Order("1", "Laptop");
        Customer customer = new Customer("James", "James@example.com", order);
        System.out.println(customer);

	}

}

/*
Customer [name=James, email=James@example.com, order=Order [orderId=123456, productName=Laptop]]
*/

/*
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