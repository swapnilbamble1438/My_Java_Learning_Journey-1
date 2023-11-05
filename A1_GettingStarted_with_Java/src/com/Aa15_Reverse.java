package com;
import java.util.Scanner;
class Aa15_Reverse
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      
	System.out.print("Enter Number ");
	int no = sc.nextInt();
	int rem = 0;
	int rev = 0;
	
	while(no > 0)
	{ 
		rem = no % 10;  
		rev = (rev * 10) + rem;
		no = no / 10;
    	}
 
	System.out.println("Reverse of Given Number is " + rev);

     }
}