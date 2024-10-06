package Day_3;

public class Palindrome {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int t = num;
		int rev = 0;
		while(t>0) {
			rev = (rev*10) + t%10;
			t/=10;
		}
		if(rev==num) {
			System.out.println("The number "+ num +" is palindrome");
		} else {
			System.out.println("The number "+ num +" is not palindrome");
		}
	}

}

/*
The number 121 is palindrome

The number 546 is not palindrome

The number 4122214 is palindrome
*/
