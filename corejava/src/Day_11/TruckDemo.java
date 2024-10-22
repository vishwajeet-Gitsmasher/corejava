package Day_11;

import java.util.Scanner;

public class TruckDemo {

	public static void main(String[] args) {
		Truck p = new Truck();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Truck ID : ");
		int id = sc.nextInt();
		System.out.print("Enter Truck Name : ");
		String name = sc.next();
		System.out.print("Enter Truck Price : ");
		double price = sc.nextDouble();
		
		p.settruckData(id,name,price);
		p.gettruckInfo();

	}

}

/*
Enter Truck ID : 2374
Enter Truck Name : Mahindra
Enter Truck Price : 2300000
Truck ID : 2374
Truck Name : Mahindra
Truck Price : 2300000.0
*/