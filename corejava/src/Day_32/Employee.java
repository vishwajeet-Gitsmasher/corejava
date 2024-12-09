package Day_32;

public class Employee {
	private int empId;
	private String empName;
    private Address address;
    
	public Employee(int empId, String empName, Address address) {
		super();
		if(empId<=0) {
			System.err.println("Error: Invalid Employee ID");
			System.exit(0);
		}
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}
    
	
    
} 

/*
Create a class Employee (Business Logic Class)
Instance Variables: 
   private int empId;
   private String empName;
   private Address address; //HAS-A relation
Create a parameterized constructor initialize the instance variable of the class.

Override toString() from Object class to print Employee class properties.
*/