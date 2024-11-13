package Day_23;

public class ShapeTester {

	public static void main(String[] args) {
		Cylinder c = new Cylinder(5, 5);
		System.out.println("Volume = "+c.getVolume());
		System.out.println("Area = "+c.getArea());

	}

}

/*
Volume = 392.5
Area = 78.5
*/

/*
An ELC class ShapeTester is given to you with a main method. Use this class to test your
Condition :
-----------
if any numeric value is zero or negative then print "Error Invalid Input".


TEST CASE 1 :
-------------
sample input  : When your reading values for Circle Class OR Cylinder class then make sure if any numeric value is <=0 then print "Error Invalid Input".
                
sample output : Error Invalid Input


TEST CASE 2 :
-------------
sample input  : Cylinder c = new Cylinder(5, 5);
sample output : Volume = 392.5
                Area = 78.5
*/