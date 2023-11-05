package com;
import java.util.Scanner;
class Aa33_Reverse_array
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
		
		for(int v = n-1; v >=0; v--)
		{
			System.out.println(x[v]);
		}
	}
}