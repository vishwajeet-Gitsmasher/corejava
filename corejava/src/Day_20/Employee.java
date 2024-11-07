package Day_20;

public class Employee {
	String name;
	double salary;
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	 
	public void work() {
		System.out.println(this.name+" is working");
	}	
}
