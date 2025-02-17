package Day_66;

import java.util.HashMap;

public class FruitInventoryManagement2 {

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("Apple", 50);
		map.put("Banana", 30);
		map.put("Orange", 20);
		
		System.out.println(map);
		
		HashMap<String,Integer> map1 = new HashMap<>();
		map1.put("Mango",40);
		map1.putAll(map);
		
		System.out.println(map1);
		
		System.out.println("After using putIfAbsent:");
		map1.putIfAbsent("Grapes",35);
		System.out.println(map1);
		
		System.out.println("After using replace:");
		map1.replace("Orange", 25);
		System.out.println(map1);
		
		System.out.println("After using remove:");
		map1.remove("Mango");
		System.out.println(map1);
	}

}

/*
{Apple=50, Orange=20, Banana=30}
{Apple=50, Mango=40, Orange=20, Banana=30}
After using putIfAbsent:
{Apple=50, Grapes=35, Mango=40, Orange=20, Banana=30}
After using replace:
{Apple=50, Grapes=35, Mango=40, Orange=25, Banana=30}
After using remove:
{Apple=50, Grapes=35, Orange=25, Banana=30}

 */

/*
Ques - 2
-----------

You are tasked with implementing a Java program that demonstrates various operations on HashMap such as 
merging two HashMap.
Create two HashMap<String, Integer> instances to store fruit names as keys and their quantities as values.
Merge the second HashMap into the first one using the putAll method.
Use the putIfAbsent method to add an entry to the HashMap only if the key is not already present.
Use the replace method to update the value for a specific key.
Use the remove method to delete an entry from the HashMap based on the key.

Example Output :
After merging fruitInventory2 into fruitInventory1:
{Apple=50, Banana=25, Orange=20, Mango=40}

After using putIfAbsent:
{Apple=50, Banana=25, Orange=20, Mango=40, Grapes=35}

After using replace:
{Apple=50, Banana=25, Orange=25, Mango=40, Grapes=35}

After using remove:
{Apple=50, Banana=25, Orange=25, Grapes=35}

*/