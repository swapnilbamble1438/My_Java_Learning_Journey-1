package DSA.A1_Array.A2_Binary_Search;

import java.util.Arrays;

public class A8_find_position_of_element_in_sorted_array_of_infinite_num {

public static void main(String[] args) {
		
		// assume it as an infinite array
		int arr[] = {2,3,5,6,7,8,10,11,12,15,20,23,30};
		
		
		// so it is an infinite array
		// we dont know the start and end of array
		// so we cant use arr.length
		
		
		
		int target = 7;
		
		int answer = ans(arr,target);		
	
		
		System.out.println(answer);
	}

	static int ans(int[] arr, int target)
	{
		// first find the range
		// first start with a box of size 2
		
		int start = 0;
		int end = 1;
		
		// condition of target
		
		while(target > arr[end])
		{
			int temp = end + 1;
			
			// double the box value
			// sizeofbox will be 
			// from newstart till newend
			// sizeofbox equals end - start + 1
			// and
			// end will be equal to 
			// previous end + sizeofbox * 2
		
			end = end + (end - start + 1) * 2;
			start = temp;
		}
		
		return binarySearch(arr, target,start,end);
	}
	
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

}


// this method will work fine on infinite array
// but for finite array it will work on some limitations

