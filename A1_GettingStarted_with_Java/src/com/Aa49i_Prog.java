package com;
class Prog49
{
	int x,y;
	
	
	public void assign(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public void show()
	{
		System.out.println("Value of x "+ x);
		System.out.println("Value of y "+y);
	}
}
public class Aa49i_Prog
{
	public static void main(String args[])
	{
		Prog49 p1=new Prog49();
		p1.assign(4,5);
		p1.show();
		
		Prog49 p2=new Prog49();
		p2.assign(8,9);
		p2.show();
		
		Prog49 p3=new Prog49();
		p3.assign(24,37);
		p3.show();
	}
}