package Day_70;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Duplicates {
	List<Integer> numberList = new ArrayList<Integer>();
	
	public List<Integer> getNumberList() {
		return numberList;
	}

	public void setNumberList(List<Integer> numberList) {
		this.numberList = numberList;
	}

	public Duplicates() {
		super();
	}

	public Duplicates(List<Integer> numberList) {
		super();
		this.numberList = numberList;
	}
	
	public List<Integer> getDuplicatesList() {
		List<Integer> dup = new ArrayList<>();
		LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
		for(Integer i:this.numberList) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		for(Map.Entry<Integer, Integer> entry :map.entrySet()) {
			if(entry.getValue()>1) {
				dup.add(entry.getKey());
			}
		}
		return dup;
	}
	

	public static void main(String[] args) {
		List<Integer> res = Arrays.asList(33,45,67,89,33,47,21,45);
		Duplicates d = new Duplicates(res);
		
		List<Integer> duplicateList = d.getDuplicatesList();
		System.out.println(duplicateList);
		
		System.out.println("==========");
		
		res = Arrays.asList(66,66,77,66,66);
		d = new Duplicates(res);
		
		duplicateList = d.getDuplicatesList();
		System.out.println(duplicateList);

	}

}

/*
[33, 45]
==========
[66]
 */

/*
Program: 3
----------------
Write a java program to find duplicates in an arrayList.
A BLC class Duplicates is given to you. Add the following 
implementations in the class:
1. A List attribute called numberList. This must be a list of Integers
3
2. Getter/Setter for the list
3. Implement the No Argument constructor.
 Implement the parameter constructor.
 Implement the method getDuplicatesList():
4. This method must scan through the numberList field of the class. 
All the numbers in the list that are duplicated
 (occurs more than once) must be returned as a new List. 
 For example, if the numberList is initialized to { 
33,45,67,89,33,47,21,45}, the method should return a new list that 
contains { 33,45}.
 Note that a number may be repeated any number of times in the 
list, but it should be present in the returned list only once. 
 For example, if the numberList is initialized to { 66,66,77,66,66}, 
the method should return a new list that contains { 66}.
5. If the numberList is empty, or null, return null.
*/