package Day_62;

import java.util.ArrayList;
import java.util.ListIterator;

public class traverseArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("grapes");
		list.add("banana");
		list.add("amla");
		list.add("orange");
		System.out.println("Forward Direction : ");
		ListIterator li = list.listIterator();
		li.forEachRemaining(System.out::println);
		
		System.out.println("========================");
		
		System.out.println("Backward Direction : ");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}	

	}

}

/*
 * Forward Direction : 
apple
grapes
banana
amla
orange
========================
Backward Direction : 
orange
amla
banana
grapes
apple

*/

// Q5) Write a Program to traverse the elements of ArrayList in both the    direction i.e forward and Backward.
