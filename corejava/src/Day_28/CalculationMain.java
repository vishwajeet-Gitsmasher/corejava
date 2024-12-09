package Day_28;

public class CalculationMain {

	public static void main(String[] args) {
		AdvancedCalculation a = new AdvancedCalculation(10,20,30,"+");
		a.performCalculation();
		System.out.println("Advanced Claulation : "+a.performAdvancedCalculation());

	}

}

/*
Addition : 30
Advanced Claulation : 30
*/

/*
In the CalculationMain class:

Create an instance of the AdvancedCalculation class, setting values for all variables.
Demonstrate the use of the performCalculation() method inherited from the superclass.
Demonstrate the use of the performAdvancedCalculation() method from the subclass.
*/