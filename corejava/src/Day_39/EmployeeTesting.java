package Day_39;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeTesting {

	public static void main(String[] args) {
		FullTimeEmployee f = new FullTimeEmployee(101,"Rahul",50000,10000);
		f.generatePayroll();
		System.out.println("Total Salary of Employee : "+f.calculateSalary());

	}
}

/*
Employee Payroll Information
Employee Monthly Salary : 50000.0
Employee Benefits : 10000.0
Total Salary of Employee : 60000.0
*/

/*
Testing :

Take a main clas  Employee Management System.
Create instances of  FullTimeEmployee.
Call the calculateSalary() and generatePayroll() methods to ensure correct calculations and information generation.

Test Case 1 : 
--------------
for Negative Salary
Sample Input:
if user eneterd negative salary

Expected Output :
Error: Monthly salary cannot be negative.


Test Case 2 :
--------------
 Empty Employee Name
Input:

if employee is passed by the user is ""(empty)

Expected Output:

Error: Employee name cannot be empty.

Test Case 3 :
--------------
Sample Input :
if all the information is valid input

Expected Output :
Print all the detail information.
*/