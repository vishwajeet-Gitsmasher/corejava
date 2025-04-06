package Day_71;

import java.util.PriorityQueue;

public class PriorityQueueExample3 {

	public static void main(String[] args) {
		PriorityQueue<String> pq1 = new PriorityQueue<>();
		pq1.add("Red");
		pq1.add("Green");
		pq1.add("Black");
		pq1.add("White");
		
		PriorityQueue<String> pq2 = new PriorityQueue<>();
		pq2.add("Red");
		pq2.add("Pink");
		pq2.add("Black");
		pq2.add("Orange");
		
		System.out.println("First Priority Queue : "+pq1);
		System.out.println("Second Priority Queue : "+pq2);
		
		for(String s : pq1) {
			if(pq2.contains(s)) {
				System.out.println("Yes : "+s+" is prsent in pq2");
			} else {
				System.out.println("No : "+s+" is Not prsent in pq2");
			}
		}

	}

}

/*
First Priority Queue : [Black, Red, Green, White]
Second Priority Queue : [Black, Orange, Pink, Red]
Yes : Black is prsent in pq2
Yes : Red is prsent in pq2
No : Green is Not prsent in pq2
No : White is Not prsent in pq2
 */



/*
Que-3
____________________________
Problem Statement:

Create a Java program that performs the following tasks:

Initialize two PriorityQueue objects, pq1 and pq2, each storing strings.
Add four different colors to pq1: "Red", "Green", "Black", and "White".
Add four different colors to pq2: "Red", "Pink", "Black", and "Orange".
Print the elements of both pq1 and pq2.
Compare the elements of pq1 with the elements of pq2 and 
print "Yes" if an element of pq1 is present in pq2, otherwise print "No".

Requirements:
---------------------
Your program should use the PriorityQueue class from the java.util package.
The elements should be added in the specified order to each queue.
Display the elements of both priority queues before the comparison.
For each element in pq1, check if it exists in pq2 and print "Yes" if it does, otherwise print "No".

Sample Output:

First Priority Queue: [Black, Green, Red, White]
Second Priority Queue: [Black, Orange, Pink, Red]
Yes
No
Yes
No

*/