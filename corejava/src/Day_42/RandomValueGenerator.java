package Day_42;

import java.util.Scanner;
import java.util.function.Supplier;

public class RandomValueGenerator {
	
	public static void main(String[] args) {
		
	    Supplier<String> stringSupplier = ()-> {
	    	int range = 9999 - 1000 + 1;
		    int ans = (int) (Math.random() * range) + 1000;
		    return "NIT"+ans;
	    };
	    System.out.println("Generated random string:"+stringSupplier.get());
	    
	    Supplier<Integer> integerSupplier = ()-> {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.print("Enter Minimum value : ");
	    	int min = sc.nextInt();
	    	System.out.print("Enter Maximum value : ");
	    	int max = sc.nextInt();
	    	int range = max - min  + 1;
		    int ans = (int) (Math.random() * range) + min;
		    return ans;
	    };
	    System.out.println("Generated random integer:"+integerSupplier.get());
	}
	 
     
}

/*
Generated random string:NIT2464
Enter Minimum value : 20
Enter Maximum value : 50
Generated random integer:25

Generated random string:NIT1406
Enter Minimum value : 1
Enter Maximum value : 5
Generated random integer:5
 */

/*
Ques - 3
-----------
Create a Java program that utilizes the Supplier interface to generate random values. Implement two Supplier instances: one for generating a random alphanumeric string in the format "NIT" followed by four random digits, and another for generating a random integer within a specified range.

RandomValueGenerator class(ELC):

Inside the main method, define two consumers:
String Supplier (stringSupplier):
Generates a random alphanumeric string in the format "NIT" followed by four random digits.
Example output: "NIT1234", "NIT5678", etc.

Integer Supplier (integerSupplier):
Generates a random integer between a specified minimum and maximum value (inclusive).
Example output: 57, 92, etc.

Tasks to Implement:
Define the stringSupplier and integerSupplier instances using the Supplier interface and lambda expressions.

Inside the main method, use these suppliers to generate random values and print the results.

Test Cases:

Test Case 1:
Output:
Generated random string: NIT1234
Generated random integer: 57

Test Case 2:
Output:
Generated random string: NIT5678
Generated random integer: 92

Test Case 3:

Output:
Generated random string: NIT0192
Generated random integer: 14

*/