package Arrays;

import java.util.Arrays;

// binarySearch() Method
// This methods search for the specific element in the
// array with the help of the binary search algorithm.

public class Aa13_binarySearch_method {
	
	public static void main(String[] args) {
		
		
		int[] intArr = {1,2,3,4,5};
		
		
		Arrays.sort(intArr);
		
		int key = 2;
		
		// Print the key and corresponding index
		System.out.println(key + " found at index = " + Arrays.binarySearch(intArr, key));
		
	}

}
