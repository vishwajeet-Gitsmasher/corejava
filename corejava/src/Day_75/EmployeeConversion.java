package Day_75;

import java.util.ArrayList;
import java.util.stream.Collectors;

class Employee{
	String name;
	String add;
	public Employee(String name, String add) {
		super();
		this.name = name;
		this.add = add;
	}
	
	
}

public class EmployeeConversion {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee("A","HYD"));
		list.add(new Employee("B","PUNE"));
		list.add(new Employee("C","MUM"));
		
		list.stream().map(e -> e.name).collect(Collectors.toList()).forEach(System.out::println);
	}
}

/*
A
B
C
 */

/*
Q5)
Implement a method using streams to convert a list of objects (e.g., Employee) 
into another list containing only one property of the object (e.g., Employee.name).
*/