package Day_20;

public class Student {
	int studentId;
	String name;
	long mobile;
	
	public Student(int studentId, String name, long mobile) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.mobile = mobile;
	}

	public void display() {
		System.out.println("studentId = "+studentId);
		System.out.println("name = "+name);
		System.out.println("mobile = "+mobile);
	}
}
