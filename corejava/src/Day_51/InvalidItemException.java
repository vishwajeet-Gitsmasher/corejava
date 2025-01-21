package Day_51;

public class InvalidItemException extends Exception{

	public InvalidItemException(String msg) {
		super(msg);
	}
	
}

/*
* InvalidItemException (Checked Exception):
-> This exception should be thrown when an attempt is made to add an invalid quantity of items (non-positive) or when there are 
not enough items in stock for the specified quantity.

*/