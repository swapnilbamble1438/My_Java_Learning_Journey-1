package DSA_Sorting_n_Searching_Algorithm;

import java.util.Arrays;

/*
 compareTo():
   compareTo() method is used for comparing two
   Strings lexicographically. Each character
   of both the Strings is converted into a
   Unicode value for comparison. If both the
   Strings are equal then this method returns
   0 else it returns positive or negative value.
   
   
 */

public class A1iv_Bubble_Sort {
	
	public static void main(String[] args) {
		
		String a[] = {"Swapnil","Ajay","Nitin","Yash","Pratik"};
		

		for(int i = 0; i < a.length-1; i++)
		{	
			for(int j = 0; j < a.length-1-i ; j++)
			{
	
				String temp = null;
				if(a[j].compareTo(a[j+1]) > 0)
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
