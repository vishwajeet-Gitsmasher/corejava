package Day_72;

public class Employee {
	private String name;
	private String gender;
	private String department;
	private double salary;
	private int years_of_experience;
	
	public Employee(String name, String gender, String department, double salary, int years_of_experience) {
		super();
		this.name = name;
		this.gender = gender;
		this.department = department;
		this.salary = salary;
		this.years_of_experience = years_of_experience;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public int getYears_of_experience() {
		return years_of_experience;
	}
	
	public void setYears_of_experience(int years_of_experience) {
		this.years_of_experience = years_of_experience;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", department=" + department + ", salary=" + salary
				+ ", years_of_experience=" + years_of_experience + "]";
	}
	
	
}

/*

Ques - 1
------------
Use Stream API to Complete the assignment.
Develop an Employee Management System in Java that handles employee information, including adding, 
updating, removing, and listing employees. The system should also provide functionalities for sorting 
employees by name, finding the highest salary by department, and categorizing employees by gender and 
department.

Define the Employee class(BLC) with attributes such as.
name: String: private 
gender: String: private
department: String: private 
salary: String: private
years_of_experience: int: private

Develop one parameterized constructor to initialize all attributes.
methods:
Define getters, setters, and toString() method.

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