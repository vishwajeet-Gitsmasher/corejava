package Day_53;

public class RailwayTicket {

	public static void main(String[] args) throws InterruptedException {
		TicketBooikng t = new TicketBooikng(1);
		
		Thread t1 = new Thread(t,"Scott");
		t1.start();
		Thread t2 = new Thread(t,"Smith");
		t2.start();
	}

}

class TicketBooikng extends Thread{
	int tickets = 1;
	int wantedticket;
	
	TicketBooikng(int wantedticket){
		this.wantedticket = wantedticket;
	}
	
	public synchronized void run() {
		String name = null;
		if(wantedticket<= tickets) {
			
			name = Thread.currentThread().getName();
			System.out.println("Tickets booked successfully: "+name);
			tickets-=wantedticket;
		} else {
			name = Thread.currentThread().getName();
			System.err.println("Sorry "+name+" tickets are not vailable");
		}
		
	}
}

/*
Tickets booked successfully: Scott
Sorry Smith tickets are not vailable
*/


/*
Program 01:
----------
Write a program in java to show the drawback of Multithreading by booking Railway Reservation System.

In this scenario, only 1 seat is available and two threads are accessing this seat to book the ticket. 

Write a Program to show that both the thread will get the ticket.
*/