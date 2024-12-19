package Day_42;

import java.util.function.Predicate;

public class NumberTester {
	public static void main(String[] args) {
		Integer num = 20;
		Predicate<Integer> isEven = (a)-> (a % 2) == 0;
		System.out.println("Is "+num+" even?"+isEven.test(num));
		
		Predicate<Integer> isPrime = (a)-> {
			for(int i=2;i<=a/2;i++) {
				if(a%i==0) {
					return false;
				}
			}
			return true;
		};
		System.out.println("Is "+num+" prime?"+isPrime.test(num));
	}
}

/*
Is 13 even?false
Is 13 prime?true

Is 5 even?false
Is 5 prime?true

Is 20 even?true
Is 20 prime?false
*/

/*
Assignment (19-DEC)
------------------------------------
Ques - 1
--------------
Create a Java program that demonstrates the usage of the Predicate interface to test if a number is even or prime. Your task is to implement a method testPredicate in the NumberTester class that tests a given number against a provided predicate.

NumberTester Class(ELC):

In the main method:
Define two predicates:
isEven: Checks if a given number is even.
isPrime: Checks if a given number is prime.

Define a sample integer number (e.g., 13).

Test each predicate using the testPredicate method and print the result indicating whether the number satisfies each predicate.

Test Cases:

Test Case 1:
Input: 13
Output:
Is 13 even? false
Is 13 prime? true

Test Case 2:
Input: 5
Output:
Is 5 even? false
Is 5 prime? true

Test Case 3:
Input: 20
Output:
Is 20 even? true
Is 20 prime? false

*/