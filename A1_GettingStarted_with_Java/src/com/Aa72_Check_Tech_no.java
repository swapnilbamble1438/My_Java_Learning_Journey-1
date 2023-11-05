package com;
import java.io.*;
import java.util.*;
public class Aa72_Check_Tech_no
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 digit Number: ");
		int n = sc.nextInt();
		
		int a = n / 1000;
		int b = (n / 100)% 10;
		int c = (n % 100)/10;
		int d = (n % 10);
		
		System.out.println("a="+a + " b=" + b  + " c=" +c + " d="+d);
		
		int firsthalf = n /100;
		int secondhalf = n % 100;
		
		System.out.println("firsthalf="+ firsthalf + " secondhalf="+ secondhalf);
		
		int sum = firsthalf + secondhalf;
		
		if(n == sum * sum)
			System.out.println("The number "+n +" is a Tech number.");
		else
			System.out.println("The number " +n +" is not a Tech number.");
		
		
		
	}
}
