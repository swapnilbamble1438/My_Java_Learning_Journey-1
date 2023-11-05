package DSA.A1_Array;

import java.util.Arrays;
import java.util.Scanner;

public class A2_modify {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// array of objects
		
		String[] arr = new String[7];
		for(int i = 0; i < arr.length; i++)
		{
			// enter this elements in console
			arr[i] = sc.next();
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		// modify
		arr[1] = "Swapnil";
		
		System.out.println(Arrays.toString(arr));
	}
}
