package Day_44;

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class ClassRoom {
	private int chairs;

	public ClassRoom(int chairs) {
		super();
		this.chairs = chairs;
	}

	public int getChairs() {
		return chairs;
	}

	public void setChairs(int chairs) {
		this.chairs = chairs;
	}

	@Override
	public String toString() {
		return "ClassRoom [chairs=" + chairs + "]";
	}

	public static UnaryOperator<ClassRoom> adjustChairs(ClassRoom cl){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Students : ");
		int num = sc.nextInt();
		UnaryOperator<ClassRoom> cls = c -> {
			if(num > c.getChairs()) {
				int diff = num - c.getChairs();
				c.setChairs(c.getChairs()+diff);
			} else if(num < c.getChairs()) {
				int diff = c.getChairs() - num;
				c.setChairs(c.getChairs()-diff);
			}
			return c;
		};
		cls.apply(cl);
		return cls;
	}
}

/*
Ques - 2
--------------
Adjusting Classroom Chairs Using UnaryOperator
You are tasked with implementing a Java program that allows adjustments to the number of chairs in a classroom based on the student count entered by the user. Utilize the UnaryOperator interface to encapsulate the logic for modifying and returning the updated ClassRoom object.

ClassRoom Class(BLC):
Create a ClassRoom class with the following attributes and methods:

Attributes:
chairs: int : private  

Methods:
getChairs(): int : public
setChairs(int chairs): void : public
Override toString().


modifiers : public :  static
return type :  UnaryOperator<ClassRoom> 
method name : adjustChairs()
parameter :  ClassRoom 
Logic: 
Prompts the user to enter the number of students.
Adjusts the number of chairs based on the following rules:
If the student count exceeds the current number of chairs, increase the chairs by based on student count.
If the student count is less than the current number of chairs, decrease the chairs based on student count.
Returns the updated ClassRoom object after modification.

ElC class Tester : 
In the main method :
Create an instance of ClassRoom with an initial number of chairs (e.g., 100).
Apply the adjustChairs() method using UnaryOperator to adjust the number of chairs based on user input.
Print the adjusted number of chairs in the classroom.
*/