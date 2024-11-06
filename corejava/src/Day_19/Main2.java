package Day_19;

class Person{
	 String name;
	 int age;
	 
	 void displayDetails(){
		 System.out.println(name);
		 System.out.println(age);
	 }
}

class Employee extends Person{
	double salary;
	
	void displayEmployeeDetails() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
	}
}

public class Main2 {

	public static void main(String[] args) {
		Employee E = new Employee();
		E.name = "Pratyush";
		E.age = 23;
		E.salary = 60000;
		E.displayDetails();
		E.displayEmployeeDetails();
	}

}

/*
Pratyush
23
Pratyush
23
60000.0
 */

/*
Q3) create base class Person 
Attributes :-

 String name;
    int age;

methods:-

return type :- void
method Name :- displayDetails
behavior of start method:- this method will print the name of the person , age of the person
------
create derived class name as Employee inherit from Person

Attribute:-

double salary;


methods:-

return type :- void
method Name :- displayEmployeeDetails
behavior of displayEmployeeDetails method:- try to call displayDetails method inside this method and print the salary also

------
create main class to test your logic 
create object initialize the values and call the methods

*/