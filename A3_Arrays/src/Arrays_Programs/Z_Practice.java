package Arrays_Programs;

import java.io.Console;
import java.util.*;



public class Z_Practice {
	
	public static void main(String[] args) 
	{

		int[] arr = {7,2,5,10,8};
		
		int m = 2;
		
		int output = 18;
		
		SplitArray(arr, m,output);
		
	}
	
	static int SplitArray(int[] arr,int m,int output)
	{
		
		
		for(int i = 0; i< arr.length-1; i++ )
		{
			int subarr1[] = new int[i + 1];
			int subarr2[] = new int[arr.length - (i + 1)];

			for(int j = 0,k = 0; j < arr.length && k < arr.length; j++,k++)
			{
				if(j < subarr1.length)
					subarr1[j] = arr[j];
				
				if(k < subarr2.length)			
					subarr2[k] = arr[(subarr1.length) + k];

			}
		
			
			int sum1 = 0;
			for(int n = 0; n < subarr1.length; n++)
			{
				sum1 = sum1 + subarr1[n];
			}
			
			int sum2 = 0;
			for(int p = 0; p < subarr2.length; p++)
			{
				sum2 = sum2 + subarr2[p];
			}
			
			
			if(sum1 == output || sum2 == output)
			{		
				System.out.println("Subarray1= "+ Arrays.toString(subarr1)+" sum= " + sum1);
				System.out.println("Subarray2= "+Arrays.toString(subarr2)+" sum= " + sum2);
		
			}
	
		}
		
		
		
	
		
		return -1; 
	}

	



}