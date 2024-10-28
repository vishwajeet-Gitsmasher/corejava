package Day_15;

public class CalculateDifference {
	public static int calculateDifference(int n) {
		int squareSum = 0;
		int m = n;
		while(m>0) {
			squareSum += m*m;
			m--;
		}
		
		int sum = 0;
		while(n>0) {
			sum += n;
			n--;
		}
		sum = sum*sum;
		return squareSum - sum;
		
	}
}

/*
Create a class with a method to find the difference between the sum of the squares and the square of the sum of the first n natural numbers.
Method Description :-
Method Name 	 calculateDifference 
Access Modifier public,static	
Argument 	 int n 
Return Type 	 int 
Logic 	Find the difference between the sum of the squares of the first n natural numbers and the square of their sum. 
For Example if n is 10,you have to find 
(1^2+2^2+3^2+….9^2+10^2)- 
(1+2+3+4+5…+9+10)^2 
*/
