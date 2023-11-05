package DSA.A1_Array.A6_Insertion_sort;

import java.util.Arrays;

public class A1_Insertion_sort {

	public static void main(String[] args) {
		
		int []arr= {4,5,1,2,3};
		
		Insertionsort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void Insertionsort(int[] arr)
	{
		for(int i = 0; i < arr.length-1; i++)
		{
			for(int j = i+1; j > 0; j--)
			{
				if(arr[j] < arr[j-1])
				{
					swap(arr,j,j-1);
				}
				else
				{
					break;
				}
			}
		}
		
	}
	
	static void swap(int[] arr, int start, int end)
	{
		int tmp = arr[start];
		arr[start] =  arr[end];
		arr[end] = tmp;
	}
	
	
}
