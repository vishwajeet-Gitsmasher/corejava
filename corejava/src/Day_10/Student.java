package Day_10;

public class Student {
	// Properties
	String name;
	String skinColour;
	int age;
	
	// Behavior
	public void getInformation() {
		System.out.println("Student name : "+name);
		System.out.println("Student skin colour : "+skinColour);
		System.out.println("Student age : "+age);
	}
	
	public void talk() {
		System.out.println(name +" is talking");
	}
}
