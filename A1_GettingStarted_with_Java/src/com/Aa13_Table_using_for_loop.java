package com;
// Display Table of given number by using for loop

import java.lang.String;
import java.util.Scanner;
class Aa13_Table_using_for_loop
{
    public static void main(String args[])
    {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a Number ");
	int no = sc.nextInt();

	for(int counter = 1; counter <= 10; counter ++)
	{
		System.out.println(no * counter);
	}
    }
}