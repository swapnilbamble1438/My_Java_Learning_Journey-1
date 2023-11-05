package DSA.A1_Array.A2_Binary_Search;

public class A5_find_floor_num {
	
	public static void main(String[] args) {
		
		
		int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,15,16,17};
		
		int target = 14;
		int index = binarySearch(arr,target);
				System.out.println("Floor number is at index: " + index);
		
			}

	static int binarySearch(int[] arr,int target)
	{
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end)
		{
			// find the middle element
//			int mid = (start + end)/2;
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
		int result = end;
		return result;
	}


}
