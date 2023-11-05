/*
 Return Values
The void keyword, used in the examples above, indicates that
 the method should not return a value. If you want the method 
 to return a value, you can use a primitive data type 
 (such as int, char, etc.) instead of void, and use the return
  keyword inside the method:
 */

package oops.Aa12ii_Method;

public class A4_Return_values 
{	
	
	static int myMethod(int x)
	{
		System.out.println(x);
		return x;
	}
	
	static int myMethod2(int y)
	{
		return 5 + y;
	}
	
	static int myMethod3(int a , int b)
	{
		return a + b;
		
	}
	
	static int myMethod4(int c ,int d)
	{
	    return  c + d;
	}
	
	public static void main(String args[])
	{
		myMethod(3);
		
		System.out.println(myMethod2(4));
		
		System.out.println(myMethod3(7,9));
		
		int z = myMethod4(5,3); // You can also store the result in a variable
		System.out.println(z);
	}

}
