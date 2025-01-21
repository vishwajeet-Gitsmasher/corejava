package Day_51;

public class ReservationSystemScenario {

	public static void main(String[] args) {
		ReservationSystem r = new ReservationSystem(30);
		try {
			r.reserveSeat(-10);
			r.reserveSeatUnchecked(10);
			r.reserveSeatUnchecked(10);
			r.reserveSeat(10);
		} catch(SeatUnavailableException e) {
			System.out.println(e.getMessage());
		} catch(InvalidReservationException e) {
			System.out.println(e.getMessage());
		}

	}

}

/*
10 Seats reserved successfully.
10 Seats reserved successfully.
10 Seats reserved successfully.
Seats are not available at the moment or there are insufficient seats for the specified reservation.
 */

/*
* Main Class (ReservationSystemScenario):

-> In the main method, create an instance of ReservationSystem with an initial number of available seats (e.g., 30).
-> Demonstrate the use of reserveSeat for valid and invalid seat reservations, handling the .
-> Demonstrate the use of reserveSeatUnchecked for valid and invalid seat reservations, handling both InvalidReservationException and SeatUnavailableException.
-> Ensure that the program provides clear error messages and handles exceptions appropriately.

*/