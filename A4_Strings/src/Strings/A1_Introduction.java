/*
String:
String is a non-primitive data types 
because it references a memory location where
data is stored in the heap memory (or String
Constant Pool) i.e, it references to a memory
where an object is actually placed. And thus
the variable of a non-primitive data is also
called reference data types or object reference
variable. This object reference variable lives
on the stack memory and the object to which
it points always lives on the heap memory.
The stack holds a pointer to the object on the
heap.
Thus all non-primitive data types are simply
called objects which are created by 
instantiating a class.

Primitive Datatypes sizes are fixed.
But Non Primitive Datatypes sizes are not fixed
And String is also a Non-Primitive Datatype
thus its size is also not fixed.

String is the sequence or group of characters.
 OR
String is an array of characters.

For e.g:
 char[] c = {'d','e','e','p','a','k'};
 String s = new String(c);
 	is same as String s = "deepak";
 	
* For representing character sequence
* java has made an interface named as
* CharSequence

* String is a class:
   public final class String extends Object implements CharSequence,Serializable,Comparable
    {
     	// include	methods
    }
    
    Serializable interface is used when we need
    to store a copy of the object and send
    then to another process which runs on the
    same sysem or over the network.
    
    Comparable interface is used to order the 
    objects of the class. It has only one
    method 
    i.e. compareTo()
    
    so String is a class
    so that we can create its object also  
    like :
    String s = new String();
    String object is immutable object
    (means unable to change)
    
    
    Noramlly we declaire and initialize String
    like:
    String s = "Hello";
    so this will also create String immutable object
    
-------------------------------------------------

	There are total three classes to create String:
	1. String
	2. StringBufer
	3. StringBuilder
	
	
    
    
    
    
 


*/

package Strings;

public class A1_Introduction {

}
