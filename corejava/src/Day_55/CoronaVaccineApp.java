package Day_55;

public class CoronaVaccineApp {

	public static void main(String[] args) {			
		User user1 = new User("Ramesh", 30, true);
		User user2 = new User("Suresh", 10, false);
		
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				try {
					user1.bookDose();
				}catch(RuntimeException e) {
					System.out.println(e.getMessage());
				}
				
				try {
					user1.bookDose();
				}catch(RuntimeException e) {
					System.out.println(e.getMessage());
				}
				
			}
			
		};
		Runnable r2 = new Runnable() {

			@Override
			public void run() {
				try {
					user2.bookDose();
				}catch(RuntimeException e) {
					System.out.println(e.getMessage());
				}
				
			}
			
		};
		
		Thread t1 = new Thread(r1,"thread1");
		Thread t2 = new Thread(r2,"thread2");
		
		t1.start();  
		t2.start();

	}

}

/*
Dose booked successfully for Ramesh
Dose already booked.
Suresh is not eligible for the vaccine.
*/


/*
4. In the CoronaVaccineApp class:



-> Create two User objects: user1 and user2.

-> Simulate concurrent user interactions using threads by creating two threads (thread1 and thread2) with anonymous runnable 
instances representing the user interactions.



Sample Output:

Dose booked successfully for Ramesh

Suresh is not eligible for the vaccine.
*/