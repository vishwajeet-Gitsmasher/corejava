package Day_40;

public class BSNL implements SIMCardInterface {

	@Override
	public String getPhoneNumber() {
		return "8978378";

	}

	@Override
	public String getNetworkProvider() {
		return "BSNL";

	}

	@Override
	public String getActivationDeactivationStatus() {
		return "Active";

	}

}

/*
-> Jio, Airtel, and BSNL Classes: These classes should implement the SIMCardInterface. Each class represents 
a SIM card from a different network provider (Jio, Airtel, and BSNL) and should have provider-specific details.
*/