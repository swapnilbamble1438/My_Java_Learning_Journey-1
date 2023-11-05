/*
 Object class is the parent of all the classes
 in Java.
 
 Throwable is the parent class of Exception class
 			
        				
 			      Object
 			         |
 		             Throwable
              ___________________|_________
             |                             | 
         Exceptions              |       Errors
---------------------------------|----------------------------
1. Exceptions are mostly         | 1. Errors are occured
   occurs because our            |    because of lack of
   Program                       |    System Resources; 
                                 |    not by our programs
                                 |    and thus, programmer
                                 |    cannot do anything
                                 |  
2. Exceptions are recoverable    | 2. Errors are not                                 
   i.e. we can handle            |    recoverable.
   Exceptions. Programmer        |    Programmer can never
   can recover Exceptions        |    recover error.
   or handle Exceptions          |    For recovering error
                                 |    you have to deal with
                                 |    System Administrator
                                 |    only.The one who deals
                                 |    with the System
                                 |  
3. Exceptions are of two types:  | 3. Error is of one type:                          
   i) Compile time(checked       |    i) Runtime (unchecked
      Excepion)                  |    Exception)
   ii) Runtime(unchecked         |                          
       Exception)                |
                                 |  
_________________________________|_________________________________                                
                                   
      Hierarchy:
      
      
      	                                                                          Object
 						                                    |
 	   				                                        Throwable
                                     _______________________________________________|___________________________________________________________
                                    |                                                                                                           |                  
                                Exception                                                                                                     Error
     _______________________________|____________________________________                                                    ___________________|________________________         
  __|______________|_________|_________|_________|____________|_____ ____|__________________________________________________|_____________________|______________________|_______________                                                                                        |
 | ClassNotFound   |    IOException    |   RemoteException    |     | RuntimeException                                 VirtualMachine          Linkage                   AscertionError  | 
 |  Exception      |         |         |                      |     |     |                                              Error                  Error                                    |
 |            NoSuchMethod   |   SQL Exception         Interrupted  |     |--ArithmeticException                          |                        |                                     |
 |              Exception    |                           Exception  |     |--ClassCastException                           |--StackOverflowError    |--VerifyError                        |
 |                           |                                      |     |--NullPointerException                         |--OutOfMemoryError      |--ClassFormatError                   |
 |                           |--EOF Exception                       |     |--IndexOutOfBoundException                                              |--NoClassDefFoundError               |
 |                           |--FileNotFoundException               |     |     |                                                                                                        |
 |                           |--IntruptedIOException                |     |     |--ArrayIndexOutOfBoundException                                                                         |
 |                                                                  |     |     |--StringIndexOutOfBoundException                                                                        |
 |                                                                  |     |                                                                                                              |
 |                                                                  |     |--IllegalArgumentException                                                                                    |
 |                                                                  |     |     |                                                                                                        |
 |                                                                  |     |     |--NumberFormatException                                                                                 |
 |                                                                  |     |                                                                                                              |
 |                                                                  |     |--etc.                                                                                                        |
 |                                                                  |                                                                                                                    |
 |                   Compile Time Exception                         |                               Runtime Exception                                                                    |
 |                   or Checked Exception                           |                             or Unchecked Exception                                                                 |
 |__________________________________________________________________|____________________________________________________________________________________________________________________|                                                                 
                                                                             
                                                                             
   This Hierarchy contains only main-main Exceptions and Errors only.
   But there are many more Exceptions and Errors.   
   
   CompileTime Exception (Checked Exception) contains:
   ClassNotFoundExeption
   NoSuchMethod          
   IOException
   SQLException
   RemoteException
   InterruptedException                       
   
   Runtime Exception (Unchecked Exception) contains:
   RuntimeException
   Error (contains all Error)                
                                                                       
                                                                         
 					    
 */

package Exception_Handling;

public class A2_Diff_Betn_Exception_n_Error {

}
