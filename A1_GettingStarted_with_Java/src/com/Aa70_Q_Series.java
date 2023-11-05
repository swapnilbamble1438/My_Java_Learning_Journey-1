package com;
/*
Q) Design a class to overloaod a function series() as follows:
   a) void series(int x, int n) - To display the sum of the series 
   								  given below:
      x¹ + x² + x³ + ..........xⁿ terms
   b) void series (int p) - To display the following series:
      0, 7, 26, 63 p terms.
   c) void series() - To display the sum of the series given below:
      1/2 + 1/3 + 1/4 .....1/10

=======================================================================*/
import java.io.*;
import java.util.*;
class Aa70_Q_Series 
{
	
	void series(int x, int n)
	{
		int i;
		
		double sum = 0;
		for (i =1; i <= n; i++ )
		{
			double a;
			a = Math.pow(x, i);
			sum = sum + a;
		}
		System.out.println("Sum: " + sum);
	}
	
	void series(int p)
	{
		int i;
		for(i = 1; i <= p; i++)
		{
			System.out.println((i * i * i)-1);
		}
		
	}
	
	void series()
	{
		
		double sum = 0;
		int i;
		int j = 2;
		for (i = 1;i <= 10; i++)
		{
			
			sum = sum + i/j;
		}
		System.out.println("Sum:" + sum);
	}
	public static void main(String args[])
	{
		Aa70_Q_Series z1 = new Aa70_Q_Series();
		z1.series(4,5);
		z1.series(4);
		z1.series();
	}


}
