package com;
// Table of 5

import java.lang.String;
import java.util.Scanner;
class Aa11_Table_of_five
{
    public static void main(String args[])
    {
	int no = 5;
	int counter = 1;
	while(counter <= 10)
	{
		System.out.println(counter * no);
		counter = counter + 1;
	}
     }
}