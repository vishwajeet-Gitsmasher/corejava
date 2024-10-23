package Day_12;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmployeeData("Rahul","Sharma", 102, 20000, 7);
		e.calculateSalary();
		e.displayDetails();
		
		System.out.println("============================================");
		e.setEmployeeData("Rohit","Sharma", 103, 40000, 25);
		e.calculateSalary();
		e.displayDetails();

	}

}

/*
Employee Details
Employee First Name : Rahul
Employee Last Name : Sharma
Employee ID : 102
Employee Salary :25000.0
Number of Projects : 7
============================================
Employee Details
Employee First Name : Rohit
Employee Last Name : Sharma
Employee ID : 103
Employee Salary :55000.0
Number of Projects : 25

*/