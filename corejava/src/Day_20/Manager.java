package Day_20;

public class Manager extends Employee{
	String department;

	public Manager(String name, double salary, String department) {
		super(name, salary);
		this.department = department;
	} 
	
	void manage() {
		System.out.println(this.name+" is managing sales Department");
		System.out.println(super.name+" is managing sales Department");
		System.out.println(name+" is managing sales Department");
	}
	
	
}
