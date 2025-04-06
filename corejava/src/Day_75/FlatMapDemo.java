package Day_75;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
	public static void main(String[] args) {
		List<String> sentences = Arrays.asList(
			    "Apple is a fruit.",
			    "Bananas are yellow.",
			    "I love programming in Java.",
			    "Elephants are the largest land animals.",
			    "Umbrellas are useful during rain.",
			    "India won the cricket match.",
			    "Ocean waves are soothing.",
			    "Everyone should drink water.",
			    "OpenAI develops artificial intelligence.",
			    "Understanding streams is important."
			);
		
		sentences.stream()
        .flatMap(s -> Arrays.stream(s.split(" ")))
        .map(String::toLowerCase)
        .collect(Collectors.toSet()) // collect unique words (case-insensitive)
        .forEach(System.out::println);

	}
}

/*
love
largest
soothing.
match.
bananas
during
india
animals.
java.
apple
fruit.
are
won
elephants
should
land
understanding
programming
develops
waves
a
in
everyone
streams
i
is
yellow.
water.
rain.
drink
the
intelligence.
openai
artificial
ocean
cricket
umbrellas
useful
important.

 */

/*
Q4)
Given a list of sentences (Strings), use flatMap to create a list of all unique words in lowercase.

*/