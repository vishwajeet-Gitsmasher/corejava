package Day_61;

import java.util.ArrayList;

public class ItineraryPlanner {
	ArrayList<Destination> destinations = new ArrayList<>();
	
	public void addDestination(Destination d) {
		destinations.add(d);
	}
	
	public void viewDestination() {
		for(Destination d: destinations) {
			System.out.println("\nDestination: "+d.destinationName);
			for(Activity a:d.Activities) {
				System.out.println(a);
			}
		}
	}
}

/*
ItineraryPlanner:
Manages a list of destinations.
Contains methods to add destinations and retrieve the list of destinations.
*/