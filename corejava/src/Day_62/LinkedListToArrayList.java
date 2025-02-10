package Day_62;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListToArrayList {

	public static void main(String[] args) {
		LinkedList<Integer> link = new LinkedList<>();
		link.add(1);
		link.add(2);
		link.add(3);
		link.add(4);
		link.add(5);
		
		System.out.print("Linked List :");
		System.out.println(link);
		ArrayList<Integer> list = new ArrayList<>(link);
//		for(int i:link) {
//			list.add(i);
//		}
		System.out.print("ArrayList :");
		System.out.print(list);
	}

}

/*
Linked List :[1, 2, 3, 4, 5]
ArrayList :[1, 2, 3, 4, 5]
*/

// Q2) Write a program to convert LinkedList to ArrayList?