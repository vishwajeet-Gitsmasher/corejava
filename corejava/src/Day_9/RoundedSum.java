package Day_9;


//BLC Class
public class RoundedSum {
	public static int sumOfRoundedValues(int a,int b,int c) {
		//int sum = (a%10<5?(a-a%10):(a+(10-a%10))) + (b%10<5?(b-b%10):(b+(10-b%10))) + 
		//           (c%10<5?(c-c%10):(c+(10-c%10)));
		int sum = (a+5)/10*10 + (b+5)/10*10 + (c+5)/10*10; 
		return sum;
	}
}
