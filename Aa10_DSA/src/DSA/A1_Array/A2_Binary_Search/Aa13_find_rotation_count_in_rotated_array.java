package DSA.A1_Array.A2_Binary_Search;

public class Aa13_find_rotation_count_in_rotated_array {

	
	public static void main(String[] args) 
	{

		int[] arr = {8,9,11,12,1,2};
	
		System.out.println(countRotations(arr));
		
		
	}

	static int countRotations(int[] arr)
	{
		int pivot = findPivot(arr);
		
		return pivot + 1;
	}
	

	// find pivot in non-rotated array
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
