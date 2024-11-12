package Day_22;

public class LibraryItem {
	String title;

	public LibraryItem(String title) {
		super();
		this.title = title;
	}
	
	public void displayInfo(){
		System.out.println("Title : "+this.title);
	}
}

/*
2) Library System with Multilevel Inheritance
Problem Statement:
You are required to create a simple library system to manage different types of library items. The system should use multilevel inheritance to manage information about generic library items, books, and ebooks.

LibraryItem (Base Class):

Attributes:
title (String): Title of the library item.
Methods:
displayInfo(): This method should print the title of the library item.


Book (Intermediate Class, inherits from LibraryItem):
Additional Attribute:
author (String): Author of the book.
Additional Method:
displayBookInfo(): This method should call displayInfo() from the LibraryItem class to print the title, and then print the author.


*/