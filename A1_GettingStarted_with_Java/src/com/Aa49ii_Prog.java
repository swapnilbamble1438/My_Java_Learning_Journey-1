package com;
class Prog49ii
{
	int x;
	static int y;
	
	
	public void assign(int x,int y)
	{
		this.x=x;
		Prog49ii.y=y;
	}
	public void show()
	{
		System.out.println("Value of x "+ x);
		System.out.println("Value of y "+y);
	}
}
public class Aa49ii_Prog
{
	public static void main(String args[])
	{
		Prog49ii p1=new Prog49ii();
		p1.assign(4,5);
		p1.show();
		
		Prog49ii p2=new Prog49ii();
		p2.assign(8,9);
		p2.show();
		
		Prog49ii p3=new Prog49ii();
		p3.assign(24,37);
		p3.show();
	}
}