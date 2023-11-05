package DSA.A1_Array.A2_Binary_Search;

public class A6_find_smallest_letter_greater_than_target {
	
	public static void main(String[] args) {
		
		char []letters = {'c','f','j'};
		
		char target = 'a';
		
		char index = binarySearch(letters,target);
	
		System.out.println(index);
	}
	
	static char binarySearch(char[] letters,char target)
	{
		int start = 0;
		int end = letters.length-1;
		
		while(start <= end)
		{
			// find the middle element
//			int mid = (start + end)/2;
		    int mid = start + (end - start)/2;
		    
			if(target < letters[mid])
			{
				end = mid -1;
			}
			else if(target > letters[mid]) {
				
				start = mid + 1;
			}
			
			
		}
		int result = start;
		return letters[result];
	}


}
