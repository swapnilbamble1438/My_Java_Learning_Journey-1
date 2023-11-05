package oops.A2_constructor;

public class C7_Constructor {
	
	int x;  // create a class attribute

	// create a class constructor for the main class
	public C7_Constructor() // constructor name will be same as the class name
	{
		x = 5; // set the initial value for the class attribute x
	}
	
	public static void main(String args[])
	{
		//  Create an object of class Main (This will call the constructor)
		C7_Constructor obj = new C7_Constructor();
		System.out.println(obj.x); 
	}
	
}
