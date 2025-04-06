package Day_73;

import java.util.Arrays;

public class ConvertBoolean {
	public static void main(String[] args) {
		Boolean[] flags = {true, false, true, false, true};
		Object[] f =  Arrays.stream(flags).map(b -> b?"Yes":"No").toArray();
		System.out.println("Yes/No Values:"+Arrays.toString(f));
		
	}
}


// Yes/No Values:[Yes, No, Yes, No, Yes]

/*
Q9) WAP to convert boolean value to "Yes" or "No"

Boolean[] flags = {true, false, true, false, true};

Yes/No Values: [Yes, No, Yes, No, Yes]
*/