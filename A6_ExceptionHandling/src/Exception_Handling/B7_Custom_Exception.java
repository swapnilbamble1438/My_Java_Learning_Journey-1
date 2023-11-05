package Exception_Handling;

import java.util.Scanner;

class customException extends Exception
{
	customException(String s)
	{
		System.err.println("Custom Exception : " + s);
	}
}


public class B7_Custom_Exception {
	
	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a number");
			int n = sc.nextInt();
			if(n % 5 == 0)
			{
				throw new customException("Cannot enter value in multiple of 11");
			}
			
			
			
			
		} catch (customException e) {

		}
		
		
	}

}
