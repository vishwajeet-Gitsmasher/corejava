package Day_24;

public class Student {
	 int studentId;
	 String name;
	 double examFee;
	 
	 public Student(int studentId, String name, double examFee) {
			super();
			if(examFee <=0) {
				System.err.println("Fess cannot be negative");
				System.exit(0);
			}
			this.studentId = studentId;
			this.name = name;
			this.examFee = examFee;
		}
	 
	public String displayDetails() {
		return this.toString();
	}
	 
	public double payFee(double amount) {
		System.out.println("All fess are clear");
		return amount;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "]";
	}

	
	
	
	
}

/*
Que 6 : Student Fee Management System
============================================================= 

-> A university needs an efficient way to manage and process fees for its students. There are different types of students with varying fee structures. 
   The university wants a system to handle the following scenarios:

1) Regular Students: Students who only need to pay the exam fee. This is the base class scenario.

2) Day Scholars: Students who attend classes daily but do not stay in hostels. They have an additional transport fee on top of the exam fee. This fee needs to be managed and calculated separately.

3) Hostellers: Students who stay in university hostels and have additional hostel fees. Their total fee is the sum of the exam fee and hostel fee.


Create BLC class as Student  
---------------------------
It contains the following implementation.

Instance Variables: studentId : int , name :String , examFee:double

Methods: displayDetails(): String , payFee() :double

Define parameterized constructor and a toString method.

Create two BLC sub classes of Student called DayScholar and Hosteller. 
Add the following implementations to each class.

*/