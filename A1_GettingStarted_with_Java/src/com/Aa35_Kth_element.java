package com;
import java.util.Scanner;
import java.util.Arrays;
class Aa35_Kth_element
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
		
		System.out.println("Enter kth Smallest element no: ");
		int k = sc.nextInt();
		
		for(int v = 0; v < n; v++)
		{}
			System.out.println(k + " Smallest element is: " + x[k-1]);

		System.out.println("Enter pth Largest element no: ");
		int p = sc.nextInt();
			
		for(int u = n-1; u >= 0; u--)
	    {}
			System.out.println(p + " Largest element no is: " + x[n-p]);
	
	
					
	}
}