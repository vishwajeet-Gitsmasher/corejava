package Day_18;

public class Student {
	int studentId;
	double marks;
	static String collegeName = "VIT Institute Vellore";

	public Student(int studentId, double marks) {
		super();
		this.studentId = studentId;
		this.marks = marks;
	}
	public void read() {
		System.out.println(studentId+" read books");
	}
	public void writeExam() {
		System.out.println(studentId+"  write exam");
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", marks=" + marks + ", collegeName = "+collegeName+"]";
	}
}


