/*
 
 finally block:
 finally is the block that is always executed
 whether Exception is handled or not.
 	OR
 finally is the block that is always executed
 whether Excepition occur or not.
 
 
 Syntax of finally block:
 --------------------------------------------------
 1st way:
 
 try
 {
 
 }catch(Exception e){
 
 }
 finally{           // so after catch block
                   // finally block can be 
 }                 // applied
 
 --------------------------------------------------------
 2nd way:
 
 try{
 
 }
 finally{   // after try block also finally block
 	    // can be applied
 }          // but in this case if Exception
 	    // occurs in try block then
 	    // then it will not get handled
 	    // because Exception handling part
 	    // is done in catch block and
 	    // without catch block it Exception
 	    // be handled
------------------------------------------------------------------
 so from both ways we can use finally block.
 But preferable way is the 1st one.
 
 1st case:
 If Exception occurs in try block
 then it will first go in catch block
 and after catch block it will go to 
 finally block.
 so first catch block will execute and 
 after catch block, finally block will execute.
 
 2nd case:
 If Exception does not occurs in try block
 then try block will fully execute and after 
 than it will not go to catch block
 but it will directly go inside finally block
 
 so finally is the block which always 
 execute whether there is Exception or not
 in try block.
 
 But Remember finally block can be written
 only when there is try catch or try.
 Directly if we try to write finally block
 then it will not execute
 
 e.g
 
 finally{  \  /
            \/    // wrong code
 }          /\
           /  \
             
-------------------------------------------------------------

e.g: finally block when there is no Exception


class Test {
	
	public static void main(String[] args) {
		
		
		try {
			
			int a = 100, b = 2 , c;
			c = a/b;
			System.out.println(c);
			
			System.out.println("I am in try catch");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally 
		{
			System.out.println("I am in finally block");
		}
		
		
	}

}
		output: 50
			I am in try catch
			I am in finally block
 
------------------------------------------------------------------

e.g: finally block when there is Exception          
            
class Test {
	
	public static void main(String[] args) {
		
		
		try {
			
			int a = 100, b = 0 , c;
			c = a/b;
			System.out.println(c);
			
			System.out.println("I am in try catch");
			
		}
		catch(Exception e)
		{
			System.out.println("Exception: " + e);
		}
		finally 
		{
			System.out.println("I am in finally block");
		}
		
		
	}

}
	
	output: Exception: java.lang.ArithmeticException: / by zero
		I am in finally block

-----------------------------------------------------------------            
e.g: finally block without catch block and
     without Exception

class Test {
	
	public static void main(String[] args) {
		
		
		try {
			
			int a = 100, b = 2 , c;
			c = a/b;
			System.out.println(c);
			
			System.out.println("I am in try catch");
			
		}
	
		finally 
		{
			System.out.println("I am in finally block");
		}
		
		
	}

}   
	output: 50
		I am in try catch
		I am in finally block
			
-------------------------------------------------------------------------
e.g: finally block without catch block
     and with Exception
     
class Test {
	
	public static void main(String[] args) {
		
		
		try {
			
			int a = 100, b = 0 , c;
			c = a/b;
			System.out.println(c);
			
			System.out.println("I am in try catch");
			
		}
	
		finally 
		{
			System.out.println("I am in finally block");
		}
		System.out.println("Bye");
		
	}

}     
	output: I am in finally block
		Exception in thread "main" java.lang.ArithmeticException: / by zero
		at Exception_Handling.Test.main(Test.java:15)

         
        In this case program will terminate
        But still finally block will execute
        itself and after that program
        will terminate abnormally.
        
        so it is better to use finally block
        with try catch and not with only try.
------------------------------------------------------------------------

Use of finally block:

try
{
	// risky code
}
catch(Exception e)
{
	// Exception handling code
}
finally
{
	// cleanup code  // means like if we want to close
                         // some database connection
	                 // we can write that code inside finally block
				     
			 // like if we have open some file
		         // we can write file closing code 
				       
		         // if we want to release memory
				       
			 // if we want to release some log 
				       
	// those resources which we have open in try block
	// we can close it inside finally block
}				
------------------------------------------------------------------------- 

 Why only closing code is return inside finally block?
 
 for e.g:
 
 	    try
            {
 			// file open 
 			// read/write   // this code will
 			// file closing // not work if Exception will occur
 	    }
 	    catch(Exception e)
 	    {
 	    
 	    }
 		
 
 if we have open some file in try block
 to read/write some data from file
 and after that in try block only we 
 have written file closing code.
 so assume if any Exception occurs like      // or If any Exception occurs while 
 FileNotFound. then it will directly go      // reading or writing a file, then 
 inside catch block and the code             // below code will not execute and thus
 below Exception line where Exception occur  // resource will not close.
 in try block will get skipped and the 
 resource will not close(our file closing
 code will be of no use). so this type of 
 coding is not effective. therefore finally 
 block is used.
 Even if after Exception will occur
 it will execute catch block and after
 that finally block will also successfully
 executed. so code of file closing in finally
 block will also work successfully.
 and thus file will successfully closed.
 
e.g: 
 
            try
            {
 			// file open   
 			// read/write   // this code will not work if Exception will occur
 			
 	    }
 	    catch(Exception e)
 	    {
 	    
 	    }
 	    finally
 	    {
 	    	// file closing code  // this code will work
 	    	                     // even after there is Exception
 	    }
 
 
 
 	Therefore we never write Resource closing
 	code inside try block. we always 
 	use finally block to write Resource
 	closing code.
 	and this type of code is called cleanup code.
----------------------------------------------------------------------- 
 e.g: file closing code inside try block
 
 
import java.io.FileInputStream;
import java.io.IOException;

public class A6_finally_block {
	
	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis = null;
		
		try {
		
			fis = new FileInputStream("d:/abc.txt");
			
			if(fis != null)
			{
				fis.close();
			}
		
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
		finally {
			
			if(fis != null)
				System.out.println("file closed");
			else
				System.out.println("file is still open");
		
		System.out.println("Bye");
		
		}
		
	}

}

	
		output: java.io.FileNotFoundException: d:\abc.txt (The system cannot find the path specified)
				file is still open
				Bye
 
-----------------------------------------------------------------------
e.g: file closing code inside finally block 


import java.io.FileInputStream;
import java.io.IOException;

public class A6_finally_block {
	
	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis = null;
		
		try {
		
			fis = new FileInputStream("d:/abc.txt");
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
		finally 
		{
			// cleanup here
			
			if(fis != null)
			{
				fis.close();
			}
			System.out.println("file closed");
		}
		System.out.println("Bye");
		
		
	}

}
	output: java.io.FileNotFoundException: d:\abc.txt (The system cannot find the path specified)
			file closed
			Bye


----------------------------------------------------------------------

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class ConnectionCloseDemo
{
	public static void main(String[] args)
	{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try
		{
			// Do stuff
			// like insert,update,delete data code
		}
		catch(Exception e)
		{
			// Exception handling code
		}
		finally
		{				// in finally we are closing all resources
			try         // through try catch you can also use throws keyword.
			{			// but try catch is always preferable.
				rs.close();
			}
			catch(SQLException e)
			{
				
			}
			
			try
			{
				ps.close();
			}
			catch(SQLException e)
			{
			
			}
			
			try
			{
				con.close();
			}
			catch(SQLException e)
			{
			
			}
		}
		
		
	}
}
------------------------------------------------------------------------- 
NOTE: We can use multiple catch blocks with one
      try block but we can only use single
      finally block with one try block, 
      not multiple.

NOTE: The statements present in the finally 
      block execute even if the try block
      contains control transfer statements
      (i.e. jump statements) like return,
      break or continue.
      
  e.g:
  
public class A6_finally_block {
	
	public static void main(String[] args){
		
		int a = 5, b = 10;
		
		int c = add(a,b);
		
		System.out.println(c);
		
	}
	
	static int add(int a, int b)
	{
		int z = 0;
		try
		{
		z = a + b;
		return z;
		}
		catch(Exception e){
			System.out.println(e);
			return 0;
		}
		finally
		{
			System.out.println("finally block executed...");
		}
		return z;
	}
	
	
}
      output: finally block executed...
              15
      
------------------------------------------------------------
The possibilities that disturbs the execution of
finally block are:
  OR
There are four cases when finally block 
will not execute after try block:

Case 1: Using of the System.exit() method
		will also stop from executing 
		finally block.

class Test{
	
	public static void main(String[] args){
		
		
		try{
			
			int a = 100, b = 2 , c;
			c = a/b;
			System.out.println(c);
			
			System.out.println("I am in try catch");
			
			System.exit(0);
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally 
		{
			System.out.println("I am in finally block");
		}
		System.out.println("Bye");
	
	}
	
}
	output: 50
			I am in try catch
--------------------------------------------------------------------------- 
Case 2: Causing a fatal error that causes the 
	process to abort
	OR
	if Error occurs in try block
	in that case also finally block
	will be not executed
		
Case 3: Due to an Exception arising in the
	finally block
	OR
	If there is Exception in finally
	block and we are not handling it
	then it will also stop finally block
	from fully executing.
		
e.g:


class Test {
	
	public static void main(String[] args){
		
		
		try{
			
			System.out.println("I am in try block");
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally 
		{
			System.out.println(100/0);
			
			System.out.println("I am in finally block");
		}
		System.out.println("Bye");
	
	}	
}
	output: I am in try block
		Exception in thread "main" java.lang.ArithmeticException: / by zero
		at Exception_Handling.Test.main(Test.java:5)

-----------------------------------------------------------------------------------
Case 4: The death of a Thread.
 	If any Thread in between get
 	terminated. then also finally block
 	will not execute.
 		
 	so this are the four cases where
 	may be finally block will be not
 	executed.
		

 */

package Exception_Handling;



public class A6_finally_block {
	
	public static void main(String[] args){
		
		
		try{
			
			System.out.println("I am in try block");
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally 
		{
			System.out.println(100/0);
			
			System.out.println("I am in finally block");
		}
		System.out.println("Bye");
	
	}
	
}
