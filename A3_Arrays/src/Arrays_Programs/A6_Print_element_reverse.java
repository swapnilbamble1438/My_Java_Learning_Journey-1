package Arrays_Programs;

import java.util.Scanner;

public class A6_Print_element_reverse {
	
	public static void main(String args[])
	{
		
		
		int arr[] = new int[]{1,2,3,4,5};
		
		for(int i = arr.length-1; i >= 0; i--)
		{
			System.out.println(arr[i]);
		}
	}

}
