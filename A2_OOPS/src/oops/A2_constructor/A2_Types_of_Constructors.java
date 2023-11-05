/*
 
 Types of Constructors:
 
 1)Default Constructor (no-arg constructor):
 	compiler create default constructor.
 	if there is not any type of constructor
 	in class so then only compiler create
 	default constructor.
 	
 	e.g:
 	
 	class Test
 	{
 		// here we will not see any constructor
 		// but there is constructor created by
 		// by compiler like this 
 		 //
 		 //  	 Test(){
 		 //  	 	}
 		 //
 		
 		public static void main(String[] args)
 		{
 			Test t = new Test();
 			
 		}	
 	}
 
 2)User Defined (No-arg constructor):
 	this constructor is not created by
 	compiler this is created by user
 	and it does not have any arguments
 	
 	e.g:
 	class Test
 	{	 	
 	 		Test(){
 		   	 	}
 		 
 		
 		public static void main(String[] args)
 		{
 			Test t = new Test();
 			
 		}	
 	}
 	
3) Parameterized constructor:
 	Constructor which consist of any
 	parameter
 	
 	e.g:
 	class Test
 	{
 		Test(int a)
 		{
 		
 		}
 		
 		public static void main(String[] args)
 		{
 			Test t = new Test(2);
 			
 		}	
 	}
 
 */

package oops.A2_constructor;

public class A2_Types_of_Constructors {

}
