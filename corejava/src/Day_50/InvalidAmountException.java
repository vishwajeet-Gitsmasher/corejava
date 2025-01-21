package Day_50;

public class InvalidAmountException extends RuntimeException {
	public InvalidAmountException(String errorMessage) {
		super(errorMessage);
	}
}

/*
class InvalidAmountException(Unchecked):
Methods:
Parameterized Constructor with String as parameter
Purpose: Thrown when an invalid amount is entered for any transaction.
*/