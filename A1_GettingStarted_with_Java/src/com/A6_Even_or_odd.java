package com;
import java.lang.String;
import java.util.Scanner;
class A6_Even_or_odd
{

    public static void main(String args[])
    {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter any number ");
	int number = sc.nextInt();

	if(number % 2 == 0)
		System.out.print(number + " is Even Number");
	else
		System.out.print(number + " is Odd Number");
	}	
}

