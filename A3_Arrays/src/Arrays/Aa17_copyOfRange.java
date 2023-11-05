package Arrays;

import java.util.Arrays;

// copyOfRange(originalArray,fromindex,endIndex) method
public class Aa17_copyOfRange {
	
	public static void main(String[] args) {
		
		int intArr[] = {10,20,15,22,35};
		

		// print array
		System.out.println("Integer Array: " + Arrays.toString(intArr));
		
		// To copy the array into an array of new length
		System.out.println("Integer Array: " + Arrays.toString(Arrays.copyOfRange(intArr, 1,3)));
		
		
	}

}
