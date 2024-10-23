package Day_12;

public class Employee {

	private String firstName;
	private String lastName;
	private int employeeId;
	private double salary;
	private int noOfProject;
	
	public void setEmployeeData(String firstName, String lastName,int employeeId,double salary, int noOfProject) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.salary = salary;
		this.noOfProject = noOfProject;
	}
	
	public void calculateSalary() {
		if(noOfProject > 20) {
			salary += 15000;
		} else if(noOfProject > 10) {
			salary += 15000;
		} else if(noOfProject > 5) {
			salary += 5000;
		} 
	}
	
	public void displayDetails() {
		System.out.println("Employee Details");
		System.out.println("Employee First Name : "+firstName);
		System.out.println("Employee Last Name : "+lastName);
		System.out.println("Employee ID : "+employeeId);
		System.out.println("Employee Salary :"+salary);
		System.out.println("Number of Projects : "+noOfProject);
	}
}

/*
Create a BLC class Employee class with properties 

private String firstName
private String lastName
private int employeeId
private double salary
private int noOfProject


Create a setEmployeeData() method with 5 parameters to initialize all the instance variables.

Implement calculateSalary() method that will add extra ammount in salary based on NoOfProject by using following criteria.

NoOfProject is more than 5 and less that 10 then add 5000.
NoOfProject is more than 10 and less that 20 then add 10000.
NoOfProject is more than 20 then add 15000. 	

 Take a method called displayDetails() to display the salary.

 Take an ELC class Tester to test your logic.

*/