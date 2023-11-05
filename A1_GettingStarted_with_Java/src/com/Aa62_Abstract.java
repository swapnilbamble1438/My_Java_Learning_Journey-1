package com;
abstract class Def
{
	public abstract void show();
	public void showme()
	{
		System.out.println("showme of Def");
	}
}
class Jkl extends Def
{
	public void show()
	{
		System.out.println("show of Jkl from Def");
	}
	
	public void display()
	{
		System.out.println("display of Def");
	}
}
class Mno extends Def
{
	public void show()
	{
		System.out.println("show of Mno from Def");
	}
}
public class Aa62_Abstract
{
	public static void main(String args[])
	{
	Def d1;
	Jkl j1 = new Jkl();
	j1.display();
	d1 = j1;
	d1.show();
	d1.showme();
	d1 = new Mno();
	d1.show();
	
	}
}
