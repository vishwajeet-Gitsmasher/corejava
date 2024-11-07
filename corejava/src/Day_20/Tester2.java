package Day_20;

public class Tester2 {

	public static void main(String[] args) {
		Manager m = new Manager("Ravi", 500000, "Sales");
		m.work();
		m.manage();

	}

}
/*
Ravi is working
Ravi is managing sales Department
Ravi is managing sales Department
Ravi is managing sales Department
*/

/*
3)create base class as Employee

Attribute :-
--------------

string name
double salary


define parametrized constructor to initialize the  instance variable

method:-
---------
return type:-void
method name:- work
behavior:- this method will print the message that along with person name the person is working
"Rajesh is working"


-----------

create derived class name as Manager

Attribute :-

String department 


define parametrized constructor to initialize the  instance variable
and also parent class properties


method:-
---------
return type:-void
method name:- manage
behavior:- this method will print the person name is managing the department name
"Rajesh is managing sales Department"

------------------------------

define Tester class here use main method to test  your logic
*/