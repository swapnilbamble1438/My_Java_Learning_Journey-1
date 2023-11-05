package Exception_Handling;

public class B6_ClassNotFound_Exception {
	
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
		
		} catch (ClassNotFoundException e) {
		 System.out.println("Class Not Found Exception...");
		}
		
		System.out.println("Hello there!");
		
		
	}

}
