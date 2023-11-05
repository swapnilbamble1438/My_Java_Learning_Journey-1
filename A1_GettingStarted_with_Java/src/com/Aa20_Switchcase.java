package com;
import java.util.Scanner;
class Aa20_Switchcase
{
    public static void main(String args[])
    {

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter rollno ");
	int rno = sc.nextInt();
	
	switch(rno)
		{
			case 10: 
				System.out.println("Ritesh");
				break;
			case 13:
				System.out.println("Swapnil");
				break;
			case 34:
				System.out.println("Bhavik");
				break;
			default:
				System.out.println("Invalid Rollno");
		}
    }
}