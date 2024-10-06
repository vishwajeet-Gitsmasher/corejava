package Day_1;

public class Additon_Using_Command_Line_Arguments {
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("Sum = "+ (a+b));
	}
}

/*
	10 20
	Sum = 30
*/

/*
  	BY USING SCANNER CLASS
  		
  	package Day_1;
	import java.util.Scanner;
	public class Additon_Using_Command_Line_Arguments {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Values ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Sum = "+ (a+b));
		}
	}
*/

/*
	Enter Values 
	10 20
	Sum = 30
 */

