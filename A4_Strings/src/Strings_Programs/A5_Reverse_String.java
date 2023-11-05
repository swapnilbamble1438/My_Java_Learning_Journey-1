package Strings_Programs;

import java.util.Scanner;

public class A5_Reverse_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = "linpaws";
		
		char []ch = str.toCharArray();
		
		for(int i = ch.length -1;i >= 0 ; i--)
		{
			System.out.print(ch[i]);
		}
		
	}
}
