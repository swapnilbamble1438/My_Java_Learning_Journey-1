package com;
/*
Q) Write a program to input a sentence and convert it
into uppercase and count and display the total number
of words starting with a letter 'A'.
Example:
Sample Input:  ADVANCEMENT AND APPLICATION OF INFORMATION 
               TECHNOLOGY ARE EVER CHANGING.
Sample Output: Total number of words starting with letter 'A' = 4.              

 =================================================================*/

import java.util.Scanner;
public class Aa68_Q_uppercase 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		System.out.println(str.toUpperCase());
		
		str = " " + str;
		
		int len = str.length();
		System.out.println(len);
		
		int c = 0;
		
		for(int i = 0; i < len -1 ; i++)
		{
			if(str.charAt(i) == ' ' && str.charAt(i + 1) == 'a')
				c++;
		}
		System.out.println("Total number of words starting with letter 'A' = " + c);
	}
}
