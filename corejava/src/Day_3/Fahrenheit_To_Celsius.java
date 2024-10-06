package Day_3;

public class Fahrenheit_To_Celsius {

	public static void main(String[] args) {
		double f = Double.parseDouble(args[0]);
		double c = ((f-32)*5)/9;
		System.out.println("Temprrature in Celcius is "+ c);
		System.out.printf("Temprature in Celcius is %.2f",c);
	}

}

/*
	Temperature in Celsius is 37.77777777777778
	Temperature in Celsius is 37.78
*/
