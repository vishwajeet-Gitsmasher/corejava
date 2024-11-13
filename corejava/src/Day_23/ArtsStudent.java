package Day_23;

public class ArtsStudent extends Student{
	private int historyMarks;
	private int geographyMarks;
	private int englishMarks;
	
	public ArtsStudent(String name, int rollNumber, int historyMarks, int geographyMarks, int englishMarks) {
		super(name, rollNumber);
		if(historyMarks <0 || geographyMarks <0 || englishMarks<0) {
			System.out.println("Error Invalid Input");
			System.exit(0);
		}

		this.historyMarks = historyMarks;
		this.geographyMarks = geographyMarks;
		this.englishMarks = englishMarks;
	}
	
	public void displayDetails() {
		System.out.println("Arts Student Details: ");
		System.out.println("Name : "+super.name);
		System.out.println("Roll Number : "+super.rollNumber);
		System.out.println("History Marks : "+this.historyMarks);
		System.out.println("Geography Marks : "+this.geographyMarks);
		System.out.println("Cnglish Marks : "+this.englishMarks);
		System.out.println("Percentage : "+ this.calculatePercentage());
	}
	
	public double calculatePercentage() {
		double percentage = (this.historyMarks + this.geographyMarks + this.englishMarks)/3;
		return percentage;
	}
	
}

/*
Define class class ArtsStudent extends from Student class
---------------------------------------------------------
Attributes: private int historyMarks, private int geographyMarks, private int englishMarks

Costructor:  A constructor to initialize current class attributes and super class attributes.

Methods: Override displayDetails() a method to display parent class details as well current class details.
         Override calculatePercentage() a method wich will calculate and return percentage.
*/