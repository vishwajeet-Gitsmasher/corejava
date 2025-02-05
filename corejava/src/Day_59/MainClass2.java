package Day_59;

public class MainClass2 {

	public static void main(String[] args) {
		Thread t1 = new ThreadA();
		Thread t2 = new ThreadB();
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();

	}

}

/*
Thread is sleeping for 2 seconds...
ThreadA is running.
ThreadB is running.
*/