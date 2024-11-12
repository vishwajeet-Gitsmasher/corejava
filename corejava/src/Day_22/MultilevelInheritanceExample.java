package Day_22;

public class MultilevelInheritanceExample {
	
	public static void main(String[]args) {
		Manager m = new Manager("Alice",35,"E123","IT");
		m.displayManagerInfo();
	}
}

/*
Person name : Alice
Person age : 35
Employee ID = E123
Department name = IT
*/


/*
Requirements:
Define the classes Person, Employee, and Manager as described above.
Implement constructors in each class to initialize their respective attributes.
In the main program (MultilevelInheritanceExample), create an instance of the Manager class.
Call displayManagerInfo() on the Manager instance to output all details.
Sample Output:
When a Manager object is created with the following details:

Name: "Alice"
Age: 35
Employee ID: "E123"
Department: "IT"

*/
