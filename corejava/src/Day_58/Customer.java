package Day_58;

public class Customer implements Runnable{
	Bakery bakery;
	String customerName;
	
	public Customer(Bakery bakery, String customerName) {
		super();
		this.bakery = bakery;
		this.customerName = customerName;
	}
	
	public void run() {
		synchronized(this) {
			while(true) {
				if(bakery.goodsAvailable > 0) {
					bakery.buyGoods(customerName);
					System.out.println(customerName+" is going to buy goods...");
				} else {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
	}
}


/*
Customer Class
======================
Create a class Customer that implements Runnable. This class should:

Attributes
Bakery bakery: Reference to the shared Bakery instance.
String customerName: The name of the customer.

Methods
----------------
Constructor to initialize all fieilds :

public void run():
Repeatedly attempts to buy goods from the bakery by calling the buyGoods() method.
If no goods are available, the customer should wait until notified by the baker.

*/