package Day_73;

import java.util.Arrays;

public class ExtractFirstLetter {

	public static void main(String[] args) {
		String []names = {"James", "Aryan", "Vibha", "Aniket"};
		Object[]n = Arrays.stream(names).map(str -> str.charAt(0)).toArray();
		System.out.println("First Letters:"+Arrays.toString(n));
	}

}

// First Letters:[J, A, V, A]

/*
Q10) WAP to extract First Letter of Each Word from String Array

String []names = {"James", "Aryan", "Vibha", "Aniket"};

First Letters: [J, A, V, A]
*/