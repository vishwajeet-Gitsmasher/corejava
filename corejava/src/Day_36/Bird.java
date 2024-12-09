package Day_36;

public class Bird extends Animal{
	boolean canFly;

	public Bird(String species, boolean canFly) {
		super(species);
		this.canFly = canFly;
	}
	
	public void makeSound() {
		System.out.println("Bird animal sound");
	}

	@Override
	public String toString() {
		return "Bird [canFly=" + canFly + ", species=" + species + "]";
	}
	
	public Animal reproduce() {
		System.out.println("Birds lay eggs as a means of reproduction.");
		return new Bird(super.species,this.canFly);
	}
	
	public void buildNest() {
		System.out.println("birds building nests for their eggs");
	}
}

/*
Subclass - Bird:
---------------------
Create a subclass named Bird that extends the Animal class.
Add an additional attribute:
canFly (boolean): Indicates whether the bird can fly.
Implement a parameterized constructor to initialize the attributes of both the Animal class and the Bird class.

Override the makeSound() and toString() methods in the Bird class.
Override the reproduce()
Similarly, in the Bird subclass, prints the message "Birds lay eggs as a means of reproduction." and returns a new Bird object with the same species and flying ability as the parent bird.

buildNest(): Prints a message about birds building nests for their eggs.
*/