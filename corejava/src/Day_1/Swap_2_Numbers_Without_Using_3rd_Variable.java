package Day_1;

public class Swap_2_Numbers_Without_Using_3rd_Variable {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("Before Swapping a = "+ a +" b = "+b);
		a = a + b;;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping a = "+ a +" b = "+b);
	}

}

/*
	Before Swapping a = 10 b = 20 
	After Swapping a = 20 b = 10
*/