/*
 Java Program to count the total number of vowels 
 and consonants in a string 
 */

package Strings_Programs;

public class A3_Count_vowels {

	public static void main(String args[])
	{
		String str = "This is a really simple sentence"; 
		
		//Converting entire string to lower case to reduce the comparisons
		str = str.toLowerCase();
		
		int vcount = 0;
		int ccount = 0;
		
		for(int i = 0; i < str.length(); i ++)
		{
			if(str.charAt(i)== 'a' || str.charAt(i)== 'e' ||
			str.charAt(i)== 'i' ||str.charAt(i)== 'o' ||
			str.charAt(i)== 'u')
				vcount ++;
			
			else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
				ccount ++;
		}
		
		System.out.println("Number of vowels: " + vcount);
		
		System.out.println("Number of consonants: " + ccount);
		
		
		
		
	}
}
