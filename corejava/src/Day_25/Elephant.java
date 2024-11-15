package Day_25;

public class Elephant extends Animal{
	private float tuskLength;

	public Elephant(String name, int age, float tuskLength) {
		super(name, age);
		if(tuskLength <=0) {
			System.err.println("Error Invalid Input");
			System.exit(0);
		}
		this.tuskLength = tuskLength;
	}
	
	public void makeSound() {
		System.out.println("The elephant trumpets.");
	}
	
	public void  displayTuskLength() {
		System.out.println("Elephant tuskLength : "+this.tuskLength + "meters");
	}
	
}

/*
Create another subclass named Elephant:
---------------------------------------
Extend the Animal class.
Add a private instance variable tuskLength (float).
Implement a constructor that takes name, age, and tuskLength as parameters and initializes the superclass constructor.
Define a method  the makeSound() method to print "The elephant trumpets."
Define a method displayTuskLength() that prints the tuskLength.
*/