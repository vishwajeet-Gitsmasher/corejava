package Day_24;

public class Mammal extends Animal{
	private boolean hasFur;

	public Mammal(String name, boolean hasFur) {
		super(name);
		this.hasFur = hasFur;
	}

	public boolean isHasFur() {
		return hasFur;
	}

	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}

	public void displayDetails() {
		System.out.println("Animal name : "+super.getName());
		System.out.println("Animal has fur : "+this.hasFur);
	}
	
}

/*
2. Create the Mammal Class
Requirements:
Extend the Animal class.
Add a private boolean attribute named hasFur.
Implement a parameterized constructor to initialize name (from Animal) and hasFur.
Implement getter and setter methods for hasFur.
Override the displayDetails method to include information about fur.

*/