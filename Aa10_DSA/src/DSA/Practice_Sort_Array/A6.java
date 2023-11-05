package DSA.Practice_Sort_Array;

import java.util.Arrays;

public class A6 {

	public static void main(String[] args) {
		
		int arr[] = {3,9,5,2,1,4,8,6,2,82,99,113,558};
		
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void sort(int[] arr)
	{
	
		for(int i = 0; i < arr.length-1; i++)
		{
			if(arr[i] > arr[i + 1])
				swap(arr,i,i+1);
			
			if(i == arr.length-2)
			{
			  if(sorted(arr))	
				 break;
			  else
				  sort(arr);
			}
				
		}				
		
	}
	
	static void swap(int[] arr, int start, int end)
	{
		int tmp = arr[start];
		arr[start] =  arr[end];
		arr[end] = tmp;
	}
	
	static boolean sorted(int arr[])
	{
		for(int i = 0; i < arr.length-1;i++)
		{
			if(arr[i] > arr[i+1])
				return false;
		}
		
		return true;
	}

}
