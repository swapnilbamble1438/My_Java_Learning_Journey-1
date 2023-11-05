package com;
// this program is used for testing various arithmetic
// and relational operators

import java.util.Scanner;
class A5_Operators
{
	public static void main(String args[])
	{
       Scanner sc = new Scanner(System.in);
	 
       System.out.println("Enter First Number");
       float no1 = sc.nextFloat();
       
	 System.out.println("Enter Second Number");
	 float no2 = sc.nextFloat();

	 System.out.println("Addition" + (no1 + no2));

	 System.out.println("Subtraction" + (no1 - no2));

       System.out.println("Division" + (no1 / no2));

	 System.out.println("Multiplication" +(no1 * no2));

	 System.out.println("Modulus" + (no1 % no2));
		
	}
}