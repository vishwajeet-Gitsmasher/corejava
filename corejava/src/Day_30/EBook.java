package Day_30;

public class EBook extends Book{
	double fileSize;
	String format;
	
	public EBook(String title, String author, double price, double fileSize, String format) {
		super(title, author, price);
		this.fileSize = fileSize;
		this.format = format;
	}
	
	public void getDetails() {
		super.getDetails();
		System.out.println("Ebook fileSize : "+this.fileSize);
		System.out.println("Ebook format : "+this.format);
		
	}
}

/*
Subclass: EBook
The EBook class extends the Book class and represents electronic books.

Additional Attributes:

double fileSize: Represents the size of the eBook file in megabytes (MB).
String format: Represents the file format of the eBook (e.g., PDF, EPUB).
Constructor:

A parameterized constructor to initialize the attributes of both the parent class (Book) and the subclass (EBook).
 Methods:

void getDetails(): Displays all the details of the book, including the fileSize and format.
*/