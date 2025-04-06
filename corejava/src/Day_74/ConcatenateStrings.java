package Day_74;

import java.util.stream.Stream;

public class ConcatenateStrings {
    public static void main(String[] args) {
        Stream<String> str = Stream.of("Hello", "", "World", " ", "from", " ", "Java", "!");
        
        StringBuilder sb = new StringBuilder();
        str.filter(s -> !s.isEmpty())
           .forEach(s -> sb.append(s));

        System.out.println(sb.toString());
    }
}


// HelloWorld from Java!

/*
Ques - 2
-----------
Write a Java program that uses the Stream.of method to create a stream of strings, filters 
out the empty strings, and then concatenate the remaining strings into a single string..

Input:
A stream of strings ["Hello", "", "World", " ", "from", " ", "Java", "!"].

Output:
A single concatenated string:
HelloWorld from Java!
*/