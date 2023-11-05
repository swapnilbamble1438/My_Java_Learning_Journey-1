package DSA.Practice_Sort_Array;

import java.util.Arrays;

public class A5 {
	
	public static void main(String[] args) {
		
		int arr[] = {33,55,23,622,3,92,23,44,1,2};
			
			sort(arr);
			System.out.println(Arrays.toString(arr));
		}
		
		static void sort(int[] arr)
		{
			int i = 0;
	
			while(i < arr.length-1)
			{
				if(arr[i] > arr[i+1])
					swap(arr,i,i+1);
				
				
			 if(i == arr.length-2)
			 {
				 if(sorted(arr))	
					 break;
				 else
					i=0;
			 }
				else
					i++;
				
			
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
