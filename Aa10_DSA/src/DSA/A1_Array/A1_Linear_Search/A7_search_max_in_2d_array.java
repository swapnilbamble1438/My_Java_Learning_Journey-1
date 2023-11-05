package DSA.A1_Array.A1_Linear_Search;

import java.util.Arrays;

public class A7_search_max_in_2d_array {

	public static void main(String[] args) 
	{
		
		int[][] arr = {
				
				{23,4,1},
				{18,12,3,9},
				{78,99,34,56},
				{18,12}
		};
		
	
		System.out.println(searchmax(arr));
		
		
		
	}

	static int searchmax(int[][] arr) 
	{
		int max =  arr[0][0];
		
		for(int row = 0; row< arr.length; row++)
		{
			for(int col = 0; col< arr[row].length; col++)
			{
				if(max < arr[row][col])
				{
					
					max = arr[row][col];
					
					
				}
				
			}
			
		}
		
		
		return max;
	}
		
		
	
}
