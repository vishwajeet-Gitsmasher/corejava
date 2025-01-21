package Day_52;

public class ShoppingApplication {

	public static void main(String[] args) {
		ShoppingCart s = new ShoppingCart(3);
		Product p = new Product(1,"TV",5000,1);
		Product p1 = new Product(2,"Fridge",2000,2);
		Product p2 = new Product(3,"Mobile",3000,2);
		
		try {
			s.addToCart(p,1);
			s.addToCart(p1,1);
			s.addToCart(p2,2);
			//s.addToCart(p,1);
			
			System.out.println("Cart :");
			for(Product product:s.cartItems) {
				
				System.out.println(product);
			}
			System.out.println("Total Items in the Cart is : "+s.itemCount);
			System.out.println("Total Cost Of Cart : "+s.calculateTotal());
			
		} catch(InvalidProductException e) {
			System.out.println(e.getMessage());
		} catch(InsufficientQuantityException e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}

/*
Cart :
Product [id=1, name=TV, price=5000.0, quantity=1]
Product [id=2, name=Fridge, price=2000.0, quantity=1]
Product [id=3, name=Mobile, price=3000.0, quantity=2]
Total Items in the Cart is : 4
Total Cost Of Cart : 13000.0

 */

/*
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