/*
We can print Exception in catch block also
so there are 3 ways to print 
the exception in catch block

1. e.printStackTrace();
2. System.out.println(e);
3. System.out.println(e.getMessage());

e.g:

class Test
{
	public static void main(String[] args) 
	{
		try
		{
			
				
		}
		catch (Exception e) {
			
			e.printStackTrace();  // it will print Exception Name,
									// Description,Stack trace
								  // it provide all details about Exception
				
			System.out.println(e); // it will provide Exception Name,
									 // Description
								   // but it will not print Stack trace
				
		    	System.out.println(e.getMessage());// it will only print Description 	
											     // but it will not print
											   // Exception Name and Stack trace
			
			
			
		}			
						
			
	}
}
-----------------------------------------------------------------------------------------
e.g. 

class Test{

	public static void main(String[] args) {
			
		try
		{
			int a = 100 , b = 0,c ;
			c = a/b;
			System.out.println(c);
				
		}
		catch (Exception e) {
				
			e.printStackTrace(); 
				
			System.out.println("==========================================================================");
				
			System.out.println(e); 
				
			System.out.println("==========================================================================");
			
		    	System.out.println(e.getMessage());
			
			
			
		}			
					
			
	}
}
	output: java.lang.ArithmeticException: / by zero
		at Exception_Handling.Test.main(Test.java:5)
		==========================================================================
		java.lang.ArithmeticException: / by zero
		==========================================================================
		/ by zero


*/

package Exception_Handling;

public class A5_Methods_to_Print_Exception {

	public static void main(String[] args) {
			
		try
		{
			int a = 100 , b = 0,c ;
			c = a/b;
			System.out.println(c);
				
		}
		catch (Exception e) {
				
			e.printStackTrace(); 
				
			System.out.println("==========================================================================");
				
			System.out.println(e.toString());
				
			System.out.println(e); 
				
			System.out.println("==========================================================================");
			
		    	System.out.println(e.getMessage());
			
		    	
			
		}			
					
			
	}
}
