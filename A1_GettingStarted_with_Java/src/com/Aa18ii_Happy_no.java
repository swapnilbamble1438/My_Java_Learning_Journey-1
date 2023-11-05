package com;
import java.util.Scanner;
public class Aa18ii_Happy_no
{



	public static void main(String args[])
	{		
	 Scanner sc = new Scanner(System.in);
	
	 System.out.println("Enter Number");
	 int no = sc.nextInt();
	 int num = no;
	 int rem = 0
			 ;
	 int hno = 0; 
	 
	 while(no > 9)
	 {
		 while(no > 0)
	 	{
		 rem = no % 10;
		 hno = hno + (rem * rem);
		 no = no / 10;
	 	}
		 no = hno;
		 hno = 0;
	 }
		 if(no == 1)
		System.out.println("Happy Number");
		 else if(no != 1)
		System.out.println("Not Happy Number");
	 
	}
}