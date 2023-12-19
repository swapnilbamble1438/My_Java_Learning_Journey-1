package com;

public class A1_Reverse_String_without_Inbuilt_Func {
	
	public static void main(String[] args) {
		
			
		String str = "Hello";
		
		char chars[] = str.toCharArray();
		
		for(int i = chars.length -1; i >= 0; i--)
		{
			System.out.print(chars[i]);
		}
		
		
		System.out.println();
		
		//another way
		
		for(int i = str.length() -1 ; i>= 0; i--)
		{
			System.out.print(str.charAt(i));
		}
		
		
		
	}

}
