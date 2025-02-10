package Day_62;

import java.util.ArrayList;

public class mergeCollection {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("grapes");
		list.add("banana");
		list.add("amla");
		list.add("orange");
		System.out.print("Original List : ");
		System.out.println(list);
		
		ArrayList<String> list2 = new ArrayList<>();
		
		list2.addAll(list);
		System.out.print("Merged List : ");
		System.out.println(list2);
	}

}


// Q4) Write a program to merge to Collection data which contains fruits name.