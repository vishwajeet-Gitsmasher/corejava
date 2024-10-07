package Day_4;

public class Selling_Price_Of_Cycle {

	public static void main(String[] args) {
		int buy = 1200;
		int repair = 250;
		int coloring = 350;
		int accesories = 500;
		int profit = 1500;
		int cost = buy + repair + coloring + accesories;
		int sellingPrice = cost + profit;
		System.out.println("Selling price of cycle is : "+ sellingPrice);
	}

}

/*
	Selling price of cycle is : 3800
*/

/*
Program-2
----------
Rohan purchased an old cycle for Rs. 1200 and spend Rs. 250 on repairs, Rs. 350 in
coloring and added new accessories worth Rs. 500. Rohan wants to make a profit of
Rs. 1500 on selling the cycle. Find the selling price of the cycle. Write a java
program to store all values and calculate and display the selling price.
*/