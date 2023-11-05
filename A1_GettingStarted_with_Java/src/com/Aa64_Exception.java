package com;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Aa64_Exception
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	      
		try {    
			System.out.println("Enter First Number ");
			int x  = sc.nextInt();
			
			System.out.println("Enter Second Number ");
			int y = sc.nextInt();
			
			int z = x/y;
			System.out.println("Division " + z);
		    }
		     catch(InputMismatchException ex)
		     {
		    	System.out.println("please provide valid number");
		     }
		   	catch(ArithmeticException ex)
			{
		   		System.out.println("second number must be > 0");
			}
			catch(Exception ex)
			{
				System.out.println("Contact Admin");
			}
			finally
			{
				System.out.println("this is finally");
			}
		    System.out.println("thanks for using my program");
	}
}
