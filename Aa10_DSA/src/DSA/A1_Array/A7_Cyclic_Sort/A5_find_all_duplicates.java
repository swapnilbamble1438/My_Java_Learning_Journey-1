package DSA.A1_Array.A7_Cyclic_Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A5_find_all_duplicates {
	
	

public static void main(String[] args) {
		
		int nums[] = {1,4,3,4,2,2};
		
		List<Integer> ans = sort(nums);
        System.out.println(ans);	
		
	}
	
	 public static List<Integer> sort(int[] arr) {
	        int i = 0;
	        
	        // sorting
	        while (i < arr.length) 
	        {
	            int correct = arr[i]-1;
	             
	          
	           if (arr[i] != arr[correct]) 
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
	        List<Integer> ans = new ArrayList<Integer>();
	        for(int j = 0; j < arr.length; j++)
	        {
	        	if(arr[j] != (j+1) )
	        		ans.add(arr[j]);
	        }
	        
	
	        return ans;
	    }
 
	  
	  public static void swap(int[] arr, int first, int second) {
	        int temp = arr[first];
	        arr[first] = arr[second];
	        arr[second] = temp;
	    }
	
	

}
