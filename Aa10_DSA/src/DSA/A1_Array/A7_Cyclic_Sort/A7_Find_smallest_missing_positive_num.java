package DSA.A1_Array.A7_Cyclic_Sort;

import java.util.Arrays;

public class A7_Find_smallest_missing_positive_num {
	

public static void main(String[] args) {
		
		int nums[] = {1,2,5,-1,0};
		
		int ans = sort(nums);
        System.out.println(ans);	
		
	}
	
	 @SuppressWarnings("unused")
	public static int sort(int[] arr) {
	        int i = 0;
	        
	        // sorting
	        while (i < arr.length) 
	        {
	            int correct = arr[i]-1;
	          
	            if(arr[i] >= arr.length || arr[i] <= 1)
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
	        System.out.println(Arrays.toString(arr));
	        
	        // search for missing number
	      int ans = 0;
	        for(int j = 0; j < arr.length; j++)
	        {
	        	if(arr[j] != (j+1) )
	        	{
	        		ans = j+1;
	        	return ans;
	        	}
	        }
	        
	
	        return ans;
	    }
 
	  
	  public static void swap(int[] arr, int first, int second) {
	        int temp = arr[first];
	        arr[first] = arr[second];
	        arr[second] = temp;
	    }
	
	

}
