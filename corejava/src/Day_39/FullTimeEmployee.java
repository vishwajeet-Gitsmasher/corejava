package Day_39;

public class FullTimeEmployee implements Employee{
	private int employeeId;
	private String employeeName;
	private double monthlySalary;
	private double benefits;
	
	public FullTimeEmployee(int employeeId, String employeeName, double monthlySalary, double benefits) {
		super();
		if(employeeName.length()==0) {
			System.err.println("Employee name cannot be empty.");
			System.exit(0);
		} else if(monthlySalary<0) {
			System.err.println("Monthly salary cannot be negative.");
			System.exit(0);
		}
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.monthlySalary = monthlySalary;
		this.benefits = benefits;
	}

	@Override
	public double calculateSalary() {
		double totalSalary = this.monthlySalary + this.benefits;
		return totalSalary;
	}

	@Override
	public void generatePayroll() {
		System.out.println("Employee Payroll Information");
		System.out.println("Employee Monthly Salary : "+this.monthlySalary);
		System.out.println("Employee Benefits : "+this.benefits);
	}
	
}

/*
FullTimeEmployee Class :

Implement a class named FullTimeEmployee that implements the Employee interface.

Include Attributes :
employeeId     	:(int)
employeeName   	:(String)
monthlySalary 	:(double) 
benefits 			:(double)

Acess modifier :private(for all the varriable )

Provide a constructor that initializes the employee details.

Implement the calculateSalary() method to calculate the salary for a full-time employee, including benefits.

Implement the generatePayroll() method to print the payroll information for a full-time employee.
*/