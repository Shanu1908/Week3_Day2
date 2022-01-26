package week3.day2;

import java.util.Scanner;

public class SecondLargestCollections {

	    public static void main(String args[]) {
	        Scanner type = new Scanner(System.in);
	        int num = 1, max1st = 0, max2nd = 0;
	        int count = 1;
	        System.out.println("Finding the second largest");
	        System.out.println("Print Largest value and the Second largest value");
	        while(num != 0) {
	            System.out.print("Integer No." + count + " ");
	            num = type.nextInt();

	            if(num >= max1st && num >= max2nd) {
	                max1st = num;
	            }
	            if(num >= max2nd && num < max1st) {
	                max2nd = num;
	            }
	            count++;
	        }
	        System.out.println("The largest value is " + max1st);
	        System.out.println("The second largest value is " + max2nd);

	   }}