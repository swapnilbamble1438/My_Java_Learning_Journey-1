package DSA.A1_Array;

import java.util.Arrays;

public class A8_swap_element {

	public static void main(String[] args) {
		
		int[] arr = {1,3,2,4,5};
		
		swap(arr, 1,2);
		
		System.out.println(Arrays.toString(arr));
	}

	private static void swap(int[] arr, int i, int j) 
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	

}
