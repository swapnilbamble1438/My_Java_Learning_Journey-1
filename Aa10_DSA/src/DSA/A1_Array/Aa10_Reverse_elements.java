package DSA.A1_Array;

import java.util.Arrays;

public class Aa10_Reverse_elements {

public static void main(String[] args) {
		
		
		int[] arr = {1,3,2,4,5};
		
		reverse(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
	}

	static void reverse(int[] arr) {
	
		int start = 0;
		int end = arr.length-1;
		
		while(start < end)
		{
			swap(arr,start,end);
			start++;
			end--;
		}
		
	
	}
	
	private static void swap(int[] arr, int i, int j) 
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
}
