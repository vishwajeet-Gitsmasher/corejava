package Day_25;

public class ZooManagement {

	public static void main(String[] args) {
		Lion lion = new Lion("Simba",5,20); 
		System.out.println("Lion Details:");
		lion.displayInfo();
		lion.makeSound();
		lion.displayManeLength();
		
		System.out.println("===================================");
		
		Elephant elephant = new Elephant("Jumbo",10,2.5f);
		System.out.println("Elephant Details:");
		elephant.displayInfo();
		elephant.makeSound();
		elephant.displayTuskLength();
	}

}

/*
Lion Details:
Animal name : Simba
Animal age : 5
The lion roars loudly.
Animal mane Length : 20 cm
===================================
Elephant Details:
Animal name : Jumbo
Animal age : 10
The elephant trumpets.
Elephant tuskLength : 2.5meters
 */

/*
Create a class named ZooManagement (as provided in the code):
-------------------------------------------------------------
In the main method, create instances of both Lion and Elephant with appropriate values.
Print information about the lion and the elephant, including their specific attributes and the sounds they make.

Your task is to implement the required classes based on the provided problem description. 


Condition :
-----------
if any numeric value is zero or negative then print "Error Invalid Input".


TEST CASE 1 :
-------------
sample input  : When your reading numeric values for any above Classe then make sure if any numeric value is <=0 then print "Error Invalid Input".
                
sample output : Error Invalid Input



TEST CASE 2 :
-------------
sample input :
               Lion:
               Name: "Simba"
               Age: 5
               Mane Length: 20 cm

               Elephant:
               Name: "Jumbo"
               Age: 10
               Tusk Length: 2.5 meters

sample output : 
               Lion Details:
               Name: Simba, Age: 5
               The lion roars loudly.
               Mane Length: 20 cm
               
               Elephant Details:
               Name: Jumbo, Age: 10
               The elephant trumpets.
               Tusk Length: 2.5 meters
*/