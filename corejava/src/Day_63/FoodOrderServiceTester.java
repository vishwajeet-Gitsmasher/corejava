package Day_63;

public class FoodOrderServiceTester {

	public static void main(String[] args) {
		FoodOrderService fs = new FoodOrderService();
		
		FoodCustomer f1 = new FoodCustomer(1,"Rahul","Pune","36373");
		FoodCustomer f2 = new FoodCustomer(2,"Virat","Hyderabad","73837");
		
		fs.placeOrder(f1);
		fs.placeOrder(f2);
		
		System.out.println("Is f1 first Customer : "+fs.isFirstTimeCustomer(f1));
		System.out.println("Is f2 first Customer : "+fs.isFirstTimeCustomer(f2));
		
		System.out.println("Bill Calculated for f1 : "+fs.calculateBill(f1, 50));
		System.out.println("Bill Calculated for f2 : "+fs.calculateBill(f2, 50));
		
		System.out.println("Printing Bill for f1: "+fs.printBill(f1, 50));
		System.out.println("Printing Bill for f2: "+fs.printBill(f2, 50));
	}

}

/*
Is f1 first Customer : false
Is f2 first Customer : false
Bill Calculated for f1 : 50
Bill Calculated for f2 : 50
Printing Bill for f1: BILL FOR : Customer Name : Rahul Bill Amount : 50
Printing Bill for f2: BILL FOR : Customer Name : Virat Bill Amount : 50

 */

/*
FoodOrderServiceTester Class:

Create a class named FoodOrderServiceTester with a main method.

Inside the main method:

Create an instance of FoodOrderService.

Create two instances of FoodCustomer.

Place orders for both customers using the placeOrder method.

Test the isFirstTimeCustomer method for both customers and print the results.

Test the calculateBill method for both customers with a base delivery charge of 50.0 and print the bills.

Test the printBill method for both customers and print the bills.

Your implementation should demonstrate the functionality of the food ordering system. Make sure to include appropriate messages and output formats for better clarity.

Ouput :-

Yes , Yes , Yes , No , Yes 


*/