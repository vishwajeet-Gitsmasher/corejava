package Day_34;

public class Employee {
	int id;
	String name;
	double basicSalary;
	double HRAPer;
	double DAPer;
	
	public Employee(int id, String name, double basicSalary, double hRAPer, double dAPer) {
		super();
		if(basicSalary<0 || hRAPer<0 || dAPer<0) {
			System.out.println("Error: Salary components must be non-negative.");
			System.exit(0);
		}
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.HRAPer = hRAPer;
		this.DAPer = dAPer;
	}
	
	public double calculateGrossSalary() {
		double GrossSalary = this.basicSalary + this.HRAPer + this.DAPer;
		return GrossSalary;
	}
}

/*
PayRoll System

The payroll system of an organization involves calculating the gross salary of each type of employee and the tax applicable to each. 

Note:-Create constructor for all the classes to intialise the instance variable.

Create the following entity classes as described below.



Class Employee

Fields: id: int, name : String, basicSalary : double, HRAPer : double, DAPer : double



Public Method: calculateGrossSalary() - returns a double

Calculate the gross salary as : basicSalary +HRAPer +DAPer



Class Manager

Fields: id: int, name : String, basicSalary : double, HRAPer : double,DAPer : double, projectAllowance: double

Public Method: calculateGrossSalary() - returna double

Calculate the gross salary as : basicSalary +HRAPer +DAPes a double

Calculate the gross salary as : basicSalary +HRAPer +DAPer + projectAllowance



Class Trainer

Fields: id: int, name : String, basicSalary : double, HRAPer : double,DAPer : double, batchCount: int, perkPerBatch: double


Public Method: calculateGrossSalary() - returns r +(batchCount * perkPerBatch)



Class Sourcing

Fields: id: int, name : String, basicSalary : double, HRAPer : double,DAPer : double, enrollmentTarget: int, enrollmentReached: int, perkPerEnrollment: double

Public Method: calculateGrossSalary() - returns a double



Calculate the gross salary as : basicSalary +HRAPer +DAPer +((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment)



Class TaxUtil

Fields: None

Public Methods:

calculateTax(Employee) - returns a double

calculateTax(Manager) - returns a double

calculateTax(Trainer) - returns a double

calculateTax(Sourcing) - returns a double



Tax Calculation Logic: If gross salary is greater than 30000 tax is 20% else, tax is 5%

Note : Attributes/Fields must be non-Private for the above classes.

Take Main class is given to you with the main Method. Use this class to test your solution.


Test Case 1: 
--------------
Valid Input for Employee
Input: totalDistance = 500, totalFuelConsumed = 50
Expected Output:

Employee Gross Salary: 23000.0
Employee Tax: 1150.0

Test Case 2:
--------------
 Negative Basic Salary
Input: basicSalary = -15000, HRAPer = 5000, DAPer = 3000

Expected Output:

Error: Salary components must be non-negative.
*/