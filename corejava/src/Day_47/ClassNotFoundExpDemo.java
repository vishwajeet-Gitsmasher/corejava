package Day_47;

import java.util.Scanner;

public class ClassNotFoundExpDemo {
	public ClassNotFoundExpDemo(String className){
		try {
			Class<?> t = Class.forName(className);
			System.out.println("Class "+className+" found: "+className);
		} catch (ClassNotFoundException e) {
			System.out.println("Class "+className+" not found.");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the class name to load:");
		String className = sc.next();
		ClassNotFoundExpDemo c = new ClassNotFoundExpDemo(className);

	}

}

/*
Ques - 4
------------
Handling ClassNotFoundException in Java
Objective:
Write a Java program that demonstrates how to handle ClassNotFoundException. The program should prompt the user to enter a class name and attempt to load that class using reflection. If the class does not exist, the program should catch the exception and print an appropriate message.

Instructions:
Create a class named ClassNotFoundExpDemo:

Implement a constructor that takes a String parameter representing the class name.
Access Modifier : public
parameter : String

Inside the constructor, declare a variable of type Class<?>.
Use a try block to attempt to load the class using Class.forName(className).
Catch ClassNotFoundException and print an appropriate message along with the stack trace.

Create a main method:
Inside the main method, create a Scanner object to read input from the user.
Prompt the user to enter a class name.
Read the user's input and pass it to the ClassNotFoundExpDemo constructor.
Close the Scanner object.

Test Case 1:
Input:
Enter the class name to load: java.lang.String

Output:
Enter the class name to load: java.lang.String
Class java.lang.String found: java.lang.String

Test Case 2:
Input:
Enter the class name to load: NonExistentClass

Output:
Enter the class name to load: NonExistentClass
Class NonExistentClass not found.
java.lang.ClassNotFoundException: NonExistentClass
    at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
    at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
    at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
    at java.base/java.lang.Class.forName0(Native Method)
    at java.base/java.lang.Class.forName(Class.java:398)
    at ClassNotFoundExpDemo.<init>(ClassNotFoundExpDemo.java:8)
    at ClassNotFoundExpDemo.main(ClassNotFoundExpDemo.java:17)

*/