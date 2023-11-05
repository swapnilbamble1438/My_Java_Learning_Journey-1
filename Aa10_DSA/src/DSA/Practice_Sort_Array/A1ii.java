package DSA.Practice_Sort_Array;

// Recursive implementation of Binary Search:


import java.util.Arrays;

public class A1ii {
	
public static void main(String[] args) {
		
		int[] arr = {7,6,5,4,3,2,1};
	
		
		
		System.out.println();
		
		for(int i=0; i < arr.length; i++)
		{
			
			
			for(int j = i + 1; j < arr.length;j++)
			{
	
				int tmp = 0;
				
				System.out.print("when i:"+i+" & j:"+j+" | before if: tmp:"+tmp+" arr["+i+"]:"+arr[i]+ " arr["+j+"]:"+arr[j]+ " | "  );
				
				
				if(arr[i] > arr[j])
				{
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
				
				System.out.print("after if: tmp:"+tmp+" arr["+i+"]:"+arr[i]+ " arr["+j+"]:"+arr[j]+ " | ");
				System.out.println("Array becomes: "+ Arrays.toString(arr) );
			}
			
			System.out.println();
			
		}
		
		
		
		
	}
}
