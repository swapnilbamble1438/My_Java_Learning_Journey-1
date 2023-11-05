package DSA.A1_Array.A1_Linear_Search;

public class A5_Search_min_betn_range {
	
	public static void main(String[] args) {
		
		int[] arr = {18,12,-7,3,14,28};
		
		System.out.println(min(arr,3 , 5));
		
	}

	
	
		private static int min(int[] arr, int start, int end) {
			
			if(end < start)
			{
				return -1;
			}
			
			if(arr == null)
			{
				return -1;
			}
			
			int min = arr[0];
			
			for(int i = start; i <= end; i++)
			{
				if(arr[i] < min)
				{
					min = arr[i];
				}
			}
			return min;
		}
		
	

}
