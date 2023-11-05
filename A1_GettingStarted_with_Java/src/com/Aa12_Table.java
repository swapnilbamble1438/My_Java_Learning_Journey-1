package com;
// Display table of given number

import java.lang.String;
import java.util.Scanner;
class Aa12_Table
{
    public static void main(String args[])
    {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a Number ");
	int no = sc.nextInt();

	int counter = 1;

	while(counter <= 10)
	{
		System.out.println(no * counter);
		counter = counter + 1;
	}
    }
}