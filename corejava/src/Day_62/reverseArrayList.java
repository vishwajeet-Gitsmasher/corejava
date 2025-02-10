package Day_62;

import java.util.ArrayList;
import java.util.Collections;

public class reverseArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		System.out.println("Original List : ");
		System.out.println(list);
		System.out.println("ArrayList Reversed by predefined Reverse method : ");
		Collections.reverse(list);
		System.out.println(list);
		
		System.out.println("ArrayList Reversed by User Defined Logic : ");
		for(int i=0,j=list.size()-1;i<j;i++,j--) {
			int temp = list.get(i);
			int temp2 = list.get(j);
			list.remove(i);
			list.add(i, temp2);
			list.remove(j);
			list.add(j,temp);
		}
		
		System.out.println(list);
	}

}

/*
[10, 11, 12, 13, 14]
[14, 13, 12, 11, 10]
[10, 11, 12, 13, 14]
*/

// Q1) Write a program to reverse ArrayList in java?