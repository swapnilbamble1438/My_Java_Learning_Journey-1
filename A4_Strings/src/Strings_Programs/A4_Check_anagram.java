package Strings_Programs;

/*
 Anagram Strings
 Two Strings are called the anagram if they contain 
 the same characters. However, the order or sequence 
 of the characters can be different.
 Example:
 Grab and Brag are anagram string;
 
 */
import java.util.Arrays;

public class A4_Check_anagram {

	public static void main(String args[])
	{
		String str1 = "Brag";
		String str2 = "Grab";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		// if length of both strings are not equal 
		// then it is not anagram
		if(str1.length() != str2.length())
			System.out.println("Both Strings are not anagram");
		
		
		
		
		// if length is same
		// convert both the arrays to character array
		else
		{
			char [] string1 = str1.toCharArray();
			char [] string2 = str2.toCharArray();
			
			
			// sorting the arrays using in-built function sort()
			Arrays.sort(string1);
			Arrays.sort(string2);
			
			
			
			//comparing both the arrays using
			// in-built function equals()
			if(Arrays.equals(string1,string2) == true)
			{
				System.out.println("Both Strings are anagram");
				
			}
			else
				System.out.println("Both Strings are not anagram");
			
		}
	}
}
