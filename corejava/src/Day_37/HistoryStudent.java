package Day_37;

public class HistoryStudent extends Student{
	private int historyMarks;
	private int civicsMarks;
	
	public HistoryStudent(String studentName, String studentClass, int historyMarks,
			int civicsMarks) {
		super(studentName, studentClass);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}

	public int getPercentage() {
		int total = this.historyMarks + this.civicsMarks;
		int percentage = total/2;
		return percentage;
	}

	@Override
	public String toString() {
		return "HistoryStudent [studentName=" + studentName + ", studentClass=" + studentClass + ", historyMarks="
				+ historyMarks + ", civicsMarks=" + civicsMarks + "]";
	}
	
	
}

/*
Create a class HistoryStudent that inherits from Student. 
Add the following attributes.
Instance variables: 
historyMarks: private int
civicsMarks: private int (Max Marks for a subject : 100)
Method:
Override getPercentage() method to computed and return the percentage of marks(Max marks for a subject :100)

*/