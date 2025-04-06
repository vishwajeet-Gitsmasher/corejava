package Day_73;

import java.util.Arrays;

public class StringLengthGreaterThanThree {
	public static void main(String[] args) {
		String[] words = {"Raj", "Rohit", "Smirti", "Richa", "Sky"};
		Object[] nums = Arrays.stream(words).filter(str -> str.length()>3).toArray();
		System.out.println("Prime Numbers:"+Arrays.toString(nums));
	}
}


// Prime Numbers:[Rohit, Smirti, Richa]


/*
Q4) WAP to print all the names from String array where the length of the 
name must be greater than 3.

String[] words = {"Raj", "Rohit", "Smirti", "Richa", "Sky"};
Output : [Rohit, Smirti, Richa]
*/