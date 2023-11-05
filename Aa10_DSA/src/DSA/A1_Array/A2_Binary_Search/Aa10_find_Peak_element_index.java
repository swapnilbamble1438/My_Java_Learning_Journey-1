package DSA.A1_Array.A2_Binary_Search;

public class Aa10_find_Peak_element_index {
	
	
public static void main(String[] args) {
		
		
		int[] arr = {0,2,4,6,8,10,9,7,6,4,2};
	
		int peak = binarySearch(arr);
				System.out.println(peak);
		
			}

	static int binarySearch(int[] arr)
	{
		int start = 0;
		int end = arr.length-1;
		
		int peak = -1;
		
		while(start < end)
		{
			// find the middle element
//			int mid = (start + end)/2;
		    int mid = start + (end - start)/2;
		    
			if(arr[mid] < arr[mid + 1])
			{
				// you are in ascending part of array
				start = mid + 1;
			}
			else if(arr[mid] > arr[mid + 1]) {
				
				// you are in descending part of array
				end = mid;
			}
			
		}
		// at last start and end will be equal
		// and that pointer will be our answer
		
		// peak = start;
		 peak = end;
		
		return peak;
	}
}
