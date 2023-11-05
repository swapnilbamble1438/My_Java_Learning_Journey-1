package DSA_Sorting_n_Searching_Algorithm;

import java.util.Arrays;

public class A1ii_Bubble_Sort {
	
	
	public static void main(String[] args) {
		
		int[] a = {36, 19 ,29 ,12,5};
		
		for(int i = 0; i < a.length-1; i++)
		{	
			for(int j = 0; j < a.length-1-i ; j++)
			{
	
				int temp = 0;
				if(a[j] > a[j+1])
				{
					temp = a[j];
					a[j] =  a[j+1];
					a[j+1] = temp;
			
				}
				
			}
		}
		
		System.out.println(Arrays.toString(a));
		
		
	}

}
