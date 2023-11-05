package DSA.A4_Recursion;

public class Aa5_Recursion_with_Binary_Search {

	
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,7,6,8,11,15};
		
		int target = 2;
		
		System.out.println(search(arr,target,0,arr.length-1));
		
	}
	
	static int search(int[] arr, int target,int start, int end)
	{
		
		if(start > end) {
			return -1;
		}
		int mid = start + (end-start)/2;
		if(target < arr[mid])
		{
			end = mid -1;
		  return  search(arr,target,start,end);
		}
		else if(target > arr[mid]) {
			start = mid + 1;
			
		return	search(arr,target,start,end);
		}
		else if(target == arr[mid]){
	
			return mid;
		}
		return mid;
		
	}
}
