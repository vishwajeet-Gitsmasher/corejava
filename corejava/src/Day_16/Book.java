package Day_16;

public class Book {
	public String title;
	public String author;
	public double price;
	
	public Book(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void printDetails() {
		System.out.println("Book Details");
		System.out.println("Book Title : "+this.title);
		System.out.println("Book Author : "+this.author);
		System.out.println("Book Price : "+this.price);
	}
	
	public void applyDiscount(double discountPercentage) {
		if(discountPercentage < 0 ) {
			System.err.println("Error: Invalid discount percentage");
			return;
		}
		this.price = this.price - (this.price*discountPercentage/100);
	}
	
	
	
}
/*
Design a Book printing System

Create a class  Book (BLC Class)

Attributes :

Name		     data type 
-------		      -----------
title                 : String
author       	      :author
price 		      :double

Acess modifier :public(for all varriables)

take a constructor to initialize all the varriables

Methods :

Method Name		:printDetails
Return type		:void
Acess modifier	:public


Method Name		:applyDiscount(double discountPercentage)
Return type		:void
Acess modifier	:public


Take Main class (ELC Class) which having in main method  and execute the main method


Test Cases :
--------------

Test Case 1:
 Applying Invalid Discount (Negative)

Error: Invalid discount percentage.
Title: 1984
Author: George Orwell
Price: ?14.391

Test Case 2: Creating Book with Negative Price
Title: Negative Price Book
Author: No Author
Price: ?-5.0

*/