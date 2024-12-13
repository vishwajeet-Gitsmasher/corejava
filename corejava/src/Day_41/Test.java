package Day_41;

public class Test {

	public static void main(String[] args) {
		MusicPlayer m = new MusicPlayer("Life");
		System.out.println(m);
		m.play();
		m.pause();
		m.stop();
		
		System.out.println("=================================");
		
		VideoPlayer v = new VideoPlayer("Rock on");
		System.out.println(v);
		v.play();
		v.pause();
		v.stop();
	}

}

/*
MusicPlayer [Song Title: Life]
Playing music	: Life)
Pausing music	: Life)
Stopping music	: Life)
=================================
VideoPlayer [Video Title: Rock on]
Playing video	: Rock on)
Pausing Video	: Rock on)
Stopping Video	: Rock on)

*/


/*
Take  a Test class to demonstrate the functionality of the media player system.


Test Case-1 :
--------------

Sample Input:

Song Title: " Life"

Expected Output :

MusicPlayer [Song Title: Life]
Playing music	: Life
Pausing music	: Life
Stopping music	: Life


Test Case-2 :
---------------
Sample Input :" "

Expected Output :
error message :Title is not be empty string.



*/