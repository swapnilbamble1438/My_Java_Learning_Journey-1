package DSA.Practice_Sort_Array;

public class A4_sort_String_array {
	
	public static void main(String[] args) {
		
		String[] arr = {"apple","ant","ball","bat","dog","cat"};
		
		for(int i = 0; i< arr.length; i++)
		{
			for(int j = i + 1; j<arr.length;j++)
			{   
				String tmp;
				if(arr[i].charAt(0) > arr[j].charAt(0))
				{
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
				
				else if(arr[i].charAt(0) == arr[j].charAt(0))
				{
					if(arr[i].charAt(1) > arr[j].charAt(1))
					{
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					}
				}
				
			}
			System.out.println(arr[i] + " ");
		}
		
		
	}

}
