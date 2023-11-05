package Arrays_Programs;

import java.util.Scanner;

public class A2_Freq_of_each_element {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter array elements ");
		for(int i = 0; i< n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		// Array fr will store frequencies of element
		int fr[] = new int[arr.length];
		
		int visited = -1;
		
		for(int i = 0; i < arr.length; i ++)
		{
			int count = 1;
			for(int j= i + 1; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					count ++;
					
					// To avoid counting same element again
					fr[j] = visited;
				}
				
			

			}
		if(fr[i] != visited)
			fr[i] = count;
			
		}
			
			for(int i = 0; i < fr.length; i++)
			{
				if(fr[i] != visited)
					System.out.println("Frequency of " + arr[i] + " is " + fr[i]);
			}
			
		
	
	}

}
