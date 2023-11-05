/*
 final keyword
 final keyword can be used with variable,
 class and methods
 
 We use final with variable 
 when we want to keep our variable constant
 and its value should not be changeable
    OR
 If we create any final variable it becomes constant,
 we cannot change the value of final variable
 
 We use final with method 
 when we dont want class method to be 
 override by its child class
 	OR
 If we create any final method, 
 we cannot override it
 
 We use final with class
 when we dont want a class to inherit
 its properties and method by it child class
    OR
 If we create any final class,
 we cannot extend it or inherit it
 
 -------------------------------------------
 E.g: 1) Example of final variable
 
 class Test
 {
 	public static void main(String args[])
 	{
 		int i = 10;
 		i = i + 20;
 		System.out.println(i);
 		
 		but if we use final
 		
 		final int j = 10;
 		j = j+ 20; // then it will give error
 			   // because j is final means
 			   // we cannot resign new value
 			  // to final variable
 	}	
 }
 ---------------------------------------------------
 E.g: 2) Example of final method
 
 class Demo
 {
 	final void m1()
 	{
 		System.out.println("I am in Demo class");
 	}
 }
 class Test extends Demo
 {
 	void m1() // it will show error 
 	{	// because final method cannot be override
 		
 		System.out.println("I am in Text class");
 	}
 	
 	public static void main(String args[])
 	{
 	
 	
 	}
 }			
 ---------------------------------------------------
 
 E.g: 3) Example of final class
 
 final class Demo
 {
 
 }
 
 class Test extends Demo // it will show error
 { 						// final class cannot be
 						// inherited
 }
 	
 
 
 */

package oops.Aa13_OOPS_InOneGo;


public class Aa11_final_keyword{
	
	public static void main(String[] args) {
		
			
		
		
		
	}

}
