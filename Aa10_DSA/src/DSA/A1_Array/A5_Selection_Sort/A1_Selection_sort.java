package DSA.A1_Array.A5_Selection_Sort;

/*
  Selection sort is a simple and efficient sorting algorithm 
  that works by repeatedly selecting the smallest (or largest) 
  element from the unsorted portion of the list and swaps it with
  the first element of the unsorted portion. This process is
  repeated for the remaining unsorted portion of the list
  until the entire list is sorted.
 
 
 */


import java.util.Arrays;

public class A1_Selection_sort {
	
public static void main(String[] args) {
		
		int[] arr = {1,3,2,4,5,2,3};
		
		selectionsort(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}
	


	static void selectionsort(int[] arr)
	{
		
		for(int i = 0; i < arr.length-1; i++)
		{
			int minindex = i;
			for(int j = i + 1; j < arr.length;j++)
			{
		// find the min item and swap with element
		// at i index
				if(arr[minindex] > arr[j] )
				{
					swap(arr,minindex,j);
				}
				if(arr[minindex] == arr[j])
				{
					swap(arr,minindex + 1,j);
					
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
