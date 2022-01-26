package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Missingelement {

	public static void main(String[] args ){
		

		// declaring an ArrayList to hold the random numbers
		ArrayList<Integer> myArraylist = new ArrayList<>();
		// declaring an ArrayList to hold the missing numbers
		ArrayList<Integer> missingNumbers = new ArrayList<>();

		int maxRanNumb = 8;// random numbers will be 0-5
		int size = 16; // size of myArrayList

		for (int j = 0; j < size; j++) {
		// Generating random numbers
		Random rand = new Random();
		int randomNumber = rand.nextInt(maxRanNumb);
		// Put random numbers into myArrayList
		myArraylist.add(randomNumber);
		}
		// Print myArrayList
		System.out.println("Contents of myArraylist: " + myArraylist);

		// Searching of missing number
		for (int j = 0; j < maxRanNumb; j++)
		if (!myArraylist.contains(j)) {
		// Put missing numbers into missingNumbers
		missingNumbers.add(j);
		}
		// Print missingNumbers
		System.out.println("Missing numbers is : " + missingNumbers);

		}

		}

