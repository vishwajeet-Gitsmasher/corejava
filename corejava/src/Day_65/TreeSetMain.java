package Day_65;

import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		try {
			System.out.println("1) Sort based on the pid in ascending order.");
			TreeSet<Product> set1 = new TreeSet<>((p1,p2)->p1.pid().compareTo(p2.pid()));
			set1.add(new Product(3,"Television"));
			set1.add(new Product(1,"Mobile"));
			set1.add(new Product(2,"Fridge"));
		
			System.out.println(set1);
			System.out.println("=============================================================");
			
			System.out.println("2) Sort based on the pid in descending order.");
			TreeSet<Product> set2 = new TreeSet<>((p1,p2)->p2.pid().compareTo(p1.pid()));
			set2.add(new Product(3,"Television"));
			set2.add(new Product(1,"Mobile"));
			set2.add(new Product(2,"Fridge"));
		
			System.out.println(set2);
			System.out.println("=============================================================");
			
			System.out.println("3) Sort based on the name in Alphabetical order.");
			TreeSet<Product> set3 = new TreeSet<>((p1,p2)->p1.pname().compareTo(p2.pname()));
			set3.add(new Product(3,"Television"));
			set3.add(new Product(1,"Mobile"));
			set3.add(new Product(2,"Fridge"));
		
			System.out.println(set3);
			System.out.println("=============================================================");
			
			System.out.println("4) Sort based on the name in Reverse order.");
			TreeSet<Product> set4 = new TreeSet<>((p1,p2)->p2.pname().compareTo(p1.pname()));
			set4.add(new Product(3,"Television"));
			set4.add(new Product(1,"Mobile"));
			set4.add(new Product(2,"Fridge"));
		
			System.out.println(set4);
			System.out.println("=============================================================");
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		
	}

}

/*
1) Sort based on the pid in ascending order.
[Product[pid=1, pname=Mobile], Product[pid=2, pname=Fridge], Product[pid=3, pname=Television]]
=============================================================
2) Sort based on the pid in descending order.
[Product[pid=3, pname=Television], Product[pid=2, pname=Fridge], Product[pid=1, pname=Mobile]]
=============================================================
3) Sort based on the name in Alphabetical order.
[Product[pid=2, pname=Fridge], Product[pid=1, pname=Mobile], Product[pid=3, pname=Television]]
=============================================================
4) Sort based on the name in Reverse order.
[Product[pid=3, pname=Television], Product[pid=1, pname=Mobile], Product[pid=2, pname=Fridge]]
=============================================================

 */

/*
Create one TreeSet class which will hold the Custom product object.

With the help of TreeSet constructor using Comparator interface, write the logic to sort the Product data on the following basis
 
1) Sort based on the pid in ascending order.
2) Sort based on the pid in descending order.
3) Sort based on the name in Alphabetical order.
4) Sort based on the name in Reverse order.
----------------------------------------------------------------------
*/