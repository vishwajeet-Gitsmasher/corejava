package Day_48;

public class ChildClass extends ParentClass{
	public void loadingClass(String className) throws ClassNotFoundException{
		if(className.length()==0) {
			throw new IllegalArgumentException("Class name cannot be empty");
		} else {
			super.loadingClass(className);
		}
	}
}

/*
Create a subclass BLC named ChildClass:

Override the loadingClass method.
method name : loadingClass
Access modifier : public 
return type : void
parameter :String

Handle the case for an empty string, throwing IllegalArgumentException with message "Class name cannot be empty".
Call the superclass method if the string is valid.
Handle the ClassNotFoundException within the method .
*/