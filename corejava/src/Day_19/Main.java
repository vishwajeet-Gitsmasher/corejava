package Day_19;

class Animal {
	int legs = 4;
	static int teeth = 32;
	void eat() {
		System.out.println("This animal eats food.");
	}
}

class Dog extends Animal{
	void bark() {
		int bow = 209;
		System.out.println(bow);
		System.out.println("The dog barks.");
	}
}

public class Main{
	public static void main(String[] args) {
		Dog d = new Dog();
		System.out.println(d.legs);
		System.out.println(d.teeth);
		d.bark();
		d.eat();
		Dog d2=d;
		
	}
}


/*
4
32
209
The dog barks.
This animal eats food.
 */



/*
Q1 )  create base class Animal 

Attributes:-

No Attributes

methods:-

return type :- void
method Name :- eat
behavior of eat method:- this method will print the message that "This animal eats food."
------
create derived class name as Dog inherit from Animal

Attribute:-

No Attributes


methods:-

return type :- void
method Name :- bark
behavior of bark method:- this method will print the Message "The dog barks."

------
create main class to test your logic 
create object initialize the values and call the method
*/