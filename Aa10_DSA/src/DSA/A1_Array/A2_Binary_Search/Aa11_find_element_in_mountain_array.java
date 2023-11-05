package DSA.A1_Array.A2_Binary_Search;

public class Aa11_find_element_in_mountain_array {
	
public static void main(String[] args) {
		
		
		int[] arr = {0,2,4,6,8,10,9,7,5,3,1};
	
		int target = 3;
		
		int ans = search(arr,target);
				System.out.println(ans);
		
			}

	static int search(int[] arr,int target)
	{
		
		int start = 0;
		int end = arr.length-1;
		
		int peak = 0;
		
		while(start < end)
		{
		    int mid = start + (end - start)/2;
		    
			if(arr[mid] < arr[mid + 1])
			{
				start = mid + 1;
			}
			else if(arr[mid] > arr[mid + 1]) {
				
				end = mid;
			}
			
		}
		
		peak = end;
		
		return binarySearch(arr,target,peak);
	}


	static int binarySearch(int[] arr,int target,int peak)
	{
		int start = 0;
		int end = peak;
				
		while(start <= end)
		{
			
		    int mid = start + (end - start)/2;
		    
			if(target < arr[mid])
			{
				end = mid - 1;
			}
			else if(target > arr[mid]) {
	
				start = mid + 1;
			}
			
			else if(target == arr[mid])
			{
				return mid;
			}
			
		}
		
		//==
		start = peak + 1;
		end = arr.length - 1;		
		while(start <= end)
		{
			
		    int mid = start + (end - start)/2;
		    
			if(target < arr[mid])
			{
				start = mid + 1;
			}
			else if(target > arr[mid]) 
			{
				end = mid - 1;
			}	
			else if(target == arr[mid])
			{
				return mid;
			}
			
		}
		
	
		return -1;
	}
}
