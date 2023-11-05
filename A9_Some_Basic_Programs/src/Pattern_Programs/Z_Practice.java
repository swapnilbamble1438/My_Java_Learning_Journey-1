package Pattern_Programs;

import java.util.Arrays;

public class Z_Practice {
	
	
	   public static int[] twoSum(int[] nums, int target) {
		
		   int []sum = {-1,-1};
		   for(int i = 0; i< nums.length-1; i++)
		   {
			   for(int j= i+1; j < nums.length; j++)
			   {
				   if(nums[i] + nums[j] == target)
				   {
					   sum [0] = i;
					   sum[1] = j;
					   return sum;
				   }
			   }
		   }
		   
		   
		   
		   
		   return sum;
	        

	    }

	    public static void main(String args[])
	    {
	        int[] nums= {2,7,11,15};
	        int target = 9;

	    int ans[] =  twoSum(nums,target);
	    
	    System.out.println(Arrays.toString(ans));
	        
	        
	        
	         
	    }
	
	
}	
