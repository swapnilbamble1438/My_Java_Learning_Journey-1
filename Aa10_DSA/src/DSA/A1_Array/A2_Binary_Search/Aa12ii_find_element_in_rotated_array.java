package DSA.A1_Array.A2_Binary_Search;

// this will not work when array contains 
// duplicate values

public class Aa12ii_find_element_in_rotated_array {
	
	public static void main(String[] args) 
	{
		
		
		int[] arr = {4,5,6,7,8,9,11,12,0,1,2,3};
		
		int target = 2;
		
		int ans = search(arr,target);
		System.out.println(ans);
		
	}

	static int search(int[] arr, int target)
	{
		int start = 0;
		int end = arr.length-1;
		
		int pivot = findPivot(arr);
		if(pivot == -1)
		{
			// just do normal binary search
			return binarySearch(arr,target,0,arr.length-1);
					
		}
		//if pivot is found, you have found 2 ascending
		// sorted arrays
	    if(arr[pivot] == target)
		{
			return pivot;
		}
		if(arr[start] >= target)
		{
			return binarySearch(arr,target,pivot + 1,end);
		}
		if(arr[start] <= target)
		{
			return binarySearch(arr,target,start,pivot -1);
		}
		return 100;
	}
	
	// normal binary search to find element
	static int binarySearch(int[] arr,int target,int start,int end)
	{
	
		
		while(start <= end)
		{
			// find the middle element
	//		int mid = (start + end)/2;
		    int mid = start + (end - start)/2;
		    
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
		return -1;
	}
	
	// find pivot method
	static int findPivot(int[] arr)
	{
		int start = 0;
		int end = arr.length-1;
		
		int pivot = -1;
		
		while(start <= end)
		{
			// 4 cases

		    int mid = start + (end - start)/2;
		    
			if(mid < end && arr[mid] > arr[mid + 1]) {
			
				pivot = mid;		
				return pivot;
			}
			
			if(mid > start &&  arr[mid-1] > arr[mid])
			{
				pivot = mid -1;
				return pivot;
			}
			
			if(arr[mid] <= arr[start])
			{
				end = mid -1;
			}
			else
			{
				start = mid + 1;
			}
			
			
		}
	
		
		return pivot;
	}

}
