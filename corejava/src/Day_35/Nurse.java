package Day_35;

public class Nurse extends HospitalStaff {
	private int yearsOfExperience;
	
	public Nurse(String name, int age, String role, int yearsOfExperience) {
		super(name, age, role);
		this.yearsOfExperience = yearsOfExperience;
	}

	public void work() {
		System.out.println(super.getRole()+" "+super.getName()+" with "+ this.yearsOfExperience+" years of experience is taking care of patients.");
	}
}

/*
* Create Nurse class which will inherite HospitalStaff

Variables :-
private int yearsOfExperience;

take  one parameterized Constructor and initialize values

// Overriding work() method for nurses
it will print massage in this format
Role + " " + NAME + " with " + yearsOfExperience + " years of experience is taking care of patients."

*/