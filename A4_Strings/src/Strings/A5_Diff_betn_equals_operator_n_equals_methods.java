/*
 
== operator is used for reference comparison
(address comparison). It means == operator checks
if both objects point to the same memory location
or not.

.equals() method is used for content comparison
(in String class). It means .equals() method
is used to check object value.
===============================================================
 == operator:

for e.g:

String s1 = new String("hii");
	
	so one object will store in heap and one in SCP
 ________________________________________________________
|                                                        |
|         		___________________________      |
|   |             |    |   _____________________   |     |	      
|   |     s1      |    |  |       hii           |  |     |
|   |    	  |    |  |                     |  |     |
|   |	          |    |  | String Pool (SCP)   |  |     |
|   |             |    |  |_____________________|  |     |
|   |	          |    |          hii              |     |
|   |             |    |                           |     |
|   |_____________|    |         Heap Memory       |     |
|    Stack Memory      |___________________________|     |
|        (LIFO)                                          |
|                                                        |
|                        JVM Memory                      |
|________________________________________________________|


again 
	String s2 = new String("hii");
	 
	 so it will create only one object in heap memory
	 and will not create object in SCP because String
	 hii is already present in SCP
	
 ________________________________________________________
|                                                        |
|         	        ___________________________      |
|   |             |    |   _____________________   |     |	      
|   |     s1      |    |  |       hii           |  |     |
|   |     s2      |    |  |                     |  |     |
|   |	          |    |  | String Pool (SCP)   |  |     |
|   |             |    |  |_____________________|  |     |
|   |	          |    |          hii              |     |
|   |             |    |          hii              |     |
|   |_____________|    |         Heap Memory       |     |
|    Stack Memory      |___________________________|     |
|        (LIFO)                                          |
|                                                        |
|                        JVM Memory                      |
|________________________________________________________|


	if we print 
	System.out.println(s1 == s2);
	
	output = false;
	
	because s1 and s2 both have different 
	object in heap memory. And == operator 
	is used to compare address(reference).
	But s1 and s2 both have different 
	address(reference) therefore it will
	show false

------------------------------------------------------------

if we create String 
 
 String s3 = "hello";
 
 it will directly create String object in SCP.
 
 _______________________________________________________
|                                                        |
|         	        ___________________________      |
|   |             |    |   _____________________   |     |	      
|   |     s3      |    |  |       hello         |  |     |
|   |    	  |    |  |                     |  |     |
|   |	          |    |  | String Pool (SCP)   |  |     |
|   |             |    |  |_____________________|  |     |
|   |	          |    |                           |     |
|   |             |    |                           |     |
|   |_____________|    |         Heap Memory       |     |
|    Stack Memory      |___________________________|     |
|        (LIFO)                                          |
|                                                        |
|                        JVM Memory                      |
|________________________________________________________|

and again if we create String
	
	String s4 = "hello";
	
	it will not create String in SCP
	because same String already exist in SCP.
	so it will point to the existing
	String in SCP.
	
 ________________________________________________________
|                                                        |
|         	        ___________________________      |
|   |             |    |   _____________________   |     |	      
|   |     s3      |    |  |       hello         |  |     |
|   |     s4      |    |  |                     |  |     |
|   |	          |    |  | String Pool (SCP)   |  |     |
|   |             |    |  |_____________________|  |     |
|   |	          |    |                           |     |
|   |             |    |                           |     |
|   |_____________|    |         Heap Memory       |     |
|    Stack Memory      |___________________________|     |
|        (LIFO)                                          |
|                                                        |
|                        JVM Memory                      |
|________________________________________________________|

	and if we compare
	System.out.println(s3 == s4);
	
	output: true
	
    output will be true because here 
    s3 and s4 both have same object or 
    address(reference).

	so if different reference variables refers 
	to the different object or address then output will b
    will be false.
    But if it refers to the same object or 
    address then output will be true.
 ====================================================================
  .equals method:
  .equals method is the method of Object class.
  
  Object:
  Object is the parent class of all the classes in Java.
  
  11 Methods of Ojbect class:
  
  1. clone()
  2. equals(Object obj)
  3. finalize()
  4. getClass()
  5. hashCode()
  6. notify()
  7. notifyAll()
  8. toString()
  9. wait()
  10. wait(long timeout)
  11. wait(long timeout, int nanos)
  
  
  class Object
  {
  	// contains 11 methods
  	  
  	// .equals method
  	 public boolean equals(Object obj)
  	 {
  	 	return (this==obj);// this keyword is to pass as an argument of current class
  				  // here this keyword is pointing to the reference
  				  // of current class and if it is 
  			         // equal to obj(reference)
  				 // then output will be true
  			         // or else false
  						   
  						   
  						   
  	 // means
  	 // .equals method of object class is used to
  	 // compare the reference or address of two
  	 // objects i.e if two objects point to 
  	 // the same memory location or not.
  	  
  	  // .equals method and == operator are both
  	  // equal in case of Object class
  	   
  	   
  	   // But in String case it is different
  	 }
  }
  
 // But in String case it is different
  
  class String extends Object
  {
  	 @Override
  	public boolean equals(Object obj) // here String has override .equals method of Object class
  	{                                // and in this method working of .equals method
  	  								// has been changed compare to Object method
  	  				
  	  								  
  	  	//.equals() method of String class is used
  	  	// for content comparison i.e it is used to
  	  	// check object value.							 
  	}
  
  }
  
  	for e.g:
  	
  	String s1 = new String("hii");
  	String s2 = new string("hii");
  	
  	System.out.println(s1 == s2);
  	output: false
  	
  	System.out.println(s1.equals(s2));
  	output: true
  	
  	so String class .equals method check
  	the content of Object.
  	and == operator check the address(reference)
  	of the Object.
  	
 -------------------------------------------------------
  	Q) what is the task of .equals method of Object class?
       Ans .equals method of object class is used to
  	   compare the reference or address of two
  	   objects.
  	    
  	Q) what is the task of .equals method of String class?
       Ans so String class .equals method check
  	   the content of Object. 
  	    
  	Q) what is the taks of .equals method ?
       Ans Then you can tell the whole concept
           from start to end.
      
       
     so the work of .equals method is different
     in Object class and different in
     String class.
     
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
   
  
 
 */


package Strings;

public class A5_Diff_betn_equals_operator_n_equals_methods {
	
	public static void main(String[] args) {
		
	}
}
