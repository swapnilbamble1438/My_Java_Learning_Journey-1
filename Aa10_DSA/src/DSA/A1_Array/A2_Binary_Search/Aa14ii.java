package DSA.A1_Array.A2_Binary_Search;

import java.util.Arrays;

public class Aa14ii {
	
	
	public static void main (String args[])
	{
		int[] arr = {7,2,5,10,8};
		
		int m = 2;
		
		int output = 1;
		
		System.out.println(splitArray(arr, m,output));
	
	}
	
	 public static int splitArray(int[] arr, int m,int output) 
	 {
	    
		  int start = 0;
		  int end = 0;
		  
		  for(int i = 0; i < arr.length; i++)
		  {
			  start = Math.max(start, arr[i]);
			  end += arr[i];
		  }
		 
		  
		  // binary search
		  while(start < end)
		  {
			  // try for the middle as potential ans
			  int mid = start + (end - start) /2;
			  
			  // calculate how many pieces you can divide
			  // this in with this max sum
			  int sum = 0;
			  int noofsubarr = 0;
			  for(int num : arr)
			  {
				  if(sum + num > mid)
				  {
					  // you cannot add this in this subarray,
					  // make new one
					  // say you add this num in new subarray,
					  // then sum = num
					  
					  sum = num;
					  noofsubarr++;
					  
				  }
				  else {
					  start += num;
				  }
			  }
			  
			  
			  if(noofsubarr > m)
			  {
				  start = mid + 1;
			  }
			  else {
				  end = mid;
			  }
			  
		  }
		 
		  
		  return end; // here start == end
		 
	 }
	 
	 
}
	        		
	       


