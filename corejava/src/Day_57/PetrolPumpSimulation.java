package Day_57;

public class PetrolPumpSimulation {

	public static void main(String[] args) {
		PetrolPump p = new PetrolPump();
		
		Car thar = new Car("Thar",p);
		Car scorpio = new Car("Scorpio",p);
		Car bmw = new Car("BMW",p);
		
		Car[] c = {thar,scorpio,bmw};
		
		Thread t1 = new Thread(thar,"T1");
		Thread t2 = new Thread(scorpio,"T2");
		Thread t3 = new Thread(bmw,"T3");
		
		Thread[] threads = {t1,t2,t3};
		
		for(Thread t: threads) {
			t.start();
			try {
				t.join();
				t.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

/*
Thar started refilling...
Thar completed refilling!.
Scorpio started refilling...
Scorpio completed refilling!.
BMW started refilling...
BMW completed refilling!.

 */

/*
PetrolPumpSimulation Class (Main):

In the main method, create an instance of PetrolPump.
Create an array of Car objects, each initialized with a unique name and the reference to the petrol pump.
Create an array of Thread objects to represent each car's thread.
Start each car thread and wait for all car threads to complete using the join method.
*/