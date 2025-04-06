package Day_70;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class StoreObject {

	public static void main(String[] args) throws IOException, ParseException {
		ArrayList<Student> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many objects you want to store : ");
		int limit = sc.nextInt();

		for(int i=0;i<limit;i++) {
			Student s = Student.getStudentObject();
			list.add(s);
		}
		String path = "C:\\Users\\Vishwajeet Walekar\\OneDrive\\Desktop\\Images\\Student.txt";
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		for(Student s:list) {
			oos.writeObject(s);
		}
		System.out.println("Object Data Stored Successfully.");
		
		System.out.println(list);
	}

}

/*
Enter how many objects you want to store : 3
Enter Student ID : 1
Enter Student Name : Virat
Enter Student Fess : 23000
Enter Student Date of Admission : 2000-12-01
Enter Student ID : 2
Enter Student Name : Rohit
Enter Student Fess : 35000
Enter Student Date of Admission : 2003-10-12
Enter Student ID : 3
Enter Student Name : Dhoni
Enter Student Fess : 12000
Enter Student Date of Admission : 2004-11-23
Object Data Stored Successfully.
[Student [studentId=1, studentName=Virat, studentFees=23000.0, dateOfAdmission=2000-12-01], Student [studentId=2, studentName=Rohit, studentFees=35000.0, dateOfAdmission=2003-10-12], Student [studentId=3, studentName=Dhoni, studentFees=12000.0, dateOfAdmission=2004-11-23]]

 */

/*
Take an ELC class StoreObject
Inside the main method create a for loop which will read the Student 
object with user choice and Store the Student object to a file called 
Student.txt


*/