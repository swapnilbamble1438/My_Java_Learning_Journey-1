package Arrays_Programs;

public class A7_Print_elements_of_even_position {

	public static void main(String args[])
	{
		int arr[] = new int[]{1,2,3,4,5,6,7};
		
		for(int i = 1; i < arr.length; i= i+2)
		{
			System.out.println(arr[i]);
		}
	}
}
