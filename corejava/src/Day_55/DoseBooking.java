package Day_55;

public class DoseBooking {
	private boolean booked;
	
	public DoseBooking(boolean booked) {
		super();
		this.booked = booked;
	}

	public void bookDose() {
		if(this.booked == true) {
			throw new RuntimeException("Dose already booked.");
		} else {
			this.booked = true;
		}
	}
	
	public boolean isDoseBooked() {
		return this.booked;
	}
}


/*
2. Implement the DoseBooking class with the following property:



-> private boolean booked: A boolean indicating whether the user has booked a dose.

-> Implement bookDose() within the DoseBooking class to book a dose. If the dose is already booked, throw a RuntimeException 
with the message "Dose already booked."

-> Implement isDoseBooked() within the DoseBooking class to check if the user has booked a dose.



*/