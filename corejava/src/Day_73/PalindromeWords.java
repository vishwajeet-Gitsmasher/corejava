package Day_73;

import java.util.Arrays;

public class PalindromeWords {
	public static void main(String[] args) {
		String[] words = {"madam", "hello", "racecar", "java", "level", "world"};
		Object[] w = Arrays.stream(words).filter(str -> isPalindrome(str)).toArray();
		System.out.println("Palindrome Words:"+Arrays.toString(w));
	}
	
	public static boolean isPalindrome(String s) {
		for(int i=0,j=s.length()-1;i<j;i++,j--) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
		}
		return true;
	}
}



// Palindrome Words:[madam, racecar, level]



/*
Q6) WAP to filter Palindrome Words from an Array.

String[] words = {"madam", "hello", "racecar", "java", "level", "world"};

Output : Palindrome Words: [madam, racecar, level]
*/