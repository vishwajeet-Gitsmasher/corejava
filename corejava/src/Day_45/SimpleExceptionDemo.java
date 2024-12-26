package Day_45;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
			System.out.print("Enter the value of a : ");
			int a = sc.nextInt();
			System.out.print("Enter the value of b : ");
			int b = sc.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("An InputMismatchException occurred.");
			System.out.println("Message : "+e.getMessage());
			System.out.println("String representation : "+e.toString());
			System.out.println("Stack Trace : ");
			e.printStackTrace();
		}finally {
			sc.close();
		}
	}

}

/*
Enter the value of a : 10
Enter the value of b : abc
An InputMismatchException occurred.
Message : null
String representation : java.util.InputMismatchException
Stack Trace : 
java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	at java.base/java.util.Scanner.next(Scanner.java:1594)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
	at Day_45.SimpleExceptionDemo.main(SimpleExceptionDemo.java:14)

 */

/*
Ques - 1
-------------
Exception and Messages 

a. Write a program to create an ELC class SimpleExceptionDemo ,which contains main method.

b. This program should read two integer numbers for the variables a and b from console using Scanner class.

c. If you enter any other character except number (0 - 9) then the error is caught by InputMisMatchException object.

d. After that using following methods print the information about the error occurring causes in the console. getMessages(),  printStackTrace(), println(),  toString().


Test Cases
Test Case 1:
Enter the first integer (a): 10
Enter the second integer (b): 20

Output:
You entered a = 10 and b = 20
Test Case 2:


Enter the first integer (a): 10
Enter the second integer (b): abc
Output:
Enter the first integer (a): 10
Enter the second integer (b): abc
An InputMismatchException occurred.
Message: null
String representation: java.util.InputMismatchException
Stack trace: 
java.util.InputMismatchException
    at java.base/java.util.Scanner.throwFor(Scanner.java:939)
    at java.base/java.util.Scanner.next(Scanner.java:1594)
    at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
    at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
    at SimpleExceptionDemo.main(SimpleExceptionDemo.java:10)


*/