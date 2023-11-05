package com;
/* 
Q) A Tech number has even number of digits.
   If the number is split int two equal halves,
   then the square of sum of these halves 
   is equal to the number itself. 
   Write a program to generate and print all four
   digit Tech numbers.
   Example:
   Consider the number 3025
   Square of sum of the halves of 3025 = (30 + 25)²
                                       = (55)²
                                       = 3025
   Therefore 3025 is a Tech number.
 
 ===================================================*/
public class Aa71_Q_Tech_no 
{
	public static void main(String args[])
	{
 
	 int i;
	 int j = 9999;
	 
	
	 
	 for( i= 1000; i <= j; i++)
	 {
		 int firsthalf = i /100;
		 int secondhalf = i % 100;
		 int sum = firsthalf + secondhalf;
		 
			 if (i == sum * sum)
			 System.out.println(i);
		 
	 }
	}
}


