package Day_24;

public class StudentTester {
	public static void main(String[] args) {
		Student s = new Student(1,"John Smith",25000);
		System.out.println(s.displayDetails());
		System.out.println("Payment Amount:"+s.payFee(25000));
		
		System.out.println("=================================================================");
		
		DayScholar d = new DayScholar(2,"Brian Lara",25000,5000);
		System.out.println(d.displayDetails());
		System.out.println("Payment Amount:"+d.payFee(37000));
		
		System.out.println("=================================================================");
		
		Hosteller h = new Hosteller(3,"Virat Kohli",25000,8000);
		System.out.println(h.displayDetails());
		System.out.println("Payment Amount:"+h.payFee(33000));
	}
}

/*
Student [studentId=1, name=John Smith, examFee=25000.0]
All fess are clear
Payment Amount:25000.0
=================================================================
DayScholar [transportFee=5000.0, studentId=2, name=Brian Lara, examFee=25000.0]
Remaining amount to pay is:7000.0
Payment Amount:37000.0
=================================================================
Hosteller [hostelFee=8000.0, studentId=3, name=Virat Kohli, examFee=25000.0]
All fess are clear
Payment Amount:33000.0

 */

/*
An ELC class Tester is given to you with a main method. Use this class to test your solution's

classes and methods.


Condition :
-----------
if any numeric value is zero or negative then print "Error Invalid Input".


TEST CASE 1 :
-------------
sample input  : When your reading values for Student class OR DayScholar Class OR Hosteller Class then make sure if any numeric value is <=0 then print "Error Invalid Input".
                
sample output : Error Invalid Input


TEST CASE 2 :
-------------
sample input  : 
                 1. For Student Class:
                 studentId: 1
                 name: "John Smith"
                 examFee: 25000.0
                 Payment Amount: 25000.0

                 2. For DayScholar Class:
                 studentId: 2
                 name: "Brian Lara"
                 examFee: 25000.0
                 transportFee: 5000.0
                 Payment Amount: 37000.0

                 3. For Hosteller Class:
                 studentId: 3
                 name: "Virat Kohli"
                 examFee: 25000.0
                 hostelFee: 8000.0
                 Payment Amount: 33000.0

sample output : 

                 Student[name=John Smith,studentId=1,examFee=25000.0]
                 All Fees are clear
                 
                 DayScholar[TransportFee=5000.0,name=Brian Lara,studentId=2,examFee=25000.0]
                 Remaining amount to pay is: 12000.0
                 
                 Hosteller[HostelFee=8000.0,name=Virat Kohli,studentId=3,examFee=25000.0]
                 All Fees are clear
*/