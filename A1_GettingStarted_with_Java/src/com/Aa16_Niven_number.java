package com;
import java.util.Scanner;
class Aa16_Niven_number
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      
	System.out.print("Enter Number ");
	int no = sc.nextInt();
	int num = no;
	int rem = 0;
	int niven = 0;
	
	while(no > 0)
		{ 
		rem = no % 10;  
		niven = niven + rem;
		no = no / 10;
		}

		if(num % niven == 0)
		 System.out.println("Given Number is Niven Number");
	      else
		 System.out.println("Given Number is not Niven Number");

     }
}