package Exception_Handling;

public class Ca23i_Exceptions_try_catch {
	
	public static void main(String args[])
	{
		// This statements will generate error,
		// because myNumbers[10] does not exist.
		// int[] myNumbers = {1,2,3};
		
		// System.out.println(myNumbers[10]);
		
		// in this case we can use try catch to catch the error
		// and execute some code to handle it:
		
		try {
			
			int[] myNumbers = {1,2,3};
			
			System.out.println(myNumbers[10]);
			
		}catch(Exception e)
		{
			System.out.println("Something went wrong.");
		}
	}

}
