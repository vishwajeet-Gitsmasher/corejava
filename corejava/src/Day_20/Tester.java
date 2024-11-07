package Day_20;

public class Tester {

	public static void main(String[] args) {
		JobGuaranteeStudent j = new JobGuaranteeStudent(101, "Ravi", 122347864, true);
		j.displayStudentInfo();
	}

}

/*
studentId = 101
name = Ravi
mobile = 122347864
placementGuarantee = true
*/

/*
1) create base class as Student

Attribute :-
--------------

int studentId
string name
long mobile

define parametrized constructor to initialize the  instance variable

method:-
---------
return type:-void
method name:- display
behavior:- this method will print the detail of student

-----------

create derived class name as JobGuaranteeStudent

Attribute :-

boolean placementGuarantee


define parametrized constructor to initialize the  instance variable
and also parent class properties


method:-

method:-
---------
return type:-void
method name:- displayStudentInfo
behavior:- this method will print the detail of student and also placementGuarantee true or false

------------------------------

define Tester class here use main method to test  your logic
*/