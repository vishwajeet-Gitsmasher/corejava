package Day_50;

public class LoanNotAllowedException extends RuntimeException{
	public LoanNotAllowedException(String errorMessage) {
		super(errorMessage);
	}
}

/*
class LoanNotAllowedException(Unchecked):
Methods:
Parameterized Constructor with String as parameter
Purpose:
Thrown when the loan amount exceeds the allowed limit.
*/