/*

Methods of String Class:

1. length()

2. isEmpty()

3. trim()

4. equals():
   The equals() method compares the content of
   given two Strings. If any character is not
   matched, it returns false. If all characters
   are matched, it returns true.
   (equals() and == is different)
   
   .equals() method return value in boolean

5. equalsIgnoreCase():
   The equalsIgnoreCase() method is used to
   compare a specified String to another String,
   ignoring case considerations i.e. lower case
   or upper case. Two Strings are considered 
   equal ignoring case if they are of th same
   length and corresponding characters in the
   two String are equal ignoring case.
   
   If the two Strings are equal irrespective 
   of their case(lower or upper case).

6. compareTo():
   compareTo() method is used for comparing two
   Strings lexicographically. Each character
   of both the Strings is converted into a
   Unicode value for comparison. If both the
   Strings are equal then this method returns
   0 else it returns positive or negative value.

7. compareToIgnoreCase():
   compareToIgnoreCase() method is used for comparing two
   Strings lexicographically and irrespective of their case
   (whether they are lower or upper case). Each character
   of both the Strings is converted into a
   Unicode value for comparison. If both the
   Strings are equal then this method returns
   0 else it returns positive or negative value.

----------------------------------------------------------------------
e.g: Example for equals() and equalsIgnoreCase() methods:

class Test
{
	public static void main(String args[])
	{
		String s1 = "hii";
		String s2 = "hello";
		String s3 = "hii";
		String s4 = "Hello";
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equals(s3));
		
		System.out.println(s2.equals(s4));
		
		System.out.println(s2.equalsIgnoreCase(s4));
	
		// from equals() method  
		//we can check whether the String is empty or not
		System.out.println(s1.equals(""));
		
		if(s1.equals(""))
		{
			System.out.println("Name is Empty");
		}
		else
		{
			System.out.println("Name is not Empty");
		}
	
	}
}	

	output: false
			true
			false
			true
			false
			Name is not Empty
-----------------------------------------------------------------				
e.g: Example for compareTo() and compareToIgnoreCase() methods:

class Test
{
	public static void main(String args[])
	{
		String s1 = "a"; // 97 
		String s2 = "A"; // 65
		                 // 97- 65
		
		String s3 = "ajay";
		String s4 = "bharat";
		
		System.out.println(s1.compareTo(s2));
		
		System.out.println(s2.compareTo(s1));
		
		System.out.println(s1.compareToIgnoreCase(s2));
	
		
		// we can sort String also using
		// compareTo() or compareToIgnoreCase() methods
		if(s3.compareTo(s4) < 0)
		{
			System.out.println(s3 + ", " + s4);
		}
		else
		{
			System.out.println(s4 + ", "+ s3);
			
			
		}
	
	}
}	

	output: 32
			-32
			0
			ajay, bharat
			
-----------------------------------------------------------------
*/

package Strings;

public class A8_Comparing_Two_Strings {
	public static void main(String args[])
	{
		String s1 = "a"; // 97 
		String s2 = "A"; // 65
		                 // 97- 65
		
		String s3 = "ajay";
		String s4 = "bharat";
		
		System.out.println(s1.compareTo(s2));
		
		System.out.println(s2.compareTo(s1));
		
		System.out.println(s1.compareToIgnoreCase(s2));
	
		
		// we can sort String also using
		// compareTo() or compareToIgnoreCase() methods
		if(s3.compareTo(s4) < 0)
		{
			System.out.println(s3 + ", " + s4);
		}
		else
		{
			System.out.println(s4 + ", "+ s3);
			
			
		}
		
	}	

}
