package Day_73;

import java.util.Arrays;

public class NamesToUpperCase {

	public static void main(String[] args) {
		String[] names = {"Virat", "Sanju", "Rohit", "Bumrah"};
		Object[] n = Arrays.stream(names).map(str -> str.toUpperCase()).toArray();
		System.out.println(Arrays.toString(n));
	}

}


// [VIRAT, SANJU, ROHIT, BUMRAH]

/*
Q8) WAP to convert all the names of String array into uppercase 

String[] names = {"Virat", "Sanju", "Rohit", "Bumrah"};

Output : [VIRAT, SANJU, ROHIT, BUMRAH]
*/