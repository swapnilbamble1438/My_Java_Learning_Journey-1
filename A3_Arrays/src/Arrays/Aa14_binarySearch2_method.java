package Arrays;

import java.util.Arrays;

/*
  binarySearch(array,fromindex,toindex,key,Comparator) Method
  This method searches a range of the specific array for the
  object using the binary search algorithm.
 
 */


public class Aa14_binarySearch2_method {

	public static void main(String[] args) {
		
		byte byteArr[] = {10,20,15,22,35};
		char charArr[] = {'g','p','c','i'};
		int intArr[] = {1,2,3,4,5,6};
		double doubleArr[] = {10.2, 15.1,2.2,3.5};
		double floatArr[] = {10.2f, 15.1f,2.2f,3.5f};
		short shortArr[] = {10,20,15,22,35};
		
		
		byte byteKey = 22;
		char charKey = 'p';
		int intKey = 3;
		double doubleKey = 1.5;
		float floatKey = 35;
		short shortKey = 5;
		
		Arrays.sort(byteArr);
		Arrays.sort(charArr);
		Arrays.sort(intArr);
		Arrays.sort(doubleArr);
		Arrays.sort(shortArr);
	
		
		
		System.out.println(byteKey + " found at index = " + Arrays.binarySearch(byteArr, 2,4,byteKey));
		System.out.println(charKey + " found at index = " + Arrays.binarySearch(charArr, 1,4,charKey));
		System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, 1,4,intKey));
		System.out.println(doubleKey + " found at index = " + Arrays.binarySearch(doubleArr, 1,4,doubleKey));
		System.out.println(floatKey + " found at index = " + Arrays.binarySearch(floatArr, 1,4,floatKey));
		System.out.println(shortKey + " found at index = " + Arrays.binarySearch(shortArr, 0,4,shortKey));
		
		
		
	}
}
