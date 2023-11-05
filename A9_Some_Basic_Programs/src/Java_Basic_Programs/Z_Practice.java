package Java_Basic_Programs;

import java.util.Scanner;

public class Z_Practice {

	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		for(int row = 1; row <= 7; row++)
		{
			
			for(int col = 7-row; col >= 1; col--)
			{
				System.out.print(" ");
			}
			
			for(int col = 1; col <= row; col++)
			{
				System.out.print("*");
			}
			
			
			System.out.println();
		
		}
		
	
	}
}
