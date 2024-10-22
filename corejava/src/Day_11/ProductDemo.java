package Day_11;

import java.util.Scanner;

public class ProductDemo {

	public static void main(String[] args) {
		Product p = new Product();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Product ID : ");
		int id = sc.nextInt();
		System.out.print("Enter Product Name : ");
		String name = sc.next();
		System.out.print("Enter Product Price : ");
		double price = sc.nextDouble();
		
		p.setProductData(id,name,price);
		p.getProductInfo();

	}

}

/*
Enter Product ID : 123
Enter Product Name : Panasonic
Enter Product Price : 25000
Product ID : 123
Product Name : Panasonic
Product Price : 25000.0
*/
