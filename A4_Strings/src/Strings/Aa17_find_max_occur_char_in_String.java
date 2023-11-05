/*
 ASCII value:
 Computers can understand only the numeric values.
 But it is not always certain that all the inputs
 are given in numeric form. So, there was a need
 for an encoding system which could convert
 the text files into numeric values. For this
 ASCII was developed. AMERICAN STANDARD CODE
 FOR INFORMATION INTERCHANGE(ASCII) is an 
 encoding approach, which is a code for 
 representing 128 characters in English into
 seven bit integers.
 
 e.g:
 
 00   NULL (Null character)
 27   ESC  (Escape)
 127  DEL  (Delete)
 
 32   Space
 61   =
 64   @
 65   A
 97   a
 
 
 and many more etc
 
 */


package Strings;

import java.util.Arrays;

public class Aa17_find_max_occur_char_in_String {

	public static void main(String[] args) {
		
		
	String  str = "auabbbcc";
	
	char[] ch = str.toCharArray();
	
	char c[] = new char[str.length()] ;
	
	int count[] = new int[str.length()] ;
	
	for(int i= 0; i<str.length();i++)
	{
		for(int j = 0; j < str.length();j++)
		{
			
				if(ch[i] == ch[j])
				{
					c[i]  = ch[i];
					count[i]++;
				}
			
		}
		

	}
	System.out.println(Arrays.toString(c));
	System.out.println(Arrays.toString(count));
	int max = 0;
	int maxi = 0;
	for(int i = 0; i < count.length; i++)
	{
		if(count[i] > max)
		{
			max = count[i] ;
			maxi = i;
		}
		
	}
		System.out.println("Max occuring element is: " + c[maxi]);
	
	
		
		
	}
	
	
}
