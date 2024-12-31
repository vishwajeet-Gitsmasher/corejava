package Day_48;

public class Tester {

	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		try {
			c.loadingClass(args[0]);
			System.out.println(args[0]+" Loaded Successfully");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}

}

/*
String s = "";
Exception in thread "main" java.lang.IllegalArgumentException: Class name cannot be empty
	at Day_48.ChildClass.loadingClass(ChildClass.java:6)
	at Day_48.Tester.main(Tester.java:8)
	
	
String s = Day_48.ArrayStoreExample;
Day_48.ArrayStoreExample Loaded Successfully

 */

/*
Create a ELC class Tester and implement the main method:

Inside the main method, create an instance of ChildClass and call the overridden loadingClass method with various test inputs.
Take the input from command line.
Use a try-catch block to catch and handle the exceptions.


Test Case 1: Valid class name
Input: java.lang.String
Expected Output:
Class loaded successfully: java.lang.String

Test Case 2: Invalid class name
Input: NonExistentClass
Expected Output:
Error loading class in ChildClass. Converting to unchecked exception.
Exception caught: Unchecked Exception: RuntimeException from ChildClass

Test Case 3: Empty class name
Input: ""
Expected Output:
Exception caught: Class name cannot be empty

*/