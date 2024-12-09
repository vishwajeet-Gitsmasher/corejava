package Day_35;

public class Shape {
	public static Shape randshape() {
		int n = (int) (Math.random()*3);
		switch(n) {
			case 0:
				return new Circle();
			case 1:
				return new Square();
			case 2:
				return new Triangle();
			default:
				return new Shape();
		}
	}
	
	public void draw() {
		System.out.println("shape draw");
	}
	
	public void erase() {
		System.out.println("Shape erase");
	}
}

/*
Question-1
--------------
Create a BLC class Named as Shape and it have three sub classes named as Circle, Triangle and Square
e for each class have two methods called as draw() and erase()

For Shape class

Methods:
public static Shape randshape()
No Argument constructor
randshape(): Using switch ((int) (Math.random()*3))
case 0: create an object for Circle Object using return
case 1: create an object for Square Object using return
case 2: create an object for Triangle Object using return
default: Print as default message
finally return an object for Shape class
Use this class to test your solution's class and methods in main method

For Shape class
Methods: In draw():void and erase():void and No argument constructor
draw(): print "shape draw"
erase(): print "Shape erase"
*/