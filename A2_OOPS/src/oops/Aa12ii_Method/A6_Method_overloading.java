/*
 Method Overloading
With method overloading, multiple methods can have the same name
with different parameters:
 */

package oops.Aa12ii_Method;

public class A6_Method_overloading 
{
	// 1st way
	// Consider the following example, which has two methods 
	// that add numbers of different type:
	
	static int myMethod(int x, int y)
	{
		return x + y;
	}
	
	static double myMethod1(double x, double y)
	{
		return x + y; 
	}
	
	// 2nd way
	//we overload the add method to work for 
	// both int and double
	
	static int add(int a, int b)
	{ 
		return a + b;
	}
	
	static double add(double a, double b)
	{
		return a + b;
	}
	
	public static void main(String args[])
	{
		// 1st way
		int no1 = myMethod(8,5);
		System.out.println(no1);
		
		double no2 = myMethod1(4.2,6.5);
		System.out.println(no2);
		
		// 2nd way
		int no3 = add(4,7);
		System.out.println(no3);
		
		double no4 = add(2.2,5.9);
		System.out.println(no4);
	}
}
