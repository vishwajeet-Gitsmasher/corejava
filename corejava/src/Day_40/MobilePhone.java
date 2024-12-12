package Day_40;

public class MobilePhone implements MobilePhoneInterface {
	private SIMCardInterface sc = null;

	@Override
	public void insertSimCard(SIMCardInterface s) 
	{
		this.sc = s;
		System.out.println(s.getNetworkProvider()+" Sim card Inserted");
		System.out.println("Sim card Phone Number is : "+sc.getPhoneNumber());
		System.out.println("Sim card is "+sc.getActivationDeactivationStatus());

	}

	@Override
	public void removingSimCard() {
		System.out.print(sc.getNetworkProvider());
		this.sc =  null;
		System.out.print(" Sim card Removed \n");

	}

	@Override
	public void makingCalls() {
		System.out.println("Making Calls using "+sc.getNetworkProvider());

	}

	@Override
	public void sendingTextMessages() {
		System.out.println("Sending Text Massages using "+sc.getNetworkProvider());

	}
	
	

}
