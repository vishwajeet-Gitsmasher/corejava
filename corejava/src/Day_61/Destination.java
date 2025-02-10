package Day_61;

import java.util.ArrayList;

public class Destination {
	String destinationName;
	ArrayList<Activity> Activities;
	
	public Destination(String destinationName) {
		super();
		this.destinationName = destinationName;
		this.Activities = new ArrayList<Activity>();
	}
	
	public void addActivity(Activity a) {
		Activities.add(a);
	}
	
	public void viewActivities() {
		Activities.forEach(System.out::println);
	}

	@Override
	public String toString() {
		return "Destination [destinationName=" + destinationName + "]";
	}
	
	
}


/*
Destination:
Represents a destination with a name and a list of activities.
Has a constructor to set the destination's name and initialize an empty list of activities.
Provides methods to add activities to the destination and retrieve the list of activities.
Overrides the toString() method to provide a string representation of a destination.
*/