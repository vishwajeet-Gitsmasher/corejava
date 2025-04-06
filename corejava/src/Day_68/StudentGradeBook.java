package Day_68;

import java.util.HashMap;
import java.util.Scanner;

public class StudentGradeBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,String> map = new HashMap<>();
		while(true) {
			System.out.println("1. Add Student Grade");
			System.out.println("2. Remove Student Grade");
			System.out.println("3. Exit");
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("*** Add Student Grade Opeartion *** ");
					System.out.print("Enter Student name : ");
					String name = sc.nextLine();
					name = sc.nextLine();
					System.out.print("Enter Student Grade : ");
					String grade = sc.next();
					if(map.putIfAbsent(name, grade)==null) {
						System.out.println("Student Grade added Successfully.");
					} else {
						System.out.println("Student already exists.");
					}
					System.out.println("Updated Map : "+map);
					break;
				case 2:
					System.out.println("*** Remove Student Grade ***");
					if(map.size()==0) {
						System.out.println("No student present to remove");
					} else {
						System.out.print("Enter name of the student to remove : ");
						String n = sc.nextLine();
						n = sc.nextLine();
						if(map.containsKey(n)) {
							map.remove(n);
							System.out.println("Student with name : "+ n + " is removed Successfully.");
							System.out.println("Updated Map : "+map);
						} else {
							System.out.println("Student with name : "+ n + " is not present.");
						}
					}
					
					break;
				case 3:
					System.out.println("Exiting the application.");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Choice.");		
			}
			
		}

	}

}

/*
1. Add Student Grade
2. Remove Student Grade
3. Exit
Enter your choice : 1
*** Add Student Grade Opeartion *** 
Enter Student name : Rohan
Enter Student Grade : A
Student Grade added Successfully.
Updated Map : {Rohan=A}
1. Add Student Grade
2. Remove Student Grade
3. Exit
Enter your choice : 1
*** Add Student Grade Opeartion *** 
Enter Student name : Deepak
Enter Student Grade : B
Student Grade added Successfully.
Updated Map : {Deepak=B, Rohan=A}
1. Add Student Grade
2. Remove Student Grade
3. Exit
Enter your choice : 2
*** Remove Student Grade ***
Enter name of the student to remove : Rohan
Student with name : Rohan is removed Successfully.
Updated Map : {Deepak=B}
1. Add Student Grade
2. Remove Student Grade
3. Exit
Enter your choice : 3
Exiting the application.


 */

/*
Program 01 
-----------
You have to create a simple Student Grade Book application in Java. The program should allow users to maintain 
a list of students along with their grades, add new students and grades, remove existing students, and exit 
the application.

You are provided with a partially implemented Java program for the Student Grade Book. However, it has 
some issues, and your task is to complete the implementation and ensure that it works correctly.

Requirements:

The program should display the following menu to the user:


Student Grade Book:
(List of students and their grades displayed here)

Options:
1. Add Student Grade
2. Remove Student Grade
3. Exit
Enter your choice:
If the grade book is empty, it should indicate that there are no students and grades to display.
Implement the following functionality for each menu option:

Add Student Grade (Option 1): Allow the user to enter the name of a new student and their grade. Add this 
information to the grade book as a key-value pair (student name as the key and grade as the value). Print 
a confirmation message indicating that the grade has been added for the student.

Remove Student Grade (Option 2): If the grade book is empty, display a message indicating that it's empty. 
Otherwise, allow the user to enter the name of the student whose grade they want to remove. If the student 
exists in the grade book, remove the student and their grade from the grade book and print a confirmation 
message. If the student is not found, print an error message.

Exit (Option 3): Display a farewell message and exit the program.

For any other invalid input, display a message indicating that the choice is invalid and ask the user to 
select a valid option.

The program should run in a continuous loop until the user selects the "Exit" option.

Your Task:

Complete the implementation of the provided Java code.

Ensure that the program handles user input correctly and provides the expected functionality as described 
in the requirements.

Test the program thoroughly to ensure it works as expected.

Submit the complete Java code for the Student Grade Book application.

Note: You can use the provided Java code as a starting point and make any necessary modifications to meet 
the requirements of the problem statement.

*/