package Day_46;

public class IllegalStateExceptionDemo {
	static void throwIllegalException( ) { 
		try{ 
			throw new IllegalStateException("MyException"); 
		} catch(IllegalStateException objA){
			System.out.println("caught:" +objA); 
		}
	}

	public static void main(String[] args) {
		throwIllegalException();
	}

}

/*
caught:java.lang.IllegalStateException: MyException
 */

/*
Ques - 3
--------------
IllegalStateException 

a. Write a program to create an ELC class IllegalStateExceptionDemo which implements a method as follows 
   static void throwIllegalException( ) { 
	try{ 
		throw new IllegalStateException("MyException"); 
	} catch(IllegalStateException objA){
		System.out.println("caught:" +objA); 
	}
    }

b. Implement the main method, and from main method call the above method.

c. Check the output of the program.

Test Case 1:
Input:
No input required, just running the program.

Output:
Calling throwIllegalException from main method:
Caught: java.lang.IllegalStateException: MyException

Test Case 2:
Input:
No input required, just running the program.

Output:
Calling throwIllegalException from main method:
Caught: java.lang.IllegalStateException: MyException


*/