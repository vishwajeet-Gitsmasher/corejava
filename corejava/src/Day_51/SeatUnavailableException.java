package Day_51;

public class SeatUnavailableException extends Exception{
	public SeatUnavailableException(String msg) {
		super(msg);
	}
	
}

/*
1)Seat Reservation System:

You are tasked with developing a Java program for a simple seat reservation system using the ReservationSystem class.
 This class involves two custom exceptions: a checked exception (SeatUnavailableException) and an unchecked exception
 (InvalidReservationException). These exceptions are designed to handle different scenarios related to reserving seats.

* SeatUnavailableException (Checked Exception):
->This exception should be thrown when an attempt is made to reserve seats that are not available at the moment or when there are 
insufficient seats for the specified reservation.
*/