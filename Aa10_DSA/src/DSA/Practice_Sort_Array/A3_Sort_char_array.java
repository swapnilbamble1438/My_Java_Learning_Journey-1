package DSA.Practice_Sort_Array;

public class A3_Sort_char_array {
	
	public static void main(String[] args) {
		
		
		char[] arr = {'a','d','c','b'};
		
		System.out.println();
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i + 1; j < arr.length; j++)
			{
				char tmp;
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
