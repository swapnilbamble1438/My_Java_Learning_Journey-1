package DSA.A1_Array.A7_Cyclic_Sort;
/*
  Q) Missing Number
  Given an array nums containing n distinct numbers
  in the range [0,n], return the only number in the
  range that is missing from the array.
  
  Example: Input: nums = {3,0,1}
  		   Output: 2
  		   
  Explaination: n = 3 since there are 3 numbers, so all
  	            numbers are in the range [0,3].
  	            2 is the missing number in the range
  	            since it does not appear in nums.
  			
  
 */

import java.util.Arrays;

public class A2_find_missing_num {
	
	public static void main(String[] args) {
		
		int nums[] = {4,0,2,1};
		
		int ans = sort(nums);
        System.out.println(ans);	
		
	}
	
	 public static int sort(int[] arr) {
	        int i = 0;
	        
	        // sorting
	        while (i < arr.length) 
	        {
	            int correct = arr[i];
	             
	            if(arr[i] >= arr.length)
	            {
	            	i++;
	            }
	            else if (arr[i] != arr[correct]) 
	            {
	                swap(arr, i , correct);
	            }
	            else 
	            {
	                i++;
	            }
	          
	        }
	        
	        // search for missing number
	        
	        for(int j = 0; j < arr.length; j++)
	        {
	        	if(arr[j] != j )
	        		return j;
	        }
	        
	
	        return -1;
	    }
 
	  
	  public static void swap(int[] arr, int first, int second) {
	        int temp = arr[first];
	        arr[first] = arr[second];
	        arr[second] = temp;
	    }
	
	

}
