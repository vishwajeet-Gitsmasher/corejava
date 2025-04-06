package Day_74;

import java.util.stream.Stream;

public class CreateStreamOfIntegers {

	public static void main(String[] args) {
		Stream<Integer> str = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		str.filter(n -> n%2==0).forEach(n -> System.out.println(n*n));
	}

}

/*
4
16
36
64
100
 */

/*
Ques - 1
------------
Write a Java program that creates a stream of integers using Stream.of, filters out the even numbers 
and then prints each squared number using forEach.
Input (Stream):
1, 2, 3, 4, 5, 6, 7, 8, 9, 10
Output:
2
4
6
8
10
*/