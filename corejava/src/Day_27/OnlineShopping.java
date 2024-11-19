package Day_27;

import java.util.Scanner;

public class OnlineShopping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. Electronics");
			System.out.println("2. Clothing");
			System.out.println("3. Exit");
			System.out.print("Enter your choice = ");1
			int choice = sc.nextInt();
			if(choice == 1) 
			{
				System.out.print("Enter Product name = ");
				String name = sc.next();
				System.out.print("Enter Product price = ");
				double price = sc.nextDouble();
				System.out.print("Enter Product brand = ");
				String brand = sc.next();
				Electronics E = new Electronics(name, price, brand);
				E.displayInfo();
				System.out.print("Enter Quantity = ");
				int quantity = sc.nextInt();
				System.out.println("Total cost : "+ E.calculateTotalCost(quantity));
			}else if(choice == 2) {
				System.out.print("Enter Product name = ");
				String name = sc.next();
				System.out.print("Enter Product price = ");
				double price = sc.nextDouble();
				System.out.print("Enter Product size = ");
				String size = sc.next();
				Clothing C = new Clothing(name, price, size);
				C.displayInfo();
				System.out.print("Enter Quantity = ");
				int quantity = sc.nextInt();
				System.out.println("Total cost : "+ C.calculateTotalCost(quantity));
				System.out.println();
				System.out.println();
			} else if(choice == 3){
				return;
			} else {
				System.out.println("Invalid Choice");
			}
		}
	}
}
/*
1. Electronics
2. Clothing
3. Exit
Enter your choice = 1
Enter Product name = LED
Enter Product price = 45000
Enter Product brand = Samsung
Product name : LED
Product price : 45000.0
Product brand : Samsung
Enter Quantity = 2
Total cost : 90000.0

==============================
1. Electronics
2. Clothing
3. Exit
Enter your choice = 2
Enter Product name = Shirt
Enter Product price = 2000
Enter Product size = M
Product name : Shirt
Product price : 2000.0
Product size : M
Enter Quantity = 2
Total cost : 4000.01

====================================

1. Electronics
2. Clothing
3. Exit
Enter your choice = 3

========================================

1. Electronics
2. Clothing
3. Exit
Enter your choice = 4
Invalid Choice
 */

/*
Create a class named OnlineShopping (as provided in the code):
In the main method, create instances of both Electronics and Clothing with appropriate values.
Print information about each product, including their specific attributes.
Calculate and print the total cost for a given quantity of each product.
*/
