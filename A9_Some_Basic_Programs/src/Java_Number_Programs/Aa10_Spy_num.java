/*
 Spy Number
 A number is spy number if the sum and product
 of its digits are equal.
 
 Example:
 1124 
   1 + 1 + 2 + 4 = 8 
   1 * 1 * 2 * 4 = 8
   Therefore 1124 is a spy number.
 */
package Java_Number_Programs;

import java.util.Scanner;

public class Aa10_Spy_num {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int no = sc.nextInt();
		int num = no;
	
		
		int rem = 0;
		int sum = 0;
		int into = 1;
		
		while(no > 0)
		{
			rem = no % 10;
			sum = sum + rem;
			into = into * rem;
			no = no / 10;
			
		}
		System.out.println(sum);
		System.out.println(into);
		
		if(sum == into)
			System.out.println(num + " is the Spy Number.");
		else
			System.out.println(num + " is not the Spy Number.");
	}
}
