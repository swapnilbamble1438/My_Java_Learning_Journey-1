package Java_Basic_Programs;
import java.util.Scanner;
public class A7i_Print_Pattern {

	public static void main(String args[])
	{

	   for(int r = 1; r <= 5; r ++)
	    {
		for(int c = 1; c <= r; c ++)
		{
			System.out.print("*");
		}
		System.out.println();
	    }
	   

	   for(int r = 1; r <= 5; r ++)
	    {
		for(int c = 5; c >= r; c --)
		{
			System.out.print("*");
		}
		System.out.println();
	    }
	   
	   
	  // output
	  //   *
	  //   **
	  //   ***
	  //   ****
	  //   *****
	  //   *****
	  //   ****
	  //   ***
	  //   **
	  //   *
//===========================================================
	   System.out.println("Next");

		for(int r = 1; r <= 5; r ++)
		{
			for(int sp = 5; sp > r; sp --)
			{
				System.out.print(" ");
			}
		
	    	for(int c = 1; c <= r; c ++)
		    {
		    	System.out.print(c);
		    }
		    System.out.println();
		}
		

		// output
		//	    1
		//	   12
		//	  123
		//	 1234
		//	12345
		
//==============================================================
		
		System.out.println("Next");
		
		for(int r = 1; r <= 5; r++) {
			

			for(int sp = 5; sp > r; sp --)
			{
				System.out.print(" ");
			}
			
			for(int a = 1; a <= r; a++) {
				
				
				System.out.print("*");
			}
			
			
			for(int c = 1; c <= r; c++) {
				
				
				System.out.print("*");
			}
			
			
			System.out.println();
		}
		
		
		// output
		//	    **
		//	   ****
		//	  ******
		//	 ********
		//	**********
		
		
		
		
		
		
	}
}
