package week3.day2;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Learnset {

	public static void main(String[] args ){
		
		Set<String> names = new HashSet<String>();

		boolean isPresent = names.add("Shankari");
		
		//Add value to list
		names.add("Shankari");
		names.add("Narayanan");
		names.add("Is Smart");
		
		boolean isDuplicate = names.add("Shankari");
		
		System.out.println(isPresent);
		System.out.println(isDuplicate);
	
		
		//Set doesn't have get()
		
		List<String> list = new ArrayList<String>(names);
		 
		System.out.println(list);
		System.out.println(list.get(0));
	}
	
	}
