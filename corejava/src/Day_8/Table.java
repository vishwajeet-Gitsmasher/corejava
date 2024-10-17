package Day_8;
import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number = ");
		int n = sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n+" * "+i+" = "+(n*i));
		}

	}

}

/*
	Enter your number = 3
	3 * 1 = 3
	3 * 2 = 6
	3 * 3 = 9
	3 * 4 = 12
	3 * 5 = 15
	3 * 6 = 18
	3 * 7 = 21
	3 * 8 = 24
	3 * 9 = 27
	3 * 10 = 30
*/

// WAP in java to print table of the given number (Number must be taken from Scanner class)
