package Day_23;

public class Cylinder extends Circle{
	double height;

	public Cylinder(double radius, double height) {
		super(radius);
		if(height <=0) {
			System.out.println("Error Invalid Input");
			System.exit(0);
		}
		this.height = height;
	}
	
	public Cylinder() {
		super();
	}
	
	public double getVolume() {
		double volume = 3.14 * super.radius * super.radius * this.height;
		return volume;
	}
}

/*
 * Create a sub class of Circle with name Cylinder 
-----------------------------------------------

Add below details to the class

1. Instance variables:

height: double.

2. Create a No constructor that assigns default values to instance variables.

3. Create parameterized constructor that accepts radius, height.

4. Create below methods,

Method name: getVolume

Return type: double

This method should return the volume of the cylinder. Return -1 if height is negative.




*/
