package Day_64;

import java.util.ArrayList;
import java.util.Collections;


public class ELC_Class {

	public static void main(String[] args) {
		ArrayList<Product> listOfProduct = new ArrayList<Product>();
		listOfProduct.add(new Product(333, "Laptop",10d));
		listOfProduct.add(new Product(111, "Mobile",20d));
		listOfProduct.add(new Product(222, "Camera",30d));

		Collections.sort(listOfProduct);
		for(Product p:listOfProduct) {
			System.out.println(p);
		}
	}

}

/*
Product [productNumber=222, productName=Camera, productPrice=30.0]
Product [productNumber=333, productName=Laptop, productPrice=10.0]
Product [productNumber=111, productName=Mobile, productPrice=20.0]
 */

// Create an ELC class which contains main method, create ArrayList object to hold Product data as well as 
// sort the product data object based on the product name.
