package com;
/*
 when we need to access non static functions of a class
 we need to create an object of class.
 object is created using following syntax:
 
 <class name> <object name> = new <class name>();
 
 one example is: Scanner sc = new Scanner(System.in);
 
 non static function are called using object of class
 
 <object name>.<function name>(<values need to be passed>);
 */

class Non_static_func
{

	public int add(int x, int y)
	{
		int z = x + y;
		return z;
		
	}
		
}

class Aa42_Non_static_function
{
	public static void main(String args[])
	{
		// create an object of First Class
		// <class name> <object name> = new <class name>();
		
		Non_static_func ns = new Non_static_func();
		
		// non static function are called using object of class
		// <object name>.<function name>(<values need to be passed>);
		System.out.println("Addition " + ns.add(34, 55));
	
	}
}