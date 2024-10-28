package Day_15;

public class CheckNumber {
	public static boolean checkNumber(int n) {
		if(n<1) {
			return false;
		}
		
		while(n>1) {
			if(n%2!=0) {
				return false;
			}
			n/=2;
		}
		return true;
	}
}

/*
Verify if the give number is power of 2 or not
Create a method to check if a number is a power of two or not
Method Description :-
Method Name: 	checkNumber 
Access Modifier : public,static
Argument :	int  
Return Type :	boolean 
Logic 	Check if the input is a power of two. 
Ex: 8 is a power of 2 
*/