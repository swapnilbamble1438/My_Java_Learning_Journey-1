/*
Searching Characters in String methods:

1. indexOf()
2. lastIndexOf()
3. charAt()
4. contains()
5. endsWith()
6. startWith()
----------------------------------------------
1. indexOf()
The indexOf() method returns the position of the
first occurence of sepcified charater(s) in 
a String or return -1, if the character does
not occur.
 OR
return the index position of characters or String in Integer.

e.g:

class Test {

	public static void main(String[] args) {
		
		
		String s = "Swapnil";
		System.out.println(s.indexOf('w'));
		System.out.println(s.indexOf("pn"));
	
	}
}	
	output: 1
	        3
-------------------------------------------------------
2. lastIndexOf()
The lastIndexOf() method returns the position
of the last occurence of the specified characters(s)
in a String or return -1, if the character
does not occur.
	 OR
return the last index position of characters or String in Integer. 
lastIndexOf() search String from last to first
e.g:

class Test {

	public static void main(String[] args) {
		
		
		String s = "Nitin";
		String t = "Searching Characters";
		System.out.println(s.lastIndexOf('n'));
		System.out.println(t.lastIndexOf("er"));

		
	}
}	
	output: 4
			17
----------------------------------------------------------------
3. charAt();
The charAt() method returns the character
at the specified  index. The index value should
lie between 0 and length()-1;

It returns the value in charcter format

e.g:

class Test {

	public static void main(String[] args) {
		
		
		String s = "Swapnil";
		
		System.out.println(s.charAt(4));

		
	}
}	
	output: n
----------------------------------------------------
4. contains()
The contains() method searches the sequence
of characters in the given String. It
returns true if sequence of char values
are found in this String otherwise returns false.

It will take argument in String format and 
return result in boolean format.

e.g

class Test {

	public static void main(String[] args) {
		
		
		String s = "Swapnil";
		
		System.out.println(s.contains("pn"));
	
	}
}
	output: true
------------------------------------------------------------
5. startsWith():
The startWith() method tests if a String starts
with the specified prefix begining from
1st index. If yes then it will return true
else it will return false.

It will take argument in String format and 
return result in boolean format.

e.g:


class Test{

	public static void main(String[] args) {
		
		
		String s = "Swapnil";
		
		System.out.println(s.startsWith("Sw"));
	
	}
}	
	output: true
---------------------------------------------------------	
6. endsWith():
The endsWith() method checks whether the String
ends with a specified suffix. If yes, then
method will return true otherwise it will
return false.

It will take argument in String format and 
return result in boolean format.

e.g:

class Test{

	public static void main(String[] args) {
		
		
		String s = "Swapnil";
		
		System.out.println(s.endsWith("il"));
	
	}
}
	output: true




---------------------------------------------------------
*/
package Strings;

public class Aa11_Searching_Charcters_methods {

	public static void main(String[] args) {
		
		
		String s = "Swapnil";
		
		System.out.println(s.endsWith("il"));
	
	}
}
