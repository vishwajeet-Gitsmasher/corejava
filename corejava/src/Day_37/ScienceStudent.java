package Day_37;

public class ScienceStudent extends Student{
	private int physicsMarks;
	private int chemistryMarks;
	private int mathsMarks;
	
	public ScienceStudent(String studentName, String studentClass, int physicsMarks,
			int chemistryMarks, int mathsMarks) {
		super(studentName, studentClass);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}

	public int getPercentage() {
		int total = this.physicsMarks + this.chemistryMarks + this.mathsMarks;
		int percentage = total/3;
		return percentage;
	}

	@Override
	public String toString() {
		return "ScienceStudent [physicsMarks=" + physicsMarks + ", chemistryMarks=" + chemistryMarks + ", mathsMarks="
				+ mathsMarks + ", studentName=" + studentName + ", studentClass=" + studentClass + "]";
	}
	
	
}

/*
Create a class ScienceStudent that inherits from Student. 
Add the following attributes
Instance variables:
physicsMarks: private int
chemistryMarks: private int
mathsMarks: private int
Methods:
Override, getPercentage() method to compute and return the percentage of marks(Max marks for a subject :100)
*/