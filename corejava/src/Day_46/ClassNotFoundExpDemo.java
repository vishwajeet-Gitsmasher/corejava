package Day_46;

//class TestClass{
//	static {
//		System.out.println("Hi how are you");
//	}
//}

public class ClassNotFoundExpDemo {
	
	public ClassNotFoundExpDemo() { 
		Class c; 
		try { 
			c = Class.forName("Day_46.TestClass"); 
		} catch (ClassNotFoundException e) { 
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ClassNotFoundExpDemo c = new ClassNotFoundExpDemo();
	}
}

/*
java.lang.ClassNotFoundException: Day_46.TestClass
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:525)
	at java.base/java.lang.Class.forName0(Native Method)
	at java.base/java.lang.Class.forName(Class.java:375)
	at Day_46.ClassNotFoundExpDemo.<init>(ClassNotFoundExpDemo.java:14)
	at Day_46.ClassNotFoundExpDemo.main(ClassNotFoundExpDemo.java:21)

 */


/*
4. ClassNotFoundException…
a. Write a program to create a class ‘ClassNotFoundExpDemo’ which implements default constructor as follows ,
public ClassNotFoundExpDemo { Class c; try { c = Class.forName("TestClass"); } catch (ClassNotFoundException e) { // deal with the exception here ... e.printStackTrace(); } }
b. Implement the main method and inside main method create an object of ClassNotFoundExpDemo class.
c. Now check the O/P.

*/