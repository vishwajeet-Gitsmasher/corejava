package Day_22;

public class LibrarySystemExample {

	public static void main(String[] args) {
		Ebook e = new Ebook("Java Programming","John Doe","PDF");
		e.displayEbookInfo();
	}

}
/*
Title : Java Programming
Author : John Doe
File Format : PDF
*/

/*
Requirements:
Define the classes LibraryItem, Book, and Ebook as described above.
Implement constructors in each class to initialize their respective attributes.
In the main program (LibrarySystemExample), create an instance of the Ebook class.
Call displayEbookInfo() on the Ebook instance to output all details.
Sample Output:
When an Ebook object is created with the following details:

Title: "Java Programming"
Author: "John Doe"
File Format: "PDF"
*/