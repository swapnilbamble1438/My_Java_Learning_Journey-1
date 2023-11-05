package DSA.A1_Array.A2_Binary_Search;

import java.util.Arrays;

/*
  Q)Given an array arr which consists of non-negative
  integers and an integer m, you can split the array
  into m non-empty continous subarrays.
  
  Example:
  Input: arr = [7,2,5,8,10] 
         m = 2
         output = 18
  Explanation: There are four ways to split arr into
  			   two subarrays. The best way is to split
  			   it into [7,2,5] and [10,8], where the 
  			   largest sum among the two subarrays
  			   is only 18.
  
 */
/*
  Dividing array into m parts (means two parts) 
  means Subarray 1 and Subarray 2
  
     Subarray 1 | Sum of    | Subarray 2 | Sum of    | Largest Sum
                | Subarray 1|            | Subarray 2| 
    ------------|-----------|------------|-----------|--------------          
      7,2,5,10  |    24     |    8       |    8      |  24
                |           |            |           |
       7,2,5    |    14     |   10,8     |    18     |  18
                |           |            |           |
       7,2      |    9      |  5,10,8    |    23     |  23
                |           |            |           |
       7        |    7      |  2,5,10,8  |    25     |  30
      
      
       
      minimum number of partition we can make that is one
      means subarray with only one element
      
      if m = 1
      maximum number of partion we can make that is n
      mean subarray with all array elements
      
      min value of ans = max element in array
      max value of ans = sum of all elements in array                                 
         
      means our arr[] = { 7,2,5,10,8};
       min(max) value will be 10;
       max(max) value will be 7 + 2 + 5 + 10 + 8 = 32;

		so we will take start = 10 and end = 32;
		so mid = (start + end)/2 
			   = (10 + 32)/2 
			   = 21
			   
	 try to see if you can split the entire array
	 with 21 as the max sum
	 means creating subarray with elements whose
	 sum will not exceeds 21.
	 
	 7+ 2 + 5 = 14  if we add next element 10 in it
				    it will exceed 21
				    so 7,2,5 will be our first Subarray
				    
	10 + 8 = 18     10,8  will be our second Subarray			    
				
	
	
	
 */


public class Aa14_Split_array_largest_sum {
	
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
				System.out.println(Arrays.toString(subarr1));
				System.out.println(Arrays.toString(subarr2));
				System.out.println(sum1 + " and " + sum2);		
			}
	
		}
		
		
		
	
		
		return -1; 
	}


}
