package com;
import java.util.Scanner;
class Aa28i_Nestedloop
{
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
		
	  System.out.print("Enter no of rows ");
	  int n = sc.nextInt();
	
	

	   for(int r = 1; r <= n ; r ++)
	    {
		for(int c = n; c >= r; c --)
		{
			System.out.print("*");
		}
		System.out.println();
	    }

	}
}