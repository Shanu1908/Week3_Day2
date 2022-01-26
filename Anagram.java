package week3.day2;

import java.io.*;
import java.util.*;
public class Anagram {

	static int NO_CHARS = 256;
/* Below is a function which checks if the strings are anagram */
static boolean isAnagram(char strana1[], char strana2[])
{
// Here we create two arrays and initialize it to 0
int cnt1[] = new int[NO_CHARS];
Arrays.fill(cnt1, 0);
int cnt2[] = new int[NO_CHARS];
Arrays.fill(cnt2, 0);
int i;
// For every character in input strings, increment the count
for (i = 0; i < strana1.length && i < strana2.length;
i++) {
cnt1[strana1[i]]++;
cnt2[strana2[i]]++;
}
// Checking If both strings are of different length
if (strana1.length != strana2.length)
return false;
// Compare count arrays
for (i = 0; i < NO_CHARS; i++)
if (cnt1[i] != cnt2[i])
	
return false;
return true;
}
/* Main program to test to check if string is Anagram or not*/
public static void main(String args[])
{
char strana1[] = ("stops").toCharArray();
char strana2[] = ("potss").toCharArray();
if (isAnagram(strana1, strana2))
System.out.println("The strings to be checked are" + " anagram of each other");
else
System.out.println("The strings to be checked are not" + " anagram of each other");
}
}