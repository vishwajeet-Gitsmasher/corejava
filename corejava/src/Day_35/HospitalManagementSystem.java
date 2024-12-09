package Day_35;

public class HospitalManagementSystem {

	public static void main(String[] args) {
		HospitalStaff h = new HospitalStaff("Nishant",50,"Doctor");
		h.work();
		
		Doctor d = new Doctor("Rahul",39,"Assitant","Heart");
		d.work();
		
		Nurse n = new Nurse("Seema",29,"Nurse",7);
		n.work();
	}

}

/*
Nishantis working massage
Assitant with specialization in Heart is treating patients.
Nurse Seema with 7 years of experience is taking care of patients.
 */

/*
create class HospitalManagementSystem inside this take main method where use this class for testing
create object for every class and check
*/