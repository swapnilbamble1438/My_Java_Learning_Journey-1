package com;
import java.util.Scanner;
import java.util.Arrays;
class Aa38_Merging_arrays
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x array size ");
		int n = sc.nextInt();
		
		int x[] = new int[n];
		
		System.out.println("Enter x array elements ");
		for(int i = 0; i < n; i++)
		{
			x[i] = sc.nextInt();
		}
		

		System.out.println("Enter y array size ");
		int m = sc.nextInt();
		
		int y[] = new int[m];

		
		System.out.println("Enter y array elements ");
		for(int i = 0; i < m; i++)
		{
			y[i] = sc.nextInt();
		}
	
		int o = n + m;
		
		int z[]= new int[o];
		
		
		for (int i = 0; i < n; i = i + 1) {
           
            z[i] = x[i];
        }
  
        for (int i = 0; i < m; i = i + 1)
        {
  
           
            z[n + i] = y[i];
        }
  
        for (int i = 0; i < o; i = i + 1)
        {
              
            
            System.out.println(z[i]);
        }
        
		
		
			
		  
	}
}