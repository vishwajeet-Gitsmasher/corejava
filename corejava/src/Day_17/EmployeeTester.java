package Day_17;

import java.util.Scanner;

public class EmployeeTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number of employees = ");
		int quantity = sc.nextInt();
		while(quantity>0) {
			System.out.println("Enter Employee Details");
			System.out.print("Enter Employee Name = ");
			String name = sc.nextLine();
			name = sc.nextLine();
			System.out.print("Enter Employee Age = ");
			int age = sc.nextInt();
			System.out.print("Enter Employee Department = ");
			String department = sc.next();
			System.out.print("Enter Employee Salary = ");
			double salary = sc.nextDouble();
			System.out.print("Enter Employee Performance = ");
			String performance = sc.next();
			
			Employee E = new Employee(name, age, department, salary, performance);
			System.out.println("Updated Salary : "+E.updateSalary());
			if(age > 0) {
				E.displayDetails();
			}
			quantity--;
		}
		sc.close();
	}

}
/*
Enter Number of employees = 1
Enter Employee Details
Enter Employee Name = Virat Kohli
Enter Employee Age = 23
Enter Employee Department = IT
Enter Employee Salary = 50000
Enter Employee Performance = good
valid input
Updated Salary : 60000.0
Employee Name : Virat Kohli
Employee Age : 23
Employee Department : IT
Employee Salary : 60000.0
Employee Performance : good

====================================================

Enter Number of employees = 1
Enter Employee Details
Enter Employee Name = Rohit
Enter Employee Age = -78
Enter Employee Department = Sales
Enter Employee Salary = 46337
Enter Employee Performance = average
Invalid input. Age must be a positive integer.

======================================================

Enter Number of employees = 1
Enter Employee Details
Enter Employee Name = Viart
Enter Employee Age = 23
Enter Employee Department = sales
Enter Employee Salary = 34000
Enter Employee Performance = average
valid input
Employee Name : Viart
Employee Age : 23
Employee Department : sales
Employee Salary : 34000.0
Employee Performance : average

=======================================================

Enter Number of employees = 1
Enter Employee Details
Enter Employee Name = Raj
Enter Employee Age = 25
Enter Employee Department = sales
Enter Employee Salary = 25000
Enter Employee Performance = GOOD

valid input

Updated Salary : 35000.0
Employee Name : Ra
Employee Age : 25
Employee Department : sales
Employee Salary : 35000.0
Employee Performance : GOOD

*/