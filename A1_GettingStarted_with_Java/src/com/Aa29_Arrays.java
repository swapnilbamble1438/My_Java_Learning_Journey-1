package com;
import java.util.Scanner;
import java.util.Arrays;
class Aa29_Arrays
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int []no=new int[5];

		System.out.println("enter numbers ");
		for(int i = 0; i < no.length; i ++)
		{
			no[i]=sc.nextInt();
		}
		
		Arrays.sort(no);
		
		System.out.println("Accepted Numbers ");
		for(int i = no.length-1; i >= 0; i--)
		{
			System.out.println(no[i]);
		}
	}
}