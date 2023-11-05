package com;
class MyMaths
{
	int x,y;
	MyMaths()
	{
		x = 10;
		y = 20;
	}
	
	MyMaths(int a,int b)
	{
		x=a;
		y=b;
	}
	public void show()
	{
		System.out.println("Value of x "+ x);
		System.out.println("Value of y "+y);
	}
}
public class Aa45_Mymaths {
	public static void main(String args[])
	{
		MyMaths m1=new MyMaths();
		m1.show();
		MyMaths m2=new MyMaths(34, 45);
		m2.show();
		MyMaths m3=new MyMaths(13, 23);
		m3.show();
	}
}