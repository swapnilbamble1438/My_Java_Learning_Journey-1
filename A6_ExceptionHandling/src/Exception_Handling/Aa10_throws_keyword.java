/*
 throws keyword:
 "throws" keyword is used to declare an Exception.
 It gives an information to the caller method that
 there may occur an Exception so it is better for
 the caller method to provide the Exception 
 handling code so that normal flow can be
 maintained.
 
 FileInputStream:
 FileInputStream class throws "FileNotFoundException"
 which is compile time Exception or checked Exception
 so we have to handle the Exception and for this
 purpose we have to use either try-catch or
 throws keyword
 
class Test{
	
	 void readfile()
	{
		 FileInputStream fis = new FileInputStream("d:/abc.txt"); // now here 
		 							// will show indication that
		 							// FileInputStream is throwing Exception
		 							// and it needs to be handle 
		
		// FileInputStream class throws Compile Time Excepton 							 
		// And Compile Time Exception needs handling code
       //to compile program successfully.
		
	}

}
	here our program will not compile because 
	FileInputStream will throw checked Exception.
	so what will we do to compile it successfully ?.
	we dont want to use try catch to handle
	this Exception. we want that our program for
	now should compile successfully and we want that
	any caller method which will call this method
	should handle this Exception in its own way.
	so in that case we can use throws keyword.
	
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Test {
	
	 void readfile() throws FileNotFoundException
	{
		 FileInputStream fis = new FileInputStream("d:/abc.txt"); // after 
		 														// using throws
		 														// it will compile
		 														// successfully
		 
		
	}

}
 

 so we have to provide throws
 and Exception Class name after method name.
 and now our program will successfully compile.
 so we dont need to put try catch block now.
 Now our statment will execute successfully.
 
 so by using throws keyword
 (Caller method) will get the indication
 through throws keyword of the method to be called that 
 the method which you are calling has Exception of
 certain type which is  is not handle
 and you have to handle in your own way.
 so it just provide an indication to caller method.
 
  throws keyword:
 "throws" keyword is used to declare an Exception.
 It gives an information to the caller method that
 there may occur an Exception so it is better for
 the caller method to provide the Exception 
 handling code so that normal flow can be
 maintained.
 
-----------------------------
e.g:
 
class Test {
	
	 void readfile() throws FileNotFoundException
	{
		 FileInputStream fis = new FileInputStream("d:/abc.txt");
		 
		
	}
	
	public static void main(String args[])
	{
		Test t = new Test();
		t.readfile(); // here it will show indication
		              // that this method has Exception
		              // with Exception class name,
			      // which is not handle and
			      // you have to handle this 
		              // method to compile it
			      // successfully
	
	}

}
 
 ----------------------------
 and when we call the method which have throws
 keyword, we will get the indication that
 our method has Exception with Exception
 class Name, and the method needs to handle.
 and after handling the method in caller method 
 our program can successfully compile.
 
 e.g:
 
 class Test {
	
	 void readfile() throws FileNotFoundException
	{
		 FileInputStream fis = new FileInputStream("d:/abc.txt");
		 
		
	}
	
	public static void main(String args[])
	{
		Test t = new Test();
		try
		{
			t.readfile();
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
-----------------------------------------------------------------------------------------------------------
so throws keyword just indicates caller method 
that certain type of Exception is possible to
occur in  method that to be called so you need
to handle it according to your way.

NOTE: throws keyword always used in Checked 
	  Exception case only. 
	  It is not use in Unchecked Exception case.
-----------------------------------------------------------------------------------------------
But again if dont want to manually handle Exception
you can again use throws keyword in Caller method also.
But it will get handle by Defaul Exception Handler 
and our program will be abnormally terminated
in middle only.
(In this case JVM will call main method.
JVM will create Exception(FileNotFoundException) object 
and passes it to Default Exception Handler and will
terminate main method(caller method).But we never
want to terminate our method abnormally in middle 
and we always want our program to be properly 
executed. thatswhy manually handling Exception
in Caller method using try catch block is preferable.)

e.g:

 
 class Test {
	
	 void readfile() throws FileNotFoundException
	{
		 FileInputStream fis = new FileInputStream("d:/abc.txt");
		 
		
	}
	
	public static void main(String args[]) throws FileNotFoundException
	{
		t.readfile();
			
		System.out.println("Hello");
	
	}

}

	output: Exception in thread "main" java.io.FileNotFoundException: d:\abc.txt (The system cannot find the path specified)
		at java.base/java.io.FileInputStream.open0(Native Method)
		at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
		at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
		at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
		at Exception_Handling.Test.readfile(Test.java:191)
		at Exception_Handling.Test.main(Test.java:199)
		
---------------------------------------------------------------------------------------------------------------------------------------
so it is always better to use try catch in caller method
to handle Exception. to prevent our program from
terminating abnormally. 
---------------------------------------------------------------------- 
 throws keyword is not use for handling Exception manually.
 Because using throws keyword, Default Exception handler
 will handle our Exception, which is not good for program.
 Thus try catch is always better to use.
 -------------------------------------------------------------------------
 NOTE: throws keyword is used to declare only for
 	   the checked Exceptions. If there occurs any
 	   unchecked Exceptions such as NullPointerException,
 	   it is programmers fault that he is not 
 	   performing check up before the code being used.
 	   
 	   
e.g:

class Test {
	
	 void readfile() throws Exception
	{
		System.out.println(100/0); // it is by programmer mistake
								// it will not show any checked Exception
								// because it is Unchecked Exception
								// and we have to put throws keyword
							// and Exception class manually after method name
		
		// so in this case try catch is better 
		// to use directly in method that is to be called.
		// thatswhy throws keyword is better for
		// checked Exceptions only.
		
	}
	 
	public static void main(String args[]) throws FileNotFoundException
	{
		
		Test rf = new Test();
		
		try 
		{
			rf.readfile();
		
		} catch (Exception e) 
		{	
			System.out.println(e);
		}
	
	}

}
------------------------------------------------------------------------- 
  
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
 	       
 	throws: It is used to declare the Exception.
 	        It gives an information to the caller
 	        method that there may occur an Exception
 	        so it is better for the caller method
 	        to provide the Exception Handling code
 	        so that flow can be maintained.       
 	       
 2. If we call a method that declares an Exception,
    we must either caught the Exception using 
    try catch block or declare the Exception using
    throws keyword or say If there is any checked
    Exception, we will get compile time error saying
    "unreported exception XXX must be caught or
    declared to be thrown". To prevent this compile
    time error we can handle the Exception in
    two ways:
    i) By using try catch ii) By using throws keyword
    
 3. throws keyword used to declare the checked 
    Exceptions only. If there occurs any unchecked
    Exception such as NullPointerException, it is
    programmers fault that he is not performing
    check up before the code being used.
         
      
 
 
-------------------------------------------------------------------------
 
 */
package Exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Aa10_throws_keyword {
	
	 void readfile() throws Exception
	{
		System.out.println(100/0);
		
	}
	 
	public static void main(String args[]) throws FileNotFoundException
	{
		
		Aa10_throws_keyword rf = new Aa10_throws_keyword();
		
		try 
		{
			rf.readfile();
		
		} catch (Exception e) 
		{	
			System.out.println(e);
		}
	
	}

}
