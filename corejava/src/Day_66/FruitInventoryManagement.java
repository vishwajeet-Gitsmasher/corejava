package Day_66;

import java.util.HashMap;
import java.util.Iterator;

public class FruitInventoryManagement {

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("Apple", 50);
		map.put("Banana", 30);
		map.put("Orange", 20);
		
		System.out.println(map);
		Iterator i = map.entrySet().iterator();
		i.forEachRemaining(System.out::println);
		
		System.out.println("Total number of entries:"+map.size());
		if(map.isEmpty()) {
			System.out.println("HashMap is empty.");
		} else {
			System.out.println("HashMap is not empty.");
		}
		
		System.out.println("Quantity for Apple:"+map.get("Apple"));
		System.out.println("Quantity for Banana:"+map.get("Banana"));
		
		if(map.containsKey("Orange")) {
			System.out.println("Orange exists in the records.");
		} else {
			System.out.println("Orange does not exists in the records.");
		}
		
		if(map.containsKey("Mango")) {
			System.out.println("Mango exists in the records.");
		} else {
			System.out.println("Mango does not exists in the records.");
		}
		
		if(map.containsValue(20)) {
			System.out.println("Quantity 20 exists in the records.");
		} else {
			System.out.println("Quantity 20 does exists in the records.");
		}
		
		if(map.containsValue(100)) {
			System.out.println("Quantity 20 exists in the records.");
		} else {
			System.out.println("Quantity 20 does exists in the records.");
		}
	}

}

/*
{Apple=50, Orange=20, Banana=30}
Apple=50
Orange=20
Banana=30
Total number of entries:3
HashMap is not empty.
Quantity for Apple:50
Quantity for Banana:30
Orange exists in the records.
Mango does not exists in the records.
Quantity 20 exists in the records.
Quantity 20 does exists in the records.

 */

/*
Ques - 1
-----------
You are tasked with implementing a simple Java program that manages a collection of fruits and their 
quantities using a HashMap. 
Create a ELC class FruitInventoryManagement :
Add fruits and their quantities to the HashMap.
Display the total number of entries in the HashMap.
Check if the HashMap is empty.
Retrieve and print the quantity of a specific fruit.
Check if a specific fruit exists in the HashMap.
Check if a specific quantity exists in the HashMap.

Sample Output :
Added Apple: 50
Added Banana: 30
Added Orange: 20
Total number of entries: 3
HashMap is not empty.

Quantity for Apple: 50
Quantity for Banana: 30

Orange exists in the records.
Mango does not exist in the records.

Quantity 20 exists in the records.
Quantity 100 does not exist in the records.

*/