package Arrays_Programs;

import java.util.Arrays;

public class Aa12_Remove_Duplicate_elements_in_an_array {

	public static void main(String[] args)
	{		

		int arr[] = {1,9,1,2,1,3,2};
		
		int newarr[] = removeDuplicates(arr);
		
		System.out.println(Arrays.toString(newarr));
	}

	 static int[] removeDuplicates(int arr[]) {
		
		 int arr2[] = new int[arr.length];
			int count = 0;
			
			for(int i = 0; i< arr.length;i++)
			{
				int duplicate = 0;
				
				for(int j= 0; j< i;j++)
				{
					if(i!= 0 && arr[i] == arr[j])
					{
						duplicate ++;
					}
				}
				if(duplicate == 0)
				{
					arr2[count] = arr[i];
					count++;
				}
			}
			
			int arr3[] = new int[count];
			for(int i = 0; i < count; i++)
			{
				arr3[i] = arr2[i];
			}
			return arr3;
				
	}
	
	
	
}
