/*
 	Automorphic number Example:
 	 76 = 76 * 76 = 5776  
 	 76 at last means it is Automorphic number.
 	 
 	 23 = 23 * 23 = 29 
 	 29 at last but we require 23 therefore it not 
 	 Automorphic number.
 */

package Java_Number_Programs;

import java.util.Scanner;

public class A3_Automorphic_num {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		int no = sc.nextInt();
		
		int nosq = no * no;
		System.out.println("Square of " + no + " is " + nosq);
		
		int remno = 0;
		int remnosq = 0;
		int sumno = 0;
		int sumnosq = 0;
		
		while(no>0 && nosq >0 )
		{
			 remno = no % 10;
			 remnosq = nosq % 10;
			 
			 no = no/10;
			 nosq = nosq/10;
			 
			 if (remno == remnosq && no == 0)
				{
					System.out.println("It is an Automorphic Number.");
					break;
				}
			else if(remno != remnosq)
				{
					System.out.println("It is not an Automorphic Number.");
					break;
				}
			 
		}
		
		
	}
}
