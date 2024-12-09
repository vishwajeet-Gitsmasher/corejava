package Day_28;

public class Professor extends Faculty{
	String researchArea;

	public Professor(String name, int id, String department, String researchArea) {
		super(name, id, department);
		this.researchArea = researchArea;
	}
	
	public void conductResearch() {
		System.out.println("Professor research area : "+this.researchArea);
	}
}

/*
Professor Class (Derived from Faculty)

Attributes:

String researchArea: Represents the research area of the professor.

Methods:

Constructor to initialize the name, id, department, and researchArea.

void conductResearch(): Prints the research area of the professor.
*/