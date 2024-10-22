package Day_11;

import java.util.Scanner;

public class Patient {
	// properties
		int patientId;
		String patientName;
		String patientDisease;
		
		
		public void setPatientData() {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Patient Id : ");
			patientId = sc.nextInt();
			System.out.print("Enter Patient Name : ");
			patientName = sc.next();
			System.out.print("Enter Patient Disease : ");
			patientDisease = sc.next();
			
		}
		
		public void getPatientData() {
			System.out.println("Patient Id : "+patientId);
			System.out.println("Patient Name : "+patientName);
			System.out.println("Patient Disease : "+patientDisease);
		}
}





