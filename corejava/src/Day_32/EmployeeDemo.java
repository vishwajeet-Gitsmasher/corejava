package Day_32;

public class EmployeeDemo {

	public static void main(String[] args) {
		Address add = new Address("Daund","Pune","Maharashtra");
		Employee e = new Employee(101,"Ram",add);
		System.out.println(e);

	}

}

/*
 * Employee [empId=101, empName=Ram, address=Address [cityName=Daund, districtName=Pune, stateName=Maharashtra]]

 */

/*
Create a class Main (Executable Logic Class) which contains main method to print
 Employee class properties using toString() method.

*/