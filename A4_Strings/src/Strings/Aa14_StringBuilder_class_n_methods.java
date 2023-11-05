/*
 Ways to create String in Java:
 1. String - create immutable objects
 2. StringBuffer - create mutable objects
 3. StringBuilder
 ----------------------------------------------------------
 	 
  StringBuilder also create mutable object like
  StringBuffer.	
  StringBuilder has same constructors, methods as that 
  of StrinBuffer but StringBuffer methods are
  synchronized and StrinBuilder methods are 
  non-synchronized methods
  
  Synchronization:
 	Synchronization in Java guarantees that no two
 	threads can execute a synchronized method
 	which requires the same lock simultaneously
 	or concurrently. And thus synchronization 
 	increases waiting time of thread and affects
 	performance of the system.
 	
 	To overcome the proble of slow performance
 	of StringBuffer methods, Java introduced
 	StringBuilder concept in JDK 1.5 version and
 	creates all the methods of StringBuilder as
 	non-synchronized which increases the methods
 	performance.
-------------------------------------------------------------- 	
 	E.g:

Creating String using StringBuilder

StringBuilder sb = new StringBuilder("hii");

it will create String object in Heap Memory and reference will
be in Stack Memory.

 ________________________________________________________
|                                                        |
|         		___________________________      |
|   |	          |    |                           |     |	      
|   |     sb      |    |          hii              |     |
|   |             |    |                           |     |
|   |             |    |                           |     |
|   |	          |    |                           |     |
|   |	          |    |                           |     |
|   |	          |    |                           |     |
|   |             |    |                           |     |
|   |_____________|    |___________________________|     |
|    Stack Memory                Heap Memory             |
|       (LIFO)                                           |
|                                                        |
|                        JVM Memory                      |
|________________________________________________________|



 and if we try to append the StringBuilder
 
 	sb.append(" bro");
 	
 	then it will update the existing sb String
 	
 ________________________________________________________
|                                                        |
|         	        ___________________________      |
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
|       (LIFO)                                           |
|                                                        |
|                        JVM Memory                      |
|________________________________________________________|


	So in StringBuilder when we update the String object,
	it does not create new String object in Heap Memory,
	it updates the existing String object in Heap Memory.
	
	But in String When we try to update the String,
	it creates the new String in SCP and does not
	update the existing the String.
	
	Main difference between String and StringBuilder is:
	String Objects are immutable and StringBuilder
	Objects are mutable.
----------------------------------------------------------
 
 Q)	When we should use String and StringBuilder?
Ans     If the data does not change or change one or
 	two times only, use String.	
 	If data is constantly or frequently changing 
 	like in calculator, notepad etc, we should
 	use StringBuilder. Because if we use String
 	here then every time it will create new 
 	object and project will become heavy
 	and will becomes slow.
 	
------------------------------------------------------------
	StringBuilder is a class in java.lang package
	having methods and constructors:
	
	package java.lang;
	
	public final class StringBuilder extends AbstractStringBuilder implements java.io.Serializable,CharSequence
	{
		// 4 constructors
		StringBuffer(){...}
		StringBuffer(CharSequence seq}{...}
		StringBuffer(String Str){...}
		StringBuffer(int capacity){...}
		
		// methods
		public int length(){...}
		public int capacity(){...}
		public StringBuilder append(){...}
		public StringBuilder insert(){...}
		public StringBuilder reverse(){...}
		public StringBuilder delete(){...}
		public StringBuilder deleteCharAt(){...}
		public StringBuilder replace(){...}
		public void ensureCapacity(){...}
		public char charAt(){...}
		public int indexOf(){...}
		public int lastIndexOf(){...}
		public String substring(){...}
		public CharSequence subSequence(){...}
		public String toString(){...}
		// etc
	}
 	some methods are same as of String methods
 	
 	StringBuilder creates mutable object.
 	StringBuilder all methods are non-synchronized.
 	
 	Synchronization:
 	Synchronization in Java guarantees that no two
 	threads can execute a synchronized method
 	which requires the same lock simultaneously
 	or concurrently. And thus synchronization 
 	increases waiting time of thread and affects
 	performance of the system.
 	
 	To overcome the proble of slow performance
 	of StringBuffer methods, Java introduced
 	StringBuilder concept in JDK 1.5 version and
 	creates all the methods of StringBuilder as
 	non-synchronized which increases the methods
 	performance.
 	
 ---------------------------------------------------------------	
 e.g: 1)
 
 class Test
 {
 	public static void main(String args[])
 	{
 			
		StringBuilder sb1 = new StringBuilder();
		System.out.println(sb1.capacity());
		
		StringBuilder sb2 = new StringBuilder("Swapnil");
		System.out.println(sb2.length());
		
		// contains same methods as that
		// of StringBuffer you can 
		// refer from StringBuffer tutorial notes
		
		
 	}
 }	
  		output: 16
  				 7
 ---------------------------------------------------------------- 				 
  
 */

package Strings;

public class Aa14_StringBuilder_class_n_methods {
	
	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder();
		System.out.println(sb1.capacity());
		
		StringBuilder sb2 = new StringBuilder("Swapnil");
		System.out.println(sb2.length());
		
		// contains same methods as that
		// of StringBuffer you can 
		// refer from StringBuffer tutorial notes
		
		
	}

}
