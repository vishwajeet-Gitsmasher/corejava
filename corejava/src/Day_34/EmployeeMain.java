package Day_34;

public class EmployeeMain {

	public static void main(String[] args) {
		TaxUtil t = new TaxUtil();
		
		Employee e = new Employee(100,"Amiya",34000,4000,8000);
		System.out.println("Manager Salary Before Tax : "+e.calculateGrossSalary());
		System.out.println("Manager Salary After Tax : "+t.calculateTax(e));
		
		System.out.println("===================================");
		
		
		Manager m = new Manager(101,"Raj",30000,1000,2000,3000);
		System.out.println("Manager Salary Before Tax : "+m.calculateGrossSalary());
		System.out.println("Manager Salary After Tax : "+t.calculateTax(m));
		
		System.out.println("===================================");
		
		Sourcing s = new Sourcing(102,"Ram",40000,2000,5000,10,5,500);
		System.out.println("Sourcing Salary Before Tax : "+s.calculateGrossSalary());
		System.out.println("Sourcing Salary After Tax : "+t.calculateTax(s));
		
		System.out.println("===================================");
		
		Trainer tr = new Trainer(104,"sam",20000,1000,6000,20,1500);
		System.out.println("Trainer Salary Before Tax : "+tr.calculateGrossSalary());
		System.out.println("Trainer Salary After Tax : "+t.calculateTax(tr));

	}

}

/*
Manager Salary Before Tax : 46000.0
Manager Salary After Tax : 36800.0
===================================
Manager Salary Before Tax : 36000.0
Manager Salary After Tax : 28800.0
===================================
Sourcing Salary Before Tax : 47000.0
Sourcing Salary After Tax : 37600.0
===================================
Trainer Salary Before Tax : 57000.0
Trainer Salary After Tax : 45600.0

 */

/*
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