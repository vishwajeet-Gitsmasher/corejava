package Day_24;

public class DayScholar extends Student{
	double transportFee;

	public DayScholar(int studentId, String name, double examFee, double transportFee) {
		super(studentId, name, examFee);
		if(transportFee <=0) {
			System.err.println("Fess cannot be negative");
			System.exit(0);
		}
		this.transportFee = transportFee;
	}
	
	public String displayDetails() {
		return this.toString();
	}

	@Override
	public String toString() {
		return "DayScholar [transportFee=" + transportFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
				+ examFee + "]";
	}
	
	public double payFee(double amount) {
		double total = this.transportFee + super.examFee;
		if(total < amount) {
			System.out.println("Remaining amount to pay is:"+(amount - total));
		}else {
			System.out.println("All fess are clear");
		}
		return amount;
	}
	
	
}

/*
DayScholar:
-----------

Instance Variables : transportFee:double ,

Methods: Define parameterized constructor 
*/