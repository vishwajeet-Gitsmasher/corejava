package Day_59;

public class MainClass {

	public static void main(String[] args) {
		Thread t1 = new HighPriorityThread();
		Thread t2 = new LowPriorityThread();
		Thread t3 = new NormalPriorityThread();
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}

}

/*
Name : Thread-0 Thread Priority : 10
Name : Thread-1 Thread Priority : 1
Name : Thread-2 Thread Priority : 5

*/
