package Day_64;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ELC_Class2 {

	public static void main(String[] args) {
		ArrayList<Customer> listOfCustomers = new ArrayList<>();
		listOfCustomers.add(new Customer(333, "Scott",10d));
		listOfCustomers.add(new Customer(111, "Zuber",20d));
		listOfCustomers.add(new Customer(222, "Aryan",30d));
		
		
		System.out.println("Sorting based on CustomerNumber : ");
		Collections.sort(listOfCustomers,(c1,c2)->c1.getCustomerNumber().compareTo(c2.getCustomerNumber()));
		for(Customer c:listOfCustomers) {
			System.out.println(c);
		}
		
		System.out.println("==================================================================");
		
		System.out.println("Sorting based on CustomerName : ");
		Collections.sort(listOfCustomers,(c1,c2)->c1.getCustomerName().compareTo(c2.getCustomerName()));
		for(Customer c:listOfCustomers) {
			System.out.println(c);
		}
		
		System.out.println("==================================================================");
		
		System.out.println("Sorting based on CustomerBill : ");
		Collections.sort(listOfCustomers,(c1,c2)->c1.getCustomerBill().compareTo(c2.getCustomerBill()));
		for(Customer c:listOfCustomers) {
			System.out.println(c);
		}

	}

}

/*
Sorting based on CustomerNumber : 
Customer [customerNumber=111, customerName=Zuber, customerBill=20.0]
Customer [customerNumber=222, customerName=Aryan, customerBill=30.0]
Customer [customerNumber=333, customerName=Scott, customerBill=10.0]
==================================================================
Sorting based on CustomerName : 
Customer [customerNumber=222, customerName=Aryan, customerBill=30.0]
Customer [customerNumber=333, customerName=Scott, customerBill=10.0]
Customer [customerNumber=111, customerName=Zuber, customerBill=20.0]
==================================================================
Sorting based on CustomerBill : 
Customer [customerNumber=333, customerName=Scott, customerBill=10.0]
Customer [customerNumber=111, customerName=Zuber, customerBill=20.0]
Customer [customerNumber=222, customerName=Aryan, customerBill=30.0]

 */

/*

Implement Comparator interface to write the logic to sort the Customer class based on the following 
a) Based on customer number
b) Based on customer name
c) Based on customer bill
Create an ELC class which contains main method, create ArrayList object to hold Customer data as 
well as sort the Customer data object based on the above criteria
*/