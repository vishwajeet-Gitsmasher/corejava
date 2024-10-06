package Day_1;

import java.util.Scanner;

public class Area_Of_Circle {

	public static void main(String[] args) {
		int radius = Integer.parseInt(args[0]);
		double pie = 3.14;
		System.out.println("Area of Circle = "+ (pie*(radius*radius)));

	}

}

/*
	Area of Circle = 314.0
*/

/*
 	BY USING SCANNER CLASS
	package Day_1;
	import java.util.Scanner;
	public class Area_Of_Circle {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Radius of cirle ");
			int radius = sc.nextInt();
			double pie = 3.14;
			System.out.println("Area of Circle = "+ (pie*(radius*radius)));
		}
	}
*/

/*
	Enter Radius of cirle 
	10
	Area of Circle = 314.0
*/
