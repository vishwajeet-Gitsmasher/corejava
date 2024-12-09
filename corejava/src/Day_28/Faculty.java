package Day_28;

public class Faculty extends Staff {
	String department;

	public Faculty(String name, int id, String department) {
		super(name, id);
		this.department = department;
	}
	
	public void teachSubject() {
		System.out.println("Faculty Department : "+this.department);
	}
}

/*
Faculty Class (Derived from Staff)

Attributes:
String department: Represents the department the faculty member belongs to.

Methods:
Constructor to initialize the name, id, and department.

void teachSubject(): Prints the department the faculty member is teaching.
*/