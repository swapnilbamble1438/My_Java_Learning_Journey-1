/*
 Handling Exception:
 
 
 How Exception Handling work in Default case
 	OR
 How Default Exception Handler works:
 
 Whenever there is Exception in any method
 that method will create object(Exception
 will create object)
     OR
 Whenever there is Exception, the method
 in which Exception occurs will create
 an object and that object will store
 three things:
 1. Exception Name(class Name which can handle Exception)
 2. Description(Proper Description of which type of Exception is occured)
 3. Stack Trace(proper Description in which line there is Exception)
 
      __________________
     |  Exception Name  |
     |  Description     |--------JVM
     |  Stack Trace     | 
     |__________________| 
     
     and the method will pass that Exception
     object to JVM
     and then JVM will check whether the 
     method in which Exception is occured
     is handling that Exception or not.
     If not Then JVM will terminate method(program)
     abnormally then JVM will pass that Exception 
     object (control) to Default Exception Handler.
     Then Default Exception Handler will
     print that Exception
     
 e.g:
  class Test
 {
 	public static void main(String[] args)
 	{
 		int a = 100, b = 0 , c;
		
		c = a/b;
		
		System.out.println(c);
		
		// This program will throw Unchecked Exception
 	}
 }
 	output: Exception in thread "main" java.lang.ArithmeticException: / by zero
			at Exception_Handling.Test.main(Test.java:5)

     
     so this is the Exception, handled
     and printed by 
     Default Exception Handler
     and the program is abnormally terminated.
------------------------------------------------------------------------------------
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
Handling Exception using try catch:

try catch Syntax:
 try
 {
	// risky code
 }
 catch(ExceptionClassName ref.var.name)
  {
  	// handling code
  }
  
  Note: try should be followed by catch
  		every time.
  		without catch, only try will not work 
----------------------------------------------------
Whenever you dont know Which is the 
Risky code or Whenever you have doubt 
about the code try using try catch.
Always remember short lines of code in try 
catch is better than long lines of code.

e.g:
class Test
{
	public static void main(String[] args)
	{
		try
		{
		int a = 100, b = 0 , c;
		
		c = a/b;
		
		System.out.println(c);
		}
		catch(ArithmeticException e)  // if you dont know which type of 
		{                             // Exception to put then you
			System.out.println(e);   // can put only Exception.
		}                            // Because Exception is the parent class
		                            // of all the Exceptions.
		  // so if you give control to the Exception class
		  // it will further automatically give control to                      
	      // specific desired class.
	
	
	}
	
}
	output: java.lang.ArithmeticException: / by zero
-----------------------------------------------------------
 How try catch block works:
 
 Inside try block whenever Exception 
 will get detected at a line,
 the code after that line till 
 before catch block will get skip.
 and it will directly go to catch block, 
 then in catch block 
 control will go to specified Exception class
 then e which is the reference object
 (object created by method in which Exception is occured)
 of Exception class contains
 Exception Name,Description,Stack Trace
 and that e can be printed inside
 catch or we can also print any message.
 and after catch block execution further
 code can be successfully executed.
 here Exception is handled inside catch block.
 and inside catch block we write handling code
	   
 Real world example:
 if inside try block we have 
 provided database connectivity
 and we are doing database connectivity
 through SQL Database,
 by chance if there will be 
 connectivity problem or SQL database
 is not working then
 we can handle it in catch block
 by saying it if SQL Connectivity is not working
 then try to do it with Oracle Database
 or try to put entries into Oracale Database
 or try to put entries to some other Database.
 so by this type we can handle our code.
	
 Means if code inside try block is not
 able to perform the given task
 then it can be perform by code
 inside catch block or can be handle
 by code inside catch block.
 
 e.g:
 
 class Test
 {
 	public static void main(String args[])
 	{
 		try
		{
			FileInputStream fis = new FileInputStream("d:/abc.txt");
			System.out.println("Hello");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Hello");
 	}
 }
	 output: java.io.FileNotFoundException: d:\abc.txt (The system cannot find the path specified)
			 Hello
			 
			 
	here Exception is successfully handle
	by try catch block.
	and program here is not abnormally 
	terminated.
	and the code after catch block
	also successfully executed.		 


-------------------------------------------------------------------------------------------------------------	 	
Flow of try catch:

	e.g: code with no Exception
	
class Test {
	public static void main(String[] args) {
	
		System.out.println("Welcome");
		try
		{
			int a = 100, b = 1 , c;
			
			c = a/b;
			
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("message inside catch block");
		}
		System.out.println("Bye");
		
		
	}
}

	output: Welcome
			100
			Bye
			
			
  so if there is no Exception in try
  block then the code inside catch will
  not execute and futher code after
  try block will get executed.			
----------------------------------------------------------------------------
e.g: code with Exception

class Test {
	public static void main(String[] args) {
	
		System.out.println("Welcome");
		try
		{
			int a = 100, b = 1 , c;
			
			c = a/b;
			
			System.out.println(c);
			
			syso.
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("message inside catch block");
		}
		System.out.println("Bye");
		
		
	}
}
	output: Welcome
            java.lang.ArithmeticException: / by zero
			message inside catch block
			Bye

	so if Exception occurs at try block
    the code after which Exception 
	is occured will get Skip till before catch block.
	then it will directly go to catch block 
	and it gets handle by catch block.
	and after catch block execution
	the further code after catch block
	can successfully excute.
	
	NOTE: catch means it will not remove Exception.
		  It will just handle that Exception

--------------------------------------------------------------------	
	
	
     
 */

package Exception_Handling;

import java.io.FileInputStream;

public class A4_try_catch {
	public static void main(String[] args) {
	
		System.out.println("Welcome");
		try
		{
			int a = 100, b = 0 , c;
			
			c = a/b;
			
			System.out.println(c);
			
			System.out.println("message inside try block");
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("message inside catch block");
		}
		System.out.println("Bye");
		
		
	}
}
