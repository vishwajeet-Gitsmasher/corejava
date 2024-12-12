package Day_40;

public class TestSim {

	public static void main(String[] args) {
		Jio j = new Jio();
		Airtel a = new Airtel();
		BSNL b = new BSNL();
		
		MobilePhone m = new MobilePhone();
		m.insertSimCard(j);
		m.makingCalls();
		m.sendingTextMessages();
		m.removingSimCard();
		
		System.out.println("===========================================");
		System.out.println("Inserting Another Simcard");
		System.out.println("===========================================");
		
		m.insertSimCard(a);
		m.makingCalls();
		m.sendingTextMessages();
		m.removingSimCard();
		

	}

}

/*
Jio Sim card Inserted
Sim card Phone Number is : 8978378
Sim card is Active
Making Calls using Jio
Sending Text Massages using Jio
Jio Sim card Removed 
===========================================
Inserting Another Simcard
===========================================
Aitel Sim card Inserted
Sim card Phone Number is : 84635278
Sim card is Active
Making Calls using Aitel
Sending Text Massages using Aitel
Aitel Sim card Removed 

 */

/*
-> Demonstrate the interaction between mobile phones and different SIM cards:

->Create instances of Jio, Airtel, and BSNL SIM cards.
->Create a MobilePhone instance.
->Insert a SIM card into the mobile phone.
->Make a call and send a text message using the inserted SIM card.
->Remove the SIM card from the mobile phone.
->Discuss how the use of interfaces (SIMCardInterface and MobilePhoneInterface) promotes a loosely coupled 
architecture and allows flexibility in swapping different SIM cards.

[Note: You can provide the classes with appropriate constructors and methods as needed for the implementation.]

Hints:
--------------
Define the interfaces with the required methods and let the classes implement them.
Consider including print statements to indicate the activation, deactivation, insertion, and removal of SIM cards.
Focus on encapsulation, polymorphism, and the benefits of using interfaces in promoting modular and flexible code.
Feel free to adjust the details and wording of the question according to your preferences and the level of 
understanding you want to assess.
*/