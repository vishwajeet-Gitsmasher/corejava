package Day_38;

public class Bread extends Food{
	String type = "vegetarian";
	
	public Bread(double proteins, double fats, double carbs) {
		super(proteins, fats, carbs, 8);
	}

	@Override
	public void getMacroNutrients() {
		System.out.println("An Bread has ["+this.proteins+"] gms of protein, ["+this.fats+"] gms of fats and ["+this.carbs+"] gms of carbohydrates.");
	}
	
	public String getType() {
		return "Bread is "+this.type;
	}
	
	public double getTaste() {
		return super.tastyScore;
	}
	
}

/*
3. class Bread which extends class Food and has the following properties:

Constructor to initialize the attributes (proteins, fats, and carbs) in the same order.
int tastyScore = 8
String type = "vegetarian"
void getMacroNutrients => prints(" A slice of bread has [this.proteins] gms of protein, [this.fats] gms of fats and [this.carbs] gms of carbohydrates.")
 
*/