package DSA.A1_Array.A6_Insertion_sort;

/*
  Insertion sort
  The array is virtually split into a sorted and an unsorted
  part. Values from the unsorted part are picked and placed
  at the correct positon in the sorted part.
 
 
 */


import java.util.Arrays;

public class A2i_Insertion_sort {

	public static void main(String[] args) {
		
		
		int arr[] = {5,4,10,1,2,7,2};
		
		Insertionsort(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void Insertionsort(int arr[])
	{
		for(int i = 0; i< arr.length; i++)
		{
			int key= arr[i];
			
			
			int  j;
			
			for(j = i-1; j >=0 && arr[j] > key; j--)
			{	
				arr[j+ 1] = arr[j];				
				
			}
			arr[j+1] = key;
			
		
		}
		
	}
	
	
	
}
