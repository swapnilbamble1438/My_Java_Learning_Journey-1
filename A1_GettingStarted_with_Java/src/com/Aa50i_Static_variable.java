package com;
/*
Method overloading / function overloading:

when a class consists of more than one method which 
has same name but different parameters either in term
of number of parameters or in term of their datatype

=========================================================
Static member(variable):

A class can have static member variable and methods for
calling static member we don't need to create an object 
of class.
because static means common for all objects.
static member can be accessed using ClassName.

The static variable gets memory only once 
in the class area at the time of class loading.
==========================================================
*/
class Staticvar
{
	int x;
	static int y=10;

	public void assign(int x)
	{
		this.x=x;
		
	}
	public void show()
	{
		System.out.println("Value of x "+ x);
		System.out.println("Value of y "+y);
	}
}
public class Aa50i_Static_variable
{
	public static void main(String args[])
	{
		Staticvar sv1 = new Staticvar();
		sv1.assign(4);
		sv1.show();
		
		Staticvar sv2 = new Staticvar();
		sv2.assign(4);
		sv2.show();
		
		Staticvar sv3 = new Staticvar();
		sv3.assign(4);
		sv3.show();
		
		
	}
}