package DSA.A1_Array;

import java.util.Arrays;
import java.util.Scanner;

public class A4_MultiDimensional {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 1 2 3
		 4 5 6
		 */
		
		int[][] arr = new int [3][3];
		
	/*
	 * int[][] arr = { 
	 * 				{1,2,3}, // 0th index 
	 * 				{4,5,6}, // 1st index 
	 */
		
	
		
		// Getting length of row of multidimensional array
		int rowlength = arr.length;
		System.out.println("row length:  " +  rowlength);
		
		// getting length  of column
		int collength = 0;
		for(int i = 0; i < arr.length; i++)
		{
			collength = arr[i].length;
		}
		System.out.println("col length: " + collength);
		
		
		// putting elements in multi dim array
		
		for(int row = 0; row< rowlength; row++)
		{
			for(int col = 0; col< collength; col++)
			{
				arr[row][col] = sc.nextInt();
			}
			
		}
		
		
	// retrieve elements in multi dim array
		
		for(int row = 0; row< rowlength; row++)
		{
			for(int col = 0; col< collength; col++)
			{
				System.out.print(arr[row][col]);
			}
			System.out.println();
		}
		
		
		
		// retrieve elements in multi dim array
		for(int i = 0; i < arr.length; i++)
		{
		System.out.println(Arrays.toString(arr[i]));
		}
		
		
		System.out.println("======================");
		// retrieve elements in multi dim array
			
			for(int row = 0; row< arr.length; row++)
			{
				for(int col = 0; col< arr[row].length; col++)
				{
					System.out.print(arr[row][col]);
				}
				System.out.println();
			}
		
		
	}

}
