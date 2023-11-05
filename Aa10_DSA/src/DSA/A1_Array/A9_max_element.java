package DSA.A1_Array;

public class A9_max_element {

	public static void main(String[] args) {
		
		
		int[] arr = {1,3,2,4,5};
		
		System.out.println(max(arr));
		
		System.out.println(maxbetweenRange(arr,1,3));
		
		
	}

	private static int max(int[] arr) {
	
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		return max;
	}
	
	private static int maxbetweenRange(int[] arr, int start, int end) {
		
		int max = arr[0];
		
		for(int i = start; i <= end; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		return max;
	}
}
