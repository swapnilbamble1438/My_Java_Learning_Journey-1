package Arrays_Programs;

public class A1_Copy_all_elements_to_another_array {

	public static void main(String args[])
	{
		int arr1[] = new int[] {1,2,3,4,5};
		
		int arr2[] = new int[arr1.length];
		
		for(int i = 0; i < arr1.length; i ++)
		{
			arr2[i] = arr1[i];
		}
		
		System.out.println("Elements of arr1: ");
		for(int i = 0; i < arr1.length; i++)
		{
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Elements of arr2: ");
		for(int i = 0; i < arr2.length; i++)
		{
			System.out.print(arr2[i] + " ");
		}
		
	}
}
