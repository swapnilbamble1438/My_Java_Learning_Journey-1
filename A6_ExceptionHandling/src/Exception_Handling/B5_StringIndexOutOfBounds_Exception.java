package Exception_Handling;

public class B5_StringIndexOutOfBounds_Exception {
	
	public static void main(String args[])
	{
		
		try {
			
			String s  = "Vande Mataram";
			System.out.println(s.charAt(20));
					
			
			
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String Index Out of Bounds Exception...");
		}
		
		System.out.println("Hello there!");
	}

}
