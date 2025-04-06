package Day_74;

import java.util.ArrayList;

class Employee{
	String name;
	int salary;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	
}

public class EmployeeSalary {
	public static void main(String[] args) {
		ArrayList<Employee> res = new ArrayList<>();
		res.add(new Employee("A",10000));
		res.add(new Employee("B",20000));
		res.add(new Employee("C",30000));
		res.add(new Employee("D",40000));
		res.add(new Employee("E",50000));
		
		res.stream().filter(e -> e.salary > 30000).forEach(System.out::println);
	}
}

/*
Employee [name=D, salary=40000]
Employee [name=E, salary=50000]
 */

/*
Ques - 6
---------------
Create a record of Employee with attributes name:(String) and id:(String)
Given a list of Employee objects with name and salary properties, write a 
program to filter the list of Employees by salary in who are having salary > 30000 
and print the employee names.
*/