package Day_51;

public class OutOfStockException extends RuntimeException{
	public OutOfStockException(String msg) {
		super(msg);
	}
}

/*
* OutOfStockException (Unchecked Exception):
-> This exception should be thrown when an attempt is made to add items exceeding the available stock.

*/