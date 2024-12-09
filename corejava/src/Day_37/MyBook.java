package Day_37;

public class MyBook extends Book{
	
	public MyBook() {
		super();
	}

	public void setTitle(String title) {
		super.title = title;
	}
	
	public String getTitle() {
		return "The title of my book is: "+super.title;
	}
}

/*
Create a sub classes of  Book called MyBook class with following specifications 
Methods: 
override setTitle from parent class.
        This method takes the book title as parameter and assigns it into the instance variable of parent class.
override getTitle from parent class.
 This method returns the name of the book in the format mentioned below in Sample Output.
*/