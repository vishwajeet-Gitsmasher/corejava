package Day_38;

public abstract class Food {
	double proteins;
	double fats;
	double carbs;
	double tastyScore;
	
	public Food(double proteins, double fats, double carbs, double tastyScore) {
		super();
		this.proteins = proteins;
		this.fats = fats;
		this.carbs = carbs;
		this.tastyScore = tastyScore;
	}

	public abstract void getMacroNutrients();
	
}

/*
Program 2:
----------
Nutrition in food can be broken down into proteins, fats, and carbohydrates. Implement the following classes about food and nutrition to complete this challenge:

1. abstract class Food with the following properties:

double proteins
double fats
double carbs
double tastyScore
void getMacroNutrients [Abstract Method]

2. class Egg which extends class Food and has the following properties:

Constructor to initialize the attributes (proteins, fats, and carbs) in the same order.
int tastyScore = 7
String type = "non-vegetarian"
void getMacroNutrients => prints("An egg has [this.proteins] gms of protein, [this.fats] gms of fats and [this.carbs] gms of carbohydrates.")

3. class Bread which extends class Food and has the following properties:

Constructor to initialize the attributes (proteins, fats, and carbs) in the same order.
int tastyScore = 8
String type = "vegetarian"
void getMacroNutrients => prints(" A slice of bread has [this.proteins] gms of protein, [this.fats] gms of fats and [this.carbs] gms of carbohydrates.")
 

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