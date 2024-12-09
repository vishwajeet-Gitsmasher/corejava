package Day_35;

public class HospitalStaff {
	private String name;
	private int age;
	private String role;
	
	public HospitalStaff(String name, int age, String role) {
		super();
		this.name = name;
		this.age = age;
		this.role = role;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void work() {
		System.out.println(this.name + "is working massage");
	}
}

/*
Question-2
---------------
 Design a  Java program that models a Hospital Management System using inheritance:

Create class HospitalStaff with following attributes

declare variable:

private String name;
private int age;
private String role;

create one parameterized Constructor and initialize values

method Name:- work()
Access modifier :-public
return type:-void

this method will print the role and there name with "is working massage"
*/