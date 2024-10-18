package Day_9;


//BLC Class
public class NextMultipleOfHundred {
	public static int getNextMultipleOfHundred(int x) {
		return x + (100 - x%100);
	}
}
