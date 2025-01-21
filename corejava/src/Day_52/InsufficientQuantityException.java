package Day_52;

public class InsufficientQuantityException extends Exception{

	public InsufficientQuantityException(String msg) {
		super(msg);
	}

}

/*
Ques - 3
--------------
Simple Shopping Application
Objective:
Develop a Java program for a simple shopping application that allows users to add products to a shopping cart and calculate the total price of the items in the cart. You will define custom exceptions for handling specific error cases and implement the necessary classes and methods to support the shopping functionality.

Requirements:
Custom Exceptions:

class InsufficientQuantityException(make it a Checked Exception) :
Methods:
Parameterized Constructor with String as parameter

Purpose : Thrown when the requested quantity of a product is not available.

class InvalidProductException(make it an Unchecked Exception):
Methods:
Parameterized Constructor with String as parameter.

Purpose : Thrown when a product is not found in the inventory.

BLC Product Class:

Attributes:
id: int: representing the product's unique identifier.
name: String: representing the product's name.
price: double: representing the product's price.
quantity: int: representing the available quantity of the product.


Constructor: 
Parameterized Constructor to initialize all the atributes.

methods : 
Method name: decreaseQuantity 
Access Modifier : public
return type : void
parameters : amount: int
Takes an integer amount as a parameter and decreases the product's quantity. Throws InsufficientQuantityException if the requested quantity is not available.

BLC  ShoppingCart Class:
Attributes:
cartItems: Product[] : to store items in the cart.
itemCount: int : An integer representing the number of items in the cart.

Constructor:
parameter : capacity : int 
Initialize the cartItems with a Product[] based on the given 
capacity.

Mehtods:

Method name: addToCart 
Access Modifier : public
return type : void
parameters : Product,int
Adds the product to the cart or updates its quantity.Throws InsufficientQuantityException if the requested quantity is not available, or InvalidProductException if the product is not found.


Method name: calculateTotal 
Access Modifier : public
return type : double
parameters : no param
Method: Calculates and returns the total price of all items in the cart.


ElC ShoppingApplication Class:

Main Method: Demonstrates the shopping application's functionality.
Creates some sample products and a shopping cart with a capacity of 10 products.
Adds products to the cart and handles exceptions as needed.
Calculates and displays the total price of the items in the cart.

Test Cases for Shopping Application
-----------------------------------------
Valid Product Addition:
Action: Add valid quantities of products to the cart.
Expected Output: Total price should be calculated correctly.

Insufficient Quantity:
Action: Attempt to add more quantity of a product than available.
Expected Output: Should throw InsufficientQuantityException with appropriate message.

Invalid Product Addition:
Action: Attempt to add a product that does not exist(i,e null).
Expected Output: Should throw InvalidProductException with appropriate message.

Full Cart:
Action: Attempt to add more products than the cart's capacity.
Expected Output: Should throw InvalidProductException with appropriate message.

Calculate Total with Empty Cart:
Action: Calculate total price with no products added.
Expected Output: Total price should be 0.0.

Calculate Total with Mixed Products:
Action: Add different products and quantities, then calculate total price.
Expected Output: Total price should reflect all products and quantities correctly.

*/