package Day_25;

public class Lion extends Animal{
	private int maneLength;

	public Lion(String name, int age, int maneLength) {
		super(name, age);
		if(maneLength <=0) {
			System.err.println("Error Invalid Input");
			System.exit(0);
		}
		this.maneLength = maneLength;
	}
	
	public void makeSound() {
		System.out.println("The lion roars loudly.");
	}
	
	public void displayManeLength() {
		System.out.println("Animal mane Length : "+this.maneLength +" cm");
	}
	
}

/*
Create a subclass named Lion:
-----------------------------
Extend the Animal class.
Add a private instance variable maneLength (int).
Implement a constructor that takes name, age, and maneLength as parameters and initializes the superclass constructor.
Define a method makeSound() method to print "The lion roars loudly."
Define a method displayManeLength() that prints the maneLength.
*/
