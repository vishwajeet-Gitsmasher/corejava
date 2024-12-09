package Day_30;

public class Book {
	String title;
	String author;
	double price;
	
	public Book(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void getDetails() {
		System.out.println("Book Title : "+this.title);
		System.out.println("Book Author : "+this.author);
		System.out.println("Book Price : "+this.price);
	}
	
	public void applyDiscount(double percentage) {
		this.price -= (this.price * percentage)/100;
	}
	
}

/*
Program 1 : (10 points))Hierarchical Inheritance
--------------------------------------------------------------------------------------------

Base Class: Book
The Book class represents the common properties and behavior of all books.

Attributes:

String title: Represents the title of the book.
String author: Represents the author of the book.
double price: Represents the price of the book.
Constructor:

A parameterized constructor to initialize the title, author, and price attributes.
Methods:

void getDetails(): Prints the details of the book, including title, author, and price.
void applyDiscount(double percentage): Applies a discount on the book's price based on the given percentage.

*/