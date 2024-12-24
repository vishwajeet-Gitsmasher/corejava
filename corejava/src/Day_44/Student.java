package Day_44;

import java.util.Scanner;
import java.util.function.Consumer;

public class Student {
	private int id;
	private String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void updateName(Consumer<String> nameUpdater) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		nameUpdater.accept(name);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}

/*
BLC Class: Student
Create a class Student. This class should include:

Attributes:

int id: private 
String name: private

Constructor:
Student(int, String):
Initializes the id and name attributes of the object.

Method:
void updateName(Consumer<String> nameUpdater):
Accepts a Consumer that updates the name attribute of the object based on the provided logic.
Override toString method to display object details.

*/