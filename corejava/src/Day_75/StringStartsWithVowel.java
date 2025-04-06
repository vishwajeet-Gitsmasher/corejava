package Day_75;

import java.util.ArrayList;

public class StringStartsWithVowel {
	public static void main(String[] args) {
		ArrayList<String> res = new ArrayList<>();
		res.add("apple");
		res.add("grapes");
		res.add("iplmatch");
		res.add("mango");
		res.add("owner");
		
		res.stream()
			.filter(s -> s.startsWith("a") || s.startsWith("e") || s.startsWith("i") || s.startsWith("o") || s.startsWith("u"))
				.filter(s-> s.length()==5)
					.forEach(System.out::println);
		
	}
}


/*
Q1) 
Write a program to process a list of strings. Use a custom predicate to filter 
strings that start with a vowel and have a length greater than 5.
*/