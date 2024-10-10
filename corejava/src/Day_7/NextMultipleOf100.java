package Day_7;

public class NextMultipleOf100 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		if(n<0) {
			System.out.println(-1);
		} else {
			int r = n%100;
			int s = 100 - r;
			int mul = n+s;
			System.out.println("Next Multiple of "+n+" is = "+mul);
		}

	}

}

/*
	-5
	-1
	
	123
	Next Multiple of 123 is = 200
*/


/*
Write a java program which print the next multiple of 100 for the given number.
Program is determined by the following rules:

if the given value is negative or zero, return -1
if the given value is positive, return the next multiple of the given number. 
Example: if x = 123, return 200.
*/