package Day_38;

public class Testing {

	public static void main(String[] args) {
		int n = 0;
		Bread b = new Bread(4,1.1,13.8);
		n++;
		System.out.println(n);
		System.out.println(b.getType());
		b.getMacroNutrients();
		System.out.println(b.getTaste());
		
		System.out.println("=======================================================");
		
		Egg e = new Egg(5,2.1,17.8);
		n++;
		System.out.println(n);
		System.out.println(e.getType());
		e.getMacroNutrients();
		System.out.println(e.getTaste());
	}

}

/*
1
Bread is vegetarian
An Bread has [4.0] gms of protein, [1.1] gms of fats and [13.8] gms of carbohydrates.
8.0
=======================================================
2
Egg is non-vegetarian
An egg has [5.0] gms of protein, [2.1] gms of fats and [17.8] gms of carbohydrates.
7.0

 */

/*
Create an ELC class Testing
The first line contains an integer, n, the number of food items.

Every food item takes input in the next 4 lines where the first line is the name of the food and the next three lines are method calls (getType, getTaste, and getMacros) 

Input :-
1
Bread
getType
getMacros
getTaste
Output :-

Bread is vegetarian
A slice of bread has 4.0 gms of protein, 1.1 gms of fats and 13.8 gms of carbohydrates.
Taste: 8
*/