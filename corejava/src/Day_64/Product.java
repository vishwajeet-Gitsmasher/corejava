package Day_64;

public class Product implements Comparable<Product> {
	private Integer productNumber;
	private String productName;
	private Double productPrice;
	
	@Override
	public String toString() {
		return "Product [productNumber=" + productNumber + ", productName=" + productName + ", productPrice="
				+ productPrice + "]";
	}

	public Product(Integer productNumber, String productName, Double productPrice) {
		super();
		this.productNumber = productNumber;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	@Override
	public int compareTo(Product p2) {
		return this.productName.compareTo(p2.productName);
	}

}

/*
Program 1:
------------
Write a Program to perform sorting operation on Product class using ArrayList by implementing Comparable interface.

Create a BLC class Product.

Instance variables:
productNumber-private-Integer
productName-private-String
productPrice-private-Double

Create a parameterized constructor to initialize the instance variable of Product class.

Implement Comparable interface to write the logic to sort the Product class based on the Product Name.

Create an ELC class which contains main method, create ArrayList object to hold Product data as well as sort the product data object based on the product name.


*/