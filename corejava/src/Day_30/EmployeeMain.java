package Day_30;

public class EmployeeMain {

	public static void main(String[] args) {
		SeniorManager sm = new SeniorManager("Ram",101,"IT",5);
		sm.displayInfo();
		sm.manageTeam();
		sm.handleMultipleTeams();

	}

}

/*
Employee name : Ram
Employee id : 101
Manager Name : Ram
Manager Department : IT
Number of teams managed by the senior manager : 5
 */

/*
Task Requirements:
Define the Classes:

Implement the Employee, Manager, and SeniorManager classes based on the attributes and methods described above.
Class Functionality:

The Employee class should store the basic information about an employee, such as their name and ID.
The Manager class should extend Employee and add the ability to manage a department.
The SeniorManager class should extend Manager and further add the ability to oversee multiple teams.
Create a Main Class:

In the Main Class, instantiate a SeniorManager object with sample values (e.g., name, ID, department, and number of teams).
Call the displayInfo(), manageTeam(), and handleMultipleTeams() methods to demonstrate the functionality of each class.


*/