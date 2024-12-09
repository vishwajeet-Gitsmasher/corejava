package Day_31;

public class Address {
	private String street;
	private String city;
	
	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	
}

/*
Que 3 : Modeling Employee and Address Details 
==============================================

Create Address Class:
---------------------
Implement a class with private fields for the street and city.
Provide a constructor to initialize these fields.
Implement getters and a toString() method to display the address.

*/