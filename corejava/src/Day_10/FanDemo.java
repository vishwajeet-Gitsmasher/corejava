package Day_10;

public class FanDemo {

	public static void main(String[] args) {
		// Object 1
		Fan bajaj = new Fan();
		bajaj.name = "Bajaj";
		bajaj.coil = "Copper";
		bajaj.wings = 3;
		
		bajaj.switchOn();
		bajaj.switchOff();
		
		System.out.println("-------------------------------");
		
		// Object 1
		Fan usha = new Fan();
		usha.name = "Usha";
		usha.coil = "Aluminium";
		usha.wings = 4;
				
		usha.switchOn();
		usha.switchOff();
	}

}

/*
Bajaj Fan of Copper coil with 3 wings is ON
Bajaj Fan of Copper coil with 3 wings is OFF
-------------------------------
Usha Fan of Aluminium coil with 4 wings is ON
Usha Fan of Aluminium coil with 4 wings is OFF


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