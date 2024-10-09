package Day_6;

public class TotalSurfaceAreaOfCylinder {

	public static void main(String[] args) {
		double r = Double.parseDouble(args[0]);
		double h = Double.parseDouble(args[1]);
		double pi= 3.14;
		double area = 2 * pi * r * r * 2 * pi *  r * h;
		System.out.println("Total Surface Area Of Cylinder = "+ area);
		

	}

}


/*
	5 5
	Total Surface Area Of Cylinder = 24649.0
*/


/*
write a java program to calculate the total surface area of a cylinder? 
Formula- 2 pi square r * 2 pi r h (take the pi as 3.14).
		2 * pi * r * r * 2 * pi *  r * h
*/