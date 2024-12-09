package Day_30;

public class MainDemo {

	public static void main(String[] args) {
		Book b = new Book("Ramayana","Ram",1000);
		b.applyDiscount(10);
		b.getDetails();
		
		System.out.println("==================================================");
		
		EBook eb = new EBook("Wings of fire","APJ",2000,36,"pdf");
		eb.applyDiscount(10);
		eb.getDetails();
		
		System.out.println("==================================================");
		
		AudioBook ab = new AudioBook("Ego","VIRAT",3000,2,"Vishwajeet");
		ab.applyDiscount(10);
		ab.getDetails();
	}

}

/*
Book Title : Ramayana
Book Author : Ram
Book Price : 900.0
==================================================
Book Title : Wings of fire
Book Author : APJ
Book Price : 1800.0
Ebook fileSize : 36.0
Ebook format : pdf
==================================================
Book Title : Ego
Book Author : VIRAT
Book Price : 2700.0
AudioBook duration : 2.0
AudioBook narrator : Vishwajeet

 */

/*
Requirements:
Define the class hierarchy as described above.
Create a main class to demonstrate the functionality of the system:
Create at least one instance of Book, EBook, and AudioBook.
Call the getDetails() method on each instance to display their details.
Apply a discount on one of the books using the applyDiscount() method and verify that the price is updated correctly.
*/