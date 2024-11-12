package Day_22;

public class Ebook extends Book{
	String fileFormat;

	public Ebook(String title, String author, String fileFormat) {
		super(title, author);
		this.fileFormat = fileFormat;
	}
	
	public void displayEbookInfo() {
		super.displayBookInfo();
		System.out.println("File Format : "+this.fileFormat);
	}
	
}

/*
Ebook (Derived Class, inherits from Book):
Additional Attribute:
fileFormat (String): File format of the ebook (e.g., PDF, EPUB).
Additional Method:
displayEbookInfo(): This method should call displayBookInfo() from the Book class to print the 
title and author, and then print the file format.

*/