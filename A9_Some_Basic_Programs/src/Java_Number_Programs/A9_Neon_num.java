/*
 Neon Number
A positive integer whose sum of digits of its square 
is equal to the number itself is called a neon number.

Neon Number Example:
 Example 1) 		   Example 2)	
 		9 					45
     9² = 81 			   45² = 2025
     8 + 1 = 9			  2 + 0 + 2 + 5 = 9
       9 = 9			 9 is not equal to 45
 It is Neon Number      It is not Neon Number
 */

package Java_Number_Programs;

import java.util.Scanner;

public class A9_Neon_num {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Three Digit Number: ");
		int no = sc.nextInt();
		int num = no;
		
		int nosq = no * no;
		
		int rem = 0;
		int sum = 0;
		
		while(nosq > 0)
		{
			rem = nosq % 10;
			sum = sum + rem;
			nosq = nosq / 10;
			
		}
		if(num == sum)
			System.out.println(num + " is the Neon Number.");
		else
			System.out.println(num + " is not the Neon Number.");
		
		
	}
}
