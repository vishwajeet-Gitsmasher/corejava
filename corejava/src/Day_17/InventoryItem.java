package Day_17;

public class InventoryItem {
	private String itemName;
	private double pricePerUnit;
	private int quantityInStock;
	
	public InventoryItem(String itemName, double pricePerUnit, int quantityInStock) {
		if(itemName == null || itemName.length()==0 || pricePerUnit <0 || quantityInStock<0) {
			System.err.println("Error : invalid Input");
			return;
		}
		this.itemName = itemName;
		this.pricePerUnit = pricePerUnit;
		this.quantityInStock = quantityInStock;
		System.out.println("Total Value of "+getItemName() + " in Stock: "+ calculateTotalValue());
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		if(itemName.length()==0) {
			System.err.println("Error : invalid Name.");
			return;
		}
		this.itemName = itemName;
	}
	public double getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(double pricePerUnit) {
		if(pricePerUnit <0) {
			System.err.println("Error : invalid price.");
			return;
		}
		this.pricePerUnit = pricePerUnit;
	}
	public int getQuantityInStock() {
		return quantityInStock;
	}
	public void setQuantityInStock(int quantityInStock) {
		if(quantityInStock<0) {
			System.err.println("Error : invalid Quantity.");
			return;
		}
		this.quantityInStock = quantityInStock;
	}
	
	public double calculateTotalValue() {
		double Amount = this.pricePerUnit * this.quantityInStock;
		return Amount;
		
	}
}

/*
Design a inventory system for a retail store :

InventoryItem Class: [BLC Class]

Create an InventoryItem class with the following 
 
Attributes:
--------------
Names			dataType
---------		-----------
itemName        	String 
pricePerUnit    	double 
quantityInStock 	int 

Implement a constructor that takes parameters to initialize the attributes of the InventoryItem object.

Provide getter and setter methods for each attribute to ensure proper encapsulation.

 Method:
-------------
MethodName  		:calculateTotalValue()
Return Type		:double
Access Modifier 	:public

This method should calculate and return the total value of the inventory item in stock, which is the product of the price per unit and the quantity in stock.


Take a InventoryMain class (ELC Class) which is having  main method to  Create instances of the InventoryItem class, perform calculations, and display relevant information such as the total value of the item in stock and whether a reorder is required.

Taste Case -1
-----------------
Sample Input :

Item Name: "Apples"
Price per Unit: 10
Quantity in Stock: 15

Expected Output: 
Total Value of Apples in Stock: 150

Test Case 2:
--------------- 
Sample Input:

Item Name: "Oranges"
Price per Unit: -5.0
Quantity in Stock: 20

Expected Output: 
Error message indicating invalid price.

Test Case 3: 
---------------
Sample Input :

Item Name: "Bananas"
Price per Unit: 5.0
Quantity in Stock: -10

Expected Output:
 Error message indicating invalid quantity.

Test Case 4 :
--------------- 
sample input :

Item Name: ""
Price per Unit: 8.0
Quantity in Stock: 10

Expected Output:
 Error message indicating invalid item name.

*/