package Day_65;

import java.util.TreeSet;

public class BookSorted {

	public static void main(String[] args) {
		TreeSet<Book> set = new TreeSet<Book>();
		set.add(new Book("Virat","Fire of wings"));
		set.add(new Book("Rohit","The Explorer"));
		set.add(new Book("Dhoni","How to Farm"));
	
		System.out.println("Books sorted in alphabetial order.");
		System.out.println(set);
	}

}

/*
Books sorted in alphabetial order.
[Book[name=Dhoni, author=How to Farm], Book[name=Rohit, author=The Explorer], Book[name=Virat, author=Fire of wings]]
*/
