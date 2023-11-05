package Arrays_Programs;

public class A3_Left_rotate_element {

	public static void main(String args[])
	{
		int []arr = new int[] {1,2,3,4,5};
		
		int n = 3;
		
		System.out.println("Original array: ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i] + " ");
		}
		
		for(int i = 0; i < n; i ++)
		{
			int j;
			int first;
			
			first = arr[0];
			for(j = 0; j < arr.length-1 ; j++)
			{
				arr[j] = arr[j+1];
				
			}
		}
	}
}
