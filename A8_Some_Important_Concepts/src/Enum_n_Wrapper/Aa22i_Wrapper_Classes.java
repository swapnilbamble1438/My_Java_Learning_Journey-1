/*
 Java Wrapper Classes
Wrapper classes provide a way to use primitive data types 
(int, boolean, etc..) as objects.

Sometimes you must use wrapper classes, for example when
 working with Collection objects, such as ArrayList, where 
 primitive types cannot be used (the list can only store 
 objects):
 
 ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
 
 ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid
 
 
 */


// Creating Wrapper Objects
/* To create a wrapper object, use the wrapper class instead of 
the primitive type. To get the value, you can just print 
the object: 
*/

package Enum_n_Wrapper;


public class Aa22i_Wrapper_Classes {
	
	public static void main(String args[])
	{
		// create the wrapper object 
		// to get the value we can just print the object
		Integer myInt = 5;
		Double myDouble = 5.99;
		Character myChar = 'A';
		
		System.out.println(myInt);
		System.out.println(myDouble);
		System.out.println(myChar);
		
		System.out.println();
		
		// since we are working with objects we can
		// use other method to get information
		// this example will give the same output as above
		
		System.out.println(myInt.intValue());
		System.out.println(myDouble.doubleValue());
		System.out.println(myChar.charValue());
		
		
		
	}
}
