package Day_59;

public class LowPriorityThread extends Thread {
	public void run() {
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		System.out.println("Name : "+name +" Thread Priority : "+priority);
	}
}
