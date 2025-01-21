package Day_55;

public class User {
	private String name;
	private VaccineEligibility eligibility;
	private DoseBooking doseBooking;
	
	public User(String name, int age,boolean hasHealthCondition) {
		super();
		this.name = name;
		this.eligibility = new VaccineEligibility(age,hasHealthCondition);
		this.doseBooking = new DoseBooking(false);
	}
	
	public void isEligible() {
		eligibility.isEligible();
	}
	
	public void bookDose() {
		if(eligibility.getHasHealthCondition() == true) {
			doseBooking.bookDose();
			System.out.println("Dose booked successfully for "+this.name);
		} else {
			throw new RuntimeException(this.name+" is not eligible for the vaccine.");
		}
	}
	
	public boolean isDoseBooked() {
		return doseBooking.isDoseBooked();
	}
}

/*
3.Define the User class with the following properties:



-> private String name: The name of the user.

-> private VaccineEligibility eligibility: An instance of the VaccineEligibility class to check the user's eligibility.

->  private DoseBooking doseBooking: An instance of the DoseBooking class to manage dose booking for the user.

-> Implement a constructor that takes the user's name, age, and health condition as parameters and initializes the class properties.



-> Implement the isEligible() method within the User class to check if the user is eligible for the vaccine by using the isEligible() 
method of the VaccineEligibility class.

-> Implement the bookDose() method within the User class to book a dose for the user if they are eligible. If the user is not eligible, 
throw a RuntimeException with the message "You are not eligible for the vaccine."

-> Implement the isDoseBooked() method within the User class to check if the user has already booked a dose by using the isDoseBooked() 
method of the DoseBooking class.

*/