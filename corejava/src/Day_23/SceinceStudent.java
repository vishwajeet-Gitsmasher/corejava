package Day_23;

public class SceinceStudent extends Student{
	private int physicsMarks;
	private int chemistryMarks;
	private int mathMarks;
	
	public SceinceStudent(String name, int rollNumber, int physicsMarks, int chemistryMarks, int mathMarks) {
		super(name, rollNumber);
		if(physicsMarks <0 || chemistryMarks <0 || mathMarks<0) {
			System.out.println("Error Invalid Input");
			System.exit(0);
		}
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathMarks = mathMarks;
	}
	
	public void displayDetails() {
		System.out.println("Science Student Details: ");
		System.out.println("Name : "+super.name);
		System.out.println("Roll Number : "+super.rollNumber);
		System.out.println("Physics Marks : "+this.physicsMarks);
		System.out.println("Chemistry Marks : "+this.chemistryMarks);
		System.out.println("Maths Marks : "+this.mathMarks);
		System.out.println("Percentage : "+ this.calculatePercentage());
	}
	
	public double calculatePercentage() {
		double percentage = (this.physicsMarks + this.chemistryMarks + this.mathMarks)/3;
		return percentage;
	}
}

/*
Define class SceinceStudent extends from Student class
---------------------------------------------------------------
Attributes: private int physicsMarks, private int chemistryMarks, private int mathMarks
Costructor:  A constructor to initialize current class attributes and super class attributes.

Methods: Override displayDetails() a method to display parent class details as well current class details.
         Override calculatePercentage() a method wich will calculate and return percentage.

*/