/*
String Methods:

1. length method: 
   length method counts the number of characters
   in the String and returns it in integer.
   This method returns the length of any String
   which is equal to the number of 16-bit
   Unicode characters in the String.
   
   It checks the number of character in String
   or checks the length of the String.
   
   But if the String value is null. then it will
   throw exception. Null pointer exception.
   
2. isEmpty() method:
   isEmpty() method of String class is included
   in java String since JDK 1.6. This method
   returns true if the given String is empty, 
   else it return false, or can say that this 
   method returns true if the length of the
   String is 0.
   
   It checks whether the trim is empty or not.
   
3. trim() method:
   trim() method of String class eliminates only
   leading and trailing spaces.
   The Unicode value of space character is
   '\u0020'. The trim() method in java checks
   this Unicode value before and after the
   String, if it exists then removes the spaces
   and returns the omitted String.
   
   It removes forward and before spaces of the
   String
   
4. equals()
5. equalsIgnoreCase()
6. compareTo()
7. compareToIgnoreCase() 


class Test
{
	public static void main(String[] args)
	{
		String name = "Swapnil";
		String surname = null;
		String email = "";
		String city = " Mumbai ";
		String state = " Maharashtra ";
		
		System.out.println(name.length());
		try {
		
		System.out.println(surname.length());
		} catch (Exception e) {
		 System.out.println(e);	
		}
			
		System.out.println(email.isEmpty());
		
		System.out.println(city.trim());
		
		System.out.println(state.trim().length());
	
		if(email.isEmpty())
		{
			System.out.println("Email is Empty");
		}
		else {
			System.out.println("Email is not Empty");
		}
	
	}
}

	output: 7
		java.lang.NullPointerException: Cannot invoke "String.length()" because "surname" is null
                true
                Mumbai
                11
                Email is Empty
		
-----------------------------------------------------------------------------------------------------------------			
*/

package Strings;

public class A7_String_methods {
	
	public static void main(String[] args)
	{
		String name = "Swapnil";
		String surname = null;
		String email = "";
		String city = " Mumbai ";
		String state = " Maharashtra ";
		
		System.out.println(name.length());
		try {
		
		System.out.println(surname.length());
		} catch (Exception e) {
		 System.out.println(e);	
		}
			
		System.out.println(email.isEmpty());
		
		System.out.println(city.trim());
		
		System.out.println(state.trim().length());
		
		if(email.isEmpty())
		{
			System.out.println("Email is Empty");
		}
		else {
			System.out.println("Email is not Empty");
		}
	}

}
