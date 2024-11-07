package Day_20;

public class Circle extends Shape{
	double radius;

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}
	
	public double area() {
		double area = 3.14 * radius * radius;
		return area;
	}
}
