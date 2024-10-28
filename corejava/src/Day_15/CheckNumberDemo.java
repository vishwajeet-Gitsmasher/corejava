package Day_15;

import java.util.Scanner;

public class CheckNumberDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to check whether it is power of 2 or not = ");
		int num = sc.nextInt();
		System.out.println("The number "+num+" is power of 2 ? "+ CheckNumber.checkNumber(num));

	}

}

/*
Enter the number to check whether it is power of 2 or not = 8
The number 8 is power of 2 ? true

Enter the number to check whether it is power of 2 or not = 16
The number 16 is power of 2 ? true

Enter the number to check whether it is power of 2 or not = 152
The number 152 is power of 2 ? false
*/
