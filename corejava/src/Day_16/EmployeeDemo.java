package Day_16;

import java.util.Scanner;

import Day_16.Employee;

public class EmployeeDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Employees = ");
		int num = sc.nextInt();
		while(num>0) {
			System.out.print("Enter First name = ");
			String firstName = sc.next();
			System.out.print("Enter Last name = ");
			String lastName = sc.next();
			System.out.print("Enter Employee ID = ");
			int employeeId = sc.nextInt();
			System.out.print("Enter Salary = ");
			double salary = sc.nextDouble();
			System.out.print("Enter Number of projects = ");
			int noOfProject = sc.nextInt();
			
			if(noOfProject < 0) {
				System.out.println("Number of projects cannot be negative");
			} else {
				Employee e = new Employee(firstName, lastName, employeeId, salary, noOfProject);
				e.calculateSalary();
				e.displayDetails();
				num--;
			}
		}
		sc.close();
	}
}

/*
Enter Number of Employees = 2

Enter First name = John
Enter Last name = Doe
Enter Employee ID = 101
Enter Salary = 50000
Enter Number of projects = 7

Employee Details
Employee First Name : John
Employee Last Name : Doe
Employee ID : 101
Employee Salary :55000.0
Number of Projects : 7

Enter First name = Michael
Enter Last name = Johnson
Enter Employee ID = 105
Enter Salary = 45000
Enter Number of projects = -5

Number of projects cannot be negative

Enter First name = Rohit
Enter Last name = Sharma
Enter Employee ID = 450
Enter Salary = 55000
Enter Number of projects = 23

Employee Details
Employee First Name : Rohit
Employee Last Name : Sharma
Employee ID : 450
Employee Salary :70000.0
Number of Projects : 23

=====================================

Enter Number of Books = 1

Enter Book Title = Ramayan
Enter Book Author = Walmiki
Enter Book Price = 200000000
Enter Discount Percentage = 2
Book Details
Book Title : Walmiki
Book Author : Walmiki
Book Price : 1.96E8
*/
