package Day_61;

import java.util.ArrayList;
import java.util.Scanner;

public class Directory {
	ArrayList<Employee> Employees = new ArrayList<>();
	
	public void addEmployee(Employee e) {
		Employees.add(e);
	}
	
	public void displayAllEmployees() {
		Employees.forEach(System.out::println);
	}
	
	public void updateEmployee(int index) {
		if(index>Employees.size() || index<0) {
			System.out.println("Invalid Index");
			return;
		}
		while(true) {
			System.out.println("======= Menu =======");
			System.out.println("1. Name");
			System.out.println("2. Position");
			System.out.println("3. Salary");
			System.out.println("4. Exit");
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Your Choice : ");
			int choice = sc.nextInt();
			switch(choice) {
			    case 1:
			    	System.out.print("Enter new Name : ");
			    	String newName = sc.nextLine();
			    	newName = sc.nextLine();
			    	Employees.get(index).setName(newName);
			    	break;
			    case 2:
			    	System.out.print("Enter new Position : ");
			    	String newPosition = sc.nextLine();
			    	newPosition = sc.nextLine();
			    	Employees.get(index).setPosition(newPosition);
			    	break;
			    case 3:
			    	System.out.print("Enter new Salary : ");
			    	double newSalary = sc.nextDouble();
			    	Employees.get(index).setSalary(newSalary);
			    	break;
			    case 4:
			    	System.out.println("Thankyou for updating the details!!");
			    	return;
			    default:
			    	System.out.println("Invalid Index");
			}
		}
		
	}
	
	public void deleteEmployee(int index) {
		if(index>Employees.size() || index<0) {
			System.out.println("Invalid Index");
			return;
		}
		Employees.remove(index);
	}
}

/*
program-1
Employee Directory:
Develop an employee directory that stores employee information (name, position, salary) and allows CRUD 
operations using collections.

Employee Class:
This class represents an employee with attributes like name, position, and salary.
It has a constructor to initialize an employee's details and getters/setters to access and modify these details.
The toString() method is overridden to provide a string representation of an employee's details.

Directory Class:
This class manages a collection of Employee objects using an ArrayList.
The addEmployee() method adds an employee to the directory.
The displayAllEmployees() method prints details of all employees in the directory.
The updateEmployee() method updates an employee's information at a specified index in the directory.
The deleteEmployee() method removes an employee from the directory at a specified index.

EmployeeDirectoryExample Class (Main Class):
This class contains the main() method where an instance of Directory is created.
Two employees, "Alice" and "Bob," are added to the directory with their respective positions and salaries.
The displayAllEmployees() method is called to show all employees.
The details of "Bob" are updated to reflect a change in position and salary.
"Alice" is deleted from the directory.
Finally, the updated list of employees is displayed again.


Output:-
Employee{name='Alice', position='Manager', salary=60000.0}
Employee{name='Bob', position='Developer', salary=50000.0}

Employee{name='Alice', position='Manager', salary=60000.0}
Employee{name='Bob', position='Senior Developer', salary=55000.0}

Employee{name='Bob', position='Senior Developer', salary=55000.0}

Initial display after adding "Alice" as a Manager and "Bob" as a Developer.
Display after updating "Bob's" information to reflect the change in position and salary.
Display after deleting "Alice" from the directory.
Final display of the remaining employee, "Bob", with his updated information.

*/