package Day_22;

public class Employee extends Person{
	String employeeId;
	
	public Employee(String name, int age, String employeeId) {
		super(name, age);
		this.employeeId = employeeId;
	}


	public void displayEmployeeInfo() {
		super.displayInfo();
		System.out.println("Employee ID = "+this.employeeId);
	}
}

/*
Employee (Intermediate Class, inherits from Person):
Additional Attribute:
employeeId (String): Unique ID for each employee.
Additional Method:
displayEmployeeInfo(): This method should call displayInfo() from the Person class and then print the employee ID.
*/