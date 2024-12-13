package Day_41;

public class VideoPlayer implements AdvancedmediaPlayer {
	String title;
	
	public VideoPlayer(String title) {
		super();
		if(title.length()<1) {
			System.err.println("error message :Title is not be empty string.");
			System.exit(0);
		}
		this.title = title;
	}
	
	@Override
	public void play() {
		System.out.println("Playing video	: "+this.title+")");
	}

	@Override
	public void stop() {
		System.out.println("Stopping Video	: "+this.title+")");

	}

	@Override
	public void pause() {
		System.out.println("Pausing Video	: "+this.title+")");

	}

	@Override
	public String toString() {
		return "VideoPlayer [Video Title: " + title + "]";
	}
	
	

}


/*
Create a class VideoPlayer that implements AdvancedMediaPlayer and provides implementations for the methods. and write some standard printing message.

*/