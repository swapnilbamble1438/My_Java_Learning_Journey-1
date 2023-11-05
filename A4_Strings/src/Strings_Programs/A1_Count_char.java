/*
 Java Program to count the total number of characters 
 in a string
 */
package Strings_Programs;

import java.util.Scanner;

public class A1_Count_char {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
//System.out.println("Enter any sentence: ");
		String str = "My name is Swapnil";
		
		int count = 0;
		
		// Counts each character except space
		for(int i = 0;i < str.length(); i++)
		{
			if(str.charAt(i) != ' ')
				count ++;
		}
		System.out.println("Total number of characters in a string: " + count);
				
		
	}
}
