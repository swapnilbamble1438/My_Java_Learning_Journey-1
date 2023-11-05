package com;
import java.lang.String;
import java.util.Scanner;
class Aa25_Factorial

{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);

	System.out.print("enter first number");
	int num = sc.nextInt();
	
	int f = 1 ;
	int i = 1;

	while(i <= num)
	{   
		f = f * i;
		i++;
		
    }
		System.out.println("ans" + f);

	}
}