package Day_51;

public class ShoppingCartScenario {

	public static void main(String[] args) {
		ShoppingCart s = new ShoppingCart(50);
		int finalCart = 0;
		try {
			finalCart += s.addItem(10);
			finalCart += s.addItemUnchecked(10);
			System.out.println("Final cart Items : "+finalCart);
		} catch(InvalidItemException e) {
			System.out.println(e.getMessage());
		} catch(OutOfStockException e) {
			System.out.println(e.getMessage());
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

// Final cart Items : 20

/*

* Main Class (ShoppingCartScenario):

-> In the main method, create an instance of ShoppingCart with an initial stock of 50 items.
-> Demonstrate the use of addItem for valid and invalid quantities, handling the InvalidItemException.
-> Demonstrate the use of addItemUnchecked for valid and invalid quantities, handling both IllegalArgumentException and
OutOfStockException.

Note: Ensure that the program provides clear error messages and handles exceptions appropriately.
*/