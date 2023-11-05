package DSA.A1_Array.A2_Binary_Search;

// Binary Search is a searching algorithm used 
// in a sorted array by repeatedly dividing the 
// search interval in half. 


// NOTE : Binary search can only be 
// performed in a sorted array

// Binary Search Algorithm can be implemented in the following two ways

//   1) Iterative Method
//   2) Recursive Method

// Iterative implementation of Binary Search:


public class A1_Binary_search {
	
	
	public static void main(String[] args) {
		
	int[] arr = {-5,-4,-2,1,2,3,4,5,6,7,8,9,10,11,12,55,60};
		
		int target = 11;
		int ans = binarySearch(arr,target);
				System.out.println(ans);
		
	}

	static int binarySearch(int[] arr,int target)
	{
		int start = 0;
		int end = arr.length-1;
		
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
}
