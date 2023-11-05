package oops.Aa12ii_Method;

public class A3_Method_parameters {

	
	// single parameter
	static void myMethod(String fname)
	{
		System.out.println(fname + " Bamble");
	}
	
	
	// multiple parameters
	static void myMethod2(String fname, int age)
	{
		System.out.println(fname + " is " + age);
	}
	public static void main(String args[])
	{
		myMethod("Swapnil");
		
		myMethod2("Swapnil",25);
	}
	
}
