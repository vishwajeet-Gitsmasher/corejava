package Day_36;

public class ZooSimulation {

	public static void main(String[] args) {
		Mammal m = new Mammal("lion",false);
		m.makeSound();
		m.nurseYoung();
		m.reproduce();
		System.out.println(m);
		
		System.out.println("======================================");
		
		Bird b = new Bird("eagle",true);
		b.makeSound();
		b.buildNest();
		b.reproduce();
		System.out.println(b);

	}

}

/*
Mammal animal sound
mammals nursing their young
Mammals give birth to live young.
Mammal [hasFur=false, species=lion]
======================================
Bird animal sound
birds building nests for their eggs
Birds lay eggs as a means of reproduction.
Bird [canFly=true, species=eagle]

 */

/*
ELC  - ZooSimulation:

Create an ELC named ZooSimulation that:

Instantiates a Mammal object (e.g., lion) with sample data.
Invokes methods on the Mammal object to demonstrate mammal-specific behaviors.
Instantiates a Bird object (e.g., eagle) with sample data.
Invokes methods on the Bird object to demonstrate bird-specific behaviors.
*/