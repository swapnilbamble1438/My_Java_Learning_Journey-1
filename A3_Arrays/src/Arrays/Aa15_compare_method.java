package Arrays;

import java.util.Arrays;

// compare(array 1, array 2) method

public class Aa15_compare_method {

	public static void main(String[] args) {
		
		// first Array
		int intArr[] = {10,20,15,22,35};
		
		// second Array
		int intArr2[] = {10,15,22};
		
		// third Array
		int intArr3[] = {10,20,15,22,35};
		
		// compare first and second array
		System.out.println("Integer Arrays on comparison: " + Arrays.compare(intArr,intArr2));
		
		// compare first and third array
				System.out.println("Integer Arrays on comparison: " + Arrays.compare(intArr,intArr3));
				
		
		
		
	}
}
