package Day_10;

public class StudentDemo {

	public static void main(String[] args) {
		// Object 1
		Student ram = new Student();
		
		ram.name = "Ram";
		ram.skinColour = "White";
		ram.age = 23;
		
		ram.getInformation();
		ram.talk();
		
		System.out.println("----------------------------");
		
		// Object 2
		Student priti = new Student();
		
		priti.name = "Priti";
		priti.skinColour = "Black";
		priti.age = 24;
		
		priti.getInformation();
		priti.talk();
		

	}

}

/*
Student name : Ram
Student skin colour : White
Student age : 23
Ram is talking
----------------------------
Student name : Priti
Student skin colour : Black
Student age : 24
Priti is talking
*/
