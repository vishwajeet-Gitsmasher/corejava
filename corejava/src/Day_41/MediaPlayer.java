package Day_41;

public interface MediaPlayer {
	public void play();
	public void stop();
	
	
}

/*
Question-1
-------------
Design a Software System for a Media Player
---------------------------------------------------
Define an interface named as MediaPlayer 
 in this interface declare two abstract method

Methods :

name 			: play()
Return Type  		:void
Access Modifier 	:public


Methods :

name 			: stop()
Return Type  		:void
Access Modifier 	:public

Define another interface AdvancedmediaPlayer that extends MediaPlayer
and in this interface add one more abstract method i.e :
 
name 			: pause()
Return Type  		:void
Access Modifier 	:public
*/