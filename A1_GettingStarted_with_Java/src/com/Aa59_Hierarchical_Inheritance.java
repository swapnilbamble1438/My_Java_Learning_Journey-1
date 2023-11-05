package com;
/*
	If a number of classes are derived from a single base class,
	it is called Hierarchical Inheritance.
 */


class C
{
	public void show()
	{
		System.out.println("class c show");
	}
}
class D extends C
{
	public void display()
	{
		System.out.println("class D display");
	}
}

class E extends C
{
	public void display()
	{
		System.out.println("class E Display");
	}
}
public class Aa59_Hierarchical_Inheritance 
	{
		public static void main(String args[])
		{
		D d1 = new D();
		d1.display();
		d1.show();
		
		E e1 = new E();
		e1.display();
		e1.show();
	}
}
