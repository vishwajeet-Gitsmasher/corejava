package Day_58;

public class Bakery {
	int goodsAvailable;
	final int MAX_GOODS_PER_DAY = 100;
	int goodsProducedToday;
	
	public Bakery(int goodsAvailable, int goodsProducedToday) {
		super();
		this.goodsAvailable = goodsAvailable;
		this.goodsProducedToday = goodsProducedToday;
	}

	public synchronized void bakeGoods() {
		if(goodsAvailable > 0) {
			//System.out.println("Sufficient Goods are Avaialable, waiting for customers to Buy...");
//			try {
//				wait();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		} else {
			if(goodsProducedToday < MAX_GOODS_PER_DAY) {
				goodsProducedToday += 10;
				goodsAvailable += 10;
				System.out.println("10 Goods Produced Sucessfully...");
			}
		}
		notifyAll();
	}
	
	public synchronized void buyGoods(String customerName) {
		int goodsToBuy = 10;
		if(goodsAvailable <= 0 || goodsAvailable < goodsToBuy) {
			while(goodsAvailable <= 0 || goodsAvailable < goodsToBuy) {
				
				try {
					//notifyAll();
					wait();
					if(goodsAvailable - goodsToBuy >= 0) {
						goodsAvailable -= goodsToBuy;
						System.out.println(customerName+" buyed "+goodsToBuy+" successfully...");
						break;
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} else {
			goodsAvailable -= goodsToBuy;
			System.out.println(customerName+" buyed "+goodsToBuy+" successfully...");
		}
		
		notifyAll();
	}
	
	public boolean isProductionFinished() {
		if(goodsProducedToday >= MAX_GOODS_PER_DAY) {
			System.out.println("Maximum Limit Reached...");
			return true;
		}
		return false;
	}
}


/*
Java Multithreading Bakery Simulation
=============================================
You are tasked with simulating a simple bakery operation using Java multithreading. In this bakery, there is one baker who bakes goods and multiple customers who buy the goods. 

You need to ensure that:
The bakery can only produce up to 100 goods per day (Maximum Limit).
The baker bakes goods only when the bakery is empty.
Customers wait if there are no goods available to buy.
Multiple customers can buy goods concurrently.
The program should stop automatically when the daily production limit is reached and all goods have been sold.

Instructions
-----------------
Bakery Class: 
================
Create a class Bakery with the following attributes and methods:

Attributes
----------------------
goodsAvailable: int - The current number of goods available for purchase.
MAX_GOODS_PER_DAY: final int - The maximum number of goods that can be produced in a day (set to 100).
goodsProducedToday: int - The total number of goods produced so far today.

Methods
--------------
1) public synchronized void bakeGoods():

Behavior:
---------
If number of goods are available then Baker will not produced new goods, It will be in wait mode (Using wait() method).

Everytime Baker will bake 10 goods in one attempt, These 10 goods will be added in total number of goods produced today as well as we need to verify
goodsProducedToday < MAX_GOODS_PER_DAY.

After baking 10 goods, it should notify all waiting threads that goods are available.

2) public synchronized void buyGoods(String customerName):

Behavior:

Allows a customer to buy a good if available.

If no goods are available, the method customer should wait until goods are available or the production is over.

After a customer buys a good, if the bakery becomes empty, notify the baker to bake more goods.

3) public boolean isProductionFinished()
It will verify and return that goodsProducedToday >= MAX_GOODS_PER_DAY and 
goodsAvailable is 0 

Baker Class
------------
Create a class Baker that implements Runnable. This class should:

Attributes
----------------
Bakery bakery: Reference to the shared Bakery instance.

Methods
-------------
Constructor to initialize the field.

public void run():
Repeatedly calls the bakeGoods() method in a loop until the daily production limit is reached (isProductionFinished())

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

BakeryExample Class (Main Class)
==========================================
Create a main class BakeryExample to start the simulation. It should:

Instantiate the Bakery class.

Create and start one Baker thread by passing the Bakery instance to the Baker class.

Create and start multiple Customer threads by passing the Bakery instance to each Customer instance.

Ensure the main class waits for the baker to finish baking and all customer threads to finish buying goods before exiting.
*/