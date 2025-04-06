package Day_71;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("Red");
		pq.add("Green");
		pq.add("Orange");
		pq.add("White");
		pq.add("Black");
		
		System.out.println(pq);

	}

}

// [Black, Green, Orange, White, Red]

/*
Que-1
____________________________
Create a Java program that uses a PriorityQueue to manage a collection of strings. 
You need to implement the following functionality:

Initialize a PriorityQueue that stores strings.
Add five different colors ("Red", "Green", "Orange", "White", "Black") to the queue.
Print all elements of the priority queue.

Requirements:
--------------------
Your program should use the PriorityQueue class from the java.util package.
The elements should be added in the specified order: "Red", "Green", "Orange", "White", "Black".
Display the elements of the PriorityQueue after all elements have been added.
-------------------------------------------------------------------------------------------------------
*/