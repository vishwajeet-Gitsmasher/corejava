package Day_16;

import java.util.Scanner;

public class BookDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Books = ");
		int num = sc.nextInt();
		while(num>0) {
			System.out.println();
			
			System.out.print("Enter Book Title = ");
			String title = sc.nextLine();
			title = sc.nextLine();
			System.out.print("Enter Book Author = ");
			String author = sc.nextLine();
			//author = sc.nextLine();
			System.out.print("Enter Book Price = ");
			double price = sc.nextDouble();
			
			if(price < 0) {
				System.err.println("Book price cannot be negative");
			} else {
				Book b = new Book(author, author, price);
				System.out.print("Enter Discount Percentage = ");
				int discount = sc.nextInt();
				b.applyDiscount(discount);
				b.printDetails();
				num--;
			}
		}
		sc.close();

	}

}

/*
Enter Number of Books = 1

Enter Book Title = My Wings
Enter Book Author = James Bond
Enter Book Price = 300

Enter Discount Percentage = 10

Book Details
Book Title : James Bond
Book Author : James Bond
Book Price : 270.0

=====================================

Enter Number of Books = 1
Enter Book Title = 1984
Enter Book Author = George Orwell
Enter Book Price = 14.3

Enter Discount Percentage = -15

Error: Invalid discount percentage

Book Details
Book Title : George Orwell
Book Author : George Orwell
Book Price : 14.3

========================================

Enter Number of Books = 1

Enter Book Title = Negative Price Book
Enter Book Author = No Author
Enter Book Price = -50

Book price cannot be negative


*/
