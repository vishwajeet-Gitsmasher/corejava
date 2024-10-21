package Day_10;

public class Dog {
	
	// properties :
	String name;
	double height;
	int age;
	
	// Behavior:
	public void getDogInformation() {
		System.out.println("Dog Name : "+name);
		System.out.println("Dog Height : "+height);
		System.out.println("Dog age : "+age);
	}
	
	
	public void bark() {
		System.out.println("BOW BOW");
	}
	
}
