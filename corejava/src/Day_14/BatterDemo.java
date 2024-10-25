package Day_14;

import java.util.Scanner;

public class BatterDemo {

	public static void main(String[] args) {
		Batter b = new Batter();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. Enter Batter details");
			System.out.println("2. Exit");
			System.out.print("Enter your choice = ");
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					System.out.print("Enter Batter Name = ");
					String name = sc.nextLine();
					name = sc.nextLine();
					System.out.print("Enter runs = ");
					int runs = sc.nextInt();
					System.out.print("Enter Number of matches = ");
					int matches = sc.nextInt();
					
				    b.batterDetails(name, runs, matches);
				    if(matches>0) {
				    	b.computeBattingAverage();
				    	b.getStatistics();
				    }
				    break;
				case 2:
					System.out.println("Thank you for using");
					sc.close();
					return;
				  
			}
		}

	}

}

/*
1. Enter Batter details
2. Exit
Enter your choice = 1

Enter Batter Name = Sachin Tendulkar
Enter runs = 18000
Enter Number of matches = 463

Name = Sachin Tendulkar
Batting Average = 38.87689

Batter name = Sachin Tendulkar
Batter runs = 18000
Batter matches = 463
Batter batting avgearge = 38.87689

===================================================

1. Enter Batter details
2. Exit
Enter your choice = 1

Enter Batter Name = Virat Kohli
Enter runs = 10000
Enter Number of matches = 100

Name = Virat Kohli
Batting Average = 100.0

Batter name = Virat Kohli
Batter runs = 10000
Batter matches = 100
Batter batting avgearge = 100.0

=======================================

1. Enter Batter details
2. Exit
Enter your choice = 1
Enter Batter Name = Rohit Sharma
Enter runs = 8000
Enter Number of matches = 0
Error: runs cannot be positive if matches are 0

=============================================

1. Enter Bowler details
2. Exit
Enter your choice = 2
Thank you for using

*/
