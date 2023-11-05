package DSA.A1_Array.A2_Binary_Search;

// find whether the array is sorted int ascending or
// descending order


public class A2_Order_agnostic_Binary_search {

	public static void main(String[] args) {
		
		int[] arr = {6,5,4,3,2,1};
		
		 String ans = orderAgnosticBS(arr);
		 
		 System.out.println(ans);
		
		
	}
	
	static String orderAgnosticBS(int[] arr)
	{
		String a = null;
		
		int start = 0;
		int end = arr.length-1;
		
		if(arr[start] < arr[end])
		{
			a = "Array is in Ascending Order";
		}
		else if(arr[start] > arr[end])
		{
			a = "Array is in Descending Order";
		}
		
		
		return a;
	}
}
