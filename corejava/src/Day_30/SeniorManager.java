package Day_30;

public class SeniorManager extends Manager{
	int numTeams;

	public SeniorManager(String name, int id, String department, int numTeams) {
		super(name, id, department);
		this.numTeams = numTeams;
	}
	
	public void handleMultipleTeams() {
		System.out.println("Number of teams managed by the senior manager : "+this.numTeams);
		
	}
}

/*
SeniorManager Class (Derived from Manager):

Attributes:
int numTeams: Represents the number of teams the senior manager oversees.
Methods:
A constructor to initialize the name, id, department, and numTeams attributes.
void handleMultipleTeams(): Prints the number of teams managed by the senior manager.
*/