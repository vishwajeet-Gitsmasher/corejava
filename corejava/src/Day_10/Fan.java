package Day_10;

public class Fan {
		// properties :
		String name;
		String coil;
		int wings;
		
		// Behavior:
		public void switchOn() {
			System.out.println(name+" Fan of "+coil+" coil with "+wings+" wings is ON");
		}
		
		
		public void switchOff() {
			System.out.println(name+" Fan of "+coil+" coil with "+wings+" wings is OFF");
		}
}

