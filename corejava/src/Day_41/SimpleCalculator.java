package Day_41;

public class SimpleCalculator implements Calculator {

	@Override
	public void calculateSum(int... args) {
		int sum = 0;
		for(int i:args) {
			sum+=i;
		}
		System.out.println("Sum of the numbers: "+sum);

	}

}

/*
ake one normal class SimpleCalculator which implements Calculator interface

in this class just implement the overriden method calculateSum and write the specific logic in this method.
*/