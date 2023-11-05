package DSA.A1_Array.A4_Bubble_Sort;

/*
  Bubble Sort Algorithm:
  It is the simplest sorting algorithm that works
  by repeatedly swapping the adjacent elements
  if they are in the wrong order. 
  This algorithm is not suitable for large data sets 
  as its average and worst-case time complexity
  is quite high.
 
 
 */



import java.util.Arrays;

public class A1_Bubble_sort {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,4,5,2};
		
		bubblesort(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}
	


	static void bubblesort(int[] arr)
	{
		
		for(int i = 0; i < arr.length-1; i++)
		{
			
			for(int j = i + 1; j < arr.length;j++)
			{
				
				int tmp = 0;
				// swap if the item is bigger than the next item
				if(arr[i] > arr[j])
				{
					tmp = arr[i];
					arr[i] =  arr[j];
					arr[j] = tmp;
				}
			
			}
		}
		
		
		
	}
}