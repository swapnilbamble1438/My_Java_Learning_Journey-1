package DSA.A1_Array.A1_Linear_Search;

import java.util.Arrays;

public class A6_search_in_2d_array {

	public static void main(String[] args) {
		
		int[][] arr = {
				
				{23,4,1},
				{18,12,3,9},
				{78,99,34,56},
				{18,12}
		};
		
		int target = 32;
		int[] ans = search(arr,target);
		System.out.println(Arrays.toString(ans));
		
		
		
	}

	static int[] search(int[][] arr, int target) 
	{

		for(int row = 0; row< arr.length; row++)
		{
			for(int col = 0; col< arr[row].length; col++)
			{
				if(arr[row][col] == target)
				{
					 return new int[] {row,col};	
				//	System.out.println(row + ", " + col);
				}
				
			}
			
		}
		
		
		return new int[] {-1,-1};
	}
}
