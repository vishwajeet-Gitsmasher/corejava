package Day_24;

public class Dog extends Mammal{
	private String breed;

	public Dog(String name, boolean hasFur, String breed) {
		super(name, hasFur);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public void displayDetails() {
		System.out.println("Animal name : "+super.getName());
		if(super.isHasFur() == true) {
			System.out.println("Animal has fur : Yes");
		} else {
			System.out.println("Animal has fur : No");
		}
		System.out.println("Dog breed : "+this.breed);
	}
}

/*
3. Create the Dog Class
Requirements:
Extend the Mammal class.
Add a private String attribute named breed.
Implement a parameterized constructor to initialize name, hasFur (from Mammal), and breed.
Implement getter and setter methods for breed.
Override the displayDetails method to include information about the breed.
*/