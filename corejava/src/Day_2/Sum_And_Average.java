package Day_2;

public class Sum_And_Average {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = Integer.parseInt(args[2]);
		int sum = x + y + z;
		int avg = sum/3;
		System.out.println("Sum = "+sum+" and Average = "+avg);
	}

}

/*
	Sum = 60 and Average = 20
*/