
// find pivot in rotated array

package DSA.A1_Array.A2_Binary_Search;

public class Aa12_find_Pivot_in_rotated_array {
	

	public static void main(String[] args) 
	{
		
		
		int[] arr = {4,5,6,7,8,9,11,12,0,1,2,3};
	
		int pivot = findPivot(arr);
				System.out.println(pivot);
		
	}

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
