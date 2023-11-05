package DSA.A1_Array.A2_Binary_Search;

public class A7_find_start_n_end_position_of_target {

	public static void main(String[] args) {
		
		
		int arr[] = {5,7,7,7,7,8,8,8,8,8,8,9,9,9,9,10};
		
		int target = 7;
		
		int StartingPos = StartingPosition(arr,target);
		int EndingPos = EndingPosition(arr,target);
		
		System.out.println("Starting position of target: " + StartingPos);
		System.out.println("Ending position of target: " + EndingPos);
		
		
	//	System.out.println("["+StartingPos+","+EndingPos+"]");
	}
	
	static int StartingPosition(int[] arr,int target)
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
	
		return -1 ;
	}
	
	
	
	static int EndingPosition(int[] arr,int target)
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
			else if(target == arr[mid])
			{	
				 start = mid + 1;
				 if(target < arr[mid+1])
					{	
						endpos = mid;
						return endpos;
						 
					}
			}
			
			
			
		}
	
		return -1 ;
	}
}
