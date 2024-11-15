package Day_25;

public class OnlineShopping {
	public static void main(String [] args) {
		Electronics electronics =  new Electronics("Laptop",1200,"Dell");
		electronics.displayInfo();
		System.out.println("Total Cost for 2 units : "+electronics.calculateTotalCost(2));
		System.out.println(electronics);
		
		System.out.println("=============================================================");
		
		Clothing clothing = new Clothing("T-Shirt", 25, "Medium");
		clothing.displayInfo();
		System.out.println("Total Cost for 3 units : "+clothing.calculateTotalCost(3));
		System.out.println(clothing);
	}
}

/*
Electronics Details:
Product name : Laptop
Product price : $ 1200.0
Electronics brand : Dell
Total Cost for 2 units : 2400.0
Electronics [name=Laptop, price=1200.0, brand=Dell]
=============================================================
Clothing Details:
Product name : T-Shirt
Product price : $ 25.0
Clothing size : Medium
Total Cost for 3 units : 75.0
Clothing [name=T-Shirt, price=25.0, size=Medium]

 */

/*
Create a class named OnlineShopping (as provided in the code):
--------------------------------------------------------------
In the main method, create instances of both Electronics and Clothing with appropriate values.
Print information about each product, including their specific attributes.
Calculate and print the total cost for a given quantity of each product.

Your task is to implement the required classes based on the provided problem description. This will help you practice inheritance concepts.

Note-Implement toString() in all the BLC classes to print the data of the corresponding objects.

Condition :
-----------
if any numeric value is zero or negative then print "Error Invalid Input".


TEST CASE 1 :
-------------
sample input  : When your reading numeric values for any above Classe then make sure if any numeric value is <=0 then print "Error Invalid Input".
                
sample output : Error Invalid Input



TEST CASE 2 :
-------------
sample input :
               Electronics Product:
               Name: "Laptop"
               Price: $1200.00
               Brand: "Dell"
               Quantity: 2
               
               Clothing Product:
               Name: "T-Shirt"
               Price: $25.00
               Size: "Medium"
               Quantity: 3

sample output : 
               Electronics Details:
               Product Name: Laptop
               Price: $1200.0
               Brand: Dell
               Total Cost for 2 units: $2400.0
               Electronics [name=Laptop, price=1200.0, brand=Dell]
               
               Clothing Details:
               Product Name: T-Shirt
               Price: $25.0
               Size: Medium
               Total Cost for 3 units: $75.0
               Clothing [name=T-Shirt, price=25.0, size=Medium]
*/