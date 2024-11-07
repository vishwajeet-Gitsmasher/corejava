package Day_20;

public class Tester1 {

	public static void main(String[] args) {
		Circle c = new Circle("red", 2);
		c.displayColor();
		System.out.println("Area ="+c.area());
	}
}
/*
color = red
Area =12.56
*/

/*
2)create base class as Shape

Attribute :-
--------------

string color


define parametrized constructor to initialize the  instance variable

method:-
---------
return type:-void
method name:- displayColor
behavior:- this method will print the color of a shape

-----------

create derived class name as Circle

Attribute :-

double radius 


define parametrized constructor to initialize the  instance variable
and also parent class properties


method:-

method:-
---------
return type:-double
method name:- area
behavior:- this method will calculate the area of circle and return the area

------------------------------

define Tester class here use main method to test  your logic
*/