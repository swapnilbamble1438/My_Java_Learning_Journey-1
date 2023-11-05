/*

Wrong Concept:
Compile time exceptions occurs at compile time
and runtime exceptions occur at runtime.

Right Concept:
All the Exceptions occur at runtime
NOTE: Exceptions never occurs at compile time.

if according to your daily routine
after waking up, we are going to office by motorcycle
so this is our normal flow

                                                ___________  
                     _            _            /__Office___\ 
      _             (_)          (_) /         |  ___      | 
   __(_)___  -->    /|\   -->    /|\/\   -->   | |   |     |
  |     \  |        [|          _/_\__\        | |   |     |
                    / \        (_)  (_)        |_|   |_____| 
                     
                     
                     
but suddenly one day our bike gets puncher and our 
next process will disturb(or flow will disturb) 
and where ever we want to reach at time we will get late.
so the event like bike getting puncher or if rain starts
suddenly  are called unexpected event or unwanted event.

so the event which we not have expected and which disturbs
our normal flow is called Exception.                     
                     
                     
                                  _____
                                 (     )
                                  (____)
                                  ''''
                                 ''''           ___________  
                     _          ''_''          /__Office___\ 
      _             (_)          (_) /         |  ___      | 
   __(_)___  -->    /|\   -->    /|\/\   -->   | |   |     |
  |     \  |        [|          _/_\__\        | |   |     |
                    / \        (_)  (x)        |_|   |_____|  
                     
                     
                     
                     
                     
  But before going Office your mother ask you 
  have you taken your Office Id,Umbrella, or Tiffin normally.
  
   
         Mother   _____________
           __    ( Beta have u )
          /(_)  < taken all ur )
           /|\   (__stuffs?____)                                  
           / \                          
                      
                  ___________                              
                 ( Yes Mamma )                  ___________  
                     _v           _            /__Office___\ 
      _             (_)          (_) /         |  ___      | 
   __(_)___  -->    /|\   -->    /|\/\   -->   | |   |     |
  |     \  |        [|          _/_\__\        | |   |     |
                    / \        (_)  (_)        |_|   |_____| 
                     
  
  for e.g. if you have taken Office Id with you,
  you will get problem during entering Office and you
  will be allowed to enter the Office.
  
  so here mother works as a compiler. She is just checking
  whether you have taken important stuffs or not
  so that you will not face problem further.
  But it doesn't mean that it is Occured Exception.
  It is just like alert message.
  
  It only means that we are just checking that 
  whether further there should not be any Exception to occur.
  
  So in real world if you have taken Office Id with you,
  you will not get problem in your home or on the 
  way to Office, you will get problem when you reach
  at Office.
  so the part from home to Office is compile time
  and Exception never occur at compile time.
  Exception occurs at runtime.
  But when you reach the Office you will not be able 
  to enter in the Office without the Office Id.
  So this is part where Exception occurs and this
  part is like runtime.
  
   
         Mother   _____________
           __    ( Beta have u )
          /(_)  < taken all ur )
           /|\   (__stuffs?____)                                  
           / \                          
                      
                  ___________                              
                 ( Yes Mamma )               ______________       ___________
                     _v           _         (Oh! I forgot Id)    /__Office___\    
      _             (_)          (_) /                 v_        |  ___  _   |
   __(_)___  -->    /|\   -->    /|\/\   -->           ( )       | |   ||_|------Touch your Id
  |     \  |        [|          _/_\__\                /|\       | |   |     |   To enter
                    / \        (_)  (_)                / \       |_|   |_____| 
                     
  
 
                     
 e.g:
 
import java.io.FileInputStream;

 class Test{
	
	public static void main(String[] args) {
		
		FileInputStream fis = new FileInputStream("d:/abc.txt"); // below this line from new keyword
		                                                         // there will be red line
		                                                         // which show message like
		                                                      // Unhandled exception type FileNotFoundException
		                                                     // 2 quick fixes available
		                                                     // Add throws declaration or
		                                                     // Surround with try/catch
		                                                     // so it not an Exception
		                                                     // it is just warning, by compiler
		                                                      // it is saying that file not found
		                                                     // Exception can occur if file will not 
		                                                     // present at the location
		                                                     // so try to handle exception using
		                                                      // throws or try/catch 
		                                                        
		                                                       
		                                                     
	}

}
                     
-------------------------------------------------------------------------------------------------------------
after listening to compiler and 
 using try/catch to handle Exception:

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Test {
	
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("d:/abc.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
			
	}

}

	output: java.io.FileNotFoundException: d:\abc.txt (The system cannot find the path specified)
 	         
 	         so this output is our Exception 
 	         
 	    All the Exceptions occur at runtime
 		Exceptions never occurs at compile time.   
                     
------------------------------------------------------------------------------------------------------------
Compile Time Exception (Checked Exception):
It is the exception that Compiler can check
during compile time whether there will occur 
Exception or not during execution.
Compile Time Exception needs handling code
to compile program successfully.


Runtime Exception (Unchecked Exception):
It is the exception that Compiler cannot check
during compile time whether there will occur
Exception or not during execution.

Real world e.g:

         Mother   _____________
           __    ( Beta have u )
          /(_)  < taken all ur )
           /|\   (__stuffs?____)                                  
           / \                          
                      
                  ___________                              
                 ( Yes Mamma )                  ___________  
                     _v           _            /__Office___\ 
      _             (_)          (_) /         |  ___      | 
   __(_)___  -->    /|\   -->    /|\/\   -->   | |   |     |
  |     \  |        [|          _/_\__\        | |   |     |
                    / \        (_)  (_)        |_|   |_____| 
                     
		Mother can ask about Purse,OfficeId,Tiffin
		-> PurseNotFoundException
		-> OfficeIdNotFoundException
		-> TiffinNotFoundException
		
		so these are some Exceptions that mother can check
		but some Exceptions mother not check or ignore them
		but this Exception can also occurs.
		
		for e.g: unwanted event like or Exception
		-> BikePuncherException
		-> AccidentOccurException
		-> TrafficFoundException
		
		Those Exception that Compiler can check
		is called Checked Exceptions.
		But those Exception that compiler ignore
		(or Compiler not able to check)
		are called Unchecked Exceptions.
		
e.g: of Checked Exception

 class Test{
	
	public static void main(String[] args) {
		
		FileInputStream fis = new FileInputStream("d:/abc.txt"); // below this line from new keyword
		                                                         // there will be red line
		                                                         // which show message like
		                                                      // Unhandled exception type FileNotFoundException
		                                                     // 2 quick fixes available
		                                                     // Add throws declaration or
		                                                     // Surround with try/catch
		                                                     // so it not an Exception
		                                                     // it is just warning, by compiler
		                                                      // it is saying that file not found
		                                                     // Exception can occur if file will not 
		                                                     // present at the location
		                                                     // so try to handle exception using
		                                                      // throws or try/catch 
		  
		  // so compiler here before executing has 
		  // detected that exception will occur  
		  // during execution so this is 
		  // checked Exception
		    
		  // checked Exception should be 
		  // handle compulsory otherwise
		  // program will not successfully
		  // execute 
		  
		  // Those Exception that Compiler can check
		// is called Checked Exceptions.  
		                                                        	                                                       
		                                                     
	}

}
---------------------------------------------------------
e.g: of Unchecked Exception

class Test
{
	public static void main(String[] args) 
	{
		System.out.println(100/0);
		// here compiler has not shown any 
		// warning 
		// means compiler has ignore
		// or not able to check the
		// exception that can occur
		// at execution
		// so it is Unchecked Exception
		
		// Those Exception that compiler ignore
		// (or Compiler not able to check)
		// are called Unchecked Exceptions.
	
	}
}

	output: Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Exception_Handling.Test.main(Test.java:8)
	
----------------------------------------------------------------------------------------------------
 Difference Between Checked and Unchecked Exception
 
  Compile Time Exception /          |    Unchecked Exception /
  Checked Exception                 |    Runtime Exception
 -----------------------------------|----------------------------------------------------------------
                                    |
 1. Checked Exceptions are the      | 1. Unchecked Exceptions are the	    
    Exceptions that are checked     |    Exceptions that are not 
    and handled at compile time.    |    checked at compiled time.
                                    |
 2. The program gives a compilation | 2. The program compiles fine    
    error if a method throws a      |    because the compiler is not
    checked Exception.              |    able to check the Exception.
                                    |
 3. If some code within a method    | 3. A method is not forced by 
    throws a checked Exception,     |    compiler to declare the 
    then the method must either     |    unchecked Exceptions thrown
    handle the Exception or it      |    by it implementations.
    must specify the Exception      |    Generally, Such methods 
	using throws keyword.           |    almost always do not declare
	                                |    them, as well.
	                                |
 4. A checked Exceptions occur      | 4. Unchecked Exceptions occurs
    when the chances of failure     |    mostly due to programming
    are too high.                   |	 mistakes.
                                    |
 5. They are direct subclass of     | 5. They are direct subclass of
    Exception class but do not      |    RuntimeException class.
    inherit from RuntimeException.  |                                                                    
                                    |
------------------------------------------------------------------------------------------------------------
*/
package Exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class A3_Diff_Bet_Checked_n_Unchecked_Exceptions {
	
	public static void main(String[] args) {
		
		
		System.out.println(100/0);
		
		
	}

}
