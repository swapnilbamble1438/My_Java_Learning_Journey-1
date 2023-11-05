/*
Case Conversion:
1. toLowerCase()
2. toUpperCase()

Type Conversion:
1. valueOf()
2. toCharArray()
-------------------------------------------------
Case Conversion:

1. toLowerCase():
The toLowerCase() method converts all
characters of the String into a lowercase letter.

2. toUpperCase():
The toUpperCase() method converts all 
characters of the String into a uppercase letter.


e.g:

class Test{
	public static void main(String[] args)
	{
		String s = "Swapnil";
		
		System.out.println(s.toLowerCase());
		
		System.out.println(s.toUpperCase());
	}
}	
	output: swapnil
			SWAPNIL

----------------------------------------------------------
Type Conversion:

1. valueOf():
The valueOf() method converts different types
of values into String. By the help of 
String.valueOf() method, we can convert int
or long or float or double or object or 
any other type into String.

Note: valueOf() method is static method thats
why we can call valueOf() method directly
by String class.

2. toCharArray():
The toCharArray() method converts the given
String into a sequence of characters.
The returned array length is equal to the
length of the String.


e.g:

class Test
{
	public static void main(String[] args)
	{
		int a = 10;
		
		String s = String.valueOf(a);
		
		//
		
		String b = "Swapnil";
		
		char[] c = b.toCharArray();
	}
}


----------------------------------------------------------
*/

package Strings;

public class Aa12_Case_Conversion_n_Type_Conversion {
	public static void main(String[] args) {
		
		int a = 10;
		
		String s = String.valueOf(a);
		
		//
		
		String b = "Swapnil";
		
		char[] c = b.toCharArray();

		
		
		
	}
}
