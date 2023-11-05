/*
 A number is said to be Peterson if the sum of 
 factorials of each digit is equal to the sum of the 
 number itself.
 
 Example:
 145 = !1 + !4 + !5
     = 1*1 + 4*3*2*1 + 5*4*3*2*1
     = 1 + 24+ 120
     = 145
 */

package Java_Number_Programs;

import java.util.Scanner;

public class A4_Peterson_num {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int no = sc.nextInt();
		int num = no;
		int rem = 0;
		int pet = 0;
		int f = 0;
		while(no > 0)
		{
	// 1st Step
			rem = no % 10;
			
			
	// 2nd Step
			f = 1;
			int i = 1;
			while(i <= rem)
			{
				f = f * i;
				i++;
			}
			pet = pet + f;
			
	// 3rd Step
			no = no / 10;
			
	// 4th Step
			if(pet == num && no == 0)
			{
				System.out.println("It is a Peterson Number.");
				break;
			}
			else if(pet != num && no == 0)
			{
				System.out.println("It is not a Peterson Number.");
				break;
			}
			
		}
	}
}
