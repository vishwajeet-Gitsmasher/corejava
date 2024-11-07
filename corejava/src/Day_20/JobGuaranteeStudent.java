package Day_20;

public class JobGuaranteeStudent extends Student{
	boolean placementGuarantee;

	public JobGuaranteeStudent(int studentId, String name, long mobile, boolean placementGuarantee) {
		super(studentId, name, mobile);
		this.placementGuarantee = placementGuarantee;
	}
	
	void displayStudentInfo() {
		display();
		System.out.println("placementGuarantee = "+placementGuarantee);
	}
	
	
}
