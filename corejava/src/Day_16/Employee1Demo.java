package Day_16;

import java.util.Scanner;

public class Employee1Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Employees = ");
		int num = sc.nextInt();
		while(num>0) {
			System.out.print("Enter Employee Number = ");
			int employeeNumber = sc.nextInt();
			System.out.print("Enter Employee Name = ");
			String employeeName = sc.nextLine();
			employeeName = sc.nextLine();
			System.out.print("Enter Employee Salary = ");
			double employeeSalary = sc.nextDouble();
			
			Employee1 e = new Employee1(employeeNumber, employeeName, employeeSalary);

			if(e.employeeSalary >= 60000 ) {
				System.out.println("Employee is Developer ");
			} else if (e.employeeSalary >= 40000 ) {
				System.out.println("Employee is Designer ");
			} else {
				System.out.println("Employee is Tester ");
			}
			num--;
		}
		sc.close();
	}

}

/*
Enter Number of Employees = 1

Enter Employee Number = 232
Enter Employee Name = Naresh Kumar
Enter Employee Salary = 43000
Employee is Designer 

===============================================

Enter Number of Employees = 2

Enter Employee Number = 102
Enter Employee Name = Rohit
Enter Employee Salary = 67000
Employee is Developer

Enter Employee Number = 202
Enter Employee Name = Virat Kolhi
Enter Employee Salary = 34000
Employee is Tester 

*/