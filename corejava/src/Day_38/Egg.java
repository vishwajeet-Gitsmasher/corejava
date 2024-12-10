package Day_38;

public class Egg extends Food{
	String type = "non-vegetarian";
	public Egg(double proteins, double fats, double carbs) {
		super(proteins, fats, carbs, 7);
	}

	@Override
	public void getMacroNutrients() {
		System.out.println("An egg has ["+this.proteins+"] gms of protein, ["+this.fats+"] gms of fats and ["+this.carbs+"] gms of carbohydrates.");
		
	}

	public String getType() {
		return "Egg is "+this.type;
	}
	
	public double getTaste() {
		return super.tastyScore;
	}
}

/*
2. class Egg which extends class Food and has the following properties:

Constructor to initialize the attributes (proteins, fats, and carbs) in the same order.
int tastyScore = 7
String type = "non-vegetarian"
void getMacroNutrients => prints("An egg has [this.proteins] gms of protein, [this.fats] gms of fats and [this.carbs] gms of carbohydrates.")


*/