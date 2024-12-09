package Day_36;

public class Mammal extends Animal{
	boolean hasFur;

	public Mammal(String species, boolean hasFur) {
		super(species);
		this.hasFur = hasFur;
	}
	
	public void makeSound() {
		System.out.println("Mammal animal sound");
	}

	@Override
	public String toString() {
		return "Mammal [hasFur=" + hasFur + ", species=" + species + "]";
	}

	public Animal reproduce() {
		System.out.println("Mammals give birth to live young.");
		return new Mammal(super.species,this.hasFur);
	}
	
	public void nurseYoung() {
		System.out.println("mammals nursing their young");
	}
}

/*
Subclass - Mammal:
---------------------

Create a subclass named Mammal that extends the Animal class.
Add an additional attribute:
hasFur (boolean): Indicates whether the mammal has fur.
Implement a parameterized constructor to initialize the attributes of both the Animal class and the Mammal class.

Override the makeSound() and toString() methods in the Mammal class.
@Override reproduce(): 
In the Mammal subclass, the reproduce() prints the message "Mammals give birth to live young." and returns a new Mammal object with the same species and fur attribute as the parent mammal.  

Implement an additional method:
nurseYoung(): Prints a message about mammals nursing their young.
*/