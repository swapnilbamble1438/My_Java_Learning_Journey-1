package Arrays;

import java.util.Arrays;

// copyOf(originalArray,newLength) Method
public class Aa16_copyof_method {
	
	public static void main(String[] args) {
		
		int intArr[] = {10,20,15,22,35};
		
		// print array
		System.out.println("Integer Array: " + Arrays.toString(intArr));
		
		//copy Aray
		System.out.println("Integer Array: " + Arrays.toString(Arrays.copyOf(intArr,intArr.length)));

		
		// Copy Array
		System.out.println("Integer Array: " + Arrays.toString(Arrays.copyOf(intArr, 10)));
		
		
		
	}

}
