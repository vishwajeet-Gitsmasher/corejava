package Day_7;

public class PalindromeOf3DigitNumber {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		if(n<=0) {
			System.out.println(-1);
			System.out.println("given number is -ve kindly provide the +ve number only");
		} else if(n<=99) {
			System.out.println(-2);
			System.out.println("this program can check the operation for the 3 number only.");
		} else {
			int res = 0;
			int m = n;
			while(n>0) {
				res = (res*10) + n%10;
				n/=10;
			}
			if(res==m) {
				System.out.println(1);
				System.out.println("number is pallindrome");
			} else {
				System.out.println(0);
				System.out.println("number is not a pallindrome");
			}
		}

	}

}

/*
	-5
	-1
	given number is -ve kindly provide the +ve number only
	
	66
	-2
	this program can check the operation for the 3 number only.
	
	232
	1
	number is pallindrome
	
	189
	0
	number is not a pallindrome
 */

/*
Write a java program which print the given three digit number is palindrome or not 

Program is determined by the following rules:

if the given number is an three digit number, Example: if x = 232, print 1. if x = 345, print 0
if 1 then print a message that the number is pallindrome
if 0 then print a message that the number is not a pallindrome
if the given number is negative or zero, print -1
if -1 then print a message that the given number is -ve kindly provide the +ve number only
if the given number is not an three digit number, print -2
if -2 then print the message that this program can check the operation for the 3 number only.
*/