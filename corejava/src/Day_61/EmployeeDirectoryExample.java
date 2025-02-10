package Day_61;

public class EmployeeDirectoryExample {

	public static void main(String[] args) {
		Directory d = new Directory();
		d.addEmployee(new Employee("Alice","Manager",60000.0));
		d.addEmployee(new Employee("Bob","Developer", 50000.0));
		
		d.displayAllEmployees();
		
		d.updateEmployee(1);
		
		d.displayAllEmployees();
		
		d.deleteEmployee(0);
		
		d.displayAllEmployees();
		
	}

}

/*
Employee [name=Alice, position=Manager, salary=60000.0]
Employee [name=Bob, position=Developer, salary=50000.0]

======= Menu =======
1. Name
2. Position
3. Salary
4. Exit
Enter Your Choice : 2
Enter new Position : Senior Developer
======= Menu =======
1. Name
2. Position
3. Salary
4. Exit
Enter Your Choice : 3
Enter new Salary : 55000
======= Menu =======
1. Name
2. Position
3. Salary
4. Exit
Enter Your Choice : 4
Thankyou for updating the details!!

Employee [name=Alice, position=Manager, salary=60000.0]
Employee [name=Bob, position=Senior Developer, salary=55000.0]

Employee [name=Bob, position=Senior Developer, salary=55000.0]

 */


/*
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