/*
 Methods of String class:
 1. length()
 2. isEmpty()
 3. trim()
 4. equals()
 5. equalsIgnoreCase()
 6. compareTo()
 7. compareToIgnoreCase()
 8. concat()
 9. join()
 10. subSequence()
 11. substring()
 
 Method to update String:
 1. replace():
 2. replaceFirst()
 3. replaceAll()
 --------------------------------------------------------
  1. replace():
  replace(char oldChar, charnewChar) method
  returns a String replacing all the old 
  characters or CharSequence to new characters
  or CharSequence.
  This method was introduced in JDK 1.5 version.
  
e.g:
class Test {
	
	public static void main(String[] args) {
		
		String s1 = "My name is Swapnil and My surname is Bamble";
 		
 		System.out.println(s1.replaceFirst("is","was"));
		
		// here whereever method will get Swapnil
 		// it will get replace by Yash	
 				
	}
}	
	
 	output: My name was Swapnil and My surname was Bamble
 --------------------------------------------------------------
 2. replaceFirst():
 replaceFirst(String regex, String replacement) method
 replaces the first substring that fits the
 specified regular expression with the 
 replacement String. If the specified regular
 expression(regex) is not valid, then it 
 will provide "java.util.regex.PatternSyntaxException"
 exception
 
 e.g:
class Test {
	
	public static void main(String[] args) {
		
		String s1 = "My name is Swapnil and My surname is Bamble";
 		
 		System.out.println(s1.replaceFirst("is","was"));
	
		// here only first is will be replaced
		// by was and the next is will remains
		// the same
	}
}	
	output: My name was Swapnil and My surname is Bamble
--------------------------------------------------------------------
3. replaceAll():
replaceAll(String regex, String replacement) method
replaces all the substrings that fits the 
specified regular expression with the replacement
String. If the specified regular expression(regex)
is not valid, then it will provide
"java.util.regex.PatternSyntaxException" 
exception

e.g:
class Test {
	
	public static void main(String[] args) {
		
		String s1 = "My name is Swapnil and My surname is Bamble";
 		
 		System.out.println(s1.replaceFirst("is","was"));
		
		// here whereever method will get Swapnil
 		// it will get replace by Yash	
 				
	
	}
}	
	
 	output: My name was Swapnil and My surname was Bamble
------------------------------------------------------------- 
  Difference between replace() and replaceAll()
  is that we can provide regex expression 
  in replaceAll() but not in replace()
  
  e.g:
  
class Test{
	
	public static void main(String[] args) {
		
		String s1 = "My name is Swapnil and My surname is Bamble";
 		
 		System.out.println(s1.replaceAll("is(.)","was"));
		
		System.out.println(s1.replaceAll("is(.*)","was"));

	
	}
}
  output: My name wasSwapnil and My surname wasBamble
  		  My name was
  
  
--------------------------------------------------------------
 */

package Strings;

public class Aa10_Replacing_n_removing_char_in_String {
	
	public static void main(String[] args) {
		
		String s1 = "My name is Swapnil and My surname is Bamble";
 		
 		System.out.println(s1.replaceAll("is(.)","was"));
 		System.out.println(s1.replaceAll("is(.*)","was"));
 		
 		
	
	}
}
