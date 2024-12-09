package Day_28;

public class StaffDemo {
	public static void main(String[] args) {
		Professor p = new Professor("Rahul",12,"IT","AI");
		p.displayInfo();
		p.teachSubject();
		p.conductResearch();
	}
}

/*
Staff name : Rahul
Staff id : 12
Faculty Department : IT
Professor research area : AI

 */

/*
Task Requirements:

Define the Staff, Faculty, and Professor classes based on the attributes and methods described above.
Create a StaffDemo class that instantiates a Professor object with sample values (e.g., name, ID, department, and research area).
Call the methods to demonstrate the functionality of each class.
*/