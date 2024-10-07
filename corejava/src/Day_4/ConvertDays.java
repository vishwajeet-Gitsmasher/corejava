package Day_4;

public class ConvertDays {

	public static void main(String[] args) {
		int days = Integer.parseInt(args[0]);
		int years = days/365;
		int months = (days%365)/30;
		int day = (days%365)%30;
		System.out.println(years +" Year[s]"+","+months+" month[s]"+","+day+" day[s]");
	}

}


/*
	500
	1 Year[s],4 month[s],15 day[s]
*/

/*
Program-4
----------
Write a program in java to input number of days. Find and display number of years, months and days.
*/