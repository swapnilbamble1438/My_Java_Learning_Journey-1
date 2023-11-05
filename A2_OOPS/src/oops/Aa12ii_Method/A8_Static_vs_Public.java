package oops.Aa12ii_Method;

public class A8_Static_vs_Public {

	
	// static method
	static void staticMethod()
	{
		System.out.println("Static methods can be called without creating object");
	}
	
	
	// public method
	public void publicMethod()
	{
		System.out.println("Public methods must be called by creating objects");
	}
	
	public static void main(String args[])
	{
		// Static methods can be called without creating objects
		staticMethod();
		
		
		// Public methods must be called by creating objects
		A8_Static_vs_Public obj = new A8_Static_vs_Public();
		obj.publicMethod();
	}
}
