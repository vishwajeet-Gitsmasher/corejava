package Day_14;

public class Batter {
	 private String name;
	 private int runs;
	 private int matches;
	 private float batting_avg;
	 
	 public void batterDetails(String name, int runs, int matches) {
		 if(runs<0 || matches<0) {
			 System.err.println("Error: Stats cannot be negative");
			 return;
		 }
		 
		 if(runs>0 && matches==0) {
			 System.err.println("Error: runs cannot be positive if matches are 0");
			 return;
		 }
		 
		 this.name = name;
		 this.runs = runs;
		 this.matches = matches;
	 }
	 
	 public void computeBattingAverage() {
		 batting_avg = (runs/(float) matches);
		 System.out.println("Name = "+name);
		 System.out.println("Batting Average = "+batting_avg);
	 }
	 
	 public void getStatistics() {
		 	System.out.println("Batter name = "+name);
			System.out.println("Batter runs = "+ runs);
			System.out.println("Batter matches = "+matches);
			System.out.println("Batter batting avgearge = "+batting_avg);
	 }
}

/*
------------
Class Batter is given to you. Add below details to the class

 1. Instance variables:
 name: private -String,
 runs: private-int,
 matches: private-int,
 batting_avg: private-float.

2.  Method batterDetails() : public void

Create a method name called batterDetails() that accepts name, runs, matches.

Method name: batterDetails
Return type: void

 3. Create below public methods,
 Method name: computeBattingAverage
 Return type: void

 This method should print the batting average of the batter by dividing run with matches.

 Input: 

 Name: "Sachin"
 Runs: 18000
 Matches: 463



 Output:
 Name: Sachin
 Batting_Avg: 38.87689

 Note: a. If runs or matches values are negative print 'Error'.

 b. If runs are greater than 0 when matches are 0 print 'Error'.

 Method name: getStatistics
 Return type: void
 This method should print the details of the batter.

 Input: 
Name: "Sachin"
Runs: 18000
Matches: 463

 Output:
 Name: Sachin
 Runs: 18000
 Matches: 463


 Note: a. If runs or matches values are negative print 'Error'.
 b. If runs are greater than 0 when matches are 0 print 'Error'.

 Given an ELC(Executable Logic class) class for Testing that contains main method. Use this class to test your code.

*/