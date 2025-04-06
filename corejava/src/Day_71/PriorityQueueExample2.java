package Day_71;

import java.util.PriorityQueue;

public class PriorityQueueExample2 {

	public static void main(String[] args) {
		PriorityQueue<String> queue1 = new PriorityQueue<>();
		queue1.add("Red");
		queue1.add("Green");
		queue1.add("Orange");
		
		System.out.println("queue1 : "+queue1);
		
		PriorityQueue<String> queue2 = new PriorityQueue<>();
		queue2.add("Pink");
		queue2.add("White");
		queue2.add("Black");
		
		System.out.println("queue2 : "+queue2);
		
		queue1.addAll(queue2);
		
		System.out.println("queue1 after addAll() : "+queue1);
		
	}

}


/*
queue1 : [Green, Red, Orange]
queue2 : [Black, White, Pink]
queue1 after addAll() : [Black, Green, Orange, Red, White, Pink]
 */


/*
Que-2
____________________________
Create a Java program that demonstrates how to merge two PriorityQueue instances. 
The program should perform the following tasks:

Initialize two PriorityQueue objects, queue1 and queue2, each storing strings.
Add three different colors to queue1: "Red", "Green", and "Orange".
Add three different colors to queue2: "Pink", "White", and "Black".
Print the elements of both queue1 and queue2.
Merge queue2 into queue1 using the addAll method.
Print the elements of the merged queue1.

Requirements:
---------------------
Your program should use the PriorityQueue class from the java.util package.
The elements should be added in the specified order to each queue.
Display the elements of both priority queues before and after merging.
The final output should show the contents of queue1 after merging queue2 into it.

Sample Output:
Priority Queue1: [Green, Red, Orange]
Priority Queue2: [Black, White, Pink]
New Priority Queue1: [Black, Green, Orange, Red, White, Pink]
-------------------------------------------------------------------------------------------------------

*/