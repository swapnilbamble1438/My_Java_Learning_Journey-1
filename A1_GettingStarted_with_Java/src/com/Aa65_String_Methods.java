package com;
import java.util.Scanner;
public class Aa65_String_Methods 
{
	public static void main(String args[])
	{
		// It is immutable (unmodifiable) String.
		String s = "Omkar come early today";
		System.out.println(s.toUpperCase());
		System.out.println(s);
		
		// Java StringBuilder class is used to 
	    // create mutable (modifiable) String.
		// StringBuffer can be also used.
		StringBuilder sb = new StringBuilder("Omkar is a good boy ?");
		System.out.println(sb.reverse());
		System.out.println(sb);
		
		System.out.println();
	//----------------------------------------------------	
		
		// Converting Integer number to String number
		int no = 423;
		String m1 = "" + no;
		System.out.println(m1);
		
		// Concatenate multiple int numbers;
		
		int no1 = 22;
		int no2 = 34;
		String m2 = "" + no1 + no2;
		
		// Converting String number to Integer number
		int m1i = Integer.valueOf(m1);
		int m2i = Integer.parseInt(m2);
		System.out.println(m1i + " " + m2i);
		
		
		System.out.println();
	//----------------------------------------------------	
		
		 //1) charAt() Method
		 System.out.println("1) charAt Method");
		 
		 String mystr1 = "Hello";
		 
		 char ans1 = mystr1.charAt(0);	
		 
		 System.out.println(ans1);
		 
		 System.out.println();
	//----------------------------------------------------
		 
		 //2) codePointAt() Method
		 System.out.println("2) codePointAt() Method");
		 
		 String mystr2 = "Hello";
		 
		 int ans2 = mystr2.codePointAt(0);
		 
		 System.out.println(ans2);
		
		 System.out.println();
	//----------------------------------------------------
		 
		//3) codePointBefore() Method
		 System.out.println("3) codePointBefore() Method");
		 
		 String mystr3 = "Hello";
		 
		 int ans3 = mystr3.codePointBefore(1);
		 
		 System.out.println(ans3);
		 
		 System.out.println();
	//----------------------------------------------------
		 
		 //4) codePointCount()
		 System.out.println("4) codePointCount()");
		 
		 String mystr4 = "Hello";
		 
		 int ans4 = mystr4.codePointCount(0, 2);
		 
		 System.out.println(ans4);
		 
		 System.out.println();
	//----------------------------------------------------
		 
		 //5) compareTo() Method
		 System.out.println("5) compareTo() Method");
		 
		 String mystr5i = "Hello";
		 String mystr5ii = "Hello";
		 
		 System.out.println(mystr5i.compareTo(mystr5ii));
		 
		 System.out.println();
	//----------------------------------------------------
		 
		 //6) compareToIgnoreCase() Method
		 System.out.println("6) compareToIgnoreCase() Method");
		 
		 String mystr6i = "HELLO";
		 String mystr6ii = "hello";
		 
		 System.out.println(mystr6i.compareToIgnoreCase(mystr6ii));
		 
		 System.out.println();
	//----------------------------------------------------
		 
	
	}
	
}
