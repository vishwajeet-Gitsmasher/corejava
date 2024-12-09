package Day_31;

public class Person {
	private String name;
	private Address address;
	
	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public void display() {
		System.out.println("Person name : "+this.name);
		System.out.print("Person Address : ");
		System.out.println(address);
	}
}

/*
Create Person Class:
--------------------
Implement a class with private fields for the name and an Address object.
Provide a constructor to initialize the name and address.
Implement a method to display the person's name and address.
*/