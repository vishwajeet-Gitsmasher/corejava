package Day_17;

import java.util.Scanner;

public class InventoryMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Inventory Details count = ");
		int quantity = sc.nextInt();
		while(quantity>0) {
			System.out.println("Enter Inventory Details");
			System.out.print("Enter item Name = ");
			String itemName = sc.nextLine();
			itemName = sc.nextLine();
			System.out.print("Enter price Per Unit = ");
			double pricePerUnit = sc.nextDouble();
			System.out.print("Enter quantity In Stock = ");
			int quantityInStock = sc.nextInt();
			
			InventoryItem I = new InventoryItem(itemName, pricePerUnit, quantityInStock);
			quantity--;
		}
		sc.close();

	}

}

/*
Enter Inventory Details count = 1
Enter Inventory Details
Enter item Name = Apple
Enter price Per Unit = 10
Enter quantity In Stock = 15
Total Value of Apple in Stock: 150.0

==========================================

Enter Inventory Details count = 1
Enter Inventory Details
Enter item Name = Sadwich
Enter price Per Unit = -27
Enter quantity In Stock = 23
Error : invalid Input

==========================================

Enter Inventory Details count = 1
Enter Inventory Details
Enter item Name = 
Enter price Per Unit = 67
Enter quantity In Stock = 78
Error : invalid Input

===========================================

Enter Inventory Details count = 1
Enter Inventory Details
Enter item Name = Tea
Enter price Per Unit = 10
Enter quantity In Stock = -29
Error : invalid Input

*/
