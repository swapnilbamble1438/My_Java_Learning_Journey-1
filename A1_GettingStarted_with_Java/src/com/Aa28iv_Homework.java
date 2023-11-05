package com;

public class Aa28iv_Homework 
{

	public static void main(String[] args) 
	{

		for(int r = 1; r <= 5; r ++)
		{
			for(int sp = 5; sp > r; sp --)
			{
				System.out.print(" ");
			}
		
	    	for(int c = 1; c <= r; c ++)
		    {
		    	System.out.print(c);
		    }
		    System.out.println();
		}
		
	}

			// output
			//	    1
			//	   12
			//	  123
			//	 1234
			//	12345

}
