package week3.day2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Printingduplicates {

	   public static void main(String[] args) {
	      ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,45,55,3,32,22,22,55,1));
	      HashSet<Integer> identify = new HashSet<>();
	      HashSet<Integer> Hit = new HashSet<>();
	      for (Integer integer : arr) {
	         if(!identify.add(integer)) {
	            Hit.add(integer);
	         }
	      }
	      System.out.println("Duplicate integers in given list is/are " + Hit);
	   }
	}
