package Day_73;

import java.util.Arrays;

public class IntegerArrayToString {

	public static void main(String[] args) {
		Integer[] numbers = {10, 20, 30, 40, 50};
		Object[] s = Arrays.stream(numbers).map(num -> "Number : "+num).toArray();
		System.out.println("Converted Strings:"+Arrays.toString(s));
	}

}



// Converted Strings:[Number : 10, Number : 20, Number : 30, Number : 40, Number : 50]


/*
Q7) WAP to convert Integer Array to String Representation

Integer[] numbers = {10, 20, 30, 40, 50};
Converted Strings: [Number: 10, Number: 20, Number: 30, Number: 40, Number: 50]
*/