package Day_23;

public class Circle {
	double radius;

	public Circle(double radius) {
		super();
		if(radius <=0) {
			System.out.println("Error Invalid Input");
			System.exit(0);
		}
		this.radius = radius;
	}
	
	public Circle() {
		super();
	}
	
	public double getArea() {
		double area = 3.14 * radius * radius;
		return area;
	}
	
}

/*
Que 3 : Circle and Cylinder Shape Calculation Program
======================================================

You are tasked with developing a software application for a company that designs
custom containers. 
The company needs to calculate the surface area of circular bases and the volumes
of cylindrical containers to estimate materials and costs. 
To achieve this, you will create a Java program with the following requirements:


Class Circle is given to you. 
----------------------------

Add below details to the class

1. Instance variables:

radius: double.

2. Create a no constructor that assigns default values to instance variables.

3. Create parameterized constructor that accepts radius.

4. Create below methods,

Method name: getArea

Return type: double

This method should return the area of the circle. Return -1 if radius is negative.

*/