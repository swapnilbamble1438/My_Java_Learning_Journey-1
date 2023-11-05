/*
Difference Between final, finally and finalize:

         final            |           finally            |        finalize
--------------------------|------------------------------|----------------------------------------------------------          
1. final is the keyword   | 1. finally is the block      | 1. finalize is the method  
                          |                              |
2. final keyword cab be   | 2. finally can be used       | 2. finalize method can be
   used with:             |    with either try or        |    override for an object.
   -> variable            |    try catch block.          |
   -> method              |                              |
   -> class               |                              | 
   so we can create       |                              |
   final varaible,        |                              |
   final method and       |                              |
   final class also.      |                              |
                          |                              |
3. final variable value   | 3. finally block is          | 3. finalize syntax:
   cannot be changed      |    used to write(provide)    |    -> protected void finalize() throws Throwable
   Because its value      |    cleanup code.             |       {
   is fixed(constant).	  |	      OR                 |         // clean-up code
   final method cannot    |    finally block is use to   |       }
   be override.           |    close the resource.       |    finalize method is  
   final class cannot     |    e.g:                      |    override for providing
   be inherit.            |    i) If we open the file    |    clean-up code.
                          |       or database in try     |	  
   			  |	  block we can close     |    finalize method always
 			  |	  it in finally block.   |    execute itself before
 			  |    ii) Memory releasing code |    Garbage Collection.
			  |	   can also be written   |        OR
                          |        in finally block.     |    finalize method is executed
			  |	   		         |    just prior to the Garbage
			  |	    			 |    Collection.
			  |	   			 |    so if any object which is
			  |	                         |    going to be deleted,
			  |	   			 |    has any resource opened
			  |	                         |    or if any resource related
			  |	                         |    to that object is opened,
			  |	   		         |    so the code to close
			  |	   			 |    that resource will be
			  |	   			 |    written in finalize method.
			  |	   			 |		
			  |	   			 |    thus in finalize method
			  |	   			 |    we write cleanup code.
			  |	   			 |	  
							   								 
							   
*/
package Exception_Handling;

public class A7_Diff_Betn_final_finally_finalize {

}
