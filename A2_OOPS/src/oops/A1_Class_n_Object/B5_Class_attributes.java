package oops.A1_Class_n_Object;

public class B5_Class_attributes {

	// here x and y are the two attributes of class
	int x = 5;
	int y = 3;
	final int z = 6;
	
	public static void main(String args[])
	{
		
		// and we can access the attributes by object
		B5_Class_attributes obj = new B5_Class_attributes();
		
		System.out.println(obj.x);
		
		// we can also modify the attributes
	   // int y = 20;  it is wrong way to modify
		obj.y = 25;
		System.out.println(obj.y);
		
		// If you don't want the ability to override existing values, 
		// declare the attribute as final:
//		obj.z = 44; // the program will not run try commenting this line
		System.out.println(obj.z);
		
	}
	
}

