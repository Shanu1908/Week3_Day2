package week3.day2;

import java.util.Arrays;
public class Reverseevenwords {

	    public static void main (String[]args)
	    {
	    	String testing = "I am a software tester";

	    	String[] p = testing.split(" ");
	    	for (int i = 1; i < p.length; i += 2)
	    	    p[i] = new StringBuilder(p[i]).reverse().toString();
	    	System.out.println(String.join(" ", p));
	    	
	    }
}