package Day_55;

public class VaccineEligibility {
	private int age;
	private boolean hasHealthCondition;
	
	public VaccineEligibility(int age, boolean hasHealthCondition) {
		super();
		this.age = age;
		this.hasHealthCondition = hasHealthCondition;
	}
	
	public void isEligible() {
		if(this.age >= 18 && this.age <= 60) {
			this.hasHealthCondition = true;
		} else {
			this.hasHealthCondition = false;
		}
	}

	public boolean getHasHealthCondition() {
		return hasHealthCondition;
	}
}

/*
Objective:
Design a COVID-19 vaccine booking application that allows users to check their eligibility based on age and health conditions. Users who 
meet the eligibility criteria can book a dose, and the application should handle concurrent user interactions using threads.



Instructions:



1.Implement the VaccineEligibility class with the following properties :



-> private int age: The age of the user.

-> private boolean hasHealthCondition: A boolean indicating whether the user has a health condition.

-> Implement a constructor that takes age and health condition as parameters and initializes the class properties.

-> Implement the isEligible() method within the VaccineEligibility class to check if a user is eligible for the vaccine. A user is eligible if 
their age is 18 years or above and either their age is less than 60 years or they have a health condition.



2. Implement the DoseBooking class with the following property:



-> private boolean booked: A boolean indicating whether the user has booked a dose.

-> Implement bookDose() within the DoseBooking class to book a dose. If the dose is already booked, throw a RuntimeException 
with the message "Dose already booked."

-> Implement isDoseBooked() within the DoseBooking class to check if the user has booked a dose.



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



4. In the CoronaVaccineApp class:



-> Create two User objects: user1 and user2.

-> Simulate concurrent user interactions using threads by creating two threads (thread1 and thread2) with anonymous runnable 
instances representing the user interactions.



Sample Output:

Dose booked successfully for Ramesh

Suresh is not eligible for the vaccine.
*/