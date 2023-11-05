package DSA.A1_Array.A2_Binary_Search;

import java.util.Arrays;

public class A7ii {
	
public static void main(String[] args) {
		
		
		int arr[] = {5,7,7,8,8,10};
		
		int target = 8;
		
		int[] answer = searchRange(arr,target);		
	
		
		System.out.println(Arrays.toString(answer));
	}
	

	// find position
	public static int[] searchRange(int[] nums,int target)
	{
		int[] ans = {-1,-1} ;
		
		ans[0] =  searchStart(nums,target);
		
		 ans[1] = searchEnd(nums,target);
	
		return ans;
	}
	
	// find starting position
	static int searchStart(int[] arr,int target)
	{	
		int start = 0;
		int end = arr.length-1;

		int startpos = 0;
	
		while(start <= end)
		{
			// find the middle element
			// int mid = (start + end)/2;
		  int mid = start + (end - start)/2;
		    
			if(target < arr[mid])
			{
				end = mid -1;
			}
			else if(target > arr[mid]) 
			{	
				start = mid + 1;
			}
			///
			else if(target == arr[mid] )
			{								
					end = mid - 1;
				 if(target > arr[mid-1])
					{	
						startpos = mid;
						return startpos;
					}
			}
			
		}
	return -1;
	}
	
	// find ending position
	static int searchEnd(int[] arr,int target)
	{
		int start = 0;
		int end = arr.length-1;
	
		int endpos = arr.length-1;

		while(start <= end)
		{
			// find the middle element
			// int mid = (start + end)/2;
		  int mid = start + (end - start)/2;
		    
			if(target < arr[mid])
			{
				end = mid -1;
			}
			else if(target > arr[mid]) 
			{	
				start = mid + 1;
			}
			///
			else if(target == arr[mid] )
			{					 
				 start = mid + 1;
				 if(target < arr[mid+1])
					{	
						endpos = mid;
						return endpos;
						 
					}
			}
			
		}
		
		return -1;
	}
	
	
	

}
