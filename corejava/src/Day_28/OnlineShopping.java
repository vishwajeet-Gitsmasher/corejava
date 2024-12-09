package Day_28;

public class OnlineShopping {

	public static void main(String[] args) {
		Electronics e = new Electronics("TV",45000,"Panasonic");
		e.displayInfo();
		System.out.println("Amount : "+e.calculateTotalCost(2));
		
		System.out.println("==========================");
		
		Clothing c = new Clothing("Max",2000,"XL");
		c.displayInfo();
		System.out.println("Amount : "+c.calculateTotalCost(2));

	}

}

/*
Product name : TV
Product price : 45000.0
Product brand : Panasonic
Amount : 90000.0
==========================
Product name : Max
Product price : 2000.0
Clothing Size : XL
Amount : 4000.0
 */


/*
Create a class named OnlineShopping (as provided in the code):

In the main method, create instances of both Electronics and Clothing with appropriate values.
Print information about each product, including their specific attributes.
Calculate and print the total cost for a given quantity of each product.

Your task is to implement the required classes based on the provided problem description. This will help you practice inheritance concepts.

*/