package Day_11;

import java.util.Scanner;

public class Employee {
	// properties
	int employeeId;
	String employeeName;
	double employeeSalary;
	
	
	public void setEmployeeData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Id : ");
		employeeId = sc.nextInt();
		System.out.print("Enter Employee Name : ");
		employeeName = sc.next();
		System.out.print("Enter Employee Salary : ");
		employeeSalary = sc.nextDouble();
		
	}
	
	public void getEmployeeData() {
		System.out.println("Employee Id : "+employeeId);
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Employee Salary : "+employeeSalary);
	}
	
}

/*
Write a Program on OOPs to define Employee class properties and behaviour.

properties :
employeeId : int
employeeName : String
employeeSalary : double

Initialize these properties with the help of Methods using Scanner class not by using Object reference.

behavior:
setEmployeeData() : public void
getEmployeeData() : public void
*/