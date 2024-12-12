package Day_40;

public interface MobilePhoneInterface {
	void insertSimCard(SIMCardInterface s);
	void removingSimCard();
	void makingCalls();
	void sendingTextMessages();
	
}

/*
-> MobilePhoneInterface: An interface that defines methods for inserting, removing SIM cards, making calls, 
and sending text messages.

-> MobilePhone Class: This class should implement the MobilePhoneInterface. It should have a slot for 
inserting a SIM card and methods for making calls and sending texts.
*/