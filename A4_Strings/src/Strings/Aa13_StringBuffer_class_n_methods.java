/*

 
 -----------------------------------------
 Topics we completed:
 1. What is String
 2. String Constant Pool
 3. String Objects Immutability Concept
 4. String final concept
 5. String class methods and constructors
 ------------------------------------------------
  Ways to create String in Java:
 1. String - create immutable objects
 2. StringBuffer
 3. StringBuilder
 
---------------------------------------------------

E.g:

Creating String using StringBuffer

StringBuffer sb = new StringBuffer("hii");

it will create String object in heap memory and reference will
be in Stack Memory.

 ________________________________________________________
|                                                        |
|         		___________________________      |
|   |	          |    |                           |     |	      
|   |     sb      |    |          hii              |     |
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


 and if we try to append the StringBuffer
 
 	sb.append(" bro");
 	
 	then it will update the existing sb String object
 	
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
|       (LIFO)                                           |
|                                                        |
|                        JVM Memory                      |
|________________________________________________________|



	So in StringBuffer when we update the String object,
	it does not create new String object in Heap memory,
	it updates the existing String object in Heap memory.
	
	But in String When we try to update the String,
	it creates the new String in SCP and does not
	update the existing the String.
	
	Main difference between String and StringBuffer is:
	String Objects are immutable and StringBuffer
	Objects are mutable.
----------------------------------------------------------
 
 Q)	When we should use String and StringBuffer?
Ans     If the data does not change or change one or
 	two times only, use String.	
 	If data is constantly or frequently changing 
 	like in calculator, notepad etc, we should
 	use StringBuffer. Because if we use String
 	here then every time it will create new 
 	object and project will become heavy
 	and will becomes slow.
 	
------------------------------------------------------------
	StringBuffer is a class in java.lang package
	having methods and constructors:
	
	package java.lang;
	
	public final class StringBuffer extends AbstractStringBuilder implements java.io.Serializable,CharSequence
	{
		// 4 constructors
		StringBuffer(){...}
		StringBuffer(CharSequence seq}{...}
		StringBuffer(String Str){...}
		StringBuffer(int capacity){...}
		
		// methods
		public synchronized int length(){...}
		public synchronized int capacity(){...}
		public synchronized StringBuffer append(){...}
		public synchronized StringBuffer insert(){...}
		public synchronized StringBuffer reverse(){...}
		public synchronized StringBuffer delete(){...}
		public synchronized StringBuffer deleteCharAt(){...}
		public synchronized StringBuffer replace(){...}
		public synchronized void ensureCapacity(){...}
		public synchronized char charAt(){...}
		public synchronized int indexOf(){...}
		public synchronized int lastIndexOf(){...}
		public synchronized String substring(){...}
		public synchronized CharSequence subSequence(){...}
		public synchronized String toString(){...}
		// etc
	}
 	some methods are same as of String methods
 	
 	StringBuffer creates mutable object.
 	StringBuffer all methods are synchronized.
 	
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
	
		public static void main(String[] args) 
		{
			
			StringBuffer sb1 = new StringBuffer();
			// now this object can store 16 bit character
			System.out.println(sb1.capacity());  // default capacity
			
			StringBuffer sb2 = new StringBuffer("Swapnil");
			System.out.println(sb2.capacity()); // default capacity + length of characters
			
			
			StringBuffer sb3 = new StringBuffer(1000); // you can provide initial capacity
			System.out.println(sb3.capacity()); // now you can store 1000 characters
				
	//	---------------------------------------------------------------------------------		
			System.out.println("-------------------------------------------");
			
			StringBuffer sb4 = new StringBuffer();
			System.out.println(sb4.capacity());  // 16
			
			sb4.append("hello");
			System.out.println(sb4.capacity());  // 16
			
			sb4.append(" there!");
			System.out.println(sb4.capacity());  // 16
			
			sb4.append(" I am");
			System.out.println(sb4.capacity()); // (old capacity * 2) + 2  or
			                                    // (old capacity +1) * 2
			sb4.append(" Swapnil");				// (16 + 1) * 2 = 34
			System.out.println(sb4.capacity());
			
			sb4.append(" here, Whats'up");      // (34 + 1) * 2 = 70
			System.out.println(sb4.capacity());
			
	//-----------------------------------------------------------
			System.out.println("-------------------------------------------");
			
			StringBuffer sb5 = new StringBuffer("Swapnil");
			System.out.println(sb5.length());
		}
}	
		output: 16
				23
				1000
				------------------------
				16
				16
				16
				34
				34
				70
				-------------------------
				7
-------------------------------------------------------------------------------------
 Q) Difference between capacity() and length() method
Ans Both return Integer values but capacity() method
    shows that how much numbers of characters 
    can be store in a object and length() method
    shows the numbers of characters present 
    in object.
-------------------------------------------------------------------------------------    
 e.g: 2) 
 
class Test {
	
		public static void main(String[] args) {
						
			StringBuffer sb1 = new StringBuffer("Swapnil");
			System.out.println(sb1.append(" Bamble"));
			
			System.out.println(sb1.charAt(3));
			
			StringBuffer sb2 = new StringBuffer("Hello How are you?");
			System.out.println(sb2.delete(6, 9));
			
			StringBuffer sb3 =new StringBuffer("I am a Programmer");
			System.out.println(sb3.delete(5, 6));
			
			StringBuffer sb4 = new StringBuffer("I am a Developer");
			System.out.println(sb4.deleteCharAt(5));
			
			System.out.println(sb3.equals(sb4));
			
			StringBuffer sb5 = new StringBuffer("hii");
			StringBuffer sb6 = sb5.append(" bro");
			System.out.println(sb5.equals(sb6));
			// StringBuffer class does not override
			// equals method of Object class But
			// String class override the equals
			// method of Object class
			
			
		}
}
 		output: Swapnil Bamble
				p
				Hello  are you?
				I am  Programmer
				I am  Developer
				false
				true
--------------------------------------------------------------
e.g: 3)

class Test
{
	public static void main(String args[])
	{
			StringBuffer sb7 =  new StringBuffer("Dustin Poirier");
			System.out.println(sb7.indexOf("i"));
			
			System.out.println(sb7.lastIndexOf("i"));
			
			System.out.println(sb7.insert(7, "Diamond "));
			
			StringBuffer sb8 = new StringBuffer("Dhoom One");
			System.out.println(sb8.replace(6, 9, "Three"));
			
			System.out.println(sb8.reverse());
			// Reverse method is not in String class
			// it is in StringBuffer class
			
			StringBuffer sb9 = new StringBuffer("MMA World");
			System.out.println(sb9.subSequence(4, 8));
			
			System.out.println(sb9.substring(4,7));
			
			System.out.println(sb9.substring(4));
	}
}
	output: 4
			11
			Dustin Diamond Poirier
			Dhoom Three
			eerhT moohD
			Worl
			Wor
			World


---------------------------------------------------------------			

e.g: 4)

class Test
{
	public static void main(String args[])
	{
			StringBuffer sb10 = new StringBuffer("Prince of Persia");
			System.out.println(sb10.toString());
			
			StringBuffer sb11 = new StringBuffer();
			sb11.ensureCapacity(34);
			System.out.println(sb11.capacity());
			
			StringBuffer sb12 = new StringBuffer("Ton? Ferguson");
			sb12.setCharAt(3, 'y');
			System.out.println(sb12);
			
			StringBuffer sb13 = new StringBuffer("Conor Mcgregor");
			sb13.setLength(5);
			System.out.println(sb13);
			
			StringBuffer sb14 = new StringBuffer("Jon");
			sb14.ensureCapacity(100);
			System.out.println(sb14.capacity());
			sb14.trimToSize(); // it will delete extra space
			System.out.println(sb14.capacity()); 
	}
}

	output: Prince of Persia
			34
			Tony Ferguson
			Conor
			100
			3
---------------------------------------------------------------
 */

package Strings;

public class Aa13_StringBuffer_class_n_methods {
	
		public static void main(String[] args) {
						
			StringBuffer sb1 = new StringBuffer("Swapnil");
			System.out.println(sb1.append(" Bamble"));
			
			System.out.println(sb1.charAt(3));
			
			StringBuffer sb2 = new StringBuffer("Hello How are you?");
			System.out.println(sb2.delete(6, 9));
			
			StringBuffer sb3 =new StringBuffer("I am a Programmer");
			System.out.println(sb3.delete(5, 6));
			
			StringBuffer sb4 = new StringBuffer("I am a Developer");
			System.out.println(sb4.deleteCharAt(5));
			
			System.out.println(sb3.equals(sb4));
			
			StringBuffer sb5 = new StringBuffer("hii");
			StringBuffer sb6 = sb5.append(" bro");
			System.out.println(sb5.equals(sb6));
			// StringBuffer class does not override
			// equals method of Object class But
			// String class override the equals
			// method of Object class
			
		//-----------------------------------------------------
			System.out.println("-------------------------------------------");
			
			StringBuffer sb7 =  new StringBuffer("Dustin Poirier");
			System.out.println(sb7.indexOf("i"));
			
			System.out.println(sb7.lastIndexOf("i"));
			
			System.out.println(sb7.insert(7, "Diamond "));
			
			StringBuffer sb8 = new StringBuffer("Dhoom One");
			System.out.println(sb8.replace(6, 9, "Three"));
			
			System.out.println(sb8.reverse());
			// Reverse method is not in String class
			// it is in StringBuffer class
			
			StringBuffer sb9 = new StringBuffer("MMA World");
			System.out.println(sb9.subSequence(4, 8));
			
			System.out.println(sb9.substring(4,7));
			
			System.out.println(sb9.substring(4));
			
			//-----------------------------------------------------
			System.out.println("-------------------------------------------");
			
			StringBuffer sb10 = new StringBuffer("Prince of Persia");
			System.out.println(sb10.toString());
			
			StringBuffer sb11 = new StringBuffer();
			sb11.ensureCapacity(34);
			System.out.println(sb11.capacity());
			
			StringBuffer sb12 = new StringBuffer("Ton? Ferguson");
			sb12.setCharAt(3, 'y');
			System.out.println(sb12);
			
			StringBuffer sb13 = new StringBuffer("Conor Mcgregor");
			sb13.setLength(5);
			System.out.println(sb13);
			
			StringBuffer sb14 = new StringBuffer("Jon");
			sb14.ensureCapacity(100);
			System.out.println(sb14.capacity());
			sb14.trimToSize(); // it will delete extra space
			System.out.println(sb14.capacity()); 
			
					
			
		}
}
