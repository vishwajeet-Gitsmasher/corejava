package Day_73;

import java.util.Arrays;

public class NameThatContainsA {
	public static void main(String[] args) {
		String[] names = {"Rahul", "Raj", "Arnav", "Scott", "Smith"};
		Object[] res = Arrays.stream(names).filter(str -> str.contains("A") || str.contains("a")).toArray();
		System.out.println("Names Containing 'A' or 'a' :"+Arrays.toString(res));
	}
}


// Names Containing 'A' or 'a' :[Rahul, Raj, Arnav]


/*.
Q2) WAP to print all the names from String array which contains 
letter 'a' in the name.

String[] names = {"Rahul", "Raj", "Arnav", "Scott", "Smith"};
Output : Names Containing 'A' or 'a' : [Rahul, Raj, Arnav]
*/