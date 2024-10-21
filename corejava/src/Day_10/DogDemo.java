package Day_10;

public class DogDemo {

	public static void main(String[] args) {
		
		// Object 1
		Dog german = new Dog();
		german.name = "German Shepard";
		german.height = 75.0;
		german.age = 7;
		
		german.getDogInformation();
		german.bark();
		
		System.out.println("-----------------------------");
		
		// Object 2
		Dog husky = new Dog();
		husky.name = "Husky";
		husky.height = 45.0;
		husky.age = 4;
		
		husky.getDogInformation();
		husky.bark();

	}

}

/*
Dog Name : German Shepherd
Dog Height : 75.0
Dog age : 7
BOW BOW
-----------------------------
Dog Name : Husky
Dog Height : 45.0
Dog age : 4
BOW BOW


*/


/*
Write a Program on OOPs to define Fan class properties and behaviour.

properties :

name    : String
coil    : String
wings	: int

behaviour:

switchOn()  : public void
switchOff() : public void   
*/