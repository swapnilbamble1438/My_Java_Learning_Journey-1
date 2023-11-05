/*

What is Final
Final is the keyword which use with 
class, method and variable

e.g:

class Abc
{

}

class Test extends Abc
{

}
so here inheritanc is possible

but if I dont want my class to inherits its property
to another class then I can declare my class Final
e.g:

final class Abc
{

}

class Test // so because of class Abc is final
{          // so we cannot extends class Abc here

}

----------------------------------------------------
E.g: example with methods

class Abc
{
	void show()
	{
	}
}
class Test extends Abc
{
	void show() // method overriding
	{
	}
}	

so here inheritance is possible

but If I dont want class Abc to inherits its
show() method into other class then I can declare
my method as final

e.g:


class Abc
{
	final void show()
	{
	}
}
class Test extends Abc
{
	// so we cannot override show method
	// of class Abc because it is declared 
	// as final
}	

----------------------------------------------
e.g: example with variable

int a = 10;
a = 20;

but If I dont want to change my variable a 
value in future so I can declare it as
final 

e.g:

final int a = 10;

// so here we cannot assign or change new
// value to a becaus a is declared as final
// and the value of final variable 
// cannot be changed
 
-------------------------------------------
Importance Features of String Class:

1. String Constant Pool (SCP):
   It is special memory location in heap area
   which stores String Literals.
   
2. Immutable Objects:
   The String Objects are immutable which means
   once String object is created its data or state
   can't be changed but a new String ojbect
   is created.
   
3. + Operator for Strings:
   Multiple Strings can be concatinated
   using + operator.
   
4. Security: 
   The parameters used for network connections,
   database connection URLs, usernames / passwords,
   etc are represented in Strings. If it was
   mutable, these parameters could be changed 
   easily.
   
5. Class loading:
   String is used as an arguments for class loading.
   If mutable, it could result in the wrong class
   being loaded (because mutable objects change
   their state).
   
6. Synchronization and Concurrency:
   Making String immutable automatically makes
   them thread safe thereby solving the 
   synchronization issues.
   
7. Memory Management: 
   When compiler optimizes our String objects,
   it seems that if two objects have the same
   value ( a = "test", and b = "test") and 
   thus we need only one String object 
   (for both a and b, these two will point
   to the same object).
   
Q) Why String class is final?
   String class has got special features which
   is not available to other java classes
   and making the String class final prevents
   subclasses that could break these
   assumptions
    	OR
   String class is final because 
   no other class will copy/inherit its method,
   properties or features.
	
   final class String
   {
   
   }
   
-----------------------------------------------

	Final and immutability both are
	different concept from each other
	
	final deals with class,method are variable
	while immutability deals with the object
	
	so in final case
final int a = 10;

	a = 20; // it will show error
// so here we cannot assign or change new
// value to a because a is declared as final
// and the value of final variable 
// cannot be changed
 
 
  and in immutable object case
 final String a = "Swapnil";
 
  a= a += "s"; // error it will not possible
  
  a+= " Bamble"; // error it will also not possible

  
 
 and in mutable Object case
     if we create object
     e.g:
     
   final StringBuffer sb = new StringBuffer("hii");
		
 
 ________________________________________________________
|                                                        |
|         	        ___________________________      |
|   |	          |    |                           |     |	      
|   |     sb      |    |          hii              |     |
|   |             |    |                           |     |
|   |    	  |    |                           |     |
|   |	          |    |                           |     |
|   |	          |    |                           |     |
|   |	          |    |                           |     |
|   |             |    |                           |     |
|   |_____________|    |___________________________|     |
|    Stack Memory               Heap Memory              |
|       (LIFO)                                           |
|                                                        |
|                        JVM Memory                      |
|________________________________________________________|

 
 sb = sb.append(" bro"); // this will show error
   		                 // because we cannot resign it
   		                 // as it is final
   		but if we only write
   		
   		sb.append(" bro"); // it will update the existing
   							// String in SCP
   		System.out.println(sb);
   		output: hii bro
 ________________________________________________________
|                                                        |
|         		___________________________      |
|   |	          |    |                           |     |	      
|   |     sb      |    |          hii bro          |     |
|   |             |    |                           |     |
|   |    	  |    |                           |     |
|   |	          |    |                           |     |
|   |	          |    |                           |     |
|   |	          |    |                           |     |
|   |             |    |                           |     |
|   |_____________|    |___________________________|     |
|    Stack Memory                Heap Memory             |
|       (LIFO)                                          |
|                                                        |
|                        JVM Memory                      |
|________________________________________________________|



  
   if it is final we cannot resign it the new value
   and in immutable case the immutable class variables are
   never allowed to change its value
   
   But StringBuffer is mutable
   so if we not use final
   it can be changeable 
   e.g:
   StringBuffer sb = new StringBuffer(" hii");
   sb = sb.append(" bro");
   System.out.println(sb);
   output: hii bro
 
   
   
   
   
   
   

*/

package Strings;

public class A4_Why_String_is_Final {
	
	
		
	

}
