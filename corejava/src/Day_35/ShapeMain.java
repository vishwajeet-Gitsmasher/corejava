package Day_35;

public class ShapeMain {

	public static void main(String[] args) {
	
		Shape s1 = Shape.randshape();
		s1.draw();
		s1.erase();
		
		s1 = Shape.randshape();
		s1.draw();
		s1.erase();
		
		s1 = Shape.randshape();
		s1.draw();
		s1.erase();

	}

}

/*
Triangle draw
Triangle erase
Square draw
Square erase
Circle draw
Circle erase

 */

/*
Create Main class(ELC Class) named as ShapeDemo and havinf main method and call the method and execute it.

Test Cases -1 :
-------------------
Valid Case: Random Shape Generation

Sample Input: [No input needed]
Expected Output (example run, actual output will vary due to randomness):

Triangle draw
Triangle erase

Square draw
Square erase

Circle draw
Circle erase

Circle draw
Circle erase
*/