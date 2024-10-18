package Day_9;

//BLC Class
public class TwoDigitsSum {
	public static int getSumOfDigits(int x) {
		int sum =0;
		while(x>0) {
			sum += x%10;
			x/=10;
		}
		return sum;
	}
}
