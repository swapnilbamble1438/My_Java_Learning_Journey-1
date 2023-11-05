package Java_Number_Programs;

import java.util.Scanner;

public class A1_Reverse_Num 
{
	public static void main(String args[])
	{
	//rev = (rev * 10) + rem;
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a Number: ");
	int no = sc.nextInt();
	int rev = 0;
	int rem = 0;
	
	while(no > 0)
	{
		rem = no % 10;
		rev = (rev * 10) + rem;
		no = no / 10;
	}

		System.out.println(rev);
	}
}
