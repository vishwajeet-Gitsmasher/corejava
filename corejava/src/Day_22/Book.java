package Day_22;

public class Book extends LibraryItem{
	String author;

	public Book(String title, String author) {
		super(title);
		this.author = author;
	}
	
	public void displayBookInfo() {
		super.displayInfo();
		System.out.println("Author : "+ this.author);
	}
	
}

/*
Book (Intermediate Class, inherits from LibraryItem):
Additional Attribute:
author (String): Author of the book.
Additional Method:
displayBookInfo(): This method should call displayInfo() from the LibraryItem class to print the title, and then print the author.
*/