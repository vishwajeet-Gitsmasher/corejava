package Day_41;

public class MusicPlayer implements AdvancedmediaPlayer {
	String title;
	
	public MusicPlayer(String title) {
		super();
		if(title.length()<1) {
			System.err.println("error message :Title is not be empty string.");
			System.exit(0);
		}
		this.title = title;
	}

	@Override
	public void play() {
		System.out.println("Playing music	: "+this.title+")");

	}

	@Override
	public void stop() {
		System.out.println("Stopping music	: "+this.title+")");

	}

	@Override
	public void pause() {
		System.out.println("Pausing music	: "+this.title+")");

	}

	@Override
	public String toString() {
		return "MusicPlayer [Song Title: " + title + "]";
	}
	
	

}


/*
Create a class MusicPlayer that implements AdvancedMediaPlayer and provides implementations for the methods, and write some standard printing message.
*/
