package Day_30;

public class Manager extends Employee{
	String department;

	public Manager(String name, int id, String department) {
		super(name, id);
		this.department = department;
	}
	
	public void manageTeam() {
		System.out.println("Manager Name : "+super.name);
		System.out.println("Manager Department : "+this.department);
	}
}

/*
Manager Class (Derived from Employee):

Attributes:
String department: Represents the department managed by the manager.
Methods:
A constructor to initialize the name, id, and department attributes.
void manageTeam(): Prints the manager's name and the department they manage.
*/