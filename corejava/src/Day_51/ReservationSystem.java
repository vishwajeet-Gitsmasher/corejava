package Day_51;

public class ReservationSystem {
	private int availableSeats;

	public ReservationSystem(int availableSeats) {
		super();
		this.availableSeats = availableSeats;
	}
	
	void reserveSeat(int numberOfSeats) throws SeatUnavailableException{
		if(numberOfSeats>availableSeats) {
			throw new SeatUnavailableException("Seats are not available at the moment or there are insufficient seats for the specified reservation.");
		} else if(numberOfSeats>0) {
			availableSeats -= numberOfSeats;
			System.out.println(numberOfSeats+" Seats reserved successfully.");
		} else {
			System.out.println("Number of seats cannot be negative or zero.");
		}
	}
	
	void reserveSeatUnchecked(int numberOfSeats) throws InvalidReservationException, SeatUnavailableException{
		if(availableSeats == 0) {
			throw new InvalidReservationException("No seats are available");
		} else if(numberOfSeats>availableSeats) {
			throw new SeatUnavailableException("Seats are not available at the moment or there are insufficient seats for the specified reservation.");
		} else if(numberOfSeats>0) {
			availableSeats -= numberOfSeats;
			System.out.println(numberOfSeats+" Seats reserved successfully.");
		} else {
			System.out.println("Number of seats cannot be negative or zero.");
		}
	}
}

/*
* ReservationSystem Class:

-> The class should have a private instance variable availableSeats representing the number of available seats.
-> Implement a constructor to initialize the initial number of available seats.
-> Implement a method reserveSeat(int numberOfSeats) that reserves seats, throwing SeatUnavailableException for unavailability
or insufficient seats.
-> Implement a method reserveSeatUnchecked(int numberOfSeats) that simulates reserving seats, throwing
 InvalidReservationException for no available seats and handling SeatUnavailableException for insufficient seats.


*/