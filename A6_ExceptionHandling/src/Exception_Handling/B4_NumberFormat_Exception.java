package Exception_Handling;

public class B4_NumberFormat_Exception {
	
	public static void main(String[] args) {
		
		try {
			
			String s = "ok";
			int i = Integer.parseInt(s);
			
		} catch (NumberFormatException e) {
			System.out.println("Number Format Exception...");
		}
		
		System.out.println("Hello there!");
		
	}

}
