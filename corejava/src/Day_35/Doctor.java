package Day_35;

public class Doctor extends HospitalStaff{
	private String specialization;
	
	public Doctor(String name, int age, String role, String specialization) {
		super(name, age, role);
		this.specialization = specialization;
	}

	public void work() {
		System.out.println(super.getRole() + " with specialization in "+ this.specialization + " is treating patients.");
	}
}

/*
*create second class Doctor which will inherited with HospitalStaff

declare variable:
private String specialization;

 take one parameterized Constructor and initialize values

// Overriding work() method for doctors
it will print Roll and Name with this massage" with specialization in " + specialization + " is treating patient
s."
*/