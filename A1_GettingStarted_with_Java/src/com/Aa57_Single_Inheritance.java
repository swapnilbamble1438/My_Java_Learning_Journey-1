package com;
/*
   Single Inheritance
   In single inheritance, a sub-class is derived from only one super class.
   It inherits the properties and behaviour of a single-parent class.
   Sometimes it is also known as simple inheritance.
 */


class A
{
	public void show()
	{
		System.out.println("Show of class A");
	}
}
class B extends A
{
	
	public void display()
	{
		System.out.println("Display of Class B");
	}
}

public class Aa57_Single_Inheritance
{	
	public static void main(String args[])
	{
		B b1 = new B();
		b1.display();
		b1.show();
		
	}
	
}
