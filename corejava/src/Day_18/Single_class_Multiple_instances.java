package Day_18;

public class Single_class_Multiple_instances {
	
	public static void main(String[] args) {
		Student raj = new Student(111, 78);
		raj.read();
		raj.writeExam();
		System.out.println(raj);
		
		System.out.println("=============================================================");
		Student priya = new Student(136, 98);
		priya.read();
		priya.writeExam();
		System.out.println(priya);
	}
}

/*
111 read books
111  write exam
Student [studentId=111, marks=78.0, collegeName = VIT Institute Vellore]
=============================================================
136 read books
136  write exam
Student [studentId=136, marks=98.0, collegeName = VIT Institute Vellore]
*/
