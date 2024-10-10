package Day_7;

public class SumOfDigits {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		if(n<0) {
			System.out.println(-3);
		} else if(n>=0 && n<=9) {
			System.out.println(-1);
		} else if(n>=10 && n<=99) {
			int m = n;
			int sum = n%10;
			n = n/10;
			sum += n%10;
			System.out.println("Sum of "+m+" is = "+sum);
		} else if(n>99) {
			System.out.println(-2);
		}

	}

}

/*
	-9
	-3
	
	5
	-1
	
	45
	Sum of 45 is = 9
	
	123
	-2
*/


/*
Write a java which program the sum of digits of the given two digit number.
program determined by the following rules:

if the given value is in between 10 and 99, return sum of it's digits. Example: if x = 34, print 7
if the given value is negative, print -3
if the given value is greater than 99, print -2
if the given value is in between 0 and 9, print -1
*/