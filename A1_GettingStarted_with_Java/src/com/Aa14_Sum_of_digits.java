package com;
import java.util.Scanner;
class Aa14_Sum_of_digits
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      
	System.out.print("Enter Number ");
	int no = sc.nextInt();
	int rem = 0;
	int sum = 0;
	
	while(no > 0)
	{ 
		rem = no % 10;  
		sum = sum + rem;
		no = no / 10;
    	}
	System.out.println("Sum of Digits " + sum);

     }
}