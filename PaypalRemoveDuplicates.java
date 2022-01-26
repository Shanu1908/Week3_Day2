package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PaypalRemoveDuplicates {

	// Input: "PayPal India"
	// Output:PaylIndia


		public static void main(String[] args) {		
			
//			Declare a String as PayPal India
			String s = "Paypal India";
			
			List<String> list = new ArrayList<String>();

//			Convert it into a character array

		char[] chArray = s.toCharArray();
		
		
//			Declare a Set as charSet for Character
 Set <Character> charSet = new HashSet<Character>();
 
//			Declare a Set as dupCharSet for duplicate Character
 Set <Character> dupSet = new HashSet<Character>();
//			Iterate character array and add it into charSet

//	if the character is already in the charSet then, add it to the dupCharSet
for (char eachChar: chArray) {
	boolean add= charSet.add(eachChar);
	if (!add) {
		dupSet.add(eachChar);
		
	}
System.out.println(dupSet);

	}
		}
}


//			Check the dupCharSet elements and remove those in the charSet

//			Iterate using charSet

//			Check the iterator variable isn't equals to an empty space

//			print each character for charSet

