package Arrays;

import java.util.Scanner;

public class Aa11_Array_copy {
	
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int intArray[] = {1,2,3,4,5};
		
		
		// first method using assignment
		int[] copyA = intArray;
		
		System.out.println(copyA == intArray);
		
		
		// second method by iterating
		
		int[] copyB = new int[intArray.length];
		
		for(int i = 0; i < copyB.length; i ++)
		{
			copyB[i] = intArray[i];
		}
		
		System.out.println(copyB == intArray);
		
		// third method using arraycopy
		
		 
		
		
		
		
		
	}
	

}
