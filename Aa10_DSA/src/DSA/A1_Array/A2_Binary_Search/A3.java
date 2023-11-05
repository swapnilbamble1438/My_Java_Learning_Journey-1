package DSA.A1_Array.A2_Binary_Search;

public class A3 {
	
	public static void main(String[] args) {
		
		
	//	int[] arr = {-5,-4,-2,1,2,3,4,5,6,7,8,9,10,11,12,55,60};
			
		int[] arr = {9,8,7,6,5,4,3,2,1};
			int target = 5;
			int ans = binarySearch(arr,target);
					System.out.println(ans);
		
	}
	
	static int binarySearch(int[] arr,int target)
	{
		int start = 0;
		int end = arr.length-1;
		
		boolean isAsc = false;
		
		if(arr[start] < arr[end])
		{
			isAsc = true;
		}
	
		
		while(start <= end)
		{
			// find the middle element
	//		int mid = (start + end)/2;
		    int mid = start + (end - start)/2;
		    
		  
		    
		    if(isAsc)
		    {
				if(target < arr[mid])
				{
					end = mid -1;
				}
		    
				else if(target > arr[mid]) {
					
					start = mid + 1;
				}
				
				else if(target == arr[mid]){
						
					return mid;
				}
		    }	
		    
		    else
		    {
				if(target > arr[mid])
				{
					end = mid -1;
				}
		    
				else if(target < arr[mid]) {
					
					start = mid + 1;
				}
				
			   else if(target == arr[mid]){
						
					return mid;
				}
		    }	
			
			
		}
		return -1;
	}
}
