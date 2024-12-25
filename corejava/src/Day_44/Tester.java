package Day_44;

public class Tester {

	public static void main(String[] args) {
		ClassRoom c = new ClassRoom(100);
		c.adjustChairs(c);
		System.out.println(c);

	}

}

/*
Enter Number of Students : 90
ClassRoom [chairs=90]

Enter Number of Students : 120
ClassRoom [chairs=120]

Enter Number of Students : 100
ClassRoom [chairs=100]
 */

/*
ElC class Tester : 
In the main method :
Create an instance of ClassRoom with an initial number of chairs (e.g., 100).
Apply the adjustChairs() method using UnaryOperator to adjust the number of chairs based on user input.
Print the adjusted number of chairs in the classroom.
*/