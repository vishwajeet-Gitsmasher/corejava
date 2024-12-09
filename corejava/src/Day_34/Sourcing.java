package Day_34;

public class Sourcing extends Employee {
	int enrollmentTarget;
	int enrollmentReached;
	double perkPerEnrollment;
	
	public Sourcing(int id, String name, double basicSalary, double hRAPer, double dAPer, int enrollmentTarget,
			int enrollmentReached, double perkPerEnrollment) {
		super(id, name, basicSalary, hRAPer, dAPer);
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.perkPerEnrollment = perkPerEnrollment;
	}
	
	public double calculateGrossSalary() {
		double GrossSalary = super.basicSalary + super.HRAPer + super.DAPer +((this.enrollmentReached/this.enrollmentTarget)*100)*this.perkPerEnrollment;
		return GrossSalary;
	}
	
}

/*
Class Sourcing

Fields: id: int, name : String, basicSalary : double, HRAPer : double,DAPer : double, enrollmentTarget: int, enrollmentReached: int, perkPerEnrollment: double

Public Method: calculateGrossSalary() - returns a double



Calculate the gross salary as : basicSalary +HRAPer +DAPer +((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment)


*/