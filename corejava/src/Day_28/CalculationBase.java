package Day_28;

public class CalculationBase {
	int num1;
	int num2;
	
	public CalculationBase() {
		super();
	}
	
	public CalculationBase(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void performCalculation() {
		int addition = this.num1 + this.num2;
		System.out.println("Addition : "+addition);
	}
}

/*
Program 3 : (Points 10)Single level Inheritance 
----------------------------------------------------------------------------------------------
Consider a scenario where you are designing a class hierarchy to handle basic and advanced calculations. The base class, CalculationBase, has two variables, num1 and num2, and a method performCalculation() that adds these two numbers. The subclass, AdvancedCalculation, extends the base class, introduces two additional variables, additionalNum and operation, and has a method performAdvancedCalculation() that performs a more complex operation using all four numbers.

Your task is to implement and test this class hierarchy. Follow the instructions below:

CalculationBase class:

Include two variables, int num1 and int num2.
Implement a default constructor and a parameterized constructor to initialize these variables.
Create a method called performCalculation() that adds num1 and num2 and displays the result.


*/