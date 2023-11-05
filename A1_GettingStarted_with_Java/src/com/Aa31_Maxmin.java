package com;
import java.util.Scanner;
public class Aa31_Maxmin 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		// Step1: Accept size of an array
		System.out.print("Enter Size of An Array ");
		int n = sc.nextInt();
		
		// Step2: Declare Array with Size n
		int []x = new int[n];
		
		// Step3: Accept values inside elements of an Array
		System.out.println("Enter " + n + " values");
		for(int v = 0; v < n; v ++)
		{
			x[v] = sc.nextInt();
		}
		
		// Step4: Find max and min from given elements
		int max = x[0];
		int min = x[0];
		
		for(int i = 1; i < n; i ++)
		{
			if(max < x[i])
			{
				max = x[i];
			}
			
			if(min > x[i])
			{
				min = x[i];
			}
			
		}
		
		// Step5: Display max and min
		System.out.println("Maximum Number is " + max);
		System.out.println("Minimum Number is " + min);

	}

}