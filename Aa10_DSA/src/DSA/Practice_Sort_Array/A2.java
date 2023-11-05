package DSA.Practice_Sort_Array;

import java.util.Arrays;

public class A2 {
	
	public static void main(String[] args) 
	{
		
		int[] array = {7,6,5,4,3,2,1};
		
		System.out.println(Arrays.toString(sortArray(array,array.length)));
		
		
	}

	private static int[] sortArray(int[] array, int length) 
	{
		
		for(int i = 1; i < length; i ++)
		{
			int j = i;
			int a = array[i];
			
			while((j > 0) && (array[j-1] > a))
			{
				array[j] = array[j-1];
				j--;
			}
			array[j] = a;	
		}
		
	
		return array;
		
	}

}
