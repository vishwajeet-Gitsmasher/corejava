package Day_75;

import java.util.ArrayList;
import java.util.Comparator;

public class SortLexicographically {
	public static void main(String[] args) {
		ArrayList<String> res = new ArrayList<>();
		res.add("apple");
		res.add("grapes");
		res.add("iplmatch");
		res.add("mango");
		res.add("owner");
		res.add("bin");
		
		res.stream().sorted((s1,s2) -> Integer.compare(s1.length(),s2.length())).sorted().forEach(System.out::println); 
	}
}

/*
apple
bin
grapes
iplmatch
mango
owner
 */


/*
Q3)
Given a list of strings, sort them by length first and lexicographically second. Implement this using sorted.

*/