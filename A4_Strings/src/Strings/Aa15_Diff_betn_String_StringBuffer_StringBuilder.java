/*
	    |                        |	                        |
	    |	     String          |      StringBuffer  	|     StringBuilder
------------|------------------------|--------------------------|------------------------				
  Storage   | 1. It allocates        | 1. It allocates          | 1. It allocates
	    |    memory in Heap	     |    memory only in        |    memory only in
            |    area and SCP	     |    Heap area             |    Heap area
	    |    aswell.             |     		        | 
	    |    i.e.		     |	  i.e.		        |    i.e.
	    |    String can create   |    StringBuffer can      |    StringBuilder can
	    |    object in Heap area |    create object only    |    create object only
	    |    and SCP             |    in Heap area          |    in Heap area
	    |                        |                          |
  Objects   | 2. String create	     | 2. StringBuffer create   | 2. StringBuilder create
	    |    immutable object    |    mutable object 	|    mutable object
	    |                        |                          |
  Memory    | 3. If we change the    | 3. consume less          | 3. occupy less
	    |    value of String     |    memory                |    memory
	    |    a lot of times,     |                          |
	    |    then it will        |                          |
	    |    allocate more       |                          |
	    |    memory.             |                          |
	    |    i.e. 		     |    i.e		        |    i.e
	    |    Each time when we   |    In this case as       |    In this case as
	    |    change the String,  |    object is mutable.    |    object is mutable.
	    |    it creates new      |    whenever we will try  |    whenever we will try
	    |    String Object and   |    to change the String  |    to change the String
	    |    thus allocates new  |    Object value it will  |    Object value it will
	    |    memory, more memory |    change the original   |    change the original
	    |    allocation, less    |    String Object and     |    String Object and
	    |    performance         |    thus no new Object    |    thus no new Object
	    |                        |    is created. less      |    is created. less 
	    |                        |    memory occupied, less |    memory occupied, less
	    |	                     |    memory, more          |    memory, more
	    |	                     |    performance           |    performance
	    |		             |                          | 
Threadsafe  | 4. String is not       | 4. All methods are       | 4. All methods are
	    |	 thread safe         |    synchronized and      |    non-synchronized
	    |	                     |    thus it is thread     |    and thus it is not
            |		    	     |	  safe                  |    thread safe
	    |			     |	                        | 
Performance | 5. String 	     | 5. StringBuffer          | 5. StringBuilder 
	    |    performance is      |    performance is fast   |    performance is fast
	    |    slow		     |    as compare to string  |    as compare to
	    |		       	     |                          |     StringBuffer
	    |			     |                          |   
    Use     | 6. It is better to     | 6. It is better to use   | 6. It is better to use
	    |    use when data is    |    when data is          |    when data is 
	    |    not changing        |    changing frequently   |    changing frequently
	    |    frequently	     |                          | 
            |			     |                          |
	    |			     | 7. If you want method    | 7. If you want method
	    |			     |    to be thread safe     |    not to be thread
	    |			     |    then it is better     |    safe then it is
	    |			     |    to use StringBuffer   |    better to use
	    |			     |  	   		|    StringBuilder
	    |			     |  			|	
									
						
*/      
package Strings;

public class Aa15_Diff_betn_String_StringBuffer_StringBuilder {

}
