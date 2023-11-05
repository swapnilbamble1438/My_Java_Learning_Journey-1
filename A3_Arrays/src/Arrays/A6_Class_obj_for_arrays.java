
// Java program to demonstrate
// Class Objects for Arrays

package Arrays;

public class A6_Class_obj_for_arrays {
	
	public static void main(String args[])
	{
		int intArray[] = new int[3];
		byte byteArray[] = new byte[3];
		short shortArray[] = new short[3];
		String stringArray[] = new String[3];
		
		System.out.println(intArray.getClass());
		System.out.println(intArray.getClass().getSuperclass());
		System.out.println(byteArray.getClass());
		System.out.println(shortArray.getClass());
		System.out.println(stringArray.getClass());
		
		
	}

}
