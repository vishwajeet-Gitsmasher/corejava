package Day_62;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class removeMethodDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1;i<=5;i++) {
			list.add(i);
		}
		System.out.print("Original List : ");
		System.out.println(list);
		
		System.out.print("Index 0 element removed : ");
		list.remove(0);// index 0 element removed
		System.out.println(list);
		
		System.out.print("Value 3 removed : ");
		list.remove(Integer.valueOf(3));// Value 3 removed 
		System.out.println(list);
		
		
	}
}

/*
Original List : [1, 2, 3, 4, 5]
Index 0 element removed : [2, 3, 4, 5]
Value 3 removed : [2, 4, 5]
 */

// Q3) Write a program to remove element from ArrayList which contains only numbers 
// (ArrayList<Integer>) by using remove method of List interface as well as remove method of Collcetion interface. 