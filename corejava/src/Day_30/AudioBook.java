package Day_30;

public class AudioBook extends Book{
	double duration;
	String narrator;
	
	public AudioBook(String title, String author, double price, double duration, String narrator) {
		super(title, author, price);
		this.duration = duration;
		this.narrator = narrator;
	}
	
	public void getDetails() {
		super.getDetails();
		System.out.println("AudioBook duration : "+this.duration);
		System.out.println("AudioBook narrator : "+this.narrator);
		
	}
	
}

/*
Subclass: AudioBook

The AudioBook class extends the Book class and represents audiobooks.

Additional Attributes:

double duration: Represents the duration of the audiobook in hours.
String narrator: Represents the name of the audiobook's narrator.
Constructor:

A parameterized constructor to initialize the attributes of both the parent class (Book) and the subclass (AudioBook).
 Methods:

void getDetails(): Displays all the details of the book, including the duration and narrator.
*/