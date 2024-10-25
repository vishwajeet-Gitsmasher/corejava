package Day_14;

import java.util.Scanner;

public class BowlerDemo {

	public static void main(String[] args) {
		Bowler b = new Bowler();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. Enter Bowler details");
			System.out.println("2. Exit");
			System.out.print("Enter your choice = ");
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					System.out.print("Enter Bowler Name = ");
					String name = sc.nextLine();
					name = sc.nextLine();
					System.out.print("Enter Wickets = ");
					int wickets = sc.nextInt();
					System.out.print("Enter Number of matches = ");
					int matches = sc.nextInt();
					System.out.print("Enter balls bowled = ");
					int  balls_bowled = sc.nextInt();
					System.out.print("Enter runs conceded = ");
					int runs_conceded = sc.nextInt();
					
				    b.bowlerDetails(name, wickets, matches, balls_bowled, runs_conceded);
				    if(matches>0) {
				    	b.computeBowlingAverage();
					    b.computeStrikeRate();
					    b.showStatistics();
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
1. Enter Bowler details
2. Exit
Enter your choice = 1

Enter Bowler Name = Jaspreet Bumrah
Enter Wickets = 20
Enter Number of matches = 10
Enter balls bowled = 240
Enter runs conceded = 300

Bowler name = Jaspreet Bumrah
Bowling Average = 15.0

Bowler name = Jaspreet Bumrah
Bowler Strike rate = 12.0

Bowler name = Jaspreet Bumrah
Bowler wickets = 20
Bowler matches = 10
Bowler balls bowled = 240
Bowler runs conceded = 300
Bowler bowling Average = 15.0
Bowler bowler Strikerate = 12.0

================================================

1. Enter Bowler details
2. Exit
Enter your choice = 1

Enter Bowler Name = Sachin
Enter Wickets = 10
Enter Number of matches = 5
Enter balls bowled = 750
Enter runs conceded = 463

Bowler name = Sachin
Bowling Average = 46.3

Bowler name = Sachin
Bowler Strike rate = 75.0

Bowler name = Sachin
Bowler wickets = 10
Bowler matches = 5
Bowler balls bowled = 750
Bowler runs conceded = 463
Bowling Average = 46.3
Bowler bowler Strikerate = 75.0

==================================================

1. Enter Bowler details
2. Exit
Enter your choice = 1
Enter Bowler Name = Sachin
Enter Wickets = 12
Enter Number of matches = 0
Enter balls bowled = 234
Enter runs conceded = 345
Error: matches are zero so no stats should me more than zero

=======================================================

1. Enter Bowler details
2. Exit
Enter your choice = 2
Thank you for using

*/
