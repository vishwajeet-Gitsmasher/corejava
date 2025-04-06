package Day_70;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class RetrieveObject {

	public static void main(String[] args) {
		try {
			String path = "C:\\Users\\Vishwajeet Walekar\\OneDrive\\Desktop\\Images\\Student.txt";
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Student s = null;
			while((s = (Student) ois.readObject())!=null) {
				System.out.println(s);
			}
		} catch(Exception e) {
			System.err.println("End of file reached.");
		}

	}

}
/*
Student [studentId=1, studentName=Virat, studentFees=23000.0, dateOfAdmission=2000-12-01]
Student [studentId=2, studentName=Rohit, studentFees=35000.0, dateOfAdmission=2003-10-12]
Student [studentId=3, studentName=Dhoni, studentFees=12000.0, dateOfAdmission=2004-11-23]
End of file reached.
 */

/*
Take another ELC class RetrieveObject
This class will retrieve the Student Object from file and print the 
Student information data.
*/