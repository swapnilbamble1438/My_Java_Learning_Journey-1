package com;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Aa66_InputMismatch {
	
	public static int divide(int x,int y)
	{
		int z = 0;
		try {
			z = x/y;
		}catch(ArithmeticException ex){
			System.out.println("second number must be >0");
			
			throw ex;
		}
		return z;
	}
	public static void main(String[] args) 
	{
		try {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("First Number ");
			int a = sc.nextInt();
			
			System.out.println("Second Number ");
			int b = sc.nextInt();
			
			int c = Aa66_InputMismatch.divide(a, b);
			System.out.println("Division" + c);
			}catch(Exception ex) {
				System.out.println("Contact Admin " + ex.getMessage());
				
		}

	}

}
