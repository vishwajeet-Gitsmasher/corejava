package Day_23;

public class StudentDemo {

	public static void main(String[] args) {
		SceinceStudent scienceStudent = new SceinceStudent("Anjali", 101, 85, 90, 80);
		scienceStudent.displayDetails();
		
        ArtsStudent artsStudent = new ArtsStudent("Aryan", 102, 75, 80, 85);
        artsStudent.displayDetails();

	}

}
/*
 * Science Student Details: 
Name : Anjali
Roll Number : 101
Physics Marks : 85
Chemistry Marks : 90
Maths Marks : 80
Percentage : 85.0
Arts Student Details: 
Name : Aryan
Roll Number : 102
History Marks : 75
Geography Marks : 80
Cnglish Marks : 85
Percentage : 80.0

*/

/*
Create Test class
-----------------
-> create main method
-> in main method create ScienceStudent object and  ArtsStudent object.
-> print the details of both class by calling displayDetails() method.
-> print the percentage of ScienceStudent & ArtsStudent by calling calculatePercentage() methods.


Condition :
-----------
if any numeric value is zero or negative then print "Error Invalid Input".


TEST CASE 1 :
-------------
sample input  : When your reading values for Student Class OR ScienceStudent class OR ArtsStudent class then make sure if any numeric value is <=0 then print "Error Invalid Input".
                
sample output : Error Invalid Input


TEST CASE 2 :
-------------
sample input : ScienceStudent scienceStudent = new ScienceStudent("Anjali", 101, 85, 90, 80);
               ArtsStudent artsStudent = new ArtsStudent("Aryan", 102, 75, 80, 85);

sample output : 
                Science Student Details:
                Name: Anjali
                Roll Number: 101
                Physics Marks: 85
                Chemistry Marks: 90
                Math Marks: 80
                Percentage: 85.0%
                
                Arts Student Details:
                Name: Bob
                Roll Number: 102
                History Marks: 75
                Geography Marks: 80
                English Marks: 85
                Percentage: 80.0%
*/