
// Java program to demonstrate
// cloning of one-dimensional arrays

package Arrays;

public class A7_Cloning_of_array {
	
	public static void main(String args[])
	{
		int intArray[] = {1,2,3};
		
		int cloneArray[] = intArray.clone();
		
		// will print false as deep copy 
		// for one-dimensional array
		System.out.println(intArray == cloneArray);
		
		for(int i = 0; i < cloneArray.length; i++)
		{
			System.out.println(cloneArray[i] + " ");
		}

        // will print true as shallow copy is created
        // i.e. sub-arrays are shared
		System.out.println(intArray[1] == cloneArray[1]);
	}

}
