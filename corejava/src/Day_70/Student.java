package Day_70;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.Scanner;

public class Student implements Serializable {
	private Integer studentId;
	private String studentName;
	private Double studentFees;
	private Date dateOfAdmission;
	
	public Student(Integer studentId, String studentName, Double studentFees, Date dateOfAdmission) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
		this.dateOfAdmission = dateOfAdmission;
	}
	
	public static Student getStudentObject() throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student ID : ");
		Integer id = sc.nextInt();
		System.out.print("Enter Student Name : ");
		String name = sc.nextLine();
		name = sc.nextLine();
		System.out.print("Enter Student Fess : ");
		Double fees = sc.nextDouble();
		System.out.print("Enter Student Date of Admission : ");
		String date = sc.nextLine();
		date = sc.nextLine();
		Date d = Date.valueOf(date);
		
		return new Student(id,name,fees,d);
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFees=" + studentFees
				+ ", dateOfAdmission=" + dateOfAdmission + "]";
	}
	

}

/*
Program: 1
----------------
Write a Program in Java to Perform Serialization and De-serialization
operation on ArrayList Object.
Take a BLC class Student
Instance variables
studentId – private – Integer
studentName – private – String
studentFees – private – Double
dateOfAdmission – private – Date
Take a parameterized constructor to initialize the instance variables
Take a Method getStudentObject()
Method Name - getStudentObject()
Parameter - No Parameter
Access Modifier - public and static
Return type - Student
This method should take the Student data from client, create and 
return Student object from this method.

Override toString() method to print Student class properties or 
variables.
Take an ELC class StoreObject
Inside the main method create a for loop which will read the Student 
object with user choice and Store the Student object to a file called 
Student.txt
Take another ELC class RetrieveObject
This class will retrieve the Student Object from file and print the 
Student information data.

*/