package DSA.A1_Array;

import java.util.Arrays;
import java.util.Scanner;

public class A1_Array {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		// array of primitive
		
		int[] arr = new int[5];
		arr[0] = 23;
		arr[1] = 45;
		arr[2] = 233;
		arr[3] = 543;
		arr[4] = 3;
		/*
		 // input using for loops
		  for(int i = 0; i < arr.length; i++) 
		  { 
		  arr[i] = sc.nextInt(); 
		  }
		 */
		
		/*
		// retriving using for loops
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
			
		}
		*/
		
		/*
		// retrieving
		for(int num: arr)    // for every element in array, print the element
		{
			System.out.println(num); // here num represents element of the array
		}
		*/
		
		// retrieving
		System.out.println(Arrays.toString(arr));
	}
}
