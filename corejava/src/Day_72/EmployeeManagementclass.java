package Day_72;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeManagementclass {
	private static List<Employee> employees = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("Choose an operation:\n 1. Add Employee \n 2. Update Employee \n 3. Remove Employee \n 4. List All Employees \n 5. Sort Employees by Name \n 6. Find Highest Salary by Department \n 7. Categorize and Increase Salary \n 8. Categorize based on Gender and Department and show Employee with highest Salary \n 9. Exit");
			System.out.print("Enter your choice : ");
			int choice = Integer.parseInt(sc.nextLine());
			
			switch(choice) {
				case 1:
					EmployeeManagementclass.addEmployee();
					break;
				case 2:
					EmployeeManagementclass.updateEmployee();
					break;
				case 3:
					EmployeeManagementclass.removeEmployee();
					break;
				case 4:
					EmployeeManagementclass.listAllEmployees();
					break;
				case 5:
					EmployeeManagementclass.sortEmployeesByName();
					break;
				case 6:
					EmployeeManagementclass.findHighestSalaryByDepartment();
					break;
				case 7:
					EmployeeManagementclass.CategorizeGenderAndIncreaseSalary();
					break;
				case 8:
					EmployeeManagementclass.CategorizeGenderDepartmentEmployeeHighestSalary();
					break;
				case 9:
					System.out.println("Exiting Application.");
					System.exit(0);
				default:
					System.out.println("Invalid Choice.");
			}
		}
		

	}
	
	private static void addEmployee() {
		System.out.print("Enter name:");
		String name = sc.nextLine();
		System.out.print("Enter gender:");
		String gender = sc.nextLine();
		System.out.print("Enter department:");
		String department = sc.nextLine();
		System.out.print("Enter salary:");
		double salary = Double.parseDouble(sc.nextLine());
		System.out.print("Enter years of experience:");
		int expr = Integer.parseInt(sc.nextLine());
		if(salary>0) {
			if(expr>=0) {
				Employee e = new Employee(name, gender, department, salary, expr);
				boolean b = employees.add(e);
				if(b) {
					System.out.println("Employee added successfully.");
				} else {
					System.out.println("Employee Already exixts.");
				}	
			} else {
				System.out.println("Expereince cannot be Negative.");
			}
		} else {
			System.out.println("Salary cannot be Negative and it should be a numeric value.");
		}	
	}

	private static void updateEmployee() {
		System.out.print("Enter index of employee to update:");
		int index = Integer.parseInt(sc.nextLine());
		System.out.print("Enter new name:");
		String name = sc.nextLine();
		System.out.print("Enter new gender:");
		String gender = sc.nextLine();
		System.out.print("Enter new department:");
		String department = sc.nextLine();
		System.out.print("Enter new salary:");
		double salary = Double.parseDouble(sc.nextLine());
		System.out.print("Enter new years of experience:");
		int expr = Integer.parseInt(sc.nextLine());
		if(index<employees.size()) {
			if(salary>0) {
				if(expr>=0) {
					Employee e = employees.get(index);
					e.setName(name);
					e.setGender(gender);
					e.setDepartment(department);
					e.setSalary(salary);
					e.setYears_of_experience(expr);
					System.out.println("Employee updated successfully.");
				} else {
					System.out.println("Expereince cannot be Negative.");
				}
			} else {
				System.out.println("Salary cannot be Negative and it should be a numeric value.");
			}
		} else {
			System.out.println("Employee index is not available to update.");
		}			
	}
	
	private static void removeEmployee() {
		System.out.print("Enter index of employee to remove:");
		int index = Integer.parseInt(sc.nextLine());
		if(index<employees.size()) {
			employees.remove(index);
			System.out.println("Employee Removed Successfully.");
		} else {
			System.out.println("Employee index is not available to remove.");
		}
	}
	
	private static void listAllEmployees() {
		if(employees.size()<1) {
			System.out.println("No employees in the List.");
			return;
		}
		for(Employee e : employees) {
			System.out.println(e.toString());
		}
	}
	
	private static void sortEmployeesByName() {
		employees.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).forEach(System.out::println);
	}
	
	private static void findHighestSalaryByDepartment() {
		Map<String, Employee> highestSalaryByDept = employees.stream()
		        .collect(Collectors.toMap(
		            Employee::getDepartment, 
		            e -> e, // Store the entire Employee object
		            (e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2 // Keep the employee with the highest salary
		        )
		);

		highestSalaryByDept.forEach((dept, emp) -> 
		    System.out.println("Department: " + dept + ", Employee: " + emp)
		);
	}
	
	private static void CategorizeGenderAndIncreaseSalary(){
		Map<String, List<Employee>> map = employees.stream()
		        .collect(Collectors.groupingBy(Employee::getGender));
		
		for(Entry<String, List<Employee>> list : map.entrySet()) {
			for(Employee e : list.getValue()) {
				e.setSalary(e.getSalary()+10000);
			}
		}
		
		map.forEach((gen,list)->System.out.println("Gender : "+ gen +" List Of Employees : "+list));
		
	}
	
	//Categorize based on Gender and Department and show Employee with highest Salary 
	public static void CategorizeGenderDepartmentEmployeeHighestSalary() {
		Map<Map.Entry<String, String>, Employee> highestSalaryByGenderAndDept = employees.stream()
	            .collect(Collectors.toMap(
	                e -> Map.entry(e.getGender(), e.getDepartment()), // Key: Gender + Department
	                e -> e, // Value: Employee
	                (e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2 // Keep employee with highest salary
	            ));
		highestSalaryByGenderAndDept.forEach((key, employee) -> 
        System.out.println("Gender: " + key.getKey() + ", Department: " + key.getValue() + ", Employee: " + employee.getName() + ", Salary: " + employee.getSalary())
    );
	}

}


/*
 * Choose an operation:
 1. Add Employee 
 2. Update Employee 
 3. Remove Employee 
 4. List All Employees 
 5. Sort Employees by Name 
 6. Find Highest Salary by Department 
 7. Categorize and Increase Salary 
 8. Categorize based on Gender and Department and show Employee with highest Salary 
 9. Exit
Enter your choice : 1
Enter name:A
Enter gender:M
Enter department:IT
Enter salary:20000
Enter years of experience:2
Employee added successfully.
Choose an operation:
 1. Add Employee 
 2. Update Employee 
 3. Remove Employee 
 4. List All Employees 
 5. Sort Employees by Name 
 6. Find Highest Salary by Department 
 7. Categorize and Increase Salary 
 8. Categorize based on Gender and Department and show Employee with highest Salary 
 9. Exit
Enter your choice : 1
Enter name:B
Enter gender:M
Enter department:IT
Enter salary:30000
Enter years of experience:3
Employee added successfully.
Choose an operation:
 1. Add Employee 
 2. Update Employee 
 3. Remove Employee 
 4. List All Employees 
 5. Sort Employees by Name 
 6. Find Highest Salary by Department 
 7. Categorize and Increase Salary 
 8. Categorize based on Gender and Department and show Employee with highest Salary 
 9. Exit
Enter your choice : 1
Enter name:C
Enter gender:F
Enter department:SALES
Enter salary:40000
Enter years of experience:4
Employee added successfully.
Choose an operation:
 1. Add Employee 
 2. Update Employee 
 3. Remove Employee 
 4. List All Employees 
 5. Sort Employees by Name 
 6. Find Highest Salary by Department 
 7. Categorize and Increase Salary 
 8. Categorize based on Gender and Department and show Employee with highest Salary 
 9. Exit
Enter your choice : 1
Enter name:D
Enter gender:F
Enter department:FINANCE
Enter salary:45000
Enter years of experience:5
Employee added successfully.
Choose an operation:
 1. Add Employee 
 2. Update Employee 
 3. Remove Employee 
 4. List All Employees 
 5. Sort Employees by Name 
 6. Find Highest Salary by Department 
 7. Categorize and Increase Salary 
 8. Categorize based on Gender and Department and show Employee with highest Salary 
 9. Exit
Enter your choice : 2
Enter index of employee to update:0
Enter new name:A
Enter new gender:M
Enter new department:IT
Enter new salary:24000
Enter new years of experience:3
Employee updated successfully.
Choose an operation:
 1. Add Employee 
 2. Update Employee 
 3. Remove Employee 
 4. List All Employees 
 5. Sort Employees by Name 
 6. Find Highest Salary by Department 
 7. Categorize and Increase Salary 
 8. Categorize based on Gender and Department and show Employee with highest Salary 
 9. Exit
Enter your choice : 3
Enter index of employee to remove:2
Employee Removed Successfully.
Choose an operation:
 1. Add Employee 
 2. Update Employee 
 3. Remove Employee 
 4. List All Employees 
 5. Sort Employees by Name 
 6. Find Highest Salary by Department 
 7. Categorize and Increase Salary 
 8. Categorize based on Gender and Department and show Employee with highest Salary 
 9. Exit
Enter your choice : 4
Employee [name=A, gender=M, department=IT, salary=24000.0, years_of_experience=3]
Employee [name=B, gender=M, department=IT, salary=30000.0, years_of_experience=3]
Employee [name=D, gender=F, department=FINANCE, salary=45000.0, years_of_experience=5]
Choose an operation:
 1. Add Employee 
 2. Update Employee 
 3. Remove Employee 
 4. List All Employees 
 5. Sort Employees by Name 
 6. Find Highest Salary by Department 
 7. Categorize and Increase Salary 
 8. Categorize based on Gender and Department and show Employee with highest Salary 
 9. Exit
Enter your choice : 5
Employee [name=A, gender=M, department=IT, salary=24000.0, years_of_experience=3]
Employee [name=B, gender=M, department=IT, salary=30000.0, years_of_experience=3]
Employee [name=D, gender=F, department=FINANCE, salary=45000.0, years_of_experience=5]
Choose an operation:
 1. Add Employee 
 2. Update Employee 
 3. Remove Employee 
 4. List All Employees 
 5. Sort Employees by Name 
 6. Find Highest Salary by Department 
 7. Categorize and Increase Salary 
 8. Categorize based on Gender and Department and show Employee with highest Salary 
 9. Exit
Enter your choice : 6
Department: FINANCE, Employee: Employee [name=D, gender=F, department=FINANCE, salary=45000.0, years_of_experience=5]
Department: IT, Employee: Employee [name=B, gender=M, department=IT, salary=30000.0, years_of_experience=3]
Choose an operation:
 1. Add Employee 
 2. Update Employee 
 3. Remove Employee 
 4. List All Employees 
 5. Sort Employees by Name 
 6. Find Highest Salary by Department 
 7. Categorize and Increase Salary 
 8. Categorize based on Gender and Department and show Employee with highest Salary 
 9. Exit
Enter your choice : 7
Gender : F List Of Employees : [Employee [name=D, gender=F, department=FINANCE, salary=55000.0, years_of_experience=5]]
Gender : M List Of Employees : [Employee [name=A, gender=M, department=IT, salary=34000.0, years_of_experience=3], Employee [name=B, gender=M, department=IT, salary=40000.0, years_of_experience=3]]
Choose an operation:
 1. Add Employee 
 2. Update Employee 
 3. Remove Employee 
 4. List All Employees 
 5. Sort Employees by Name 
 6. Find Highest Salary by Department 
 7. Categorize and Increase Salary 
 8. Categorize based on Gender and Department and show Employee with highest Salary 
 9. Exit
Enter your choice : 8
Gender: F, Department: FINANCE, Employee: D, Salary: 55000.0
Gender: M, Department: IT, Employee: B, Salary: 40000.0
Choose an operation:
 1. Add Employee 
 2. Update Employee 
 3. Remove Employee 
 4. List All Employees 
 5. Sort Employees by Name 
 6. Find Highest Salary by Department 
 7. Categorize and Increase Salary 
 8. Categorize based on Gender and Department and show Employee with highest Salary 
 9. Exit
Enter your choice : 9
Exiting Application.

 */

/*

Define the Employee Management class(ELC) with attributes such as:
employees: List : private: static

methods:
[Exception Handling:
Handle exceptions for invalid input types (e.g., non-numeric salary, negative years of experience).
Manage errors gracefully and provide meaningful error messages to guide user interactions.]

method name: addEmployee
modifiers: private, static
return type: void
purpose: Adds a new employee to the list.
 

method name: updateEmployee
modifiers: private, static
return type: void
purpose: Updates an existing employee at the specified index.


method name: removeEmployee
modifiers: private, static
return type: void
purpose: Removes an employee at the specified index.
 

method name: listAllEmployees
modifiers: private, static
return type: void
purpose: Lists all employees.
 

method name: sortEmployeesByName
modifiers: private, static
return type: void
purpose: Sorts employees by name.


method name: findHighestSalaryByDepartment
modifiers: private, static
return type: void
purpose: Finds, store and prints the highest salary employee in each department. Store it in Map object then print it.


method name: categorizeAndIncreaseSalary
modifiers: private, static
return type: void
purpose:
Categorizes employees by gender and department, finds the highest salary employee in each category, and prints the results. Store it in Map object then print it based on category.


In main method:
Use a Scanner object to read user input.A switch statement is used to handle different operations based on user input.
In the addEmployee and updateEmployee methods, exceptions are handled to ensure valid input types and meaningful error messages are provided.

Sample Output : 

Choose an operation:
1. Add Employee
2. Update Employee
3. Remove Employee
4. List All Employees
5. Sort Employees by Name
6. Find Highest Salary by Department
7. Categorize and Increase Salary
8. Exit

Enter your choice : 1

Enter name:
John Doe
Enter gender:
Male
Enter department:
IT
Enter salary:
5000
Enter years of experience:
5
Employee added successfully.


Choose an operation:
1. Add Employee
2. Update Employee
3. Remove Employee
4. List All Employees
5. Sort Employees by Name
6. Find Highest Salary by Department
7. Categorize and Increase Salary
8. Exit

Enter your choice : 1

Enter name:
Jane Smith
Enter gender:
Female
Enter department:
HR
Enter salary: 10000xy
Enter years of experience:
7
Error: Salary must be a numeric value.

Choose an operation:
1. Add Employee
2. Update Employee
3. Remove Employee
4. List All Employees
5. Sort Employees by Name
6. Find Highest Salary by Department
7. Categorize and Increase Salary
8. Exit

Enter your choice : 1

Enter name:
Alice Johnson
Enter gender:
Female
Enter department:
Finance
Enter salary:
5500
Enter years of experience:
-3
Error: Years of experience cannot be negative.
Listing All Employees

Choose an operation:
1. Add Employee
2. Update Employee
3. Remove Employee
4. List All Employees
5. Sort Employees by Name
6. Find Highest Salary by Department
7. Categorize and Increase Salary
8. Exit

Enter your choice : 4

Employee{name='John Doe', gender='Male', department='IT', salary='5000', years_of_experience=5}

Choose an operation:
1. Add Employee
2. Update Employee
3. Remove Employee
4. List All Employees
5. Sort Employees by Name
6. Find Highest Salary by Department
7. Categorize and Increase Salary
8. Exit

Enter your choice : 2

Enter index of employee to update:
0
Enter new name:
John Doe
Enter new gender:
Male
Enter new department:
IT
Enter new salary:
6000
Enter new years of experience:
6
Employee updated successfully.

Choose an operation:
1. Add Employee
2. Update Employee
3. Remove Employee
4. List All Employees
5. Sort Employees by Name
6. Find Highest Salary by Department
7. Categorize and Increase Salary
8. Exit

Enter your choice : 2

Enter index of employee to update:
10
Enter new name:
John Doe
Enter new gender:
Male
Enter new department:
IT
Enter new salary:
6000
Enter new years of experience:
6
Error: Employee not found.

Choose an operation:
1. Add Employee
2. Update Employee
3. Remove Employee
4. List All Employees
5. Sort Employees by Name
6. Find Highest Salary by Department
7. Categorize and Increase Salary
8. Exit

Enter your choice : 3

Enter index of employee to remove:
0
Employee removed successfully.


Choose an operation:
1. Add Employee
2. Update Employee
3. Remove Employee
4. List All Employees
5. Sort Employees by Name
6. Find Highest Salary by Department
7. Categorize and Increase Salary
8. Exit

Enter your choice : 3

Enter index of employee to remove:
10
Error: Employee not found.


Choose an operation:
1. Add Employee
2. Update Employee
3. Remove Employee
4. List All Employees
5. Sort Employees by Name
6. Find Highest Salary by Department
7. Categorize and Increase Salary
8. Exit

Enter your choice : 5

Employee{name='Alice Johnson', gender='Female', department='Finance', salary='5500', years_of_experience=4}
Employee{name='Jane Smith', gender='Female', department='HR', salary='6000', years_of_experience=7}
Employee{name='John Doe', gender='Male', department='IT', salary='5000', years_of_experience=5}


Choose an operation:
1. Add Employee
2. Update Employee
3. Remove Employee
4. List All Employees
5. Sort Employees by Name
6. Find Highest Salary by Department
7. Categorize and Increase Salary
8. Exit

Enter your choice : 6

Department: IT, Employee: Employee{name='John Doe', gender='Male', department='IT', salary='5000', years_of_experience=5}
Department: HR, Employee: Employee{name='Jane Smith', gender='Female', department='HR', salary='6000', years_of_experience=7}
Department: Finance, Employee: Employee{name='Alice Johnson', gender='Female', department='Finance', salary='5500', years_of_experience=4}

Choose an operation:
1. Add Employee
2. Update Employee
3. Remove Employee
4. List All Employees
5. Sort Employees by Name
6. Find Highest Salary by Department
7. Categorize and Increase Salary
8. Exit

Enter your choice : 7

Gender: Female, Department: Finance, Employee: Employee{name='Alice Johnson', gender='Female', department='Finance', salary='5500', years_of_experience=4}
Gender: Female, Department: HR, Employee: Employee{name='Jane Smith', gender='Female', department='HR', salary='6000', years_of_experience=7}
Gender: Male, Department: IT, Employee: Employee{name='John Doe', gender='Male', department='IT', salary='5000', years_of_experience=5}

Choose an operation:
1. Add Employee
2. Update Employee
3. Remove Employee
4. List All Employees
5. Sort Employees by Name
6. Find Highest Salary by Department
7. Categorize and Increase Salary
8. Exit

Enter your choice : 8

Exiting...




*/