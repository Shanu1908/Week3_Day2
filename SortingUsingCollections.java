package week3.day2;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class SortingUsingCollections {


	public static void main(String[] args) {

		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
//		Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		

		List<String> companies = Arrays.asList(input);
//		get the length of the array		
		int size= companies.size();
		int length = input.length;

//		sort the array	
		Collections.sort(companies);
//		Iterate it in the reverse order
     
//		print the array
		for (int i = size-1; i>=0; i-- ) {
			System.out.println(companies.get(i));
		
		}
		for (int i = length-1; i >=0; i--) {
			System.out.println(input[i]);
		}
			
//		Required Output: Wipro, HCL , CTS, Aspire Systems

	}


}
