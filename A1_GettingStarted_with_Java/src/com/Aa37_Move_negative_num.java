package com;
import java.util.Scanner;
class Aa37_Move_negative_num
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
		
		for(int v=0; v<n;v ++)
		 {	
			
				if (x[v]>0)
					System.out.println(x[v]);
				
			
		 }
		for(int u=0; u<n; u++)
		{
			if (x[u]<0)
			 System.out.println(x[u]);
		}
			
					
	}
}