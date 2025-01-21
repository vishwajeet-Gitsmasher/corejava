package Day_52;

public class InvalidProductException extends RuntimeException{
	public InvalidProductException(String msg) {
		super(msg);
	}
}

/*
class InvalidProductException(make it an Unchecked Exception):
Methods:
Parameterized Constructor with String as parameter.

Purpose : Thrown when a product is not found in the inventory.

*/