package Day_44;

import java.util.function.Consumer;

public class ObjectCreatorMain{
	public static void main(String[] args) {
		
		ObjectCreator<String> CustomObject = (id,name) ->{
			return new Student(id,name);
		};
		
		Student student = (Student) CustomObject.create(1,"John doe");
		System.out.println(student);
		
		Consumer<String> nameUpdater = newname -> {
			student.setName(newname);
		};
		
		student.updateName(nameUpdater);
		System.out.println(student);
		
		Student s2 = (Student) CustomObject.create(2,"Alice");
		System.out.println(s2);
		s2.updateName(nameUpdater);
		System.out.println(s2);
	}
}

/*
Main Class: ObjectCreatorMain
In the main method of the ObjectCreatorMain class:

Define and use a lambda expression to instantiate a CustomObject using the ObjectCreator interface. The lambda should return  an object of Student with id and name.
Call create method and store the object.

Use a Consumer lambda expression to update the name attribute of the created Student object. The Consumer should modify the name to include a suffix or any transformation logic.

Print the details of the updated Student instance to verify its attributes.

Test Case 1: Basic Creation and Update
Input:
id: 1
name: "John Doe"
Operation:
Update the name to "Jane Updated"
Expected Output:
Updated Student Details:
Student{id=1, name='Jane Updated'}

Test Case 2: Different Name Update
Input:
id: 2
name: "Alice"
Operation:
Update the name to "Alice Johnson"
Expected Output:
Updated Student Details:
Student{id=2, name='Alice Johnson'}

Test Case 3: No Name Update
Input:
id: 3
name: "Bob"
Operation:
No update applied
Expected Output:
Updated Student Details:
Student{id=3, name='Bob'}
*/