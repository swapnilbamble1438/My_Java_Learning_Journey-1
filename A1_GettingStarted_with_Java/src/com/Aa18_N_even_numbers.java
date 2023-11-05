package com;
import java.util.Scanner;
class Aa18_N_even_numbers
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a Number ");
	int no = sc.nextInt();
	
	no = no + no;
	int evenno = 0;
	int counter = 0;

 	while(counter <= no - 1)
		{
		evenno = no - counter;
		
		if(evenno % 2 == 0)
		System.out.println("Even Number " + evenno);
		
		counter = counter + 1;
		}
		
		/* Program with for loop method
		for(int counter = 0; counter <= no - 1; counter ++);
			{
				evenno = no - counter;
	
				if(evenno % 2 == 0)
				System.out.println("Even Number " + evenno);
			}
		*/

         }
}
	
	