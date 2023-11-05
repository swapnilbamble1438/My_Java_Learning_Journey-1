/*
 
 
 Working of Default Exception Handler:		
 
	when it get Exception in void method
	then divide method will create Exception 
	object containing all Exception Details
	(Exception Name,Description,Stack trace)
	and pass that object to JVM.
	Again JVM check if void method is handling
	Exception or not,and if divide method is not
	handling that Exception then JVM will terminate
	that divide method abnormally. Just after
	terminating the divide method JVM will go
	to the caller method(main method) from which the
	 divide method is called, And again JVM check if 
	that main method is also handling that Exception
	of divide method or not, if main method is not
	handling that Exception then JVM will also
	terminate the main method abnormally.
	Then JVM will pass the Exception object to 
	Default Exception Handler.Then Default Exception
	Handler will print that Exception object.
	and all Exception details will be printed.

	e.g:
	
class Test
{
 	public static void main(String args[])
	{
 		Test t = new Test();
 		t.divide();
 	}
 
 	void divide()
 	{
 		int a= 100, b=0 ,c;
 		c=a/b;
 		
 		System.out.println(c);
 	}
} 
	output: Exception in thread "main" java.lang.ArithmeticException: / by zero
			at Exception_Handling.Test.divide(Test.java:6)
			at Exception_Handling.Test.main(Test.java:5)
	
	 
	 so this is the Exception, handled
     and printed by 
     Default Exception Handler
     and the program is abnormally terminated.
     
     in this method we can apply try catch block in
     divide method or in caller(main) method.
     but it is better to put try catch block
     in divide method.
--------------------------------------------------------------------------------------    
But if you dont want your program to be 
abnormally terminated or to abnormally
stop in middle of execution then you
should handle the Exception manually.
By using Try catch or Throw or Throws.

We can handle the Exception using 5 keywords:
1. try 
2. catch
3. finally
4. throw 
5. throws
----------------------------------------------------------------------------
Handling Exception using try catch block:

try catch block working is already explained
in A4_try_catch.java you can refer from there.

e.g: Handling Exception in caller method(main method):

class Test
{
 	public static void main(String args[])
	{
 		Test t = new Test();
 		
 		try
 		{
 			t.divide();
 		}
 		catch(Exception e)
 		{
 			System.out.println(e);
 		}
 	}
 
 	void divide()
 	{
 		int a= 100, b=0 ,c;
 	
 		c=a/b;
 		
 		System.out.println(c);
 		
 		System.out.println("Hello");
 	}
} 
	output: java.lang.ArithmeticException: / by zero
---------------------------------------------------------------------------

e.g: Handling Exception in called method(divide method):

class Test
{
 	public static void main(String args[])
	{
 		Test t = new Test();
 		t.divide();
 	}
 
 	void divide()
 	{
 		int a= 100, b=0 ,c;
 		
 		try
 		{
	 		c=a/b;
	 		
	 		System.out.println(c);
 		}
 		catch(Exception e)
 		{
 			System.out.println(e);
 		}	
 		
 		System.out.println(c);
 	}
} 

		output: java.lang.ArithmeticException: / by zero
				hello

-------------------------------------------------------------------------
so here we notice that it is better to handle
Exception in called method (divide method).

Because if we handle Exception in caller(main method)
then  the code below Which Exception is possible
to occur in called(divide method) will be skipped
and directly go to catch block of caller method
(main method) for further execution.
But if we handle Exception in called method (divide
method) then we can put try catch block to only
specific risky lines of codes. and rest of 
the code will be out of try catch where we dont want
to handle any Exception.so that code will be safe
from getting skip.
Thus it is better to use Exception Handling in
called(divide) method.
-----------------------------------------------------------------------
Using throw keyword:

throw keyword Syntax:

throw new ExceptionClassName(" ");

e.g:

class Test
{
	public static void main(String args[])
	{
		throw new ArithmeticException();
	}
}
	output: Exception in thread "main" java.lang.ArithmeticException
	        at Exception_Handling.Test.main(Test.java:9)

		
		Compare this from Default Exception Handling in
		A4_try_catch.java 
		both have same output
		
			But

		here Exception is Handled by default Exception
		Handler only.
	        But this time Exception object
		is not created by method in which Exception is
		occured, Exception(ArithmeticException) object 
		is created by programmer (user) manually and
		passes that object to JVM.
		
		Now this time main method has no role
		in Exception object creation.
		and Exception object is created by programmer.
		we can also say that Programmer is 
		passing Exception object manually to JVM.
		
		so this is the difference between
		simple program and program using throw keyword.
		
		so throw keyword is used to pass the 
		Exception object created by Programmer(user)
		to JVM
		
	    and next will be same.
            JVM will check whether the 
	    method in which Exception is occured
	    is handling that Exception or not.
	    If not Then JVM will terminate method(program)
	    abnormally then JVM will pass that Exception 
	    object (control) to that Default Exception Handler.
	    Then Default Exception Handler will
	    print that Exception.
	     
	    Q) If main method is doing same work
	    then why we need throw keyword?
	    	OR
	    or by default method is creating Exception
	    object then why Programmer is passing
	    Exception object manually ?
	    
	    Because throw keyword is used for
	    custom Exception or User define Exception.
	    
	    real world example:
	    if we have a voting application.
	    and we have to put a condition
	    if age is above 18 you can vote
	    or else not.
	    so we can create Exception class
	    with voter age and votefail message.
	    if our voter age is below 18 
	    and if he tries to vote
	    we can throw that Exception class.
	    
	    
	    Note: Throw keyword is used for Custom Exception
	          object Creation. It is not for handling
	          Exception.
	          Still we have to use try catch to handle
	          Exception.
	    
---------------------------------------------------------	    
					
			          Object
		                    |
				 Throwable
		       _____________|_____________
		      |                           |
	           Exception                    Error
	         _____|______
		|            |
	 Checked      Unchecked
	Exception	  Exception
       (Compile Time      (Runtime		  
        Exception)         Exception)
	
 We can create our own Exception in any 
 Exception class in Checked or Unchecked
 Exception class.
 
 If you want your Exception as 
 Checked Exception than you should 
 inherit Exception class.
 But If you want your Exception to 
 be Unchecked Exception than you should
 inherit Unchecked class.
  OR
 Whenever we create custom Exception class
 it will be a child class of Exception class.
	    
 Note: Always create custom Exception
	   as Unchecked Exception.
----------------------------------	  
 Custom Checked Exception class:	    
-----------------------------------	    
	class Test extends Exception
	{
	    
	}

--------------------------------------	    
 Custom Unchecked Exception class:
--------------------------------------- 	
    
   	class Test extends RuntimeException
   	{
	    
	}
	          
-----------------------------------------------------------------

 e.g: Creating Custom Unchecked Exception using throw keyword :

class Test {
	
	public static void main(String[] args)
	{
		
		int age = 16;
		if(age < 18)
		{
			throw new YoungerAge("You are too young to vote, age: ",age);  // it is Unchecked Exception
																		// so without handling it also
																		// it will compile successfully.
			
		}
		else {
			System.out.println("Successfully voted");
		}
		
		System.out.println("Hello");
		
 	}

}

class YoungerAge extends RuntimeException
{
	
	int age;
	public YoungerAge(String msg,int age) {
		super(msg +" "+ age);
		this.age = age;
			
	}

}
	
	output:	Exception in thread "main" Exception_Handling.YoungerAge: You are too young to vote, age:  16
	        at Exception_Handling.Test.main(Test.java:8)
	
 	  so we have only created custom Unchecked
	  Exception here but we have still
	  not handle it.
	  
	  so this is our Custom Unchecked Exception.
	  Which programmer has pass created Custom
	  Exception object and passes it to JVM.
	  and JVM has checked it whether Exception 
	  is handle by method in which Exception is occured.
	  If not Then JVM will terminate method(program)
	  abnormally then JVM will pass that Exception 
	  object (control) to that Default Exception Handler.
	  Then Default Exception Handler will
	  print that Exception by calling that
	  Custom Exception class.
	  
	  so here in custom Unchecked Exception or
	  Unchecked Exception case Exception
	  is not forcefully needed to handle.
	  without handling it also program
	  will successfully compile. 
	  
	  
---------------------------------------------------------------------------------------------------------------	    
e.g: Handling Custom Unchecked Exception using try catch block:	    
	    
class Test {
	
	public static void main(String[] args)
	{
		
		
		int age = 16;
		
		try
		{
			if(age < 18)
			{
				throw new YoungerAge("You are too young to vote, age: ",age);
				
			}
			else {
				System.out.println("Successfully voted");
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("hello");
		
		
		
		
 	}

}

class YoungerAge extends RuntimeException
{
	int age;
	
	public YoungerAge(String msg,int age) {
		super(msg +" "+ age);
	
			
	}

}
	output: Exception_Handling.YoungerAge: You are too young to vote, age:  16
		hello

	
	this time Exception is handled by method
	in which Exception is occured.
	
	Now JVM will again check if the method is
	handling Exception or not.
	If yes then catch block will handle that
	Exception object which is created by
	Programmer manually. and will print it
	or catch block will handle it.
---------------------------------------------------------------------------------
 
 e.g: Creating Custom Checked Exception using throw keyword
      and also handling it :

Note: Checked Exception should always be handle
      otherwise it will not compile



class Test {
	
	public static void main(String[] args)
	{
		
		int age = 16;
		
		if(age < 18)
		{
			try
			{
				throw new UnderAge(); // it should be handle because
						      // it is checked Exception.
						      // otherwise it will not compile
									 
									  
			}
			catch(UnderAge e)
			{
				System.out.println(e);
			}
			
		}
		else {
			System.out.println("Successfully voted");
		}
		
		System.out.println("Hello");
		
 	}
}
	
	class UnderAge extends Exception
	{
		
		UnderAge()
		{
			super("Not Eligible for Voting.");
		}
		
		UnderAge(String msg) {
			super(msg);
		}

	}  			  
				
	output: Exception_Handling.UnderAge: Not Eligible for Voting.
		Hello	
			
	so here in Custom checked Exception case
	or checked Exception case, Exception
    needs to be handle, without handling
    it, the class will not compile successfully.
--------------------------------------------------------------------------------    
	Unchecked Exception does not have any restrictions
	that it should be handle using try catch block
	or declare using throws keyword.
	
	so if you don't want your programmer to force
	using try catch block or throws keyword for 
	handling or declaring risky code or Exception 
	than you can create your Customized Exception
	under Runtime Exception category(Custom Unchecked Exception)
	
	But still without handling Exception
	whether it is checked or Unchecked Exception
	the program will abnormally terminate.
	so it is good to handle Exception whether
	it is checked or unchecked Exception
	so that our program will not abnormally
	terminate in middle and it will execute
	fully.
	
	
---------------------------------------------------------------------------------	
	Important Points to Note:
	
 1. keywords working:
 
 	try: In try block we write statements that
 	     can throw exception i.e. it mentains
 	     risky code.
 	     
 	catch: It mentains Exception handling code
 	       i.e. alternative way for Exception
 	       
 	finally: It mentains clean up code i.e.
 	         closing the resources
 	         
 	throw: It creates Exception object manually
 	       (by programmer) and handover to JVM
 	       
 2. We can throw either checked or unchecked Exception
    but throw is best for customized Exception
    
 3. We can only throw class that comes in throwable
    child class
    
 4. We cannot write any statment after throw,
    otherwise it will provide unreachable 
    statement error.   
 	     
 	     
	
-------------------------------------------------------------------------


*/
package Exception_Handling;

public class A9_throw_keyword {
	
	public static void main(String[] args)
	{
		
		
		
		int age = 16;
		
		try
		{
			if(age < 18)
			{
				throw new YoungerAge("You are too young to vote, age: ",age);
			}
			else {
				System.out.println("Successfully voted");
			}
			
		}
		catch(YoungerAge e)
		{
			System.out.println(e);
		}
		System.out.println("hello");
		
		
		
		
 	}

}

class YoungerAge extends RuntimeException
{
	int age;
	
	public YoungerAge(String msg,int age) {
		super(msg +" "+ age);
	
			
	}

}
