package DSA.A1_Array.A2_Binary_Search;

// Recursive implementation of Binary Search:


import java.util.Arrays;

public class A1ii {
	
	public static void main(String[] args) {
		
		int[] arr = {-5,-4,-2,1,2,3,4,5,6,7,8,9,10,11,12,55,60};
			
			int target = 11;
			int start = 0;
			int end = arr.length-1;
			
			int ans = binarySearch(arr,target,start,end);
					System.out.println(ans);
			
		}

		static int binarySearch(int[] arr,int target,int start,int end)
		{
		
			
			if(start <= end)
			{
				// find the middle element
		//		int mid = (start + end)/2;
			    int mid = start + (end - start)/2;
			    
				if(target < arr[mid])
				{
					end = mid -1;
					return binarySearch(arr,target,start,end);
				}
				else if(target > arr[mid]) {
					
					start = mid + 1;
					return binarySearch(arr,target,start,end);
				}
				else if(target == arr[mid]){
			
					return mid;
				}
				
			}
			return -1;
		}	
}
