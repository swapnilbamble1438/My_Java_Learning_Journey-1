package DSA.Practice_Sort_Array;

//sorting array without method

public class A1 {

	public static void main(String[] args) {
		
		int[] arr = {7,6,5,4,3,2,1};
	
		
		
		System.out.println();
		
		for(int i=0; i < arr.length; i++)
		{
			for(int j = i + 1; j < arr.length;j++)
			{
				int tmp = 0;
				if(arr[i] > arr[j])
				{
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			System.out.print(arr[i] + " ");
		}
		
		
		
		
	}
}
