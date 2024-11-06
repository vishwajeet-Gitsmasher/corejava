package Day_18;

class Person {
	int eyes;
	int ears;
	int hands;
	String name;

	public Person(int eyes, int ears, int hands, String name) {
		this.eyes = eyes;
		this.ears = ears;
		this.hands = hands;
		this.name = name;
	}

	void eat() {
		System.out.println(name + " eats food");
	}

	void sleep() {
		System.out.println(name + " sleeps for 8 hours");
	}
}

class Student1 extends Person {
	int studentId;
	double marks;
	String course;
	Address add;

	public Student1(int eyes, int ears, int hands, String name, int studentId, double marks, String course, Address add) {
		super(eyes, ears, hands, name);
		this.studentId = studentId;
		this.marks = marks;
		this.course = course;
		this.add = add;
	}

	void read() {
		System.out.println("Student " + name + " reads books");
	}

	void writeExam() {
		System.out.println("Student " + name + " writes an exam");
	}

	void travelToCollege(Bike b) { // USES-A
		b.start();
		b.stop();
	}

	@Override
	public String toString() {
		return "Student1 [studentId=" + studentId + ", marks=" + marks + ", course=" + course + ", add=" + add + "]";
	}
}

class Employee extends Person { // IS-A
	int empId;
	double salary;
	String designation;
	Address add; // HAS-A

	public Employee(int eyes, int ears, int hands, String name, int empId, double salary, String designation, Address add) {
		super(eyes, ears, hands, name);
		this.empId = empId;
		this.salary = salary;
		this.designation = designation;
		this.add = add;
	}

	void work() {
		System.out.println("Employee " + name + " works for 8 hours a day");
	}

	void maintenance() {
		System.out.println("Employee " + name + "'s maintenance cost is 1000 rs per day");
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", designation=" + designation + ", add=" + add + "]";
	}
}

class Address {
	String city;
	int houseNum;
	String district;
	int pincode;

	public Address(String city, int houseNum, String district, int pincode) {
		this.city = city;
		this.houseNum = houseNum;
		this.district = district;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", houseNum=" + houseNum + ", district=" + district + ", pincode=" + pincode + "]";
	}
}

class Bike {
	int wheels;
	String brandName;
	int numOfGears;

	public Bike(int wheels, String brandName, int numOfGears) {
		this.wheels = wheels;
		this.brandName = brandName;
		this.numOfGears = numOfGears;
	}

	void start() {
		System.out.println("Bike started");
	}

	void stop() {
		System.out.println("Bike stopped");
	}

	@Override
	public String toString() {
		return "Bike [wheels=" + wheels + ", brandName=" + brandName + ", numOfGears=" + numOfGears + "]";
	}
}

public class Test {
	public static void main(String[] args) {
		Address empAddress = new Address("Mumbai", 123, "Mumbai", 400001);
		Employee e1 = new Employee(2, 2, 2, "John", 101, 500000, "Software Engineer", empAddress);
		System.out.println(e1);
		e1.work();
		e1.maintenance();
		e1.eat();
		e1.sleep();
		
		System.out.println("===============================================================================================");

		Address stuAddress = new Address("Pune", 456, "Pune", 411001);
		Student1 s1 = new Student1(2, 2, 2, "Alice", 202, 85.5, "Computer Science", stuAddress);
		System.out.println(s1);
		s1.read();
		s1.writeExam();
		s1.eat();
		s1.sleep();
		
		Bike bike = new Bike(2, "Yamaha", 5);
		s1.travelToCollege(bike);
	}
}
/*
Employee [empId=101, salary=500000.0, designation=Software Engineer, add=Address [city=Mumbai, houseNum=123, district=Mumbai, pincode=400001]]
Employee John works for 8 hours a day
Employee John's maintenance cost is 1000 rs per day
John eats food
John sleeps for 8 hours
===============================================================================================
Student1 [studentId=202, marks=85.5, course=Computer Science, add=Address [city=Pune, houseNum=456, district=Pune, pincode=411001]]
Student Alice reads books
Student Alice writes an exam
Alice eats food
Alice sleeps for 8 hours
Bike started
Bike stopped

*/
