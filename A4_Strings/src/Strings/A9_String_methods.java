/*
 String method:
 1. length()
 2. isEmpty()
 3. trim()
 4. equals()
 5. equalsIgnoreCase()
 6. compareTo()
 7. compareToIgnoreCase()
 8. concat(String str method)
 9. join(CharSequence delimiter,CharSequence... elements)
 10. subSequence(int beginIndex,int endIndex) method
 11. i) substring(int beginIndex)
   . ii) substring(int beginIndex,int endIndex) 
 
----------------------------------------------------------- 
Adding two String using plus operator{

class Test
{
	public static void main(String args[])
	{
		String s1 = "hii";
		String s2 = " bro";
		
		System.out.println(s1 + s2);		
		System.out.println(s1 + 10);		
		System.out.println(s1 + 10 + 20);		
		System.out.println(10 + 20 + s1);
		System.out.println(10 + s1 + 20);
		
		// plus operator works from left to right
		
		System.out.println(s1 + 20 / 10);
		// here it will divide first then do
		// addition with String
		
		System.out.println(s1 + 10 * 10);
		
	// System.out.println(s1 + 10 - 5);
		
		// BODMAS: It stands for Bracket,of,Division,
		// Multiplication,Addition and Subtraction.
		// It refers to the order of operations to
		// solve an expression. It tells which process
		// to perform first to evaluate a given
		// numerical expression.
	}
}	
	output: hii bro
			hii10
			hii1020
			30hii
			10hii20
			hii2
			hii100
--------------------------------------------------------------------

1. concat(String str) method:

concat(String str) method concatenates one String
to the end of another String.
This method returns a String with the value of 
the String passed into the method, appended to 
the end of the String.	

e.g:
	
class Test
{
	public static void main(String args[])
	{
		String s1 = "hii";
		String s2 = " bro";
		
		System.out.println(s1.concat(s2));
	}
}	
	output: hii bro
-----------------------------------------------------------------
2. join(CharSequence delimiter,CharSequence... elements):

join(CharSequence delimiter,CharSequence... elements) 
is the static method which concatenates the given
elements with the delimiter and returns the
concatenated String. It was Included int JDK 1.8 version.

Note that if an element is null, then null is added
and if delimiter is null then it will throw
"java.lang.NullPointerException"

e.g:
class Test
{
	public static void main(String args[])
	{
		String s1 = "Swapnil";
		String s2 = "Yash";
		String s3 = null;
		
		System.out.println(String.join(",",s1,s2,s3));
		
		// put first element as delimiter("," or " " or ";")
		// which you want  
		// and the put Strings
		// But in the place of delimiter you cannot provide
		// null it will throw exception
		// but you can put null values in String 
		 
		
		// You can add multiple elements if you want
		//
		// so we call join method throught String
		// class directly. Because it is a static
		// method
	}
}
	output: Swapinil,Yash,null
--------------------------------------------------------------------
3. subSequence(int beginIndex,int endIndex) method:
	
subSequence(int beginIndex,int endIndex) method 
returns a CharSequence. The subsequence starts
with the char value at the specified index and
ends with the char value at(end-1).
It throws java.lang.StringIndexOutOfBoundsException
exception if any index position value is negative.	

subSequence method returns value
in a char of Sequence

e.g:

class Test
{
	public static void main(String args[])
	{
		String s = "Swapnil";
		
		System.out.println(s.subSequence(2, 6));
	}
}
	output: apni
---------------------------------------------------------------
4. substring(int beginIndex)
	and
5. substring(int beginIndex,int endIndex)

It returns a new String that is a substring
of this String. The substring begins at the
specified beginIndex and extends to the 
character at index endIndex -1;

substring method returns value in String
	
class Test
{
	
	public static void main(String args[])
	{
		String s = "Swapnil";
		
		System.out.println(s.substring(1));
		System.out.println(s.substring(1,6));
		
	}

}	
	 output: wapnil
			 wapni
--------------------------------------------------------------	
*/
package Strings;

public class A9_String_methods {
	
	public static void main(String args[])
	{
		String s = "Swapnil";
		
		System.out.println(s.substring(1));
		System.out.println(s.substring(1,6));
		
	}

}
