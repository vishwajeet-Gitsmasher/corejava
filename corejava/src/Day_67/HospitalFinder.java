package Day_67;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class HospitalFinder {

	public static void main(String[] args) {
		ArrayList<String> treatment1 = new ArrayList<>();
		treatment1.add("Cardiac");
		treatment1.add("ENT");
		treatment1.add("Ortho");
		treatment1.add("Pediatric");
		treatment1.add("Gastro");
		
		Hospital h1 = new Hospital("ASHODA",treatment1, "MATHEWS", "9837322222", "Sec");
		Hospital h2 = new Hospital("Pristine",treatment1, "Anthony", "26323222222", "Amp");
		Hospital h3 = new Hospital("Max",treatment1, "Kusal", "9287362222", "Beg");
		
		HospitalService hs = new HospitalService();
		hs.addHospital(h1);
		hs.addHospital(h2);
		hs.addHospital(h3);
		
		HashMap<Integer,String> res = hs.getHospitals();
		Iterator itr = res.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()); 
		}
		
		Hospital h = hs.getHospitalDetails(100);
		System.out.println(h);

		Hospital ho1 = hs.getHospitalDetails(101);
		System.out.println(ho1);

		Hospital ho2 = hs.getHospitalDetails(102);
		System.out.println(ho2);

	}

}

/*
100=ASHODA
101=Pristine
102=Max
Hospital [hospitalCode=100, hospitalName=ASHODA, listOfTreatments=[Cardiac, ENT, Ortho, Pediatric, Gastro], contactPerson=MATHEWS, contactNumber=9837322222, location=Sec]
Hospital [hospitalCode=101, hospitalName=Pristine, listOfTreatments=[Cardiac, ENT, Ortho, Pediatric, Gastro], contactPerson=Anthony, contactNumber=26323222222, location=Amp]
Hospital [hospitalCode=102, hospitalName=Max, listOfTreatments=[Cardiac, ENT, Ortho, Pediatric, Gastro], contactPerson=Kusal, contactNumber=9287362222, location=Beg]

 */

/*
A class HospitalFinder is given to you with a main method. 
Create multiple Hospital objects and test with the methods of HospitalService class here
*/