package Day_6;

public class CelsiusToFarenheit {

	public static void main(String[] args) {
		double c = Double.parseDouble(args[0]);
		double f = ((9*c)/5)+32;
		System.out.println("Temperature in farenheit is "+ f);
		System.out.printf("Temprature in Celcius is %.2f",c);

	}

}

/*
	97
	Temperature in farenheit is 206.6
	Temprature in Celcius is 97.00
*/


/*
write Java Program Convert Fahrenheit To Celsius | Vice Versa
Formula-
Celsius=(Fahrenheit-32)*5/9;
Fahrenheit=((9*Celsius)/5)+32;
Note [ Write two seprate program for converting celsius into 
Fahrenheit
and Fahrenheit into celsius ]
*/