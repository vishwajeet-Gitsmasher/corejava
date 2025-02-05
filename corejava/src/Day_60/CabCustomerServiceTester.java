package Day_60;

public class CabCustomerServiceTester {

	public static void main(String[] args) {
		CabCustomer c1 = new CabCustomer(1,"A","Hyd","Pune",0,"91673");
		CabCustomer c2 = new CabCustomer(2,"B","Bangalore","Delhi",10,"89673");
		CabCustomer c3 = new CabCustomer(3,"C","Kolkata","Varanasi",20,"73873");
		CabCustomer c4 = new CabCustomer(4,"D","Mumbai","Indore",3,"21073");
		CabCustomer c5 = new CabCustomer(5,"E","Chennai","Kashmir",30,"31903");
		
		CabCustomerService cs = new CabCustomerService();
		
		CabCustomer[] arr = {c1,c2,c3,c4,c5};
		
		for(CabCustomer c: arr) {
			System.out.println(c.toString());
		}
		
		System.out.println("====================================================================================================");

		for(CabCustomer c:arr) {
			System.out.println("Is new Customer : "+cs.isFirstCustomer(c));
			System.out.println(cs.printBill(c));
			cs.addCabCustomer(c);
			System.out.println(c.toString());
			System.out.println("-----------------------------------------------------------------------------------------");
		}
		
		CabCustomer c6 = new CabCustomer(6,"F","Chennai","Pune",0,"51903");
		System.out.println("Is new Customer : "+cs.isFirstCustomer(c6));
		System.out.println(cs.printBill(c6));
		cs.addCabCustomer(c6);
		System.out.println(c6.toString());
		
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		System.out.println("Is new Customer : "+cs.isFirstCustomer(c1));
		System.out.println(cs.printBill(c1));
		cs.addCabCustomer(c1);
		System.out.println(c1.toString());
	}

}

/*
CabCustomer [custId=1, customerName=A, pickupLocation=Hyd, dropLocation=Pune, distance=0, phone=91673]
CabCustomer [custId=2, customerName=B, pickupLocation=Bangalore, dropLocation=Delhi, distance=10, phone=89673]
CabCustomer [custId=3, customerName=C, pickupLocation=Kolkata, dropLocation=Varanasi, distance=20, phone=73873]
CabCustomer [custId=4, customerName=D, pickupLocation=Mumbai, dropLocation=Indore, distance=3, phone=21073]
CabCustomer [custId=5, customerName=E, pickupLocation=Chennai, dropLocation=Kashmir, distance=30, phone=31903]
====================================================================================================
Is new Customer : true
A Please pay your bill of Rs.0.0
CabCustomer [custId=1, customerName=A, pickupLocation=Hyd, dropLocation=Pune, distance=0, phone=91673]
-----------------------------------------------------------------------------------------
Is new Customer : true
B Please pay your bill of Rs.0.0
CabCustomer [custId=2, customerName=B, pickupLocation=Bangalore, dropLocation=Delhi, distance=10, phone=89673]
-----------------------------------------------------------------------------------------
Is new Customer : true
C Please pay your bill of Rs.0.0
CabCustomer [custId=3, customerName=C, pickupLocation=Kolkata, dropLocation=Varanasi, distance=20, phone=73873]
-----------------------------------------------------------------------------------------
Is new Customer : true
D Please pay your bill of Rs.0.0
CabCustomer [custId=4, customerName=D, pickupLocation=Mumbai, dropLocation=Indore, distance=3, phone=21073]
-----------------------------------------------------------------------------------------
Is new Customer : true
E Please pay your bill of Rs.0.0
CabCustomer [custId=5, customerName=E, pickupLocation=Chennai, dropLocation=Kashmir, distance=30, phone=31903]
-----------------------------------------------------------------------------------------
Is new Customer : true
F Please pay your bill of Rs.0.0
CabCustomer [custId=6, customerName=F, pickupLocation=Chennai, dropLocation=Pune, distance=0, phone=51903]
----------------------------------------------------------------------------------------------------
Is new Customer : false
A Please pay your bill of Rs.80.0
CabCustomer [custId=1, customerName=A, pickupLocation=Hyd, dropLocation=Pune, distance=0, phone=91673]

*/
