package Day_50;

public class AccountNotFoundException extends Exception {
	public AccountNotFoundException(String errorMessage) {
		super(errorMessage);
	}
}

/*
class AccountNotFoundException(Checked):
Methods:
Parameterized Constructor with String as parameter
Purpose: Thrown when an account is not found during a transfer.
*/