package DSA.A1_Array.A6_Insertion_sort;

import java.util.Arrays;

public class A2ii {
	
public static void main(String[] args) {
		
		
		int arr[] = {5,4,10,1,2,7,2};
		
		Insertionsort(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void Insertionsort(int arr[])
	{
		for(int i = 0; i< arr.length; i++)
		{
			int key= arr[i];
			
			System.out.println("i: "+ i);
			System.out.println("key: " + key);	
			
			int  j;
			
			for(j = i-1; j >=0 && arr[j] > key; j--)
			{
				System.out.println("-------------------------------");
				System.out.println("j: " + j);
				System.out.println("j+1: " + (j+1));
				
				System.out.println("arr[j+1]: arr["+(j+1)+"]: " + arr[j+1]);
				System.out.println("arr[j]: arr["+(j)+"]: " + arr[j]);
				
				arr[j+ 1] = arr[j];
				
				System.out.println("After arr[j+1] = arr[j]");
				
				System.out.println("arr[j+1]: arr["+(j+1)+"]: " + arr[j+1]);
				System.out.println("arr[j]: arr["+(j)+"]: " + arr[j]);
				
				System.out.println("-------------------------------");
				
			}
			arr[j+1] = key;
			
			System.out.println("key: " + key);
			System.out.println("arr[j+1]: arr["+(j+1)+"]: " + arr[j+1]);
			
			System.out.println("Array becomes: " + Arrays.toString(arr));
			System.out.println("==============================");
		}
		
	}
	
	

}
