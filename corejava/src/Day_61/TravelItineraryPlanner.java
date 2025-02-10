package Day_61;

public class TravelItineraryPlanner {

	public static void main(String[] args) {
		ItineraryPlanner ip = new ItineraryPlanner();

		Destination d1 = new Destination("Paris");
		Activity a1 = new Activity("Visit Eiffel Tower","Morning");
		Activity a2 = new Activity("Louvre Museum","Afternoon");
		d1.Activities.add(a1);
		d1.Activities.add(a2);
		
		Destination d2 = new Destination("London");
		Activity a3 = new Activity("British Museum","Morning");
		Activity a4 = new Activity("London Eye","Afternoon");
		d2.Activities.add(a3);
		d2.Activities.add(a4);
		
		ip.addDestination(d1);
		ip.addDestination(d2);
		
		ip.viewDestination();
	}

}

/*
Destination: Paris
- Visit Eiffel Tower (Morning)
- Louvre Museum (Afternoon)

Destination: London
- British Museum (Morning)
- London Eye (Afternoon)
 */

/*
TravelItineraryPlanner (Main Class):
Creates an instance of ItineraryPlanner.
Creates two Destination objects: "Paris" and "London".
Adds activities to each destination.
Adds these destinations to the itinerary planner.
Displays the itinerary by listing destinations and their respective activities.


Output:-
Destination: Paris
- Visit Eiffel Tower (Morning)
- Louvre Museum (Afternoon)

Destination: London
- British Museum (Morning)
- London Eye (Afternoon)



*/