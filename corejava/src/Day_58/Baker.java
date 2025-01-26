package Day_58;

public class Baker implements Runnable {
	Bakery bakery;

	public Baker(Bakery bakery) {
		super();
		this.bakery = bakery;
	}

	@Override
	public void run() {
		while(!bakery.isProductionFinished()) {
			//System.out.println("Goods production in process...");
			bakery.bakeGoods();
		}
	}
	
	
}

/*
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

*/