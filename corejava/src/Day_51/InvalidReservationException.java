package Day_51;

public class InvalidReservationException extends RuntimeException{

	public InvalidReservationException(String msg) {
		super(msg);
	}
	
}

/*

* InvalidReservationException (Unchecked Exception):
->This exception should be thrown when an attempt is made to reserve seats when no seats are available.

*/