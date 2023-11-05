package Exception_Handling;

public class B2_NullPointer_Exception {
	
	public static void main(String[] args) {
		
		try {
			
			String s = null;
			System.out.println(s.charAt(1));
			
			
		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception...");
		}
		
		System.out.println("Hello there!");
	}

}
