package com;
import java.util.Scanner;
import java.util.Arrays;
class Aa34_Sort_array
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
		
		Arrays.sort(x);
		
		System.out.println("Accepted Numbers in Ascending Order: ");
		for(int v = 0; v < n; v++)
		{
			System.out.println(x[v]);
		}
		
		System.out.println("Accepted Numbers in Descending Order: ");
		for(int u = n-1; u >= 0; u--)
		{
			System.out.println(x[u]);
		}
		
	}
}
