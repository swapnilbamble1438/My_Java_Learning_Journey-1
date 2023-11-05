package com;
import java.util.Scanner;
class Aa36_Frequency_of_num
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size ");
		int n = sc.nextInt();
		
		int x[] = new int[n];
		
		System.out.println("Enter array elements ");
		for(int i = 0; i < n; i++)
		{
			x[i] = sc.nextInt();
		}
		
		System.out.println("Enter a number from given array: ");
		int no = sc.nextInt();
		
		int freq=0;
		for(int v = 0; v < n; v++)
			
		{
			if(no == x[v])
				freq++;	
		}
		System.out.println("Frequency of " + no +" is "  +  freq);
	
					
	}
}