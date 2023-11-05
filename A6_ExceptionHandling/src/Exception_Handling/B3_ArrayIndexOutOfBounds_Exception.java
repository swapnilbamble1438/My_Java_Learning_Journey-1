package Exception_Handling;

public class B3_ArrayIndexOutOfBounds_Exception {
	
	public static void main(String[] args) {
		
		try {
			
			
			String s[] = new String[5];
			
			System.out.println(s[10]);
			
			
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception...");
		}
		
		System.out.println("Hello there!");
		
		
	}

}
