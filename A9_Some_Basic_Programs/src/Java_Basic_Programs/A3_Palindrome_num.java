/*
 Palindrome number in java: A palindrome number is a
  number that is same after reverse. 
  For example 545, 151, 34543, 343, 171, 48984 
  are the palindrome numbers. 
  It can also be a string like LOL, MADAM etc.
 */

package Java_Basic_Programs;
import java.util.Scanner;

public class A3_Palindrome_num 
{	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		int no = sc.nextInt();
		int no2 = no;
		int rem = 0;
		int rev = 0;
		
		while(no > 0)
		{
			rem = no % 10;
			rev = (rev * 10) + rem;
			no = no / 10;
		}
		
		if(rev == no2)
			System.out.println(no2 + " is a Palindrome Number.");
		else
			System.out.println(no2 + " is not a Palindrome Number.");
	}

}
