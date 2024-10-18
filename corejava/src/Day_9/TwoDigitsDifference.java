package Day_9;


//BLC Class
public class TwoDigitsDifference {
	public static int getDiffOfDigits(int x) {
		int a = x%10;
		x/=10;
		int b = x%10;
		return b-a;
	}
}
