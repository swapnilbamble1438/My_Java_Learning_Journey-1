package com;
/*
Q) Write a program to overlaoad a function "calculation()"
   three times to perform
   the following:
   a. Factorial of a integer value (taking int as argument and
      return type).
   b. Reverse of a long value (taking long as argument but
      no return type).
   c. Adding three integer values without using '+' operator 
      (with 3 int argument and int return type).
   Use main method to call all the functions.
   
=======================================================================*/    

class Aa53_Calculation
{
	public int Calculation(int x)
	{
		int f =1;
		for(int i = 1; i <= x; i++)
		{
			f = f* i;
		}
		return f;
	}
	public void Calculation(long x)
	{
		long rev = 0;
		while(x>0)
		{
			long rem = x % 10;
			x = (int)x/10;
			rev = rev * 10 + rem;
		}
		System.out.println("Reverse is " + rev);
	}
	public int Calculation(int x, int y, int z)
	{
		x = x-(-y);
		x = x-(-z);
		return x;
	}
	public static void main(String [] args)
	{
		Aa53_Calculation q1 = new Aa53_Calculation();
		
		System.out.println("Factorial is " + q1.Calculation(5));
		
		q1.Calculation(12345L);
	
		System.out.println("Addition " + q1.Calculation(10,20,30));
		
	}
	
}

