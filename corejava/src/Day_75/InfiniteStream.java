package Day_75;

import java.util.stream.Stream;

public class InfiniteStream {
	public static void main(String[] args) {
		Stream.iterate(1,n -> n+1)
			.filter(n -> n%2==0).limit(10)
				.map(n -> n*n).
					forEach(System.out::println);
		
	}
}

/*
4
16
36
64
100
144
196
256
324
400
 */

/*
Q2)
Use Stream.iterate or Stream.generate to create an infinite stream. Then filter 
and map the data to produce the first 10 odd squares.

*/