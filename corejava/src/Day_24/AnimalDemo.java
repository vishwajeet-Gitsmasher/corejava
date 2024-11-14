package Day_24;

public class AnimalDemo {

	public static void main(String[] args) {
		Dog d = new Dog("Tommy",true,"Labrador");
		d.displayDetails();
		
		System.out.println("===========================");
		
		Dog myDog = new Dog("Buddy", false, "Golden Retriever");
		myDog.displayDetails();

	}

}

/*
Animal name : Tommy
Animal has fur : Yes
Dog breed : Labrador
===========================
Animal name : Buddy
Animal has fur : No
Dog breed : Golden Retriever
*/

/*
4. Create the Main Class
Requirements:
Create an instance of the Dog class.
Display details of the Dog object to demonstrate inheritance.


Condition :
-----------
if any numeric value is zero or negative then print "Error Invalid Input".


TEST CASE 1 :
-------------
sample input  : When your reading numeric values for any above Classe then make sure if any numeric value is <=0 then print "Error Invalid Input".
                
sample output : Error Invalid Input



TEST CASE 2 :
-------------
sample input : Dog myDog = new Dog("Buddy", true, "Golden Retriever");
               
sample output : 
               Dog Details:
               Animal Name: Buddy
               Has Fur: Yes
               Breed: Golden Retriever
*/