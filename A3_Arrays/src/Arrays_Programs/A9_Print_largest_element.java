package Arrays_Programs;

public class A9_Print_largest_element {

	public static void main(String args[])
	{
		int arr[] = new int[] {1,2,3,4,5,6,9,8};
		
		int max= 0;
		int max2 = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(max < arr[i])
				max = arr[i];
		}
		System.out.println("2nd Largest element: " + max);

		
		for(int j = 0; j < arr.length; j++) 
		{
			if(max2 < arr[j] && arr[j] < max)
				max2 = arr[j];
		}
		System.out.println("2nd Largest element: " + max2);
	}
}
