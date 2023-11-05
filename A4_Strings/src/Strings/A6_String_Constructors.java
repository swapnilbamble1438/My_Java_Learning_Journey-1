/*
 
 String Constructors:
 
  class String
 {
 	public String()
 	{
 	
 	}
 	
 	public String(String str)
 	{
 	
 	}
 	
 	public String(StringBuffer sb)
 	{
 	
 	}
 	
 	public String(StringBuilder sb)
 	{
 	
 	}
 	
 	public String(char[] ch)
 	{
 	
 	}
 	
 	public String(byte[] b)
 	{
 	
 	}
 	
 	// and many more constructors and methods
 	// contain in String class
 	
 }
 
 ---------------------------------------------------
 E.g: use of constructor
 
 class Main
 {
 	public static void main(String args[])
 	{
 		String s1 = "hii";  // creates 1 object
 		String s2 = new String("hello");// creates 2 object
 	
 	     // use of no arg String constructor
 		// we can create empty String
 		String s3 = new String();
 		System.out.println(s3.length()); // output: 0
 	
 	
 		// use of (String str) constructor
 		String s4 = new String("bye"); // creates 2 object
 		System.out.println(s4);
 	
 		// use of (StringBuffer sb) constructor
 		 StringBuffer sb1 = new StringBuffer("happy");
 		 String s5 = new String(sb1); 
 		 System.out.println(s5);
 		 
 		 // use of (StringBuilder sb) constructor
 		  StringBuilder sb2 = new StringBuilder("joy");
 		  String s6 = new String(sb2); // here we are converting mutable object into immutable object
 		  System.out.println(s6);   // and we can pass StringBuilder or Buffer into String constructor
 		 
 		 // use of  (char[] c) constructor
 		  char[] c = {'a','b','c'};
 		  String s7 = new String(c);
 		  System.out.println(s7); // we can pass char[] into String constructor.
 		 
 		 // use of (byte[] b) constructor
 		  byte[] b = {101,102,103};
 		  String s8 = new String(b); // here it will convert each byte into char.
 		  System.out.println(s8);  // so here we can pass byte[] into String constructor
 		                          // try to do this and check the output.
 		 
 		
 	}
} 	
--------------------------------------------------------------------------

 Q) why char array is preferred over String for
    storing passwords in Java ?
Ans 1.String objects are immutable in Java and
    therefore if a password is stored as plain
    text it will be available in memory until
    Garbage collector clears it, but String
    objects are stored in String literal pool(SCP)
    for re-usability and garbage collection is not
    applicable in SCP, which is a security threat.
    with an array, you can explicitly wipe the
    data after you're done with it. You can 
    overwrite the array with anything you like,
    and the password won't be present anywhere
    in the system, even before garbage collection.
        OR
    String object if created it Stored in SCP
    and it will not get change or update
    and it will remain in SCP even after it is
    of no use. and SCP is not applicable for 
    garbage collection(means it cannot be 
    deleted through garbage collection). 
    and there is chances of existing old 
    String(password) can get hacked. 
    thats why char array is better
    for storing password.
        
 e.g:
 
 class Main
 {
 	public static void main(String args[])
 	{
 		char[] s1 = new char[]{'a','b','c'};
 		
 		String s2 = new String("abc");
 		
 		System.out.println("s1: " + s1);
 		System.out.println("s2: " + s2);
 	}
 }
 		output: s1: [c@659e0bfd
 		        s2: abc
 		        
    so here char[] provide different value	
    i.e it will provide object.
    and String will provide value inside
    object.	        
    
    that means password stored in char[] will 
    be safer than String, because the 
    value inside it, we cannot get it directly.
    
    but in case of String we can directly print
    the value of object(password).
    
    
 
 
 */


package Strings;

public class A6_String_Constructors {
	
	public static void main(String[] args) {
		
		String str = new String();
		System.out.println(str.length());
		
		
	}

}
