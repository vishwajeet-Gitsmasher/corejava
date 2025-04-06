package Day_74;

import java.util.ArrayList;

public class LengthOfExactly4Characters {
	public static void main(String[] args) {
		ArrayList<String> res = new ArrayList<>();
		res.add("Toby");
		res.add("Anna");
		res.add("Leroy");
		res.add("Alex");
		
		res.stream().filter(s -> s.length()==4).sorted().limit(2).forEach(System.out::println);
		
		
	}
}

/*
Alex
Anna
 */

/*
Ques - 5
--------------
Write a Java program that processes a list of names to filter, sort, and print names with a 
length of exactly 4 characters.
Requirements:
Use a list of strings containing names as input.
Filter out names that are not exactly 4 characters long.
Sort the filtered names in lexicographical order (alphabetical order).
Limit the output to the first 2 names after sorting.
Print each name on a new line.

Input : 
A List of strings: ["Toby", "Anna", "Leroy", "Alex"]
Expected Output:
Anna
Alex
*/