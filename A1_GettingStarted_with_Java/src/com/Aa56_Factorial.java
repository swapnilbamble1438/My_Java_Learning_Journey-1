package com;
/*
Q)Write a program to perform factorial of a nmuber by
  overloading three constructor methods viz; 
  default constructor, parameterized constructor and
  copy constructor respectively. Create a "show()" method
  to display the factorial of the number.
=============================================================*/
class Fact
{
	
		int f;
		int x= 1;
		Fact()
		{
			
		}
		Fact(int x)
		{
			this.x=x;
			f=1;
			for(int i=1; i<=x;i++)
			{
				f = f*i;
			}
		}
		Fact(Fact copy)
		{
			this.x = copy.x;
		}
		public void show()
		{
			System.out.println("Factorial of 5 is "+ f);
		}
}
		public class Aa56_Factorial
		{
			public static void main(String[] args)
			{
				Fact ft = new Fact(5);
				ft.show();
			}
		}