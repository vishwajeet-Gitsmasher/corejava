package Day_69;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String,String>();
		String s1 = "India";
		String s2 = new String("India");
		map.put(s1, "FisrtValue");
		map.put(s2, "SecondValue");
		
		System.out.println("Simple HashMap : "+map);
		System.out.println("Simple HashMap Size: "+map.size());
		
		System.out.println("s1 hashcode : "+s1.hashCode());
		System.out.println("s2 hashcode : "+s2.hashCode());
		
		IdentityHashMap<String,String> map2 = new IdentityHashMap<String,String>();
		String s3 = "India";
		String s4 = new String("India");
		map2.put(s3, "ThirdValue");
		map2.put(s4, "FourthValue");
		
		System.out.println("IdentityHashMap : "+map2);
		System.out.println("IdentityHashMap Size : "+map2.size());
		
		System.out.println("s3 IdentityHashCode : "+System.identityHashCode(s3));
		System.out.println("s4 IdentityHashCode : "+System.identityHashCode(s4));
		
		

	}

}

/*
Simple HashMap : {India=SecondValue}
Simple HashMap Size: 1
s1 hashcode : 70793495
s2 hashcode : 70793495
IdentityHashMap : {India=ThirdValue, India=FourthValue}
IdentityHashMap Size : 2
s3 IdentityHashCode : 1618212626
s4 IdentityHashCode : 1129670968
 */

/*
Program 02 :
------------
Write a program to show the internal working of IdentityHashMap in comparison to HashMap.
*/