package Day_28;

public class AdvancedCalculation extends CalculationBase{
	double additionalNum;
	String operation;
	
	public AdvancedCalculation() {
		super();
	}
	
	public AdvancedCalculation(int num1, int num2, double additionalNum, String operation) {
		super(num1, num2);
		this.additionalNum = additionalNum;
		this.operation = operation;
	}
	
	public int performAdvancedCalculation() {
		int result = 0;
		if(this.operation == "+") {
			result = super.num1 + super.num2;
		} else if(this.operation == "-") {
			result = super.num1 - super.num2;
		} else if(this.operation == "*") {
			result = super.num1 * super.num2;
		} else if(this.operation == "/") {
			result = super.num1 / super.num2;
		} else if(this.operation == "%") {
			result = super.num1 % super.num2;
		}
		return result;
	}
}


/*
AdvancedCalculation class:

Extend the CalculationBase class.

Introduce two additional variables, double additionalNum and String operation.

Implement a default constructor and a parameterized constructor to initialize all four variables.

Create a method called performAdvancedCalculation() that uses all four numbers to perform a complex 
operation. Display the result along with the details of the operation.
*/