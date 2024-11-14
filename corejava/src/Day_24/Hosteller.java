package Day_24;

public class Hosteller extends Student{
	double hostelFee;

	public Hosteller(int studentId, String name, double examFee, double hostelFee) {
		super(studentId, name, examFee);
		if(hostelFee <=0) {
			System.err.println("Fess cannot be negative");
			System.exit(0);
		}
		this.hostelFee = hostelFee;
	}

	
	public String displayDetails() {
		return this.toString();
	}
	
	@Override
	public String toString() {
		return "Hosteller [hostelFee=" + hostelFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
				+ examFee + "]";
	}	
	
	public double payFee(double amount) {
		double total = this.hostelFee + super.examFee;
		if(total < amount) {
			System.out.println("Remaining amount to pay is:"+(amount - total));
		}else {
			System.out.println("All fess are clear");
		}
		return amount;
		
	}
	
}

/*
Hosteller:
----------
Instance Variables: hostelFee :double

Methods: Define parameterized constructor 

Add the following methods in BOTH classes.

Method: displayDetails(): This method should return a string containing the details of the student

in the following format:

Student [name=John Smith,studentId=123,examFee=100.0] OR

DayScholar[transportFee=500, name=John Smith,studentId=123,examFee=100.0] and so on.

Method: payFee(amount): This method takes amount as parameter that represents the fee

provided. You must calculate and then return the remaining amount paid in excess. If excess is

paid, the returned amount will be negative. The total fees that each student must pay must

include all the fees applicable to that Student(examFees, transportFees, hostelFees as applicable).

Subtract the given amount from total fee for each student and return the remaining amount.
*/