package Arrays_Programs;

public class Aa10_Print_smallest_element {
	

	public static void main(String args[])
	{
		int arr[] = new int[] {1,2,3,4,5,6,9,8};
		
		int min= arr[0];
		
		for(int i = 0; i < arr.length; i++)
		{
			if(min > arr[i])
				min = arr[i];
		}
		System.out.println("Smallest element: " + min);
	}


}
