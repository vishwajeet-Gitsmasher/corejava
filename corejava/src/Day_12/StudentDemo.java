package Day_12;

public class StudentDemo {

	public static void main(String[] args) {
		Student raj = new Student();
		raj.setStudentData(101, "Raj Kumar", 78);
		raj.calculateGrade();
		System.out.println(raj.displayDetails());
		
		Student ram = new Student();
		ram.setStudentData(102, "Ram", 90);
		ram.calculateGrade();
		System.out.println(ram.displayDetails());
	}

}

/*
Student [name=Raj Kumar, studentId=101, marks=78, grade=C]

Student [name=Ram, studentId=102, marks=90, grade=B]

*/