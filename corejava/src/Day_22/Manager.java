package Day_22;

public class Manager extends Employee{
	String department;
	
	public Manager(String name, int age, String employeeId, String department) {
		super(name, age, employeeId);
		this.department = department;
	}

	public void displayManagerInfo() {
		super.displayEmployeeInfo();
		System.out.println("Department name = "+this.department);
	}
}
/*
Manager (Derived Class, inherits from Employee):
Additional Attribute:

department (String): Department name of the manager.

Additional Method:
displayManagerInfo(): This method should call displayEmployeeInfo() from the Employee class and then print the department name.

*/
