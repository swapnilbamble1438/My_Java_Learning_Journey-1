package DSA.A1_Array;

import java.util.Arrays;
import java.util.Scanner;

public class A3_modify_method {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			
			int[] arr = {1,2,3,4};
			
			change(arr);
			System.out.println(Arrays.toString(arr));
			
			
		
		}
		
		static void change(int[] arr)
		{
			arr[0] = 99;
		}
		
		
		// so here we can see that array is mutable 
		// means it can be change
}
