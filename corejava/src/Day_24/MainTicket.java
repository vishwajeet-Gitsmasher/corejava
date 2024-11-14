package Day_24;

public class MainTicket {

	public static void main(String[] args) {
		Ticket regularTicket = new Ticket("Concert", 101, 50.0);
		regularTicket.displayDetails();
		
		System.out.println("======================================================");
		
        VIPTicket vipTicket = new VIPTicket("VIP Concert", 201, 100.0, "Backstage Access");
        vipTicket.displayDetails();
        
        System.out.println("======================================================");
        
        StudentTicket studentTicket = new StudentTicket("Student Event", 301, 30.0, true);
        studentTicket.displayDetails();

	}

}

/*
Regular Ticket:
Event:Concert
Seat Number:101
Price:50.0
======================================================
VIP Ticket:
Event:VIP Concert
Seat Number:201
Price:100.0
Special Access:Backstage Access
======================================================
Student Ticket:
Event:Student Event
Seat Number:301
Price:30.0
Student Discount:true

 */

/*
Create a class MainTicket which contains main method to demonstrate the usage.

//Creating a Ticket object using the parameterized constructor

//Creating a VIPTicket object using the parameterized constructor

//Creating a StudentTicket object using the parameterized constructor


Condition :
-----------
if any numeric value is zero or negative then print "Error Invalid Input".


TEST CASE 1 :
-------------
sample input  : When your reading values for Ticket class OR VIPTicket OR StudentTicket then make sure if any numeric value is <=0 then print "Error Invalid Input".
              
sample output : Error Invalid Input



TEST CASE 2 :
-------------
sample input  : 
                Ticket regularTicket = new Ticket("Concert", 101, 50.0);
                VIPTicket vipTicket = new VIPTicket("VIP Concert", 201, 100.0, "Backstage Access");
                StudentTicket studentTicket = new StudentTicket("Student Event", 301, 30.0, true);

sample output : 
              Regular Ticket:
              Event: Concert
              Seat Number: 101
              Price: $50.0
              
              VIP Ticket:
              Event: VIP Concert
              Seat Number: 201
              Price: $100.0
              Special Access: Backstage Access
              
              Student Ticket:
              Event: Student Event
              Seat Number: 301
              Price: $30.0
              Student Discount: true

*/