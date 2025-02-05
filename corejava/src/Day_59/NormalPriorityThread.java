package Day_59;

public class NormalPriorityThread extends Thread {
	public void run() {
		Thread.yield();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		System.out.println("Name : "+name +" Thread Priority : "+priority);
		
	}
}
