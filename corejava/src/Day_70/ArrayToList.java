package Day_70;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		String[] arr = new String[3];
		arr[0] = "Apple";
		arr[1] = "mango";
		arr[2] = "Grapes";
		List<String> Fruitslist = convertToList(arr);
		System.out.println(Fruitslist);

	}
	
	public static List<String> convertToList(String[] inputArray) {
		List<String> list = Arrays.asList(inputArray);
		return list;
	}
}

/*
[Apple, mango, Grapes]
 */


/*
Program: 2
----------------
Write a Java program to convert Array to List.
A BLC class called ArrayToList is given to you.
Add a static method: convertToList(String[] inputArray) : This method 
takes an array of strings as an argument. It should convert the given 
array to a list of Strings and return this list. 
Note that the length of the list must be the same as that of the array. 
Return null for errors a null array or an empty list for an empty 
array.
An ELC Class called Tester with the main method is given to you. Use 
this class to test your solution


*/