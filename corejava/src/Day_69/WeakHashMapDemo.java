package Day_69;

import java.util.WeakHashMap;

record Product(int id,String name) {
	
}

public class WeakHashMapDemo {

	public static void main(String[] args) {
		WeakHashMap<Product,String> map = new WeakHashMap<>();
		Product p1 = new Product(1,"Mobile");
		map.put(p1, "Hyderabad");
		System.out.println(map);
		
		p1=null;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.gc();
		System.out.println(map);
		
		
	}

}

/*
{Product[id=1, name=Mobile]=Hyderabad}
{}

 */

/*
Write a program to show that WeakHashMap keys are weak in comparison to HashMap, 
if key is a reference key and it's value is set to be null.

*/